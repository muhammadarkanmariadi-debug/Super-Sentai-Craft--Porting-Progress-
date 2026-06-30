package com.liasdan.supersentaicraft.items.sentai_30.abaranger;

import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import java.util.function.Consumer;

public class BakuryuuJointItem extends BaseItem {
    public int num;
    public String num2;

    public BakuryuuJointItem(int armor, String part, Properties properties) {
        super(properties);
        this.num = armor;
        this.num2 = part;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack headStack = player.getItemBySlot(EquipmentSlot.HEAD);
        if (!headStack.isEmpty() && headStack.getItem() instanceof AbarangerMechaItem belt) {
            
            Consumer<CompoundTag> data = form -> {
                if (this.num2.equals("right")) {
                    form.putInt("right", this.num);
                } else if (this.num2.equals("left")) {
                    form.putInt("left", this.num);
                } else {
                    form.putInt("right", 0);
                    form.putInt("left", 0);
                }
                form.putBoolean("Update_form", true);
            };
            
            if (!headStack.has(DataComponents.CUSTOM_DATA)) {
                headStack.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
            }
            CustomData.update(DataComponents.CUSTOM_DATA, headStack, data);
            
            player.startUsingItem(hand);
            return InteractionResultHolder.success(player.getItemInHand(hand));
        }
        return super.use(level, player, hand);
    }
}
