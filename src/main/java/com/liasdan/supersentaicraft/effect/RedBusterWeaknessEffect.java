package com.liasdan.supersentaicraft.effect;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

import java.util.List;


public class RedBusterWeaknessEffect extends InstantenousMobEffect {


	public RedBusterWeaknessEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}


	@Override
	public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		if (!pLivingEntity.level().isClientSide()) {
			if (pLivingEntity.level() instanceof ServerLevel level) {
				if (pLivingEntity instanceof Player player) {
					List<LivingEntity> chicken = level.getEntitiesOfClass(LivingEntity.class, player.getBoundingBox().inflate(15),
							entity -> (entity instanceof Chicken));

					for (LivingEntity enemy : chicken) {
						player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3, 8, true, true));
						player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3, 8, true, true));
					}
				}
			}
		}
		return true;
	}
}

