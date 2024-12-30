package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class OrgettesEntity extends BaseFootsoldierEntity {

    public OrgettesEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="orgettes";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.ORGETTES_CLUB.get()));
    }

    public void remove(RemovalReason p_149847_) {
        if ( this.isDeadOrDying()) {
            if (this.random.nextInt(5) == 1) {
                BaseFootsoldierEntity boss = MobsCore.DUKE_ORG_ROUKI.get().create(this.level());
                if (boss != null) {
                    boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                    this.level().addFreshEntity(boss);

                    if (this.getLastAttacker()instanceof Player){
                        Player playerIn = (Player) this.getLastAttacker();
                    }
                }
            }
        }
        super.remove(p_149847_);
    }
}