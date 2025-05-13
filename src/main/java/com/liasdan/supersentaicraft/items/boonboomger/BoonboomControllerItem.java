package com.liasdan.supersentaicraft.items.boonboomger;

import com.liasdan.supersentaicraft.items.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.EventHooks;

public class BoonboomControllerItem extends BaseBlasterItem {

	public BoonboomControllerItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int num, boolean flag) {
		if (entity instanceof Player playerIn) {
			if (playerIn.getItemInHand(InteractionHand.MAIN_HAND).getItem() == BoonboomgerItems.BOONBOOM_CONTROLLER.get())
				playerIn.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,40,13));
		}
	}
}
