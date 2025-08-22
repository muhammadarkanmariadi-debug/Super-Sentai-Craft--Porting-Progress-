package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.MobsItems;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DrunnsEntity extends BaseFootsoldierEntity {
	
    public DrunnsEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="drunn";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.DRUNN_SPEAR.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(MobsItems.DRUNN_SHIELD.get()));
    }

    public void remove(Entity.RemovalReason p_149847_) {
    	if ( this.isDeadOrDying()) {
    		if (this.random.nextInt(5) == 1) {
        		if (this.random.nextInt(2) == 0) {
    				BaseFootsoldierEntity boss = MobsCore.GAISOULG.get().create(this.level());
    				if (boss != null) {
    					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
    					this.level().addFreshEntity(boss);

    					if (this.getLastAttacker()instanceof Player){
    						Player playerIn = (Player) this.getLastAttacker();
    						playerIn.sendSystemMessage(Component.translatable("<Gaisoulg>Gaisoul Change!").withStyle(ChatFormatting.DARK_PURPLE));
    					}
    				}
    			}
        		else if (this.random.nextInt(2) == 1) {
    				BaseFootsoldierEntity boss = MobsCore.RYUSOUL_MORIA.get().create(this.level());
    				if (boss != null) {
    					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
    					this.level().addFreshEntity(boss);
    				}
    			}
			}
		}
		super.remove(p_149847_);
	}
}