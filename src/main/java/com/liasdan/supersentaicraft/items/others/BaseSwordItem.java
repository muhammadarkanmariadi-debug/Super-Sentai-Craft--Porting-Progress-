package com.liasdan.supersentaicraft.items.others;

import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.GorangerItems;

import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

public class BaseSwordItem extends SwordItem {

	private Item RepairItem = GorangerItems.GORANGER_LOGO.get();

	private Item craftingRemainingItem = null;
	
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

	public BaseSwordItem KeepDifItem(Item Dif) {
		craftingRemainingItem=Dif;
		return this;
	}

	public BaseSwordItem KeepItem() {
		craftingRemainingItem=this;
		return this;
	}

	public ItemStack getCraftingRemainingItem(ItemStack stack)
	{
		if (stack.getItem() instanceof BaseSwordItem) {
			if (!hasCraftingRemainingItem(stack))
			{
				return ItemStack.EMPTY;
			}
			return new ItemStack(craftingRemainingItem);
		} else  return new ItemStack(this.getCraftingRemainingItem());
	}


	public boolean hasCraftingRemainingItem(ItemStack stack)
	{
		return ((BaseSwordItem)stack.getItem()).craftingRemainingItem!=null;
	}
}