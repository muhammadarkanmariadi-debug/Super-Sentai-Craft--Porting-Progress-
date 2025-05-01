package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NejirettasEntity extends BaseFootsoldierEntity {

    public NejirettasEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="nejiretta";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.MUFFLAMBO.get()));
    }
}