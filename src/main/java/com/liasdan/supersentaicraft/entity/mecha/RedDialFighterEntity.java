package com.liasdan.supersentaicraft.entity.mecha;

import com.liasdan.supersentaicraft.entity.MobsCore;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class RedDialFighterEntity extends BaseMechaEntity {
    public RedDialFighterEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, true);
        NAME = "red";
        NAME_MODEL = "red";
        NAME_ANIMATIONS = "red";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "red" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "red" + ".walk");
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.level().isClientSide() && this.tickCount % 20 == 0) {
            double radius = 75.0D;
            
            java.util.List<BlueDialFighterEntity> blueList = this.level().getEntitiesOfClass(BlueDialFighterEntity.class, this.getBoundingBox().inflate(radius));
            java.util.List<YellowDialFighterEntity> yellowList = this.level().getEntitiesOfClass(YellowDialFighterEntity.class, this.getBoundingBox().inflate(radius));
            java.util.List<GoodStrikerEntity> gsList = this.level().getEntitiesOfClass(GoodStrikerEntity.class, this.getBoundingBox().inflate(radius));

            if (!blueList.isEmpty() && !yellowList.isEmpty() && !gsList.isEmpty()) {
                LupinKaiserEntity lupinKaiser = MobsCore.LUPIN_KAISER.get().create(this.level());
                if (lupinKaiser != null) {
                    lupinKaiser.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
                    this.level().addFreshEntity(lupinKaiser);
                    lupinKaiser.triggerAnim("action_controller", "gattai");

                    blueList.get(0).discard();
                    yellowList.get(0).discard();
                    gsList.get(0).discard();
                    this.discard();
                }
            }
        }
    }
}
