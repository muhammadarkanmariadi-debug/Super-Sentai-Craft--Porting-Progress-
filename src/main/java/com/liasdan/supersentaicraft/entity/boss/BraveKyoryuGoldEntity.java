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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;

public class BraveKyoryuGoldEntity extends BaseFootsoldierEntity {

    public BraveKyoryuGoldEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME = "brave_kyoryu_gold";

        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyoryugerItems.BRAVE_ZANDAR_THUNDER.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(KyoryugerItems.GABURICHANGER.get()));
        this.handDropChances[EquipmentSlot.MAINHAND.getIndex()] = 0.0F;
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 40.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.4F)
                .add(Attributes.ATTACK_DAMAGE, 10.0D)
                .add(Attributes.ARMOR, 3.0D)
                .add(Attributes.MAX_HEALTH, 100.0D);
    }
    
    @Override
    protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource damageSource, boolean recentlyHit) {
        super.dropCustomDeathLoot(serverLevel, damageSource, recentlyHit);
        
        this.spawnAtLocation(new ItemStack(KyoryugerItems.BLANK_BRAVE_ZYUDENCHI.get(), 2));
        
        int rand = this.random.nextInt(3);
        if (rand == 0) {
            this.spawnAtLocation(KyoryugerItems.GOLD_GABU_GABUCHANGER.get());
        } else if (rand == 1) {
            this.spawnAtLocation(KyoryugerItems.PTERAVOLTON_ZYUDENCHI.get());
        }
    }
}
