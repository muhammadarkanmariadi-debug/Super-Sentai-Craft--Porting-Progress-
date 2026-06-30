package com.liasdan.supersentaicraft.entity.boss;

import com.liasdan.supersentaicraft.entity.footsoldier.BaseFootsoldierEntity;
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

public class HebitsukaiMetalEntity extends BaseFootsoldierEntity {

    public HebitsukaiMetalEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME = "hebitsukai_metal";

        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.DARK_KYU_SICKLE.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(KyurangerItems.DARK_SEIZA_BLASTER.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(KyurangerItems.KYURANGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(KyurangerItems.KYURANGER_HELMET.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(KyurangerItems.METAL_DARK_SEIZA_BLASTER.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(KyurangerItems.KYURANGER_LEGGINGS.get()));

        this.handDropChances[EquipmentSlot.MAINHAND.getIndex()] = 0.0F;
        this.handDropChances[EquipmentSlot.OFFHAND.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.CHEST.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.HEAD.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.FEET.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.LEGS.getIndex()] = 0.0F;
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 128.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.3F)
                .add(Attributes.ATTACK_DAMAGE, 10.0D)
                .add(Attributes.ARMOR, 5.0D)
                .add(Attributes.MAX_HEALTH, 80.0D);
    }
    
    @Override
    protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource damageSource, boolean recentlyHit) {
        super.dropCustomDeathLoot(serverLevel, damageSource, recentlyHit);
        
        this.spawnAtLocation(new ItemStack(KyurangerItems.BLANK_KYUTAMA.get(), 5));
        
        int r = this.random.nextInt(5);
        if (r == 0) {
            this.spawnAtLocation(new ItemStack(KyurangerItems.DARK_KYU_SICKLE.get(), 1));
        } else if (r == 1) {
            this.spawnAtLocation(new ItemStack(KyurangerItems.DARK_SEIZA_BLASTER.get(), 1));
        }
    }
}
