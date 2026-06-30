package com.liasdan.supersentaicraft.items.sentai_50.kyuranger;

import com.liasdan.supersentaicraft.entity.bikes.GaruBikeEntity;
import com.liasdan.supersentaicraft.entity.ally.KyurangerAllyEntity;
import com.liasdan.supersentaicraft.entity.ally.ExAidAllyEntity;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.sentai_50.KyurangerItems;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;

public class SkillKyutamaItem extends BaseItem {

    private final int num;

    public SkillKyutamaItem(Properties properties, int effectId) {
        super(properties);
        this.num = effectId;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        
        if (!level.isClientSide()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);
            
            if (!belt.isEmpty() && belt.getItem() instanceof SeizaBlasterItem) {
                switch (num) {
                    case 1:
                        if (level instanceof ServerLevel serverLevel) serverLevel.setDayTime(level.getDayTime() + 12000);
                        break;
                    case 2:
                        if (belt.getItem() == KyurangerItems.BLACK_SEIZA_BLASTER.get()) {
                            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 4, true, false));
                        } else {
                            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 2, true, false));
                        }
                        break;
                    case 3:
                        player.spawnAtLocation(Items.WATER_BUCKET);
                        break;
                    case 4:
                        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 2, true, false));
                        break;
                    case 5:
                        player.spawnAtLocation(Items.MAP);
                        break;
                    case 6:
                        if (belt.getItem() == KyurangerItems.SKY_BLUE_SEIZA_BLASTER.get()) {
                            player.addEffect(new MobEffectInstance(EffectCore.BIG, 1000, 0, true, false));
                            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 2, true, false));
                            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1000, 2, true, false));
                        }
                        break;
                    case 7:
                        player.spawnAtLocation(Items.COD);
                        break;
                    case 8:
                        player.spawnAtLocation(Items.SHIELD);
                        break;
                    case 9:
                        KyurangerAllyEntity kyuranger = new KyurangerAllyEntity(com.liasdan.supersentaicraft.entity.MobsCore.KYURANGER.get(), level);
                        kyuranger.setItemSlot(EquipmentSlot.FEET, new ItemStack(belt.getItem()));
                        
                        // Equip correct weapons based on belt
                        if (belt.getItem() == KyurangerItems.RED_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_SWORD.get()));
                        } else if (belt.getItem() == KyurangerItems.BLUE_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_CLAW.get()));
                        } else if (belt.getItem() == KyurangerItems.ORANGE_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_SPEAR.get()));
                        } else if (belt.getItem() == KyurangerItems.GOLD_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_CROSSBOW.get()));
                        } else if (belt.getItem() == KyurangerItems.BLACK_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_AXE.get()));
                        } else if (belt.getItem() == KyurangerItems.SILVER_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_SICKLE.get()));
                        } else if (belt.getItem() == KyurangerItems.GREEN_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_RAPIER.get()));
                        } else if (belt.getItem() == KyurangerItems.PINK_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_SHOT.get()));
                        } else if (belt.getItem() == KyurangerItems.YELLOW_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_SLASHER.get()));
                        } else if (belt.getItem() == KyurangerItems.COMMANDER_RYUTSUEDER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.RYUTSUEDER.get()));
                        } else if (belt.getItem() == KyurangerItems.SKY_BLUE_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.KYU_SPEAR.get()));
                        } else if (belt.getItem() == KyurangerItems.HOUOU_BLADE_SHIELD.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.HOUOU_BLADE.get()));
                            kyuranger.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(KyurangerItems.HOUOU_SHIELD.get()));
                        } else if (belt.getItem() == KyurangerItems.METAL_DARK_SEIZA_BLASTER.get()) {
                            kyuranger.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KyurangerItems.DARK_KYU_SICKLE.get()));
                            kyuranger.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(KyurangerItems.DARK_SEIZA_BLASTER.get()));
                        }
                        
                        kyuranger.moveTo(player.getX(), player.getY(), player.getZ(), player.getYRot(), 0.0F);
                        level.addFreshEntity(kyuranger);
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                    case 10:
                        if (level instanceof ServerLevel serverLevel) serverLevel.setDayTime(23000);
                        break;
                    case 11:
                    case 15:
                        BlockPos pos = player.blockPosition().relative(player.getDirection(), 3);
                        if (level.isEmptyBlock(pos)) {
                            level.setBlock(pos, Blocks.WATER.defaultBlockState(), 3);
                        }
                        break;
                    case 12:
                        player.spawnAtLocation(Items.GOLDEN_HELMET);
                        break;
                    case 13:
                        Horse horse = new Horse(net.minecraft.world.entity.EntityType.HORSE, level);
                        horse.tameWithName(player);
                        horse.moveTo(player.getX(), player.getY(), player.getZ(), 0, 0);
                        level.addFreshEntity(horse);
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                    case 14:
                        Arrow arrow = new Arrow(level, player, new ItemStack(Items.ARROW), null);
                        arrow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 3.0F, 1.0F);
                        arrow.setBaseDamage(10.0D);
                        level.addFreshEntity(arrow);
                        break;
                    case 16:
                        player.spawnAtLocation(new ItemStack(Items.SNOWBALL, 16));
                        break;
                    case 17:
                        player.spawnAtLocation(new ItemStack(Items.LADDER, 4));
                        break;
                    case 18:
                        BlockPos webPos = player.blockPosition().relative(player.getDirection(), 3);
                        if (level.isEmptyBlock(webPos)) level.setBlock(webPos, Blocks.COBWEB.defaultBlockState(), 3);
                        if (level.isEmptyBlock(webPos.above())) level.setBlock(webPos.above(), Blocks.COBWEB.defaultBlockState(), 3);
                        break;
                    case 19:
                        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 2, true, false));
                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 2, true, false));
                        break;
                    case 20:
                        if (player.isInWater()) {
                            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1000, 2, true, false));
                            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1000, 2, true, false));
                        }
                        break;
                    case 21:
                        if (!player.isPassenger() && !player.isVehicle()) {
                            // Dimension change logic would go here. For now, we skip.
                        }
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                    case 22:
                        BlockPos jukePos = player.blockPosition().relative(player.getDirection(), 3);
                        if (level.isEmptyBlock(jukePos)) level.setBlock(jukePos, Blocks.JUKEBOX.defaultBlockState(), 3);
                        break;
                    case 23:
                        Parrot parrot = new Parrot(net.minecraft.world.entity.EntityType.PARROT, level);
                        parrot.tame(player);
                        parrot.moveTo(player.getX(), player.getY(), player.getZ(), 0, 0);
                        level.addFreshEntity(parrot);
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                    case 24:
                        player.spawnAtLocation(Items.PAINTING);
                        break;
                    case 25:
                        GaruBikeEntity bike = new GaruBikeEntity(com.liasdan.supersentaicraft.entity.MobsCore.GARU_BIKE.get(), level);
                        bike.moveTo(player.getX(), player.getY(), player.getZ(), player.getYRot(), 0.0F);
                        level.addFreshEntity(bike);
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                    case 26:
                        player.spawnAtLocation(Items.BUCKET);
                        break;
                    case 27:
                        Wolf wolf = new Wolf(net.minecraft.world.entity.EntityType.WOLF, level);
                        wolf.tame(player);
                        wolf.moveTo(player.getX(), player.getY(), player.getZ(), 0, 0);
                        level.addFreshEntity(wolf);
                        if (!player.getAbilities().instabuild) itemstack.shrink(1);
                        break;
                    case 28:
                        player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1000, 2, true, false));
                        break;
                    case 29:
                        player.spawnAtLocation(Items.IRON_PICKAXE);
                        break;
                    case 30:
                        ThrownEnderpearl pearl = new ThrownEnderpearl(level, player);
                        pearl.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                        level.addFreshEntity(pearl);
                        break;
                    case 31:
                    case 32:
                    case 35:
                    case 36:
                        // Left out for now as specific sentai items were dropped
                        break;
                    case 33:
                        player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1000, 2, true, false));
                        break;
                    case 34:
                        player.spawnAtLocation(Items.FURNACE);
                        break;
                    case 37:
                        ExAidAllyEntity ex_aid = new ExAidAllyEntity(com.liasdan.supersentaicraft.entity.MobsCore.EX_AID.get(), level);
                        ex_aid.moveTo(player.getX(), player.getY(), player.getZ(), player.getYRot(), 0.0F);
                        level.addFreshEntity(ex_aid);
                        break;
                }
                
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }
        
        return InteractionResultHolder.pass(itemstack);
    }
}
