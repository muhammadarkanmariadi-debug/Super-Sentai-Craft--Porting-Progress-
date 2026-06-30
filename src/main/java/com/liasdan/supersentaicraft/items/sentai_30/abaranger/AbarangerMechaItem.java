package com.liasdan.supersentaicraft.items.sentai_30.abaranger;

import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.summon.BaseSummonEntity;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;

public class AbarangerMechaItem extends MechaGattaiItem {

    public static final String[] Right = {"", "_abaren_nagurus", "_abaren_veilus", "_abaren_galer"};
    public static final String[] Left = {"", "_abaren_nokodon", "_abaren_rokkiru", "_abaren_nokodon_fire"};

    public AbarangerMechaItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> torso, DeferredItem<Item> legs, DeferredItem<Item> boot, Properties properties) {
        super(material, rider, baseFormItem, torso, legs, boot, properties);
        this.Unlimited_Textures = 2; // Supports left and right arm overlays
    }

    public static int get_left(ItemStack itemstack) {
        if (itemstack.has(DataComponents.CUSTOM_DATA)) {
            CompoundTag tag = itemstack.get(DataComponents.CUSTOM_DATA).getUnsafe();
            return tag.getInt("left");
        }
        return 0;
    }

    public static int get_right(ItemStack itemstack) {
        if (itemstack.has(DataComponents.CUSTOM_DATA)) {
            CompoundTag tag = itemstack.get(DataComponents.CUSTOM_DATA).getUnsafe();
            return tag.getInt("right");
        }
        return 0;
    }

    @Override
    public void giveEffects(LivingEntity player) {
        super.giveEffects(player);
        if (isTransformed(player)) {
            ItemStack armor = player.getItemBySlot(EquipmentSlot.HEAD);
            int left = get_left(armor);
            int right = get_right(armor);

            // Base Mecha Effects
            if (this.Rider.equals("abaren_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));

                if (left == 0) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false));
                    player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                    player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                }
                if (right == 0) {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, true, false));
                }
            } else if (this.Rider.equals("abaren_ohji")) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
            } else if (this.Rider.equals("killer_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false));
            } else if (this.Rider.equals("max_ohja")) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false));
            } else if (this.Rider.equals("max_ryuoh")) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false));
            } else if (this.Rider.equals("oo_abaren_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false));
            } else if (this.Rider.equals("bakuren_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, true, false));
                // Ice freeze logic could be added here in tick event
            }

            // Combination Effects
            if (left == 2) {
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false));
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
            if (right == 1) {
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false));
            }
            if (right == 2) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
            }
            if (left == 1) {
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
            }
            if (left == 3) {
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.FIREPUNCH, 20, 2, true, false));
            }
            if (right == 3) {
                player.addEffect(new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false));
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
        }
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        int left = get_left(itemstack);
        int right = get_right(itemstack);

        if (num == 1) { // Right arm overlay
            if (right == 0 || (right == 3 && riderName.equals("abaren_oh"))) {
                return "blank";
            }
            if (right < Right.length) {
                return riderName + Right[right];
            }
        } else if (num == 2) { // Left arm overlay
            if (left == 0) {
                return "blank";
            }
            if (left < Left.length) {
                return riderName + Left[left];
            }
        }
        return "blank";
    }
}
