package com.liasdan.supersentaicraft.entity.bikes;

import com.liasdan.supersentaicraft.items.sentai_50.KyurangerItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class GaruBikeEntity extends baseBikeEntity {

    public GaruBikeEntity(EntityType<? extends baseBikeEntity> entityType, Level level) {
        super(entityType, level, KyurangerItems.GYOSHA_KYUTAMA.get());
        NAME = "garu_bike";
        NAME_MODEL = "garu_bike";
        NAME_ANIMATIONS = "garu_bike";
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.3F)
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D);
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide()) {
            for (net.minecraft.world.entity.Entity passenger : this.getPassengers()) {
                if (passenger instanceof net.minecraft.world.entity.LivingEntity living) {
                    living.addEffect(new net.minecraft.world.effect.MobEffectInstance(net.minecraft.world.effect.MobEffects.INVISIBILITY, 2, 0, false, false));
                }
            }
        }
    }

    @Override
    protected void removePassenger(net.minecraft.world.entity.Entity passenger) {
        super.removePassenger(passenger);
        if (!this.level().isClientSide()) {
            this.spawnAtLocation(KyurangerItems.GYOSHA_KYUTAMA.get());
            this.discard();
        }
    }
}
