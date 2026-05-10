package com.liasdan.supersentaicraft.items.king_ohger;

import com.liasdan.supersentaicraft.items.GoBustersItems;
import com.liasdan.supersentaicraft.items.KingOhgerItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class OhgerCaliburSwordItem extends BaseSwordItem {

	public OhgerCaliburSwordItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}
	
	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player player, InteractionHand p_41130_) {

		ItemStack itemstack = player.getItemInHand(p_41130_);

		ItemStack BELT = player.getItemBySlot(EquipmentSlot.FEET);


		if (this == KingOhgerItems.OHGER_CALIBUR.get()) {
			if (player.getItemBySlot(EquipmentSlot.FEET) == ItemStack.EMPTY) {
				if (player.getOffhandItem().getItem() == KingOhgerItems.GOD_TONBO_SOUL.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KingOhgerItems.TONBO_OHGER_CALIBUR.get(), 1));
				else if (player.getOffhandItem().getItem() == KingOhgerItems.GOD_KAMAKIRI_SOUL.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KingOhgerItems.KAMAKIRI_OHGER_CALIBUR.get(), 1));
				else if (player.getOffhandItem().getItem() == KingOhgerItems.GOD_PAPILLON_SOUL.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KingOhgerItems.PAPILLON_OHGER_CALIBUR.get(), 1));
				else if (player.getOffhandItem().getItem() == KingOhgerItems.GOD_HACHI_SOUL.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KingOhgerItems.HACHI_OHGER_CALIBUR.get(), 1));
				else
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KingOhgerItems.KUWAGATA_OHGER_CALIBUR.get(), 1));
			}
		}
		else if (this == KingOhgerItems.OHGER_CALIBUR_ZERO.get()) {
			if (player.getItemBySlot(EquipmentSlot.FEET) == ItemStack.EMPTY)
				player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KingOhgerItems.OH_KUWAGATA_OHGER_CALIBUR_ZERO.get(), 1));
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}