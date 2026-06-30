package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class GoodStrikerEntity extends BaseMechaEntity {
    public GoodStrikerEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, true);
        NAME = "good_striker";
        NAME_MODEL = "good_striker";
        NAME_ANIMATIONS = "good_striker";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "good_striker" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "good_striker" + ".walk");
    }
}
