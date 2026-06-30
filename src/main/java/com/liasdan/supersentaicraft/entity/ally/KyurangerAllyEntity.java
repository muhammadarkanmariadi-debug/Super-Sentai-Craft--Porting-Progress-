package com.liasdan.supersentaicraft.entity.ally;

import com.liasdan.supersentaicraft.items.sentai_50.KyurangerItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class KyurangerAllyEntity extends BaseAllyEntity {

    public KyurangerAllyEntity(EntityType<? extends BaseAllyEntity> type, Level level) {
        super(type, level);
        NAME = "kyuranger";

        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(KyurangerItems.KYURANGER_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(KyurangerItems.KYURANGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(KyurangerItems.KYURANGER_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(KyurangerItems.RED_SEIZA_BLASTER.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_SWORD.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(KyurangerItems.SEIZA_BLASTER.get()));

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
        
        this.spawnAtLocation(new ItemStack(KyurangerItems.FUTAGO_KYUTAMA.get(), 1));
    }
}
