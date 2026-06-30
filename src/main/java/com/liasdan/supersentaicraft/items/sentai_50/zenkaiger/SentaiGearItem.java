package com.liasdan.supersentaicraft.items.sentai_50.zenkaiger;

import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.sentai_50.ZenkaigerItems;
import com.liasdan.supersentaicraft.items.sentai_50.DonbrothersItems;
import com.liasdan.supersentaicraft.items.sentai_50.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;
import com.liasdan.supersentaicraft.items.sentai_30.GingamanItems;
import com.liasdan.supersentaicraft.items.sentai_30.MegarangerItems;
import com.liasdan.supersentaicraft.items.sentai_20.DairangerItems;
import com.liasdan.supersentaicraft.items.sentai_20.ZyurangerItems;
import com.liasdan.supersentaicraft.items.sentai_20.JetmanItems;
import com.liasdan.supersentaicraft.items.sentai_20.LivemanItems;
import com.liasdan.supersentaicraft.items.sentai_10.GorangerItems;

import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.phys.Vec3;

public class SentaiGearItem extends BaseItem {

    private final int num;
    private final boolean avatarou;

    public SentaiGearItem(Properties properties, int effectId, boolean avatarou) {
        super(properties);
        this.num = effectId;
        this.avatarou = avatarou;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

            if (!belt.isEmpty() && (belt.getItem() == ZenkaigerItems.ZENKAIZER_GEARTLINGER.get() || 
                                    belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get() ||
                                    belt.getItem() == ZenkaigerItems.STACAESAR_GEARTOZINGER.get() ||
                                    belt.getItem() == ZenkaigerItems.HAKAIZER_BELT.get())) {
                
                // Assuming it has ammo, but let's just trigger the effect immediately for now 
                // like how skill kyutamas work without strict ammo checking, or we can just apply the effect.
                applyEffect(level, player, belt);
                
                if (!player.getAbilities().instabuild) itemstack.shrink(1);
            }
        }

