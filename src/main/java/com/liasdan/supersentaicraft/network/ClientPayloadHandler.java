package com.liasdan.supersentaicraft.network;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.network.payload.EndPosePayload;
import com.liasdan.supersentaicraft.network.payload.StartPosePayload;
import com.zigythebird.playeranim.animation.PlayerAnimResources;
import com.zigythebird.playeranim.animation.PlayerAnimationController;
import com.zigythebird.playeranim.api.PlayerAnimationAccess;
import com.zigythebird.playeranimcore.animation.Animation;
import com.zigythebird.playeranimcore.animation.layered.modifier.AbstractFadeModifier;
import com.zigythebird.playeranimcore.easing.EasingType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import java.util.UUID;

import static com.liasdan.supersentaicraft.SuperSentaiCraftCore.MODID;
import static com.liasdan.supersentaicraft.items.others.RangerChangerItem.get_Form_Item;
import static com.zigythebird.playeranim.PlayerAnimLibMod.ANIMATION_LAYER_ID;

public class ClientPayloadHandler {

    public static void startPoseAnimations(final StartPosePayload data, final IPayloadContext context) {
        LivingEntity posingRider = context.player().level().getPlayerByUUID(UUID.fromString(data.UUID()));
        assert posingRider != null;
        Animation animation = PlayerAnimResources.getAnimation(ResourceLocation.fromNamespaceAndPath(MODID, "default.pose"));

        if (posingRider.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem driverItem) {

            RangerFormChangeItem formChangeItemOne = get_Form_Item(posingRider.getItemBySlot(EquipmentSlot.FEET), 1);

            String formItemName = formChangeItemOne.toString().replace("supersentaicraft:", "");
            String riderName = driverItem.Rider.toLowerCase();

            animation = PlayerAnimResources.getAnimation(ResourceLocation.fromNamespaceAndPath(MODID, riderName + ".pose"));

            if (formChangeItemOne.is(ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "animation/form_specific_pose")))) {
                animation = PlayerAnimResources.getAnimation(ResourceLocation.fromNamespaceAndPath(MODID, riderName + "." + formItemName + ".pose"));
            }

            if (animation == null) {
                animation = PlayerAnimResources.getAnimation(ResourceLocation.fromNamespaceAndPath(MODID, "default.pose"));
            }
        }
        try {
            AbstractClientPlayer animationTarget = (AbstractClientPlayer) Minecraft.getInstance().level.getPlayerByUUID(UUID.fromString(data.UUID()));
            PlayerAnimationController controller = (PlayerAnimationController) PlayerAnimationAccess.getPlayerAnimationLayer(animationTarget, ANIMATION_LAYER_ID);

            controller.addModifierBefore(AbstractFadeModifier.standardFadeIn(15, EasingType.EASE_IN_ELASTIC));
            controller.triggerAnimation(animation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void endPoseAnimations(final EndPosePayload data, final IPayloadContext context) {
        try {
            assert Minecraft.getInstance().level != null;
            AbstractClientPlayer animationTarget = (AbstractClientPlayer) Minecraft.getInstance().level.getPlayerByUUID(UUID.fromString(data.UUID()));
            assert animationTarget != null;
            PlayerAnimationController controller = (PlayerAnimationController) PlayerAnimationAccess.getPlayerAnimationLayer(animationTarget, ANIMATION_LAYER_ID);
            if (controller != null && controller.isPlayingTriggeredAnimation()) {
                controller.stopTriggeredAnimation();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}