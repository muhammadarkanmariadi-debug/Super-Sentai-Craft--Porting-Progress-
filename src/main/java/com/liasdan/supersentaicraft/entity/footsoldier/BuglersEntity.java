package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.MobsItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BuglersEntity extends BaseFootsoldierEntity {

	private BaseFootsoldierEntity boss;

	public BuglersEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="bugler";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.BUGLERS_KATAR.get()));
    }

    public void remove(RemovalReason p_149847_) {
    	if (this.isDeadOrDying()) {
    		if (this.random.nextInt(5) == 1) {
				if (this.level().getBiome(this.blockPosition()).is(BiomeTags.IS_NETHER)) boss = null;
				else boss = MobsCore.DARK_BUSTER.get().create(this.level());
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level().addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn = (Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("<Dark Buster>Let's Morphin!").withStyle(ChatFormatting.RED));
					}
				}
			}
		}
		super.remove(p_149847_);
	}
}