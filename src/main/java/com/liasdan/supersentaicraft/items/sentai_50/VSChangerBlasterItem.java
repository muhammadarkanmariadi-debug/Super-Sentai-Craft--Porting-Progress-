package com.liasdan.supersentaicraft.items.sentai_50;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.entity.mecha.*;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.EventHooks;

public class VSChangerBlasterItem extends BaseBlasterItem {

    public VSChangerBlasterItem(Tier toolTier, int Atk, float Spd, Properties prop) {
        super(toolTier, Atk, Spd, prop);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        
        System.out.println("VSChangerBlasterItem use() called! ClientSide: " + level.isClientSide() + ", Shift: " + player.isShiftKeyDown());

        return super.use(level, player, hand);
    }
}
