package com.liasdan.supersentaicraft.client.renderer;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.client.models.MechaModel;
import com.liasdan.supersentaicraft.entity.mecha.BaseMechaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MechaRenderer extends GeoEntityRenderer<BaseMechaEntity> {

    public MechaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MechaModel());
        this.scaleWidth = 1.0f;
        this.scaleHeight = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(BaseMechaEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
                "textures/entity/vsranger_gattai/" + animatable.NAME + ".png");
    }

    @Override
    public void render(BaseMechaEntity entity, float entityYaw, float partialTick, com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.MultiBufferSource bufferSource, int packedLight) {
        if ("ichigo".equals(entity.NAME) || "nigo".equals(entity.NAME) || "sanggo".equals(entity.NAME) || "good_striker".equals(entity.NAME)) {
            this.scaleWidth = 0.4f;
            this.scaleHeight = 0.4f;
        } else if (!"patkaiser".equals(entity.NAME) && !"lupinkaiser".equals(entity.NAME)) {
            this.scaleWidth = 0.5f;
            this.scaleHeight = 0.5f;
        } else {
            this.scaleWidth = 2.0f;
            this.scaleHeight = 2.0f;
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
