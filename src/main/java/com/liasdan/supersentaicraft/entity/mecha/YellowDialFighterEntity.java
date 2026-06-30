package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class YellowDialFighterEntity extends BaseMechaEntity {
    public YellowDialFighterEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, true);
        NAME = "yelow";
        NAME_MODEL = "yelow";
        NAME_ANIMATIONS = "yelow";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "yelow" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "yelow" + ".walk");
    }
}
