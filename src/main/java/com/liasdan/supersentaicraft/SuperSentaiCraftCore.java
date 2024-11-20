package com.liasdan.supersentaicraft;

import com.liasdan.supersentaicraft.client.renderer.BasicEntityRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownShurikenRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownWeaponRenderer;
import com.liasdan.supersentaicraft.events.ModClientEvents;
import com.liasdan.supersentaicraft.blocks.RangerBlocks;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.events.ModCommonEvents;
import com.liasdan.supersentaicraft.items.GingamanItems;
import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.MaskmanItems;
import com.liasdan.supersentaicraft.items.MobsItems;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.ShinkengerItems;
import com.liasdan.supersentaicraft.items.gingaman.GingaBraceItem;
import com.liasdan.supersentaicraft.items.others.BaseDualSwordItem;
import com.liasdan.supersentaicraft.items.ryusoulger.MosaChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulChangerItem;
import com.liasdan.supersentaicraft.loot.ModLootModifiers;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Mod(SuperSentaiCraftCore.MODID)
public class SuperSentaiCraftCore {

	public static final String MODID="supersentaicraft";
	private static final Logger LOGGER = LogUtils.getLogger();

	private static final ResourceLocation BLOCKING_PROPERTY_RESLOC = ResourceLocation.parse("blocking");

	public static List<Item> SWORD_GUN_ITEM= new ArrayList<Item>();

	public static List<Item> SHIELD_ITEM= new ArrayList<Item>();

	public static List<Item> MULTI_WEAPON_ITEM= new ArrayList<Item>();

	public static List<Item> FORM_WEAPON_ITEM= new ArrayList<Item>();

	public SuperSentaiCraftCore(IEventBus modEventBus, ModContainer modContainer) {
		// Register the commonSetup method for modloading
		modEventBus.addListener(this::commonSetup);
		NeoForge.EVENT_BUS.register(new ModCommonEvents.CommonEvents());
		NeoForge.EVENT_BUS.register(new ModCommonEvents.EventHandler());

		// Register ourselves for server and other game events we are interested in.
		// Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
		// Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
		NeoForge.EVENT_BUS.register(this);
		EffectCore.register(modEventBus);

		GorangerItems.register(modEventBus);
		MaskmanItems.register(modEventBus);
		GingamanItems.register(modEventBus);
		ShinkengerItems.register(modEventBus);
		RyusoulgerItems.register(modEventBus);

		OtherItems.register(modEventBus);
		RangerBlocks.register(modEventBus);

		MobsCore.register(modEventBus);
		MobsCore.MOBLIST.register(modEventBus);
		MobsItems.register(modEventBus);
		RangerTabs.register(modEventBus);
		ModLootModifiers.register(modEventBus);

		// Register the item to a creative tab
		modEventBus.addListener(this::addCreative);
		modEventBus.addListener(ModCommonEvents::entityAttributeEvent);
		modEventBus.addListener(ModCommonEvents::entitySpawnRestriction);

		// Register our mod's ModConfigSpec so that FML can create and load the config file for us
		modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
	}

	private void commonSetup(final FMLCommonSetupEvent event)
	{
	}

	// Add the example block item to the building blocks tab
	private void addCreative(BuildCreativeModeTabContentsEvent event)
	{
		RangerTabs.AddItemsToTabs(event);
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
	}

	// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
	@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			NeoForge.EVENT_BUS.register(new ModClientEvents.ClientEvents());

			for (int i = 0; i < SWORD_GUN_ITEM.size(); i++) {
				ItemProperties.register(SWORD_GUN_ITEM.get(i), ResourceLocation.parse("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
					if (p_174637_ == null) {
						return 0.0F;
					} else {
						return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration(p_174637_) - p_174637_.getUseItemRemainingTicks()) / 1.0F;
					}
				});
			}

			for (int i = 0; i < SHIELD_ITEM.size(); i++) {
				ItemProperties.register(SHIELD_ITEM.get(i), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
					return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
				});
			}

			for (int i = 0; i < MULTI_WEAPON_ITEM.size(); i++) {
				ItemProperties.register(MULTI_WEAPON_ITEM.get(i), ResourceLocation.parse("pull"), ($itemStack, $level, $entity, $seed) -> {
					return BaseDualSwordItem.get_mode($itemStack);
				});
			}

			for (int i = 0; i < FORM_WEAPON_ITEM.size(); i++) {
				ItemProperties.register(FORM_WEAPON_ITEM.get(i), ResourceLocation.parse("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
					if (p_174637_ == null) {
						return 0.0F;
					}
					else if (p_174637_.getItemBySlot(EquipmentSlot.FEET)!= null) {
						ItemStack belt = p_174637_.getItemBySlot(EquipmentSlot.FEET);
						if (p_174637_.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GingaBraceItem) {
							if (p_174635_.getItem() == GingamanItems.JUUGEKIBOU_RED.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_GREEN.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_BLUE.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_YELLOW.get()||p_174635_.getItem() == GingamanItems.JUUGEKIBOU_PINK.get()) {
								if (GingaBraceItem.get_Form_Item(belt, 1).getBeltTex()=="beast_armor_shine_belt") return p_174637_.getUseItem() != p_174635_ ? 2.0F : 3.0F;
								else return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
							}
							if (p_174635_.getItem() == GingamanItems.SEIJUUKEN.get()) {
								if (GingaBraceItem.get_Form_Item(belt, 1).getBeltTex()=="beast_armor_shine_belt") return 1;
								else return 0;
							}
						}
						if (p_174637_.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RyusoulChangerItem) {
							if (p_174635_.getItem() == RyusoulgerItems.MAX_RYUSOUL_CHANGER.get()) {
								if (RyusoulChangerItem.get_Form_Item(belt, 2).getFormName(false)=="_max") return 1;
								else return 0;
							}
						}
						if (p_174637_.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof MosaChangerItem) {

							if (p_174635_.getItem() == RyusoulgerItems.MOSA_CHANGER.get()) {
								if (p_174637_.getItemBySlot(EquipmentSlot.FEET).getItem()==RyusoulgerItems.GOLD_MOSA_CHANGER.get()){
									if (MosaChangerItem.get_Form_Item(belt, 2).getFormName(false)!="") return 2;
									else return 1;
								}
								else return 0;
							}
						}
						else {
							return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
						}
						return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
					}
					return p_174637_.getUseItem() != p_174635_ ? 0.0F : 1.0F;
					//return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
				});
			}
		}

		@SubscribeEvent
		public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
			event.registerEntityRenderer(MobsCore.ZOLDERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.UNGLERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.YARTOTS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.NANASHIS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.GEDOU_SHINKEN_RED.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.DRUNNS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.GAISOULG.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.RYUSOUL_MORIA.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.EXPLOSIVE_PROJECTILE.get(), ThrownItemRenderer::new);
			event.registerEntityRenderer(MobsCore.WEAPON_PROJECTILE.get(), ThrownWeaponRenderer::new);
			event.registerEntityRenderer(MobsCore.SHURIKEN_PROJECTILE.get(), ThrownShurikenRenderer::new);
		}
	}
}