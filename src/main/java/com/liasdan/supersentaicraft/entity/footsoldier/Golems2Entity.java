package com.liasdan.supersentaicraft.entity.footsoldier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class Golems2Entity extends BaseFootsoldierEntity {
    public Golems2Entity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        this.NAME = "golems_2";
    }
}
