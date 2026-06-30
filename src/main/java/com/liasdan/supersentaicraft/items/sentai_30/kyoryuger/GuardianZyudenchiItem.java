package com.liasdan.supersentaicraft.items.sentai_30.kyoryuger;

import com.liasdan.supersentaicraft.entity.bikes.DeinochaserEntity;
import com.liasdan.supersentaicraft.entity.ally.KyoryugerAllyEntity;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;

public class GuardianZyudenchiItem extends BaseItem {
    
    private final int effectId;

    public GuardianZyudenchiItem(Properties properties, int effectId) {
        super(properties);
        this.effectId = effectId;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        
        if (!level.isClientSide()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);
            
            // Requires holding a Gaburivolver in FEET slot
            if (!belt.isEmpty() && belt.getItem() instanceof GaburivolverItem) {
                
                switch (this.effectId) {
                    case 1: // Deinochaser
                        DeinochaserEntity bike = new DeinochaserEntity(com.liasdan.supersentaicraft.entity.MobsCore.DEINOCHASER.get(), level);
                        bike.moveTo(player.getX(), player.getY(), player.getZ(), player.getYRot(), 0.0F);
                        level.addFreshEntity(bike);
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                        
                    case 2: // Ovirappoo (Saturation)
                        player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1000, 2, true, false));
                        break;
                        
                    case 3: // Iguanodon (Fire Slash)
                        player.addEffect(new MobEffectInstance(EffectCore.FIRESLASH, 1000, 0, true, false));
                        break;
                        
                    case 4: // Pukuptor (Smoke)
                        if (level instanceof ServerLevel serverLevel) {
                            serverLevel.sendParticles(ParticleTypes.LARGE_SMOKE, player.getX(), player.getY(), player.getZ(), 10, 0.5, 0.5, 0.5, 0.1);
                        }
                        break;
                        
                    case 5: // Seikorn (Nausea)
                        player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1000, 2, true, false));
                        break;
                        
                    case 6: // Tuperanda (Slowness)
                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1000, 2, true, false));
                        break;
                        
                    case 7: // Gurumonite (Slash Boost, Shot Boost)
                        player.addEffect(new MobEffectInstance(EffectCore.SLASH, 1000, 2, true, false));
                        player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 1000, 2, true, false));
                        break;
                        
                    case 8: // Kentrospiker / Clone
                        KyoryugerAllyEntity kyoryuger = new KyoryugerAllyEntity(com.liasdan.supersentaicraft.entity.MobsCore.KYORYUGER.get(), level);
                        
                        // Equip clone with current belt
                        kyoryuger.setItemSlot(EquipmentSlot.FEET, new ItemStack(belt.getItem()));
                        
                        // Default weapons
                        kyoryuger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyoryugerItems.GABURICALIBUR.get()));
                        kyoryuger.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(KyoryugerItems.GABURIVOLVER.get()));
                        
                        kyoryuger.moveTo(player.getX(), player.getY(), player.getZ(), player.getYRot(), 0.0F);
                        level.addFreshEntity(kyoryuger);
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                        
                    case 9: // Archenolon (Speed)
                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 5, true, false));
                        break;
                        
                    case 10: // Futabain (Invisibility)
                        player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1000, 2, true, false));
                        break;
                        
                    case 11: // Allomerus (Fly Potion)
                        player.addEffect(new MobEffectInstance(EffectCore.FLYING, 1000, 2, true, false));
                        break;
                        
                    case 12: // Beyonsmo (Resistance)
                        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 10, true, false));
                        break;
                        
                    case 13: // Kukuptops (Poison)
                        player.addEffect(new MobEffectInstance(MobEffects.POISON, 1000, 2, true, false));
                        break;
                        
                    case 14: // Maximum (Punch Boost)
                        player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 1000, 5, true, false));
                        break;
                }
                
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }
        
        return InteractionResultHolder.pass(itemstack);
    }
}
