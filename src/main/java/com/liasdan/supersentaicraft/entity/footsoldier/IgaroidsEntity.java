package com.liasdan.supersentaicraft.entity.footsoldier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class IgaroidsEntity extends BaseFootsoldierEntity {
    public IgaroidsEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        this.NAME = "igaroids";
    }
}
