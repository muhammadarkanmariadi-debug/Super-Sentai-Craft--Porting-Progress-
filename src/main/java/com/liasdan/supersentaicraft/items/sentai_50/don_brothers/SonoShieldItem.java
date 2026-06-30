package com.liasdan.supersentaicraft.items.sentai_50.don_brothers;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_50.DonbrothersItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;

public class SonoShieldItem extends ShieldItem {
    public SonoShieldItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        
        if (!level.isClientSide()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);
            
            if (player.isShiftKeyDown() && !belt.isEmpty() && belt.getItem() == DonbrothersItems.SONOI_NOUTO_BRACE.get()) {
                if (this == DonbrothersItems.SONO_SHIELD.get()) {
                    int currentLock = getNBT(belt, "lock");
                    
                    if (currentLock != 3) {
                        setNBT(belt, "lock", 3); // kyokatai
                    } else {
                        setNBT(belt, "lock", 0); // normal
                    }
                }
            }
        }
        
        return super.use(level, player, hand);
    }

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
