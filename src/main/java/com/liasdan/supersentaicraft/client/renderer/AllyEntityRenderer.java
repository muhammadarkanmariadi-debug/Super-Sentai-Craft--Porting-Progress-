package com.liasdan.supersentaicraft.client.renderer;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.client.models.BasicMobModel;
import com.liasdan.supersentaicraft.entity.ally.BaseAllyEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;


public class AllyEntityRenderer extends  HumanoidMobRenderer<BaseAllyEntity, BasicMobModel<BaseAllyEntity>>  {


	public AllyEntityRenderer(EntityRendererProvider.Context ctx) {
		this(ctx, ModelLayers.PLAYER);
	}

	
	public AllyEntityRenderer(EntityRendererProvider.Context ctx, ModelLayerLocation ModelLayer) {
		super(ctx, new BasicMobModel<>(ctx.bakeLayer(ModelLayer)),1);
		this.addLayer(new HumanoidArmorLayer<>(this, new HumanoidModel<>(ctx.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel<>(ctx.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), ctx.getModelManager()));
	}



	@Override
	public ResourceLocation getTextureLocation(BaseAllyEntity p_114482_) {
		
		return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "textures/entities/"+p_114482_.NAME+".png");
	}
}