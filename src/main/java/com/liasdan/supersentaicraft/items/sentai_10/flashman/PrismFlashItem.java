package com.liasdan.supersentaicraft.items.sentai_10.flashman;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.summon.BaseSummonEntity;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.function.Supplier;

public class PrismFlashItem extends RangerChangerItem {

    private final Supplier<SimpleParticleType> particleSupplier;
    private final MobEffectInstance[] effects;

    public PrismFlashItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties, Supplier<SimpleParticleType> particleSupplier, MobEffectInstance... effects) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.particleSupplier = particleSupplier;
        this.effects = effects;
    }

    @Override
    public void giveEffects(LivingEntity player) {
        if (isTransformed(player)) {
            for (MobEffectInstance effect : effects) {
                if ((effect.getEffect() != MobEffects.DAMAGE_BOOST &&
                        effect.getEffect() != MobEffects.DAMAGE_RESISTANCE &&
                        effect.getEffect() != MobEffects.MOVEMENT_SPEED &&
                        effect.getEffect() != EffectCore.SLASH &&
                        effect.getEffect() != EffectCore.PUNCH)
                        || (player instanceof BaseSummonEntity
                        && (effect.getEffect() != MobEffects.DAMAGE_RESISTANCE || effect.getAmplifier() < 3))
                        || player instanceof Player) {
                    player.addEffect(new MobEffectInstance(effect.getEffect(), effect.getDuration(), effect.getAmplifier(), true, false));
                }
            }
        }
    }



    @Override
    public void OnTransformation(ItemStack itemstack, LivingEntity player) {
        super.OnTransformation(itemstack, player);
        if (isTransformed(player) && !player.level().isClientSide() && particleSupplier != null && particleSupplier.get() != null) {
            ((ServerLevel) player.level()).sendParticles(particleSupplier.get(),
                    player.getX(), player.getY() + 1,
                    player.getZ(), 100, 0, 0, 0, 1);
        }
    }
}
