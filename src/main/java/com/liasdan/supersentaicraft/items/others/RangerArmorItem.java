package com.liasdan.supersentaicraft.items.others;

import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;

import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.client.RangerArmorRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class RangerArmorItem extends ArmorItem implements GeoItem {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private Item RepairItem = GorangerItems.GORANGER_LOGO.get();
	
	public RangerArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
		super(material, type, properties.stacksTo(1).durability(type ==Type.BOOTS?600:500));
	
	}

	@Override
	public boolean canElytraFly(ItemStack stack, net.minecraft.world.entity.LivingEntity entity) {
		return entity.hasEffect(EffectCore.GLIDE);
	}

	@Override
	public boolean elytraFlightTick(ItemStack stack, net.minecraft.world.entity.LivingEntity entity, int flightTicks) {
		if (!entity.level().isClientSide) {
			int nextFlightTick = flightTicks + 1;
			if (nextFlightTick % 10 == 0) {
				entity.gameEvent(net.minecraft.world.level.gameevent.GameEvent.ELYTRA_GLIDE);
			}
		}
		return true;
	}

	@Override
	public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
		consumer.accept(new GeoRenderProvider() {
			private RangerArmorRenderer renderer;
			@Override
			public <T extends LivingEntity> HumanoidModel<?> getGeoArmorRenderer(@Nullable T livingEntity, ItemStack itemStack, @Nullable EquipmentSlot equipmentSlot, @Nullable HumanoidModel<T> original) {
				if(this.renderer == null)
					this.renderer = new RangerArmorRenderer(equipmentSlot);
				final Minecraft mc = Minecraft.getInstance();
				this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original, mc.renderBuffers().bufferSource(), mc.getTimer().getGameTimeDeltaPartialTick(true), 0, 0, 0, 0);

				return this.renderer;
			}
		});
	}

	public RangerArmorItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	public static Float GetCapeRotation(ItemStack itemstack)
	{
		if (itemstack.has(DataComponents.CUSTOM_DATA)&itemstack.getItem()instanceof RangerArmorItem) {
			CompoundTag tag = itemstack.get(DataComponents.CUSTOM_DATA).getUnsafe();
			return tag.getFloat("cape_rotation");
		}
		return 0f;
	}

	public static void setCapeRotation(ItemStack itemstack,Float num)
	{
		if (!itemstack.has(DataComponents.CUSTOM_DATA)) {
			itemstack.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
		}
		if (itemstack.getItem() instanceof RangerChangerItem) {
			Consumer<CompoundTag> data = form -> form.putFloat("cape_rotation", num);
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, data);
		}
	}

	public static void setTransforming(ItemStack itemstack,Float num)
	{
		if (!itemstack.has(DataComponents.CUSTOM_DATA)) {
			itemstack.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
		}
		if (itemstack.getItem() instanceof RangerChangerItem) {
			Consumer<CompoundTag> data = form -> form.putFloat("is_transforming", num);
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, data);
		}
	}

	public static Float GetTransforming(ItemStack itemstack)
	{
		if (itemstack.has(DataComponents.CUSTOM_DATA)&itemstack.getItem()instanceof RangerArmorItem) {
			CompoundTag tag = itemstack.get(DataComponents.CUSTOM_DATA).getUnsafe();
			return tag.getFloat("is_transforming");
		}
		return 0f;
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
		RawAnimation IDLE = RawAnimation.begin().thenLoop("idle");
		RawAnimation WALK = RawAnimation.begin().thenLoop("walk");
		RawAnimation IDLE_CAPE = RawAnimation.begin().thenLoop("idle_cape");

		controllerRegistrar.add(new AnimationController<>(this, "riderAnim", 20, state -> {


			Entity entity = state.getData(DataTickets.ENTITY);
			boolean IsWaking = false;
			boolean IsKicking = false;
			if (entity instanceof LivingEntity player) {

				float X =0;
				float Y =0;
				float Z =0;
				boolean isPlayer =false;
				if (player instanceof Player) {
					X =player.xxa;
					Y=player.yya;
					Z=player.zza;
					isPlayer=true;
				}else if (player instanceof Mob mob) {
					if (player.getDeltaMovement().x != 0 ||player.getDeltaMovement().z != 0){
						X= mob.getViewXRot(state.getPartialTick());
						Vec3 look = player.getLookAngle();
						if (look.x>0&player.getDeltaMovement().x>0)Z= 1;
						else if (look.z>0&player.getDeltaMovement().z>0)Z= 1;
						else  if (look.x<0&player.getDeltaMovement().x<0)Z= 1;
						else if (look.z<0&player.getDeltaMovement().z<0)Z= 1;
						else Z= -1;
					}
				}

				if (player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem&&player.getDeltaMovement().x != 0 ||
						player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem&&player.getDeltaMovement().z != 0)
					IsWaking = RangerChangerItem.get_Form_Item(player.getItemBySlot(EquipmentSlot.FEET),1).get_Walk();

				if (this instanceof RangerChangerItem belt) {

					if (GetTransforming(player.getItemBySlot(EquipmentSlot.FEET)) > 0)setTransforming(player.getItemBySlot(EquipmentSlot.FEET),GetTransforming(player.getItemBySlot(EquipmentSlot.FEET))-0.2f);
					if (GetTransforming(player.getItemBySlot(EquipmentSlot.FEET)) < 0) setTransforming(player.getItemBySlot(EquipmentSlot.FEET),0f);

					if (belt.HasCape(player.getItemBySlot(EquipmentSlot.FEET))) {
						float cape = GetCapeRotation(player.getItemBySlot(EquipmentSlot.FEET));

						if (Z > 0 & cape >-0.7&!player.isSwimming()) cape = cape-0.01f-(player.getSpeed()/10);
						else if (Z < 0&cape <0) cape = cape +0.1f;
						else if  (Z == 0&cape <0&X== 0||cape <-0.7||cape <0&player.isSwimming()) cape = cape +0.02f;
						if (X > 0) {
							if (isPlayer&Z == 0& cape >-0.7) cape = cape-0.01f-(player.getSpeed()/10);
						}
						if (X < 0) {
							if (isPlayer&Z == 0& cape >-0.7) cape = cape-0.01f-(player.getSpeed()/10);
						}
						if (player.fallDistance>0&!player.isSwimming()& cape>-2.5)cape =cape -0.05f;

						setCapeRotation(player.getItemBySlot(EquipmentSlot.FEET), cape);
					}
				}
			}
			state.setAndContinue(IsWaking ? WALK : IDLE);

			return PlayState.CONTINUE;
		}));
	}

	public RangerArmorItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}
	

	
	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return cache;
	}
}