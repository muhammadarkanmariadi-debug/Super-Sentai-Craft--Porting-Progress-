package com.liasdan.supersentaicraft.items.sentai_50.boonboomger;

import com.liasdan.supersentaicraft.items.sentai_50.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.EventHooks;

public class ZoonzoomShokaBlasterItem extends BaseBlasterItem {

	public ZoonzoomShokaBlasterItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}

	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack itemstack = player.getItemInHand(hand);
		ItemStack BELT = player.getItemBySlot(EquipmentSlot.FEET);

		if (BELT.getItem() instanceof RangerChangerItem belt) {

			if (this== BoonboomgerItems.ZOONZOOM_SHOKA_BLASTER.get())
			{
				if (player.isShiftKeyDown())
				{
					if (RangerChangerItem.get_Form_Item(BELT, 1).getFormName(false)=="_119"|
							(RangerChangerItem.get_Form_Item(BELT, 1).getFormName(false)=="_007")|
							(RangerChangerItem.get_Form_Item(BELT, 1).getFormName(false)=="_110")) ((RangerFormChangeItem)belt.Base_Form_Item).use(level,player,hand);
					else ((RangerFormChangeItem)BoonboomgerItems.BUN_RED_119.get()).use(level,player,hand);

				}
			}
		}

		boolean flag = !player.getProjectile(itemstack).isEmpty();
		InteractionResultHolder<ItemStack> ret = EventHooks.onArrowNock(itemstack, level, player, hand, flag);

		if (ret != null) return ret;
		else {
			player.startUsingItem(hand);
			return InteractionResultHolder.consume(itemstack);
		}
	}
}