package com.liasdan.supersentaicraft.items.sentai_40.goonger;

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
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.registries.DeferredItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;

public class GoOngerMechaItem extends MechaGattaiItem {

    public static final String[] Right = {"", "_birca", "_gunpherd", "_toripter", "_t_line"};
    public static final String[] Left = {"", "_birca", "_gunpherd", "_jetras", "_k_line"};

    public GoOngerMechaItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> torso, DeferredItem<Item> legs, DeferredItem<Item> boot, Properties properties) {
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

    public static int get_eftTime(ItemStack itemstack) {
        if (itemstack.has(DataComponents.CUSTOM_DATA)) {
            CompoundTag tag = itemstack.get(DataComponents.CUSTOM_DATA).getUnsafe();
            return tag.getInt("eftTime");
        }
        return 100;
    }

    public static void set_eftTime(ItemStack itemstack, int time) {
        if (!itemstack.has(DataComponents.CUSTOM_DATA)) {
            itemstack.set(DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY);
        }
        net.minecraft.world.item.component.CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> {
            tag.putInt("eftTime", time);
        });
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, net.minecraft.world.entity.Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);
        if (entity instanceof LivingEntity player && !level.isClientSide) {
            if (isTransformed(player) && slotId == 36) { // 36 is usually head slot internally for logic or beltTick
                ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
                int eftTime = get_eftTime(boots);
                if (eftTime <= 2) {
                    set_eftTime(boots, eftTime + 1);
                }
            }
        }
    }

    @Override
    public void giveEffects(LivingEntity player) {
        super.giveEffects(player);
        if (isTransformed(player)) {
            ItemStack armor = player.getItemBySlot(EquipmentSlot.HEAD);
            ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
            int left = get_left(armor);
            int right = get_right(armor);

            // Universal Combination Effects
            if (left == 1 || right == 1) {
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
            }
            if (left == 2 || right == 2) {
                player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false));
                if (player.isCrouching() && get_eftTime(boots) > 2) {
                    Level level = player.level();
                    if (!level.isClientSide) {
                        Vec3 look = player.getLookAngle();
                        Arrow fireball = new Arrow(level, player, new ItemStack(Items.ARROW), null);
                        fireball.pickup = AbstractArrow.Pickup.DISALLOWED;
                        fireball.setDeltaMovement(look.x * 3, look.y * 3, look.z * 3);
                        level.addFreshEntity(fireball);
                        set_eftTime(boots, 0);
                    }
                }
            }
            if (right == 3) player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 3, true, false));
            if (left == 3) player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false));
            if (right == 4) player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
            if (left == 4) player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false));

            // Base Mecha Effects
            if (this.Rider.equals("engine_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false));
            } else if (this.Rider.equals("gunbir_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false));

                if (left == 0) {
                    player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                    player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                }
                if (right == 0) {
                    player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false));
                    if (player.isCrouching() && get_eftTime(boots) > 2) {
                        Level level = player.level();
                        if (!level.isClientSide) {
                            Vec3 look = player.getLookAngle();
                            Arrow fireball = new Arrow(level, player, new ItemStack(Items.ARROW), null);
                            fireball.pickup = AbstractArrow.Pickup.DISALLOWED;
                            fireball.setDeltaMovement(look.x * 3, look.y * 3, look.z * 3);
                            level.addFreshEntity(fireball);
                            set_eftTime(boots, 0);
                        }
                    }
                }
            } else if (this.Rider.equals("engine_oh_g6") || this.Rider.equals("engine_oh_g9") || this.Rider.equals("engine_oh_g12")) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false));

                if (this.Rider.equals("engine_oh_g9") || this.Rider.equals("engine_oh_g12")) {
                    player.addEffect(new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false));
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false));
                }
                if (this.Rider.equals("engine_oh_g12")) {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false));
                }

                if (player.isCrouching() && get_eftTime(boots) > 2) {
                    Level level = player.level();
                    if (!level.isClientSide) {
                        Vec3 look = player.getLookAngle();
                        Arrow fireball = new Arrow(level, player, new ItemStack(Items.ARROW), null);
                        fireball.pickup = AbstractArrow.Pickup.DISALLOWED;
                        fireball.setDeltaMovement(look.x * 3, look.y * 3, look.z * 3);
                        level.addFreshEntity(fireball);
                        set_eftTime(boots, 0);
                    }
                }
            } else if (this.Rider.equals("seikuu_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false));
                
                if (right == 0) player.addEffect(new MobEffectInstance(EffectCore.PUNCH, 20, 3, true, false));
                if (left == 0) player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false));
            } else if (this.Rider.equals("kyoretsu_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                
                if (right == 0) player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
                if (left == 0) player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false));
            } else if (this.Rider.equals("engine_daishogun")) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false));
            } else if (this.Rider.equals("skydor_engine_oh")) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false));
            }
        }
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        int left = get_left(itemstack);
        int right = get_right(itemstack);

        if (num == 1) { // Right arm overlay
            if (right == 0) {
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
