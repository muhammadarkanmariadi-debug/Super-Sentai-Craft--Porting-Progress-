package com.liasdan.supersentaicraft.items.gaoranger;

import com.google.common.collect.Lists;
import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.GaorangerItems;
import com.liasdan.supersentaicraft.items.ShinkengerItems;
import com.liasdan.supersentaicraft.items.others.MechaArmorItem;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GaoKingItem extends MechaGattaiItem {

	public GaoKingItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> torso, DeferredItem<Item> legs, DeferredItem<Item> boot, Properties properties) {
		super(material, rider, baseFormItem, torso, legs, boot, properties);
		Unlimited_Textures=4;
	}

	@Override
	public String getUnlimitedTextures(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String riderName, int num)
	{
		boolean fly = rider instanceof Player player && player.getAbilities().flying;

		if(num==2) return get_Form_Item(itemstack,2).getFormName(fly);
		else if(num==3) return get_Form_Item(itemstack,3).getFormName(fly);
		else if(num==4) return get_Form_Item(itemstack,4).getFormName(fly);

		return riderName+get_Form_Item(itemstack,1).getFormName(fly);
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
		boolean fly = !rider.onGround();

		String belt = ((MechaGattaiItem)itemstack.getItem()).BELT_TEXT;

		if (equipmentSlot == EquipmentSlot.HEAD) {
			if (!this.isTransformed(rider)) {
				belt = "blank";
			}
			else if (rangerName == "gao_icarus") {
				belt = "gao_icarus_wings";
			}
			else belt = "blank";
			return belt;
		}

		if (equipmentSlot == EquipmentSlot.FEET) return get_Form_Item(itemstack,2).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.CHEST) return get_Form_Item(itemstack,3).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.LEGS) return get_Form_Item(itemstack,4).getFormName(fly);

		else return rangerName+get_Form_Item(itemstack,1).getFormName(fly);
	}

	public ResourceLocation getBeltModelResource(ItemStack itemstack,MechaArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		if (this == GaorangerItems.GAO_ICARUS_HELMET.get()) return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/rangerwingbelt.geo.json");
		else return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, get_Form_Item(itemstack, 1).getBeltModel());
	}

	public  boolean getPartsForSlot(ItemStack itemstack,EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
			case FEET,LEGS,CHEST ->{
				return true;
			}
			default -> {}
		}
		return false;
	}
}