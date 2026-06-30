package com.liasdan.supersentaicraft.items.sentai_40.toqger;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems;

import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;

public class ResshaItem extends RangerFormChangeItem {

    public ResshaItem(Properties properties, int belt, String formName, String ridername, String beltTex, MobEffectInstance... effects) {
        super(properties, belt, formName, ridername, beltTex, effects);
        this.OVERRIDE_RANGER_NAME = ridername; // Ensure Norikae uses this Ressha's color/form
    }

    @Override
    public Boolean CanChange(Player player, RangerChangerItem belt, ItemStack stack) {
        // Allow any ToQger to use any Ressha for Norikae, Wild, etc.
        if (belt.Rider.startsWith("toq_") || belt.Rider.equals("yami_0gou")) {
            return true;
        }
        return super.CanChange(player, belt, stack);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);


        // --- Rainbow ToQ 1gou Check ---
        if (player.getInventory().countItem(ToqgerItems.RED_RESSHA.get()) > 0 &&
            player.getInventory().countItem(ToqgerItems.BLUE_RESSHA.get()) > 0 &&
            player.getInventory().countItem(ToqgerItems.YELLOW_RESSHA.get()) > 0 &&
            player.getInventory().countItem(ToqgerItems.GREEN_RESSHA.get()) > 0 &&
            player.getInventory().countItem(ToqgerItems.PINK_RESSHA.get()) > 0 &&
            player.getInventory().countItem(ToqgerItems.BUILD_RESSHA.get()) > 0 ) {
            
            if (belt.isEmpty()) {
                ItemStack newBelt = new ItemStack(ToqgerItems.TOQ_1GOU_CHANGER.get());
                com.liasdan.supersentaicraft.items.others.RangerChangerItem.set_Form_Item(newBelt, ToqgerItems.RAINBOW_RESSHA.get(), 1);
                player.setItemSlot(EquipmentSlot.FEET, newBelt);
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            } else if (belt.getItem() instanceof com.liasdan.supersentaicraft.items.others.RangerChangerItem) {
                com.liasdan.supersentaicraft.items.others.RangerChangerItem.set_Form_Item(belt, ToqgerItems.RAINBOW_RESSHA.get(), 1);
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }

        if (belt.isEmpty()) {
            ItemStack newBelt = ItemStack.EMPTY;
            String gender = "guy";

            if (this == ToqgerItems.RED_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.TOQ_1GOU_CHANGER.get());
                gender = "guy";
            } else if (this == ToqgerItems.BLUE_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.TOQ_2GOU_CHANGER.get());
                gender = "guy";
            } else if (this == ToqgerItems.YELLOW_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.TOQ_3GOU_CHANGER.get());
                gender = "girl";
            } else if (this == ToqgerItems.GREEN_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.TOQ_4GOU_CHANGER.get());
                gender = "guy";
            } else if (this == ToqgerItems.PINK_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.TOQ_5GOU_CHANGER.get());
                gender = "girl";
            } else if (this == ToqgerItems.BUILD_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.TOQ_6GOU_APPLI_CHANGER.get());
                gender = "guy";
            } else if (this == ToqgerItems.VIOLET_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.TOQ_7GOU_CHANGER.get());
                gender = "guy";
            } else if (this == ToqgerItems.ZERO_RESSHA.get()) {
                newBelt = new ItemStack(ToqgerItems.YAMI_0GOU_CHANGER.get());
                gender = "guy";
            }

            if (!newBelt.isEmpty()) {
                if (!newBelt.has(DataComponents.CUSTOM_DATA)) {
                    newBelt.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
                }
                final String finalGender = gender;
                Consumer<CompoundTag> data = form -> form.putString("toq_gender", finalGender);
                CustomData.update(DataComponents.CUSTOM_DATA, newBelt, data);

                RangerChangerItem.set_Form_Item(newBelt, this, 1);
                player.setItemSlot(EquipmentSlot.FEET, newBelt);
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }
        
        // --- Hyper ToQger Overlay Logic ---
        if (!belt.isEmpty() && belt.getItem() instanceof RangerChangerItem) {
            if (this == ToqgerItems.HYPER_RESSHA.get()) {
                Consumer<CompoundTag> data = form -> {
                    if (form.getString("toq_overlay").equals("toq_hyper")) form.putString("toq_overlay", "");
                    else form.putString("toq_overlay", "toq_hyper");
                    form.putBoolean("Update_form", true);
                };
                if (!belt.has(DataComponents.CUSTOM_DATA)) {
                    belt.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
                }
                CustomData.update(DataComponents.CUSTOM_DATA, belt, data);
                player.setItemSlot(EquipmentSlot.FEET, belt); // Force sync
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }
        
        return super.use(level, player, hand);
    }
}
