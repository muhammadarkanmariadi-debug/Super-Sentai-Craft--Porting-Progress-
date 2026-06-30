package com.liasdan.supersentaicraft.entity.footsoldier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class BarmiasWhiteEntity extends BaseFootsoldierEntity {
    public BarmiasWhiteEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        this.NAME = "barmias_white";
    }
}
