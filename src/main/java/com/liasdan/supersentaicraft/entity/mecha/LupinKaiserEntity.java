package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class LupinKaiserEntity extends BaseMechaEntity {
    public LupinKaiserEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, false);
        NAME = "lupinkaiser";
        NAME_MODEL = "lupinkaiser";
        NAME_ANIMATIONS = "lupinkaiser";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "lupinkaiser" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "lupinkaiser" + ".walk");
    }
}
