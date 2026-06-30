package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.entity.boss.BraveKyoryuGoldEntity;
import com.liasdan.supersentaicraft.entity.boss.ChaosRyugerEntity;
import com.liasdan.supersentaicraft.entity.boss.DeathryugerEntity;
import com.liasdan.supersentaicraft.entity.boss.DogoldEntity;
import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;

public class ZorimasEntity extends BaseFootsoldierEntity {

    public ZorimasEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME = "zorimas";
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 40.0D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.3F)
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.ARMOR, 1.0D)
                .add(Attributes.MAX_HEALTH, 20.0D);
    }

    @Override
    protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource damageSource, boolean recentlyHit) {
        super.dropCustomDeathLoot(serverLevel, damageSource, recentlyHit);

        // Spawn Kyoryuger Zyudenchi
        int randZyudenchi = this.random.nextInt(6);
        switch (randZyudenchi) {
            case 0:
                this.spawnAtLocation(new ItemStack(KyoryugerItems.GABUTYRA_ZYUDENCHI.get(), 1));
                break;
            case 1:
                this.spawnAtLocation(new ItemStack(KyoryugerItems.PARASAGUN_ZYUDENCHI.get(), 1));
                break;
            case 2:
                this.spawnAtLocation(new ItemStack(KyoryugerItems.STEGOTCHI_ZYUDENCHI.get(), 1));
                break;
            case 3:
                this.spawnAtLocation(new ItemStack(KyoryugerItems.ZAKUTOR_ZYUDENCHI.get(), 1));
                break;
            case 4:
                this.spawnAtLocation(new ItemStack(KyoryugerItems.DRICERA_ZYUDENCHI.get(), 1));
                break;
            case 5:
                this.spawnAtLocation(new ItemStack(KyoryugerItems.EMPTY_ZYUDENCHI.get(), 2));
                break;
        }

        // Random chance to spawn a Boss upon death if attacked by player
        if (damageSource.getEntity() instanceof net.minecraft.world.entity.player.Player) {
            int randBoss = this.random.nextInt(10);
            if (randBoss == 0) {
                int bossType = this.random.nextInt(4);
                Monster boss = null;
                switch (bossType) {
                    case 0:
                        boss = new DogoldEntity(MobsCore.DOGOLD.get(), this.level());
                        break;
                    case 1:
                        boss = new DeathryugerEntity(MobsCore.DEATHRYUGER.get(), this.level());
                        break;
                    case 2:
                        boss = new ChaosRyugerEntity(MobsCore.CHAOS_RYUGER.get(), this.level());
                        break;
                    case 3:
                        boss = new BraveKyoryuGoldEntity(MobsCore.BRAVE_KYORYU_GOLD.get(), this.level());
                        break;
                }
                
                if (boss != null) {
                    boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
                    this.level().addFreshEntity(boss);
                }
            }
        }
    }
}
