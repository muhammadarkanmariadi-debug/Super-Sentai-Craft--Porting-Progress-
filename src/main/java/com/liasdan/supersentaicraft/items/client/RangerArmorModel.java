package com.liasdan.supersentaicraft.items.client;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.resources.ResourceLocation;
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
			EquipmentSlot slot= riderRenderer.getCurrentSlot();
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
			GeoBone cape = this.getAnimationProcessor().getBone("cape");

			if (cape != null & RangerArmorItem.GetCapeRotation(RIDER.getItemBySlot(EquipmentSlot.FEET)) < 0)
				cape.setRotX(RangerArmorItem.GetCapeRotation(RIDER.getItemBySlot(EquipmentSlot.FEET)));
		}
	}
}