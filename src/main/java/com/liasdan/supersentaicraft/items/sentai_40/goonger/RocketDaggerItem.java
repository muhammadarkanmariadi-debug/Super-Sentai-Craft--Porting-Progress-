package com.liasdan.supersentaicraft.items.sentai_40.goonger;

import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class RocketDaggerItem extends BaseSwordItem {

    public RocketDaggerItem(Tier toolTier, int Atk, float Spd, Properties prop) {
        super(toolTier, Atk, Spd, prop);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        
        player.fallDistance = 0.0f;
        
        Vec3 look = player.getLookAngle();
        player.setDeltaMovement(look.x / 2.0, look.y / 2.0, look.z / 2.0);
        player.hurtMarked = true; // Required to sync movement to client
        
        if (level.isClientSide()) {
            level.addParticle(ParticleTypes.FIREWORK, player.getX(), player.getY(), player.getZ(), 0.0D, 0.0D, 0.0D);
        }
        
        player.startUsingItem(hand);
        return InteractionResultHolder.success(itemstack);
    }
}
