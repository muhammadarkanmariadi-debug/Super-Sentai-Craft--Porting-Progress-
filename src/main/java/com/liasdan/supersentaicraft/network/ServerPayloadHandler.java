package com.liasdan.supersentaicraft.network;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.network.payload.AbilityKeyPayload;
import com.liasdan.supersentaicraft.network.payload.PoseKeyPayload;
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
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import static com.liasdan.supersentaicraft.SuperSentaiCraftCore.MODID;
import static com.liasdan.supersentaicraft.items.others.RangerChangerItem.get_Form_Item;
import static com.zigythebird.playeranim.PlayerAnimLibMod.ANIMATION_LAYER_ID;

public class ServerPayloadHandler {

    public static void handleAbilityKeyPress(final AbilityKeyPayload data, final IPayloadContext context) {
        handleAbilityKeyPress((ServerPlayer)context.player());
    }

    public static void handlePoseKeyPress(final PoseKeyPayload data, final IPayloadContext context) {
        if (context.player().getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem driverItem) {

            RangerFormChangeItem formChangeItemOne = get_Form_Item(context.player().getItemBySlot(EquipmentSlot.FEET), 1);

            String formItemName = formChangeItemOne.toString().replace("supersentaicraft:", "");
            String riderName = driverItem.Rider.toLowerCase();

            Animation animation = PlayerAnimResources.getAnimation(ResourceLocation.fromNamespaceAndPath(MODID, riderName + ".pose"));

            if (formChangeItemOne.is(ItemTags.create(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "animation/form_specific_pose")))) {
                animation = PlayerAnimResources.getAnimation(ResourceLocation.fromNamespaceAndPath(MODID, riderName + "." + formItemName + ".pose"));
            }

            try {
                context.player().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,80, 2,true,false));
                PlayerAnimationController controller = (PlayerAnimationController) PlayerAnimationAccess.getPlayerAnimationLayer(Minecraft.getInstance().player, ANIMATION_LAYER_ID);
                controller.addModifierBefore(AbstractFadeModifier.standardFadeIn(15, EasingType.EASE_IN_ELASTIC));
                controller.triggerAnimation(animation);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void handleAbilityKeyPress(ServerPlayer player) {

        if (player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RangerChangerItem belt) RangerChangerItem.setUseAbility(player.getItemBySlot(EquipmentSlot.FEET));
    }
}