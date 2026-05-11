package com.liasdan.supersentaicraft.items.client;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.MechaArmorItem;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
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

public class MechaArmorModel extends GeoModel<MechaArmorItem> {

	public MechaArmorModel() {
	}

	@Override
	public ResourceLocation getModelResource(MechaArmorItem animatable, @Nullable GeoRenderer<MechaArmorItem> renderer) {
		if (renderer instanceof MechaArmorRenderer riderRenderer) {
			LivingEntity RIDER = riderRenderer.GetEntity();
			EquipmentSlot slot= riderRenderer.getCurrentSlot();
			if (RIDER.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem BELT) {
				if (slot == EquipmentSlot.HEAD)
					return BELT.getBeltModelResource(RIDER.getItemBySlot(EquipmentSlot.HEAD), animatable, slot, RIDER);
				else return BELT.getModelResource(RIDER.getItemBySlot(EquipmentSlot.HEAD), animatable, slot, RIDER);
			}
		}
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/ranger.geo.json");
	}

	@Override
	public ResourceLocation getModelResource(MechaArmorItem animatable) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/ranger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MechaArmorItem animatable, @Nullable GeoRenderer<MechaArmorItem> renderer) {
		if (renderer instanceof MechaArmorRenderer riderRenderer) {
			LivingEntity RIDER = riderRenderer.GetEntity();
			EquipmentSlot slot = riderRenderer.getCurrentSlot();
			ItemStack BELT = RIDER.getItemBySlot(EquipmentSlot.HEAD);
			if (BELT.getItem() instanceof MechaGattaiItem DRIVER && (slot == EquipmentSlot.HEAD || DRIVER.isTransformed(RIDER))) {
				return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/mecha/" + DRIVER.GET_TEXT(BELT, slot, RIDER, DRIVER.Rider) + ".png");
			}
		}
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/blank.png");
	}

	@Override
	public ResourceLocation getTextureResource(MechaArmorItem animatable) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/armor/blank.png");
	}


	@Override
	public ResourceLocation getAnimationResource(MechaArmorItem animatable) {
		return  ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "animations/ranger.animation.json");
	}

	@Override
	public void setCustomAnimations(MechaArmorItem an, long instanceId, AnimationState<MechaArmorItem> state) {

		Entity entity = state.getData(DataTickets.ENTITY);
		if (entity instanceof LivingEntity RIDER) {
			Float GetTransforming = (float) RIDER.getAttribute(AttributeRegistry.IS_TRANSFORMING).getBaseValue()-(state.getPartialTick()*0.2f);

			GeoBone cape = this.getAnimationProcessor().getBone("cape");

			if (cape != null & MechaArmorItem.GetCapeRotation(RIDER.getItemBySlot(EquipmentSlot.HEAD)) < 0)
				cape.setRotX(MechaArmorItem.GetCapeRotation(RIDER.getItemBySlot(EquipmentSlot.HEAD)));

			if (RIDER.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MechaGattaiItem belt) {
				belt.setCustomAnimations(an, instanceId, state);
			}
		}
	}
}