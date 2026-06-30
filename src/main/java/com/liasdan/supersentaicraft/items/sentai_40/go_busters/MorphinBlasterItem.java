package com.liasdan.supersentaicraft.items.sentai_40.go_busters;

import com.liasdan.supersentaicraft.items.sentai_40.GoBustersItems;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class MorphinBlasterItem extends BaseBlasterItem {

	public MorphinBlasterItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}

	public void releaseUsing(ItemStack stack, Level level, LivingEntity entityLiving, int timeLeft) {
		super.releaseUsing(stack, level, entityLiving, timeLeft);
		if (entityLiving instanceof Player player && level instanceof ServerLevel serverlevel) {
			if (player.getItemBySlot(EquipmentSlot.FEET) == ItemStack.EMPTY) {
				if (player.getOffhandItem().getItem() == GoBustersItems.SILVER_ENETRON.get() | player.getOffhandItem().getItem() == GoBustersItems.STAG_ANIMAL_DISK.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.STAG_MORPHIN_BLASTER.get(), 1));
				else if (player.getOffhandItem().getItem() == GoBustersItems.BEETLE_ANIMAL_DISK.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.BEETLE_MORPHIN_BLASTER.get(), 1));
				else if (player.getOffhandItem().getItem() == GoBustersItems.VAGLASS_LOGO.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.ENTER_MORPHIN_BLASTER.get(), 1));
				else
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.BEET_MORPHIN_BLASTER.get(), 1));
			}
		}
	}
}