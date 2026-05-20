package com.liasdan.supersentaicraft.util;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.network.payload.EndPosePayload;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.network.PacketDistributor;

import static com.liasdan.supersentaicraft.world.data_attachments.AttachmentTypeRegistry.*;

public class AnimationUtil {
    public static boolean canPose (LivingEntity poser) {
        if (!poser.getItemBySlot(EquipmentSlot.FEET).toString().contains("kamenridercraft") && !poser.isVisuallyCrawling() && !poser.isSleeping() && !poser.isSwimming() && !poser.isPassenger() && !poser.walkAnimation.isMoving()  && poser.onGround()
                && !poser.isCrouching() && !poser.onClimbable() && poser.getData(POSE_COOLDOWN) <= 0  &&
                !poser.getData(USING_ABILITY)) {
            return true;
        }
        return false;
    }

    public static void stopPosing(LivingEntity poser) {
        if (poser.level() instanceof ServerLevel) {
            poser.setData(IS_POSING, false);
            poser.setData(POSE_COOLDOWN, 20);
            PacketDistributor.sendToAllPlayers(new EndPosePayload(0, poser.getStringUUID()));
        }
    }
}
