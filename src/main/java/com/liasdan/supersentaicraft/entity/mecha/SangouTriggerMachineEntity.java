package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class SangouTriggerMachineEntity extends BaseMechaEntity {
    public SangouTriggerMachineEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, false);
        NAME = "sanggo";
        NAME_MODEL = "sanggo";
        NAME_ANIMATIONS = "sanggo";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "sanggo" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "sanggo" + ".walk");
    }
}
