package com.liasdan.supersentaicraft.client.renderer;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.client.models.BikeModel;
import com.liasdan.supersentaicraft.entity.bikes.baseBikeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BikeRenderer extends GeoEntityRenderer<baseBikeEntity> {

    public BikeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BikeModel());
        this.scaleWidth = 1.1f;
        this.scaleHeight = 1.1f;

    }

    @Override
    public ResourceLocation getTextureLocation(baseBikeEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
                "textures/entities/" + animatable.NAME + ".png");
    }

    @Override
    public void render(baseBikeEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
            MultiBufferSource bufferSource, int packedLight) {
        poseStack.pushPose();
        if (entity.NAME.equals("garu_bike")) {
            poseStack.translate(0, 1.5, 0); // Translate up
            poseStack.scale(-1.0f, -1.0f, 1.0f); // Mirror X and Y like 1.12.2 ModelBase
        } else {
            poseStack.translate(0, -0.15f, 0);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
        poseStack.popPose();
    }
}
