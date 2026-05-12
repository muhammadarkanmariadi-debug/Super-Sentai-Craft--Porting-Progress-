package com.liasdan.supersentaicraft.util;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.network.payload.EndPosePayload;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.network.PacketDistributor;

public class AnimationUtil {
    public static boolean canPose (LivingEntity poser) {
        if (!poser.isVisuallyCrawling() && !poser.isSleeping() && !poser.isSwimming() && !poser.isPassenger() && !poser.walkAnimation.isMoving()  && poser.onGround()
        && !poser.isCrouching() && !poser.onClimbable() && poser.getAttribute(AttributeRegistry.POSE_COOLDOWN).getValue() <= 0  &&
                poser.getAttribute(AttributeRegistry.USING_ABILITY).getValue() == 0) {
            return true;
        }
        return false;
    }

    public static void stopPosing(LivingEntity poser) {
        if (poser.level() instanceof ServerLevel) {
            poser.getAttribute(AttributeRegistry.POSING).setBaseValue(0);
            poser.getAttribute(AttributeRegistry.POSE_COOLDOWN).setBaseValue(20);
            PacketDistributor.sendToAllPlayers(new EndPosePayload(0, poser.getStringUUID()));
        }
    }
}
