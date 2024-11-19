package com.liasdan.supersentaicraft.items.others;

import java.util.List;

import com.liasdan.supersentaicraft.items.GorangerItems;

import net.minecraft.world.item.*;

public class BaseSwordItem extends SwordItem {

	private Item RepairItem = GorangerItems.GORANGER_LOGO.get();
	
	public BaseSwordItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, prop.attributes(SwordItem.createAttributes(Tiers.DIAMOND, Atk, Spd)));

	}

	public BaseSwordItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}

	public BaseSwordItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

}