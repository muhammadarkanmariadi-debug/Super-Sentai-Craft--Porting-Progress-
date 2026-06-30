package com.liasdan.supersentaicraft.items.sentai_50.don_brothers;

import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_50.DonbrothersItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;

/**
 * Ported from 1.12.2 item_alter_gear.java.
 * Sets the "alter" NBT tag on an equipped Don Blaster belt,
 * enabling the Alter form overlay. Each belt type (Momotarou/Toradora/Murasame)
 * has a specific "base" alter gear that can initiate alter mode.
 */
public class AlterGearItem extends BaseItem {

    private final int num;

    public AlterGearItem(Properties properties, int alterNum) {
        super(properties);
        this.num = alterNum;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

            if (!belt.isEmpty() && belt.getItem() instanceof RangerChangerItem) {
                Item beltItem = belt.getItem();

                if (beltItem == DonbrothersItems.MOMOTAROU_DON_BLASTER.get()) {
                    if (this == DonbrothersItems.DON_MOMOTAROU_AVATAROU_GEAR_ALTER.get()) {
                        // Base alter gear for Momotarou: set alter, clear avatar/lock/core
                        setNBT(belt, "alter", num);
                        setNBT(belt, "avatar", 0);
                        setNBT(belt, "armor", 0);
                        setNBT(belt, "core", 0);
                    } else if (getNBT(belt, "alter") != 0) {
                        // Already in alter mode: swap alter variant
                        setNBT(belt, "alter", num);
                        setNBT(belt, "avatar", 0);
                    }
                } else if (beltItem == DonbrothersItems.TORADORA_RYUKO_NO_GEKI.get()) {
                    if (this == DonbrothersItems.DON_DORAGOKU_AVATAROU_GEAR_ALTER.get()) {
                        setNBT(belt, "alter", num);
                        setNBT(belt, "avatar", 0);
                        setNBT(belt, "armor", 0);
                    } else if (getNBT(belt, "alter") != 0) {
                        setNBT(belt, "alter", num);
                        setNBT(belt, "avatar", 0);
                    }
                } else if (beltItem == DonbrothersItems.MURASAME_NINJARK_SWORD.get()) {
                    if (this == DonbrothersItems.DON_MURASAME_AVATAROU_GEAR_ALTER.get()) {
                        setNBT(belt, "alter", num);
                        setNBT(belt, "avatar", 0);
                        setNBT(belt, "armor", 0);
                    } else if (getNBT(belt, "alter") != 0) {
                        setNBT(belt, "alter", num);
                        setNBT(belt, "avatar", 0);
                    }
                }
            }
        }

        return InteractionResultHolder.success(itemstack);
    }

    // --- NBT helpers using CustomData ---

    public static int getNBT(ItemStack stack, String key) {
        if (stack.has(DataComponents.CUSTOM_DATA)) {
            CompoundTag tag = stack.get(DataComponents.CUSTOM_DATA).copyTag();
            return tag.getInt(key);
        }
        return 0;
    }

    public static void setNBT(ItemStack stack, String key, int value) {
        Consumer<CompoundTag> data = tag -> tag.putInt(key, value);
        CustomData.update(DataComponents.CUSTOM_DATA, stack, data);
    }
}
