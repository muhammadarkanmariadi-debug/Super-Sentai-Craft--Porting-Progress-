package com.liasdan.supersentaicraft.items.sentai_50.zenkaiger;

import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_50.ZenkaigerItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

public class ZenkaiGearItem extends RangerFormChangeItem {

    private final int num;
    private final int lockNum;

    public ZenkaiGearItem(Properties properties, int armorIndex, String riderType, String formString, String beltString, int num, int lockNum) {
        super(properties, armorIndex, riderType, formString, beltString);
        this.num = num;
        this.lockNum = lockNum;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        InteractionResultHolder<ItemStack> result = super.use(level, player, hand);
        ItemStack itemstack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

            if (!belt.isEmpty()) {
                if (belt.getItem() == ZenkaigerItems.ZENKAIZER_GEARTLINGER.get() ||
                    belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get() ||
                    belt.getItem() == ZenkaigerItems.STACAESAR_GEARTOZINGER.get() ||
                    belt.getItem() == ZenkaigerItems.HAKAIZER_BELT.get() ||
                    belt.getItem() == ZenkaigerItems.TWOKAI_FLINT_GEARDALINGER.get()) {

                    // If it's Twokaizer related gear, it sets Lock instead of Core
                    if (this == ZenkaigerItems.TWOKAI_CUTANNER_GEAR.get() || this == ZenkaigerItems.TWOKAI_RICKY_GEAR.get()) {
                        setGeartlingerCore(belt, 0);
                        setGeartlingerLock(belt, lockNum);
                    } else if (this == ZenkaigerItems.ZENKAI_ZYU_GEAR.get()) {
                        if (belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get()) {
                            setGeartlingerCore(belt, 0);
                            setGeartlingerLock(belt, 5);
                        } else {
                            setGeartlingerCore(belt, num);
                            setGeartlingerLock(belt, 0);
                        }
                    } else {
                        // Standard Zenkai Gears
                        setGeartlingerCore(belt, num);
                        setGeartlingerLock(belt, 0);
                    }
                }
            }
        }

        return result;
    }

    private void setGeartlingerCore(ItemStack itemstack, int value) {
        CustomData customData = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = customData.copyTag();
        tag.putInt("Core", value);
        itemstack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }

    private void setGeartlingerLock(ItemStack itemstack, int value) {
        CustomData customData = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = customData.copyTag();
        tag.putInt("Lock", value);
        itemstack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }
}
