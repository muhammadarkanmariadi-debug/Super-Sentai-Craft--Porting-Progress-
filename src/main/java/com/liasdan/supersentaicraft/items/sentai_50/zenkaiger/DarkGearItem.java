package com.liasdan.supersentaicraft.items.sentai_50.zenkaiger;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.entity.ally.MechaDarkGearAllyEntity;
import com.liasdan.supersentaicraft.items.others.BaseItem;
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

public class DarkGearItem extends BaseItem {

    private final int num;

    public DarkGearItem(Properties properties, int effectId) {
        super(properties);
        this.num = effectId;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

            if (!belt.isEmpty() && belt.getItem() == ZenkaigerItems.STACAESAR_GEARTOZINGER.get()) {
                if (num != 0) {
                    MechaDarkGearAllyEntity mecha = new MechaDarkGearAllyEntity(MobsCore.MECHA_DARK_GEAR.get(), level);
                    mecha.setPos(player.getX(), player.getY(), player.getZ());
                    
                    ItemStack mechaBelt = mecha.getItemBySlot(EquipmentSlot.FEET);
                    setGeartlingerCore(mechaBelt, num - 1);
                    
                    level.addFreshEntity(mecha);
                    
                    if (!player.getAbilities().instabuild) itemstack.shrink(1);
                }
            }
        }

        return InteractionResultHolder.success(itemstack);
    }

    private void setGeartlingerCore(ItemStack itemstack, int value) {
        CustomData customData = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = customData.copyTag();
        tag.putInt("Core", value);
        itemstack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }
}
