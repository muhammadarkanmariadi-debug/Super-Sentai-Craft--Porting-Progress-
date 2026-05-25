package com.liasdan.supersentaicraft.network;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.network.payload.*;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import com.zigythebird.playeranim.animation.PlayerAnimResources;
import com.zigythebird.playeranim.animation.PlayerAnimationController;
import com.zigythebird.playeranim.api.PlayerAnimationAccess;
import com.zigythebird.playeranimcore.animation.Animation;
import com.zigythebird.playeranimcore.animation.layered.modifier.AbstractFadeModifier;
import com.zigythebird.playeranimcore.easing.EasingType;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import java.util.UUID;

import static com.liasdan.supersentaicraft.SuperSentaiCraftCore.MODID;
import static com.liasdan.supersentaicraft.items.others.RangerChangerItem.get_Form_Item;
import static com.liasdan.supersentaicraft.util.AnimationUtil.canPose;
import static com.liasdan.supersentaicraft.util.AnimationUtil.stopPosing;
import static com.zigythebird.playeranim.PlayerAnimLibMod.ANIMATION_LAYER_ID;

public class ServerPayloadHandler {

    public static void handleAbilityKeyPress(final AbilityKeyPayload data, final IPayloadContext context) {
        handleAbilityKeyPress((ServerPlayer)context.player());
    }

    public static void handlePoseKeyPress(final PoseKeyPayload data, final IPayloadContext context) {
        //TODO add gamerule for allow particles, sounds, and cooldown length
        if (context.player().getAttribute(AttributeRegistry.POSING).getValue() == 1) {
            context.player().getAttribute(AttributeRegistry.POSING).setBaseValue(0);
            stopPosing(context.player());
        } else {
            if (canPose(context.player())){
                context.player().getAttribute(AttributeRegistry.POSING).setBaseValue(1);
                PacketDistributor.sendToAllPlayers(new StartPosePayload(0, context.player().getStringUUID()));
            }
        }
    }

    public static void handleAttributeChange(final AttributeChangePayload data, final IPayloadContext context) {
        if (context.player().level().getPlayerByUUID(UUID.fromString(data.id())) instanceof LivingEntity entity) {
            if (entity instanceof Player&context.player().getStringUUID().equals(data.id())) {
                PacketDistributor.sendToAllPlayers(new AttributeChangeClientPayload(data.id(), data.attributeName(), data.valueChange()));
            }
        }
    }

    public static void handleClimbing(final ClimbCollisionPayload data, final IPayloadContext context) {
        if (context.player().level().getPlayerByUUID(UUID.fromString(data.id())) instanceof LivingEntity entity) {
            Vec3 initialVec = entity.getDeltaMovement();
            Vec3 climbVec = new Vec3(initialVec.x, 0.1D * (entity.getAttribute(AttributeRegistry.CLIMBING).getValue()), initialVec.z);
            entity.setDeltaMovement(climbVec.scale(0.97D));
            entity.hurtMarked = true;
        }
    }

    private static void handleAbilityKeyPress(ServerPlayer player) {
        if (player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem belt) RangerChangerItem.setUseAbility(player.getItemBySlot(EquipmentSlot.FEET));
    }
}