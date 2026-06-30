package com.liasdan.supersentaicraft.items.sentai_20.zyuranger;

import com.liasdan.supersentaicraft.items.OtherItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;
import java.util.List;

public class ZyusoukenItem extends BowItem {
    private Item RepairItem = OtherItems.BLANK_FORM.get();
    private Item craftingRemainingItem = null;

    public ZyusoukenItem(Tier toolTier, int Atk, float Spd, Properties prop) {
        super(prop.durability(toolTier.getUses()).attributes(SwordItem.createAttributes(Tiers.DIAMOND, Atk, Spd)));
    }

    public ZyusoukenItem ChangeRepairItem(Item item) {
        RepairItem = item;
        return this;
    }

    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
        return repairCandidate.getItem() == RepairItem;
    }

    public ZyusoukenItem AddToTabList(List<Item> TabList) {
        TabList.add(this);
        return this;
    }

    public ZyusoukenItem KeepDifItem(Item Dif) {
        craftingRemainingItem = Dif;
        return this;
    }

    public ZyusoukenItem KeepItem() {
        craftingRemainingItem = this;
        return this;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        if (stack.getItem() instanceof ZyusoukenItem) {
            if (!hasCraftingRemainingItem(stack)) {
                return ItemStack.EMPTY;
            }
            return new ItemStack(craftingRemainingItem);
        } else return new ItemStack(this.getCraftingRemainingItem());
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return ((ZyusoukenItem)stack.getItem()).craftingRemainingItem != null;
    }

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity entityLiving, int timeLeft) {
        // Implement flute sound logic later if sound event is available
        // if (entityLiving instanceof Player player && level instanceof ServerLevel serverlevel) {
        //     level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), ModSounds.ZYUSOUKEN_FLUTE.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
        // }
    }
}
