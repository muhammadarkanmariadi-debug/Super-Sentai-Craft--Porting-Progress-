package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PordermenEntity extends BaseFootsoldierEntity {

    public PordermenEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="porderman";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.PORDERMAN_SWORD.get()));
    }
}