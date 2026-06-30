package com.liasdan.supersentaicraft.entity.footsoldier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class BarmiasBlackEntity extends BaseFootsoldierEntity {
    public BarmiasBlackEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        this.NAME = "barmias_black";
    }
}
