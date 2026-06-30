package com.liasdan.supersentaicraft.items.sentai_40.goonger;

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

public class EngineSoulItem extends BaseItem {
    public int num;
    public String num2;

    public EngineSoulItem(int armor, String part, Properties properties) {
        super(properties);
        this.num = armor;
        this.num2 = part;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack headStack = player.getItemBySlot(EquipmentSlot.HEAD);
        if (!headStack.isEmpty() && headStack.getItem() instanceof GoOngerMechaItem belt) {
            
            Consumer<CompoundTag> data = form -> {
                if (belt.Rider.equals("seikuu_oh")) {
                    if (this.num == 1 && this.num2.equals("left")) { // Birca
                        form.putInt("left", 1);
                    } else if (this.num == 2 && this.num2.equals("right")) { // Gunpherd
                        form.putInt("right", 2);
                    } else if (this.num == 3 && this.num2.equals("right") || this.num == 3 && this.num2.equals("left")) { // Toripter/Jetras
                        form.putInt("right", 0);
                        form.putInt("left", 0);
                    } else {
                        if (this.num2.equals("right")) {
                            form.putInt("right", this.num);
                        } else if (this.num2.equals("left")) {
                            form.putInt("left", this.num);
                        } else {
                            form.putInt("right", 0);
                            form.putInt("left", 0);
                        }
                    }
                } else if (belt.Rider.equals("gunbir_oh")) {
                    if (this.num == 1 && this.num2.equals("left") || this.num == 2 && this.num2.equals("right")) { // Birca or Gunpherd
                        form.putInt("right", 0);
                        form.putInt("left", 0);
                    } else {
                        if (this.num2.equals("right")) {
                            form.putInt("right", this.num);
                        } else if (this.num2.equals("left")) {
                            form.putInt("left", this.num);
                        } else {
                            form.putInt("right", 0);
                            form.putInt("left", 0);
                        }
                    }
                } else if (belt.Rider.equals("engine_oh")) {
                    if (this.num2.equals("right")) {
                        form.putInt("right", this.num);
                    } else if (this.num2.equals("left")) {
                        form.putInt("left", this.num);
                    } else {
                        form.putInt("right", 0);
                        form.putInt("left", 0);
                    }
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
