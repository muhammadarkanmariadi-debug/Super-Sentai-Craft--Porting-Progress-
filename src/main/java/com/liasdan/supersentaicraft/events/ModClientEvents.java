package com.liasdan.supersentaicraft.events;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.client.renderer.BasicEntityRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownShurikenRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownWeaponRenderer;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.GingamanItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.gingaman.GingaBraceItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.MosaChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulChangerItem;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RenderLivingEvent;

public class ModClientEvents {

	public static class ClientEvents {
		@SubscribeEvent
		public void addRenderLivingEvent(RenderLivingEvent.Pre event) {

			float size = 1;
			boolean Tall = event.getEntity().hasEffect(EffectCore.STRETCH);

			if (event.getEntity().hasEffect(EffectCore.STRETCH)) {
				size = size + ((event.getEntity().getEffect(EffectCore.STRETCH).getAmplifier()) + 1);
			}

			float size2 = event.getEntity().hasEffect(EffectCore.STRETCH) ? 1 : size;

			if (event.getEntity().hasEffect(EffectCore.FLAT)) {
				size2 = 0.1f;
			}
			float size3 = event.getEntity().hasEffect(EffectCore.STRETCH) ? 1 : size;
			if (event.getEntity().hasEffect(EffectCore.WIDE)) {
				size2 = (float) (size2 * 3);
				size3 = (float) (size3 * 3);
			}
			event.getPoseStack().scale(size3, size, size2);
		}
	}
}