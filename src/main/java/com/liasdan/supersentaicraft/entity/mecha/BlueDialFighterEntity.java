package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class BlueDialFighterEntity extends BaseMechaEntity {
    public BlueDialFighterEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, true);
        NAME = "blue";
        NAME_MODEL = "blue";
        NAME_ANIMATIONS = "blue";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "blue" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "blue" + ".walk");
    }
}
