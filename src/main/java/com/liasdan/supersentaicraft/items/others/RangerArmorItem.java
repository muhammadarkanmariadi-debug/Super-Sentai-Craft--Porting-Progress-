package com.liasdan.supersentaicraft.items.others;

import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import com.liasdan.supersentaicraft.items.sentai_10.GorangerItems;
import com.liasdan.supersentaicraft.items.client.RangerArmorRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class RangerArmorItem extends ArmorItem implements GeoItem {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private java.util.function.Supplier<Item> RepairItem = GorangerItems.GORANGER_LOGO;
	
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

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
		RawAnimation IDLE = RawAnimation.begin().thenLoop("idle");
		RawAnimation FLY = RawAnimation.begin().thenLoop("fly");
		controllerRegistrar.add(new AnimationController<>(this, "riderAnim", 20, state -> {
			Entity entity = state.getData(DataTickets.ENTITY);
			if (entity instanceof net.minecraft.world.entity.player.Player player && player.isFallFlying()) {
				String itemName = net.minecraft.core.registries.BuiltInRegistries.ITEM.getKey(this).getPath();
				if (itemName.contains("jetman")) {
					state.setAndContinue(FLY);
					return PlayState.CONTINUE;
				}
			}
			state.setAndContinue(IDLE);
			return PlayState.CONTINUE;
		}));
	}

	public RangerArmorItem ChangeRepairItem(Item item) {
		RepairItem = () -> item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem.get();
	}
	

	
	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return cache;
	}
}