package com.liasdan.supersentaicraft.items.others;

import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.sentai_10.GorangerItems;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

public class BaseShieldItem extends ShieldItem {

	private java.util.function.Supplier<Item> RepairItem = GorangerItems.GORANGER_LOGO;
	
	public BaseShieldItem(Properties prop) {
		super(prop.durability(336));
		SuperSentaiCraftCore.SHIELD_ITEM.add(this);
	}

	public BaseShieldItem ChangeRepairItem(Item item) {
		RepairItem = () -> item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem.get();
	}

	public BaseShieldItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	public boolean canPerformAction(ItemStack stack, ItemAbility itemAbility) {
		return ItemAbilities.DEFAULT_SHIELD_ACTIONS.contains(itemAbility);
	}
}