package com.liasdan.supersentaicraft.items.sentai_50.boonboomger;

import com.liasdan.supersentaicraft.items.sentai_50.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

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
