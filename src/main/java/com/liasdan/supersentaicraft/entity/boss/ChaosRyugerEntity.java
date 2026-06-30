package com.liasdan.supersentaicraft.entity.boss;

import com.liasdan.supersentaicraft.entity.footsoldier.BaseFootsoldierEntity;
import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ChaosRyugerEntity extends BaseFootsoldierEntity {

    public ChaosRyugerEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="ld_chaos_ryuger";

        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(KyoryugerItems.KYORYUGER_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(KyoryugerItems.KYORYUGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(KyoryugerItems.KYORYUGER_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(KyoryugerItems.CHAOS_STONE.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyoryugerItems.CHAOS_CALIBUR.get()));
        
        this.armorDropChances[EquipmentSlot.HEAD.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.CHEST.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.LEGS.getIndex()] = 0.0F;
        this.armorDropChances[EquipmentSlot.FEET.getIndex()] = 0.0F;
        this.handDropChances[EquipmentSlot.MAINHAND.getIndex()] = 0.0F;
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 128.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.3F)
                .add(Attributes.ATTACK_DAMAGE, 10.0D)
                .add(Attributes.ARMOR, 4.0D)
                .add(Attributes.MAX_HEALTH, 80.0D);
    }

    @Override
    protected void dropCustomDeathLoot(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource damageSource, boolean recentlyHit) {
        super.dropCustomDeathLoot(serverLevel, damageSource, recentlyHit);
        
        this.spawnAtLocation(new ItemStack(KyoryugerItems.BLANK_DEBOTH_ZYUDENCHI.get(), 5));
        
        int rand = this.random.nextInt(5);
        if (rand == 0) {
            this.spawnAtLocation(KyoryugerItems.CHAOS_CALIBUR.get());
        } else if (rand == 1) {
            this.spawnAtLocation(KyoryugerItems.CHAOS_STONE.get());
        }
    }
}
