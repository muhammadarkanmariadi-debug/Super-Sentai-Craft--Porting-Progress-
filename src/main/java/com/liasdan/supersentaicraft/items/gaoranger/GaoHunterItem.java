package com.liasdan.supersentaicraft.items.gaoranger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.GaorangerItems;
import com.liasdan.supersentaicraft.items.ShinkengerItems;
import com.liasdan.supersentaicraft.items.others.MechaArmorItem;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class GaoHunterItem extends MechaGattaiItem {

	public GaoHunterItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> torso, DeferredItem<Item> legs, DeferredItem<Item> boot, Properties properties) {
		super(material, rider, baseFormItem, torso, legs, boot, properties);
		Unlimited_Textures=3;
	}

	@Override
	public String getUnlimitedTextures(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String riderName, int num)
	{
		boolean fly = rider instanceof Player player && player.getAbilities().flying;

		if(num==2) return get_Form_Item(itemstack,2).getFormName(fly);
		else if(num==3) return get_Form_Item(itemstack,3).getFormName(fly);
		else return riderName+get_Form_Item(itemstack,1).getFormName(fly);
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
		boolean fly = !rider.onGround();

		String belt = ((MechaGattaiItem)itemstack.getItem()).BELT_TEXT;

		if (equipmentSlot == EquipmentSlot.HEAD) {
			if (rider.getMainHandItem().getItem()== GaorangerItems.LIGATOR_BLADE.get() ||
					rider.getMainHandItem().getItem()==GaorangerItems.LIGATOR_BLADE_BLUE_MOON.get()) {
				belt = "blank";
			}
			else if (!this.isTransformed(rider)) {
				belt = "blank";
			}
			else if (rangerName == "gao_hunter") {
				belt = "ligator_blade";
			}
			else if (rangerName == "gao_hunter_blue_moon") {
				belt = "ligator_blade_blue_moon";
			}
			else belt = "blank";
			return belt;
		}

		if (equipmentSlot == EquipmentSlot.FEET) return get_Form_Item(itemstack,2).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.CHEST) return get_Form_Item(itemstack,3).getFormName(fly);
		else return rangerName+get_Form_Item(itemstack,1).getFormName(fly);
	}

	public ResourceLocation getBeltModelResource(ItemStack itemstack,MechaArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/gao_hunter.geo.json");
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