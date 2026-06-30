package com.liasdan.supersentaicraft.items.others;

import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.sentai_10.GorangerItems;

import net.minecraft.world.item.*;

public class BaseSwordItem extends SwordItem {

	private java.util.function.Supplier<Item> RepairItem = GorangerItems.GORANGER_LOGO;

	private Item craftingRemainingItem = null;
	private java.util.function.Supplier<Item> craftingRemainingItemSupplier = null;
    private Boolean Dual = false;
	
	public BaseSwordItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, prop.attributes(SwordItem.createAttributes(Tiers.DIAMOND, Atk, Spd)));

	}

	public BaseSwordItem ChangeRepairItem(Item item) {
		RepairItem = () -> item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem.get();
	}

	public BaseSwordItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	public BaseSwordItem KeepDifItem(Item Dif) {
		craftingRemainingItem=Dif;
		return this;
	}

	public BaseSwordItem KeepDifItemSupplier(java.util.function.Supplier<Item> Dif) {
		craftingRemainingItemSupplier = Dif;
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
			if (craftingRemainingItemSupplier != null) {
				return new ItemStack(craftingRemainingItemSupplier.get());
			}
			return new ItemStack(craftingRemainingItem);
		} else  return new ItemStack(this.getCraftingRemainingItem());
	}


	public boolean hasCraftingRemainingItem(ItemStack stack)
	{
		return ((BaseSwordItem)stack.getItem()).craftingRemainingItem!=null || ((BaseSwordItem)stack.getItem()).craftingRemainingItemSupplier != null;
	}

    public BaseSwordItem IsDualWeapon() {
        Dual = true;
        SuperSentaiCraftCore.MULTI_WEAPON_ITEM.add(this);
        return this;
    }
}