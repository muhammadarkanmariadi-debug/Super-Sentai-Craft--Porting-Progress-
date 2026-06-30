package com.liasdan.supersentaicraft.entity.footsoldier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class KunekunesEntity extends BaseFootsoldierEntity {
    public KunekunesEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        this.NAME = "kunekunes";
    }
}
