package com.liasdan.supersentaicraft.entity.footsoldier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class JimmersEntity extends BaseFootsoldierEntity {
    public JimmersEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        this.NAME = "jimmers";
    }
}
