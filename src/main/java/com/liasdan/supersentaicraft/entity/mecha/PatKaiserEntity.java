package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class PatKaiserEntity extends BaseMechaEntity {
    public PatKaiserEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, false);
        NAME = "patkaiser";
        NAME_MODEL = "patkaiser";
        NAME_ANIMATIONS = "patkaiser";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "patkaiser" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "patkaiser" + ".walk");
    }
}
