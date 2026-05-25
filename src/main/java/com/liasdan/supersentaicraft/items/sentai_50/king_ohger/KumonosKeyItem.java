package com.liasdan.supersentaicraft.items.sentai_50.king_ohger;

import com.liasdan.supersentaicraft.items.sentai_50.KingOhgerItems;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class KumonosKeyItem extends BaseItem {

	public KumonosKeyItem(Properties properties) {
		super( properties);
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()== KingOhgerItems.KUMONO_SLAYER.get())
		{
			if (BELT.isEmpty())
			{
				if (this == KingOhgerItems.CHANGE_KUMONOS_KEY.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(KingOhgerItems.SPIDER_KUMONO_SLAYER.get()));
				}
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}