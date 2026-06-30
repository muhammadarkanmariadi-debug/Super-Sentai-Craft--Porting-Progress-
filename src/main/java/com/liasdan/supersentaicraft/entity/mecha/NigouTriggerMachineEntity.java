package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class NigouTriggerMachineEntity extends BaseMechaEntity {
    public NigouTriggerMachineEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, false);
        NAME = "nigo";
        NAME_MODEL = "nigo";
        NAME_ANIMATIONS = "nigo";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "nigo" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "nigo" + ".walk");
    }
}