        return InteractionResultHolder.success(itemstack);
    }

    private void applyEffect(Level level, Player player, ItemStack belt) {
        switch (num) {
            case 0: // Saber
                player.addEffect(new MobEffectInstance(EffectCore.FIRESLASH, 1000, 2, true, false));
                break;
            case 1: // Goranger
                player.spawnAtLocation(Items.SNOWBALL);
                break;
            case 2: // J.A.K.Q.
                if (belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get()) {
                    player.spawnAtLocation(Items.STICK); // Big baton placeholder
                }
                break;
            case 3: // Battle Fever
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1000, 2, true, false));
                break;
            case 4: // Denziman
                setGeartlingerLock(belt, num);
                break;
            case 5: // Sun Vulcan
                player.spawnAtLocation(Items.SNOWBALL);
                break;
            case 6: // GoGo-V (Actually Ribbons?)
                // Ribbons...
                break;
            case 7: // Dynaman
                Vec3 look = player.getLookAngle();
                SmallFireball fireball = new SmallFireball(level, player, look.normalize());
                fireball.setPos(player.getX() + look.x * 1.6, player.getY() + 1, player.getZ() + look.z * 1.6);
                level.addFreshEntity(fireball);
                break;
            case 8: // Bioman
                player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 1000, 2, true, false));
                break;
            case 9: // Changeman
                Vec3 look2 = player.getLookAngle();
                SmallFireball fireball2 = new SmallFireball(level, player, look2.normalize());
                fireball2.setPos(player.getX() + look2.x * 1.6, player.getY() + 1, player.getZ() + look2.z * 1.6);
                level.addFreshEntity(fireball2);
                break;
            case 11: // Maskman
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1000, 2, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000, 2, true, false));
                break;
            case 12: // Liveman
                player.spawnAtLocation(LivemanItems.FALCON_SABER.get());
                break;
            case 13: // Turboranger
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 2, true, false));
                break;
            case 15: // Jetman
                if (getGeartlingerCore(belt) == 0 && belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get()) {
                    setGeartlingerCore(belt, 1);
                    setGeartlingerLock(belt, 0);
                } else if (getGeartlingerCore(belt) == 0) {
                    setGeartlingerCore(belt, 2);
                    setGeartlingerLock(belt, 0);
                } else {
                    setGeartlingerCore(belt, 0);
                }
                break;
            case 16: // Zyuranger
                Vec3 look3 = player.getLookAngle();
                LargeFireball fireball3 = new LargeFireball(level, player, look3.normalize(), 1);
                fireball3.setPos(player.getX() + look3.x * 1.6, player.getY() + 1, player.getZ() + look3.z * 1.6);
                level.addFreshEntity(fireball3);
                break;
            case 17: // Dairanger
                player.spawnAtLocation(DairangerItems.DAIREN_ROD_RYUU.get());
                break;
            case 18: // Kakuranger
                ThrownEnderpearl pearl = new ThrownEnderpearl(level, player);
                pearl.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                level.addFreshEntity(pearl);
                break;
            case 19: // Ohranger
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1000, 4, true, false));
                break;
            case 20: // Carranger
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 6, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1000, 6, true, false));
                break;
            case 21: // Megaranger
                setGeartlingerEffect(belt, 1);
                break;
            case 22: // Gingaman
                if (belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get()) {
                    player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1000, 2, true, false));
                }
                break;
            case 23: // GoGo-V
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000, 4, true, false));
                break;
            case 24: // Timeranger
                if (player.getRandom().nextInt(5) < 4) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 6, true, false));
                } else {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1000, 6, true, false));
                }
                break;
            case 25: // Gaoranger
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1000, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 3, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 3, true, false));
                break;
            case 26: // Hurricaneger
                setGeartlingerEffect(belt, 2);
                break;
            case 33: // Shinkenger
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000, 1, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 4, true, false));
                break;
            case 34: // Goseiger
                if (belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get()) {
                    setGeartlingerEffect(belt, 3);
                } else {
                    player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 1000, 6, true, false));
                }
                break;
            case 36: // Go-Busters
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 4, true, false));
                break;
            case 37: // Kyoryuger
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 1000, 4, true, false));
                break;
            case 38: // ToQger
                setGeartlingerEffect(belt, 2);
                break;
            case 39: // Ninninger
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1000, 4, true, false));
                player.addEffect(new MobEffectInstance(EffectCore.SLASH, 1000, 4, true, false));
                break;
            case 40: // Zyuohger
                if (belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get()) {
                    player.spawnAtLocation(Items.STICK); // Zyuoh the rod placeholder
                } else {
                    player.addEffect(new MobEffectInstance(EffectCore.FLYING, 1000, 4, true, false));
                    setGeartlingerEffect(belt, 3);
                }
                break;
            case 41: // Kyuranger
                if (belt.getItem() == ZenkaigerItems.TWOKAIZER_GEARDALINGER.get()) {
                    player.addEffect(new MobEffectInstance(EffectCore.BIG, 1000, 4, true, false));
                } else {
                    player.addEffect(new MobEffectInstance(MobEffects.LUCK, 1000, 4, true, false));
                }
                break;
            case 42: // Lupinranger/Patranger
            case 44: // Kiramager
                player.addEffect(new MobEffectInstance(EffectCore.SHOTBOOST, 1000, 4, true, false));
                break;
            case 43: // Ryusoulger
                player.spawnAtLocation(RyusoulgerItems.RYUSOUL_KEN.get());
                break;
            case 45: // Zenkaiger
                if (getGeartlingerCore(belt) == 0) {
                    setGeartlingerCore(belt, 1);
                } else {
                    setGeartlingerCore(belt, 0);
                }
                break;
            case 46: // Donbrothers
                // Don Momotaro entity spawn (Placeholder)
                player.spawnAtLocation(DonbrothersItems.DON_BLASTER.get());
                break;
            default:
                break;
        }
    }

    private int getGeartlingerCore(ItemStack itemstack) {
        CustomData customData = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        if (customData.contains("Core")) {
            return customData.copyTag().getInt("Core");
        }
        return 0;
    }

    private void setGeartlingerCore(ItemStack itemstack, int value) {
        CustomData customData = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = customData.copyTag();
        tag.putInt("Core", value);
        itemstack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }

    private void setGeartlingerLock(ItemStack itemstack, int value) {
        CustomData customData = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = customData.copyTag();
        tag.putInt("Lock", value);
        itemstack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }

    private void setGeartlingerEffect(ItemStack itemstack, int value) {
        CustomData customData = itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = customData.copyTag();
        tag.putInt("Effect", value);
        itemstack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }
}
