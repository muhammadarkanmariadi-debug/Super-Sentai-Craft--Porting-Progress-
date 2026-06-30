package com.liasdan.supersentaicraft.items.sentai_30.dekaranger;

import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.registries.DeferredItem;

public class SPBadgeItem extends BaseItem {

    private final DeferredItem<Item> baseForm;
    private final DeferredItem<Item> upgradeForm;

    public SPBadgeItem(DeferredItem<Item> baseForm, DeferredItem<Item> upgradeForm, Properties properties) {
        super(properties);
        this.baseForm = baseForm;
        this.upgradeForm = upgradeForm;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

        if (belt.getItem() instanceof RangerChangerItem) {
            Item currentForm = RangerChangerItem.get_Form_Item(belt, 1);
            if (currentForm == baseForm.get()) {
                RangerChangerItem.set_Form_Item(belt, upgradeForm.get(), 1);
            } else if (currentForm == upgradeForm.get()) {
                RangerChangerItem.set_Form_Item(belt, baseForm.get(), 1);
            }
        }

        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
    }
}
