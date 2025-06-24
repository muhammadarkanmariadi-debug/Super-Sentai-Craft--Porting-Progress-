package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CutmenEntity extends BaseFootsoldierEntity {

    public CutmenEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="cutman";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.CUTMEN_SWORD.get()));
    }
}