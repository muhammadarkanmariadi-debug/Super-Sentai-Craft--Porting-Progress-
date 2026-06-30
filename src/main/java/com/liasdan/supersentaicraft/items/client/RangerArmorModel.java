package com.liasdan.supersentaicraft.items.client;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class RangerArmorModel extends GeoModel<RangerArmorItem> {

	public RangerArmorModel() {
	}

	@Override
	public ResourceLocation getModelResource(RangerArmorItem animatable, @Nullable GeoRenderer<RangerArmorItem> renderer) {
		if (renderer instanceof RangerArmorRenderer riderRenderer) {
			LivingEntity RIDER = riderRenderer.GetEntity();
			EquipmentSlot slot = riderRenderer.getCurrentSlot();
			if (RIDER.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem BELT) {
				if (slot == EquipmentSlot.FEET)
					return BELT.getBeltModelResource(RIDER.getItemBySlot(EquipmentSlot.FEET), animatable, slot, RIDER);
				else return BELT.getModelResource(RIDER.getItemBySlot(EquipmentSlot.FEET), animatable, slot, RIDER);
			}
		}
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/ranger.geo.json");
	}

	@Override
	public ResourceLocation getModelResource(RangerArmorItem animatable) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/ranger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RangerArmorItem animatable, @Nullable GeoRenderer<RangerArmorItem> renderer) {
		if (renderer instanceof RangerArmorRenderer riderRenderer) {
			LivingEntity RIDER = riderRenderer.GetEntity();
			EquipmentSlot slot = riderRenderer.getCurrentSlot();
			ItemStack BELT = RIDER.getItemBySlot(EquipmentSlot.FEET);
			if (BELT.getItem() instanceof RangerChangerItem DRIVER && (slot == EquipmentSlot.FEET || DRIVER.isTransformed(RIDER))) {
				return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/" + DRIVER.GET_TEXT(BELT, slot, RIDER, DRIVER.Rider) + ".png");
			}
		}
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/blank.png");
	}

	@Override
	public ResourceLocation getTextureResource(RangerArmorItem animatable) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/blank.png");
	}


	@Override
	public ResourceLocation getAnimationResource(RangerArmorItem animatable) {
		return  ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "animations/ranger.animation.json");
	}

	@Override
	public void setCustomAnimations(RangerArmorItem an, long instanceId, AnimationState<RangerArmorItem> state) {

		Entity entity = state.getData(DataTickets.ENTITY);
		if (entity instanceof LivingEntity RIDER) {

			double GetTransformingOld =  RIDER.getAttribute(AttributeRegistry.IS_TRANSFORMING_OLD).getBaseValue();
			double GetTransforming = RIDER.getAttribute(AttributeRegistry.IS_TRANSFORMING).getBaseValue();

			double GetBallOld =  RIDER.getAttribute(AttributeRegistry.BALL_ROT_OLD).getBaseValue();
			double GetBall = RIDER.getAttribute(AttributeRegistry.BALL_ROT).getBaseValue();
			double GetWheelOld =  RIDER.getAttribute(AttributeRegistry.WHEEL_ROT_OLD).getBaseValue();
			double GetWheel = RIDER.getAttribute(AttributeRegistry.WHEEL_ROT).getBaseValue();
			double GetCapeOld =  RIDER.getAttribute(AttributeRegistry.CAPE_ROT_OLD).getBaseValue();
			double GetCape = RIDER.getAttribute(AttributeRegistry.CAPE_ROT).getBaseValue();

			Float  Transforming = (float) Mth.lerp(state.getPartialTick(),GetTransformingOld,GetTransforming);
			Float  wheel= (float) Mth.lerp(state.getPartialTick(),GetWheelOld,GetWheel);
			Float  ball = (float) Mth.lerp(state.getPartialTick(),GetBallOld,GetBall);
			Float  Cape = (float) Mth.lerp(state.getPartialTick(),GetCapeOld,GetCape);

			GeoBone cape = this.getAnimationProcessor().getBone("cape");

			if (cape != null & Cape< 0)
				cape.setRotX(Cape);
			if (cape != null & ball != 0)
				cape.setRotY(ball);

			if (RIDER.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem belt) {
				belt.setCustomAnimations(an, instanceId, state);

				GeoBone gozyuger_logo = this.getAnimationProcessor().getBone("gozyuger_logo");
				if (gozyuger_logo != null) {
					if (RangerChangerItem.isTransforming(RIDER)) {
						float size = Transforming/40;
						gozyuger_logo.setScaleX(1-size);
						gozyuger_logo.setScaleY(1-size);
						gozyuger_logo.setScaleZ(1f);

						gozyuger_logo.setHidden(false);
					}
					else {
						gozyuger_logo.setHidden(true);
					}
				}

				GeoBone wings = this.getAnimationProcessor().getBone("wings");
				if (wings != null) {
					net.minecraft.world.item.Item mainHandItem = RIDER.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
					net.minecraft.world.item.Item offHandItem = RIDER.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
					if (mainHandItem == com.liasdan.supersentaicraft.items.sentai_50.ZenkaigerItems.V_MERANG.get() || 
					    offHandItem == com.liasdan.supersentaicraft.items.sentai_50.ZenkaigerItems.V_MERANG.get()) {
						wings.setHidden(true);
					} else {
						wings.setHidden(false);
					}
				}

				GeoBone ninjarkSwordBack = this.getAnimationProcessor().getBone("ninjark_sword_back");
				if (ninjarkSwordBack != null) {
					net.minecraft.world.item.Item mainHandItem = RIDER.getItemBySlot(EquipmentSlot.MAINHAND).getItem();
					net.minecraft.world.item.Item offHandItem = RIDER.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
					if (mainHandItem == com.liasdan.supersentaicraft.items.sentai_50.DonbrothersItems.NINJARK_SWORD.get() || 
					    offHandItem == com.liasdan.supersentaicraft.items.sentai_50.DonbrothersItems.NINJARK_SWORD.get()) {
						ninjarkSwordBack.setHidden(true);
					} else {
						ninjarkSwordBack.setHidden(false);
					}
				}
			}
		}
	}
}