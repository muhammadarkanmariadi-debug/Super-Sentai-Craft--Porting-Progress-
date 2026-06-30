package com.liasdan.supersentaicraft.items.sentai_50.kiramager;

import java.util.List;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class KanaemaStoneItem extends Item {
    private final int effectType;

    public KanaemaStoneItem(Properties properties, int effectType) {
        super(properties);
        this.effectType = effectType;
    }

    public static int getAmmo(ItemStack stack) {
        CustomData customData = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        return customData.copyTag().getInt("Ammo");
    }

    public static void setAmmo(ItemStack stack, int ammo) {
        CustomData customData = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = customData.copyTag();
        tag.putInt("Ammo", ammo);
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }

    public static final int MAX_AMMO = 400; // 20 seconds instead of 20 minutes for better gameplay

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        int ammo = getAmmo(stack);
        if (ammo < MAX_AMMO) {
            setAmmo(stack, ammo + 1);
        }
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return getAmmo(stack) >= MAX_AMMO;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemstack = player.getItemInHand(usedHand);
        ItemStack feetStack = player.getItemBySlot(EquipmentSlot.FEET);

        if (!level.isClientSide && feetStack.getItem() instanceof RangerChangerItem) {
            if (getAmmo(itemstack) >= MAX_AMMO) {
                if (effectType == 1) { // Destoria
                    Vec3 look = player.getLookAngle();
                    double x = player.getX() + look.x * 3;
                    double y = player.getY();
                    double z = player.getZ() + look.z * 3;
                    PrimedTnt tnt = new PrimedTnt(level, x, y, z, player);
                    level.addFreshEntity(tnt);
                } else if (effectType == 2) { // Reversia
                    if (level instanceof net.minecraft.server.level.ServerLevel serverLevel) {
                        serverLevel.setDayTime(serverLevel.getDayTime() + 12000);
                    }
                } else if (effectType == 3) { // Energia
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, MAX_AMMO, 4, true, false));
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, MAX_AMMO, 3, true, false));
                    player.addEffect(new MobEffectInstance(MobEffects.JUMP, MAX_AMMO, 3, true, false));
                    player.addEffect(new MobEffectInstance(MobEffects.SATURATION, MAX_AMMO, 3, true, false));
                } else if (effectType == 4) { // Illusia (Dimension TP removed/simplified unless dimension exists)
                    if (player instanceof ServerPlayer serverPlayer) {
                        // Assuming the dimension is not ported natively yet, fallback to overworld spawn
                        // You can update this once SuperSentaiTopia is ported to 1.21.1
                    }
                }
                setAmmo(itemstack, 0);
            } else {
                // Not enough ammo
            }
        }

        player.startUsingItem(usedHand);
        return InteractionResultHolder.success(itemstack);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        int percent = (getAmmo(stack) * 100) / MAX_AMMO;
        tooltipComponents.add(Component.literal("Kiramental: " + percent + "%").withStyle(ChatFormatting.BLUE));
    }

    public KanaemaStoneItem AddToTabList(java.util.List<Item> TabList) {
        TabList.add(this);
        return this;
    }
}
