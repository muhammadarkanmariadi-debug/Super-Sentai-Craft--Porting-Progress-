package com.liasdan.supersentaicraft.client.models;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.mecha.BaseMechaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MechaModel extends GeoModel<BaseMechaEntity> {
    @Override
    public ResourceLocation getModelResource(BaseMechaEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/vsranger_gattai/" + animatable.NAME_MODEL + ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BaseMechaEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/entity/vsranger_gattai/" + animatable.NAME + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(BaseMechaEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "animations/vsranger_gattai/" + animatable.NAME_ANIMATIONS + ".animation.json");
    }
}
