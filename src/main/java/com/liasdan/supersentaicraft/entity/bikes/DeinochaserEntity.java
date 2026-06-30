package com.liasdan.supersentaicraft.entity.bikes;

import com.liasdan.supersentaicraft.entity.MobsCore;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class DeinochaserEntity extends baseBikeEntity {



	public DeinochaserEntity(EntityType<? extends baseBikeEntity> entityType, Level level) {
		super(entityType, level, com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems.DEINOCHASER_ZYUDENCHI.get());
		NAME ="deinochaser";
		NAME_MODEL ="deinochaser";
		NAME_ANIMATIONS ="deinochaser";
		}


	public static AttributeSupplier.Builder setAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ATTACK_DAMAGE, 2.0D);
	}
}
