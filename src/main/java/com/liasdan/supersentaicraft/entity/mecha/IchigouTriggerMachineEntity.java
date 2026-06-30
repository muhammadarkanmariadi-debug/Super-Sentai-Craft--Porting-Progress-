package com.liasdan.supersentaicraft.entity.mecha;

import com.liasdan.supersentaicraft.entity.MobsCore;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animation.RawAnimation;

public class IchigouTriggerMachineEntity extends BaseMechaEntity {
    public IchigouTriggerMachineEntity(EntityType<? extends BaseMechaEntity> entityType, Level level) {
        super(entityType, level, null, false);
        NAME = "ichigo";
        NAME_MODEL = "ichigo";
        NAME_ANIMATIONS = "ichigo";
        
        // Define default animations if applicable
        IDLE = RawAnimation.begin().thenLoop("animation." + "ichigo" + ".idle");
        DRIVE = RawAnimation.begin().thenLoop("animation." + "ichigo" + ".walk");
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.level().isClientSide() && this.tickCount % 20 == 0) {
            double radius = 75.0D;
            
            java.util.List<NigouTriggerMachineEntity> nigouList = this.level().getEntitiesOfClass(NigouTriggerMachineEntity.class, this.getBoundingBox().inflate(radius));
            java.util.List<SangouTriggerMachineEntity> sangouList = this.level().getEntitiesOfClass(SangouTriggerMachineEntity.class, this.getBoundingBox().inflate(radius));
            java.util.List<GoodStrikerEntity> gsList = this.level().getEntitiesOfClass(GoodStrikerEntity.class, this.getBoundingBox().inflate(radius));

            if (!nigouList.isEmpty() && !sangouList.isEmpty() && !gsList.isEmpty()) {
                PatKaiserEntity patKaiser = MobsCore.PAT_KAISER.get().create(this.level());
                if (patKaiser != null) {
                    patKaiser.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
                    this.level().addFreshEntity(patKaiser);
                    patKaiser.triggerAnim("action_controller", "gattai");

                    nigouList.get(0).discard();
                    sangouList.get(0).discard();
                    gsList.get(0).discard();
                    this.discard();
                }
            }
        }
    }
}
