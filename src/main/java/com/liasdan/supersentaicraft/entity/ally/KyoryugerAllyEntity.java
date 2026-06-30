package com.liasdan.supersentaicraft.entity.ally;

import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class KyoryugerAllyEntity extends BaseAllyEntity {

    public KyoryugerAllyEntity(EntityType<? extends BaseAllyEntity> type, Level level) {
        super(type, level);
        NAME = "kyoryuger";

        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(KyoryugerItems.KYORYUGER_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(KyoryugerItems.KYORYUGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(KyoryugerItems.KYORYUGER_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(KyoryugerItems.KYORYU_RED_GABURIVOLVER.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyoryugerItems.GABURICALIBUR.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(KyoryugerItems.GABURIVOLVER.get()));

        this.handDropChances[EquipmentSlot.MAINHAND.getIndex()] = 0.0F;
        this.handDropChances[EquipmentSlot.OFFHAND.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.CHEST.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.HEAD.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.FEET.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.LEGS.getIndex()] = 0.0F;
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 32.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.5D)
                .add(Attributes.ATTACK_DAMAGE, 7.0D)
                .add(Attributes.ARMOR, 2.0D)
                .add(Attributes.MAX_HEALTH, 100.0D);
    }
    
    @Override
    protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource damageSource, boolean recentlyHit) {
        super.dropCustomDeathLoot(serverLevel, damageSource, recentlyHit);
    }
}
