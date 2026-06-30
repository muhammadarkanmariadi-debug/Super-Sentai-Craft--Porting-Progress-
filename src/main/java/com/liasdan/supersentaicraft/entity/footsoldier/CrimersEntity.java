package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CrimersEntity extends BaseFootsoldierEntity {

    public CrimersEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="crimer";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.CRIMERS_SWORD.get()));
    }
}