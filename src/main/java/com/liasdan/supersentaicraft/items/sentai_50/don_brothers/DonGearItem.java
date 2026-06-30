package com.liasdan.supersentaicraft.items.sentai_50.don_brothers;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
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
 * Ported from 1.12.2 item_don_gear.java.
 * Handles henshin logic when holding the Don Gear and having the
 * associated changer in the offhand. Also updates NBT state on the
 * equipped belt (core, lock, armor).
 */
public class DonGearItem extends RangerFormChangeItem {

    public DonGearItem(Properties properties, int belt, String formName, String rangername, String beltTex) {
        super(properties, belt, formName, rangername, beltTex);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);
            ItemStack offhand = player.getItemInHand(InteractionHand.OFF_HAND);
            Item feetItem = feet.getItem();
            Item offhandItem = offhand.getItem();

            if (!feet.isEmpty() && feetItem instanceof RangerChangerItem) {
                // Henshin NBT updates on existing belt
                if (feetItem == DonbrothersItems.TORADORA_RYUKO_NO_GEKI.get()) {
                    if (this == DonbrothersItems.DON_DORAGOKU_AVATAROU_GEAR.get()) {
                        setNBT(feet, "core", 0);
                    } else if (this == DonbrothersItems.DON_TORABOLT_AVATAROU_GEAR.get()) {
                        setNBT(feet, "core", 1);
                    }
                } else if (this == DonbrothersItems.OMIKOSHI_PHOENIX.get()) {
                    setNBT(feet, "core", 1);
                    setNBT(feet, "armor", 1); // equivalent to lock in 1.12.2
                } else if (this == DonbrothersItems.ONI_SISTER_MANGA_AVATAROU_GEAR.get()) {
                    setNBT(feet, "core", 1);
                    setNBT(feet, "armor", 2); // equivalent to lock in 1.12.2
                } else if (feetItem == DonbrothersItems.MOMOTAROU_DON_BLASTER.get() ||
                           feetItem == DonbrothersItems.SARU_DON_BLASTER.get() ||
                           feetItem == DonbrothersItems.ONI_DON_BLASTER.get() ||
                           feetItem == DonbrothersItems.INU_DON_BLASTER.get() ||
                           feetItem == DonbrothersItems.KIJI_DON_BLASTER.get() ||
                           feetItem == DonbrothersItems.MURASAME_NINJARK_SWORD.get()) {
                    // Reset NBT on standard henshin
                    setNBT(feet, "core", 0);
                    setNBT(feet, "armor", 0);
                    setNBT(feet, "alter", 0);
                    setNBT(feet, "avatar", 0);
                }
            } else if (feet.isEmpty()) {
                // Equip belt if holding changer in offhand
                if (offhandItem == DonbrothersItems.DON_BLASTER.get()) {
                    Item beltToEquip = null;
                    if (this == DonbrothersItems.DON_MOMOTAROU_AVATAROU_GEAR.get()) beltToEquip = DonbrothersItems.MOMOTAROU_DON_BLASTER.get();
                    else if (this == DonbrothersItems.SARU_BROTHER_AVATAROU_GEAR.get()) beltToEquip = DonbrothersItems.SARU_DON_BLASTER.get();
                    else if (this == DonbrothersItems.ONI_SISTER_AVATAROU_GEAR.get()) beltToEquip = DonbrothersItems.ONI_DON_BLASTER.get();
                    else if (this == DonbrothersItems.INU_BROTHER_AVATAROU_GEAR.get()) beltToEquip = DonbrothersItems.INU_DON_BLASTER.get();
                    else if (this == DonbrothersItems.KIJI_BROTHER_AVATAROU_GEAR.get()) beltToEquip = DonbrothersItems.KIJI_DON_BLASTER.get();

                    if (beltToEquip != null) {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(beltToEquip));
                        if (!player.isCreative()) {
                            itemstack.shrink(1);
                        }
                    }
                } else if (offhandItem == DonbrothersItems.RYUKO_NO_GEKI.get()) {
                    if (this == DonbrothersItems.DON_DORAGOKU_AVATAROU_GEAR.get() || this == DonbrothersItems.DON_TORABOLT_AVATAROU_GEAR.get()) {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(DonbrothersItems.TORADORA_RYUKO_NO_GEKI.get()));
                        if (!player.isCreative()) {
                            itemstack.shrink(1);
                        }
                    }
                } else if (offhandItem == DonbrothersItems.NINJARK_SWORD.get()) {
                    if (this == DonbrothersItems.DON_MURASAME_AVATAROU_GEAR.get()) {
                        player.setItemSlot(EquipmentSlot.FEET, new ItemStack(DonbrothersItems.MURASAME_NINJARK_SWORD.get()));
                        if (!player.isCreative()) {
                            itemstack.shrink(1);
                        }
                    }
                }
            }
        }
        return super.use(level, player, hand);
    }

    public static void setNBT(ItemStack stack, String key, int value) {
        Consumer<CompoundTag> data = tag -> tag.putInt(key, value);
        CustomData.update(DataComponents.CUSTOM_DATA, stack, data);
    }
}
