package com.liasdan.supersentaicraft;

import com.liasdan.supersentaicraft.client.renderer.BasicEntityRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownShurikenRenderer;
import com.liasdan.supersentaicraft.client.renderer.ThrownWeaponRenderer;
import com.liasdan.supersentaicraft.events.ModClientEvents;
import com.liasdan.supersentaicraft.blocks.RangerBlocks;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.events.ModCommonEvents;
import com.liasdan.supersentaicraft.items.*;
import com.liasdan.supersentaicraft.items.gingaman.GingaBraceItem;
import com.liasdan.supersentaicraft.items.lupatranger.VSChangerItem;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.ryusoulger.MosaChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulChangerItem;
import com.liasdan.supersentaicraft.loot.ModLootModifiers;
import com.liasdan.supersentaicraft.sounds.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
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
import net.neoforged.neoforge.client.event.RenderLivingEvent;
import net.neoforged.neoforge.client.event.RenderPlayerEvent;
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

	public static List<Item> CHARGED_WEAPON= new ArrayList<Item>();

	public static List<Item> FORM_WEAPON_ITEM= new ArrayList<Item>();

	public static List<Item> CHANGE_CHANGER_TEXTURE= new ArrayList<Item>();

	public SuperSentaiCraftCore(IEventBus modEventBus, ModContainer modContainer) {
		// Register the commonSetup method for modloading
		modEventBus.addListener(this::commonSetup);
		NeoForge.EVENT_BUS.register(new ModClientEvents.ClientEvents());
		NeoForge.EVENT_BUS.register(new ModCommonEvents.CommonEvents());
		NeoForge.EVENT_BUS.register(new ModCommonEvents.EventHandler());

		// Register ourselves for server and other game events we are interested in.
		// Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
		// Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
		NeoForge.EVENT_BUS.register(this);
		EffectCore.register(modEventBus);
		ModSounds.register(modEventBus);

		OtherItems.register(modEventBus);

		GorangerItems.register(modEventBus);
		JAKQItems.register(modEventBus);
		BattleFeverItems.register(modEventBus);
		SunVulcanItems.register(modEventBus);
		MaskmanItems.register(modEventBus);
		CarrangerItems.register(modEventBus);
		GingamanItems.register(modEventBus);
		GaorangerItems.register(modEventBus);
		ShinkengerItems.register(modEventBus);
		LuPatRangerItems.register(modEventBus);
		RyusoulgerItems.register(modEventBus);
		BoonboomgerItems.register(modEventBus);
		GozyugerItems.register(modEventBus);

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

	@SubscribeEvent
	public void addRenderLivingEvent(RenderLivingEvent.Pre event) {

		if (event.getRenderer().getModel() instanceof PlayerModel model) {
			if (event.getEntity().getItemBySlot(EquipmentSlot.FEET).getItem() instanceof ArmorItem belt) {
				if (event.getEntity().getItemBySlot(EquipmentSlot.FEET).has(DataComponents.CUSTOM_DATA)) {
					CompoundTag tag = event.getEntity().getItemBySlot(EquipmentSlot.FEET).get(DataComponents.CUSTOM_DATA).getUnsafe();
					if (tag.getDouble("render_type") != 0) {
						if (tag.getDouble("render_type") != 2) {
							model.head.visible = false;
						}
						else {
							model.head.visible = true;
						}

						if (tag.getDouble("render_type") != 3) {
							model.leftLeg.visible = false;
							model.rightLeg.visible = false;
							model.leftArm.visible = false;
							model.rightArm.visible = false;
							model.body.visible = false;
						}
						else {
							model.head.visible = true;
							model.leftLeg.visible = true;
							model.rightLeg.visible = true;
							model.leftArm.visible = true;
							model.rightArm.visible = true;
							model.body.visible = true;
						}

						model.leftSleeve.visible = false;
						model.rightSleeve.visible = false;
						model.leftPants.visible = false;
						model.rightPants.visible = false;
						model.jacket.visible = false;
					}
				}
			}
			if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ArmorItem belt) {
				if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).has(DataComponents.CUSTOM_DATA)) {
					CompoundTag tag = event.getEntity().getItemBySlot(EquipmentSlot.HEAD).get(DataComponents.CUSTOM_DATA).getUnsafe();
					if (tag.getDouble("render_type2") != 0) {
						model.head.visible = false;
						model.hat.visible = false;
						model.leftLeg.visible = false;
						model.rightLeg.visible = false;
						model.leftArm.visible = false;
						model.rightArm.visible = false;
						model.body.visible = false;
						model.leftSleeve.visible = false;
						model.rightSleeve.visible = false;
						model.leftPants.visible = false;
						model.rightPants.visible = false;
						model.jacket.visible = false;
					}
				}
			}
			else {
				model.head.visible = true;
				model.hat.visible = true;
				model.leftLeg.visible = true;
				model.rightLeg.visible = true;
				model.leftArm.visible = true;
				model.rightArm.visible = true;
				model.body.visible = true;
				model.leftSleeve.visible = true;
				model.rightSleeve.visible = true;
				model.leftPants.visible = true;
				model.rightPants.visible = true;
				model.jacket.visible = true;
			}
		}

		float size = 1;
		boolean Tall = event.getEntity().hasEffect(EffectCore.STRETCH);

		if (event.getEntity().hasEffect(EffectCore.STRETCH)) {
			size = size + ((event.getEntity().getEffect(EffectCore.STRETCH).getAmplifier()) +1f);
		}

		float size2 = event.getEntity().hasEffect(EffectCore.STRETCH) ? 1 : size;

		if (event.getEntity().hasEffect(EffectCore.FLAT)) {
			size2 = 0.04f;
		}
		float size3 = event.getEntity().hasEffect(EffectCore.STRETCH) ? 1 : size;
		if (event.getEntity().hasEffect(EffectCore.WIDE)) {
			size2 = (float) (size2 * 3);
			size3 = (float) (size3 * 3);
		}
		event.getPoseStack().scale(size3, size, size2);
	}

	@SubscribeEvent
	public void addRenderPlayerEvent(RenderPlayerEvent.Pre event) {

	}

	// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
	@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {

			for (int i = 0; i < SWORD_GUN_ITEM.size(); i++) {
				ItemProperties.register(SWORD_GUN_ITEM.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
					if ($entity == null) {
						return 0.0F;
					} else {
						return $entity.getUseItem() != $itemStack ? 0.0F : (float)($itemStack.getUseDuration($entity) - $entity.getUseItemRemainingTicks()) / 1.0F;
					}

				});
			}

			for (int i = 0; i < SHIELD_ITEM.size(); i++) {
				ItemProperties.register(SHIELD_ITEM.get(i), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
					return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
				});
			}

			for (int i = 0; i < MULTI_WEAPON_ITEM.size(); i++) {
				ItemProperties.register(MULTI_WEAPON_ITEM.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
					return BaseDualSwordItem.get_mode($itemStack);
				});
			}

			for (int i = 0; i < CHARGED_WEAPON.size(); i++) {
				ItemProperties.register(CHARGED_WEAPON.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
					if (BaseBlasterItem.get_mode($itemStack) == 30) return 1;
					return 0;
				});
			}

			for (int i = 0; i < FORM_WEAPON_ITEM.size(); i++) {
				ItemProperties.register(FORM_WEAPON_ITEM.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
					if ($entity == null) {
						return 0.0F;
					}
					else if ($entity.getItemBySlot(EquipmentSlot.FEET)!= null) {
						ItemStack belt = $entity.getItemBySlot(EquipmentSlot.FEET);
						if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GingaBraceItem) {
							if ($itemStack.getItem() == GingamanItems.JUUGEKIBOU_RED.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_GREEN.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_BLUE.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_YELLOW.get()||$itemStack.getItem() == GingamanItems.JUUGEKIBOU_PINK.get()) {
								if (GingaBraceItem.get_Form_Item(belt, 2).getBeltTex()=="beast_armor_shine_belt") return $entity.getUseItem() != $itemStack ? 2.0F : 3.0F;
								else return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
							}
							if ($itemStack.getItem() == GingamanItems.SEIJUUKEN.get()) {
								if (GingaBraceItem.get_Form_Item(belt, 2).getBeltTex()=="beast_armor_shine_belt") return 1;
								else return 0;
							}
						}
						if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof VSChangerItem) {
							if ($itemStack.getItem() == LuPatRangerItems.VS_CHANGER.get()) {
								if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="_tricolor") return 7;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="_ugou") return 8;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_scissor") return 9;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_crane") return 10;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_magic") return 11;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_splash") return 12;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="_super") return 13;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_siren") return 14;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="lupat_gold") return 15;
								else if (VSChangerItem.get_Form_Item(belt,2).getFormName(false)=="") {
									if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.RED_VS_CHANGER.get()) return 1;
									else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.BLUE_VS_CHANGER.get()) return 2;
									else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.YELLOW_VS_CHANGER.get()) return 3;
									else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.ICHIGOU_VS_CHANGER.get()) return 4;
									else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.NIGOU_VS_CHANGER.get()) return 5;
									else if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.SANGOU_VS_CHANGER.get()) return 6;
								}
								else return 0;
							}
						}
						if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==LuPatRangerItems.LUPAT_X_CHANGER.get()) {
							if ($itemStack.getItem() == LuPatRangerItems.X_CHANGER.get()){
								if (RangerChangerItem.get_Form_Item(belt, 1).getBeltTex()=="lupinranger_belt") return 1;
								else return 0;
							}
						}
						if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RyusoulChangerItem) {
							if ($itemStack.getItem() == RyusoulgerItems.MAX_RYUSOUL_CHANGER.get()) {
								if (RyusoulChangerItem.get_Form_Item(belt, 2).getFormName(false)=="_max") return 1;
								else return 0;
							}
						}
						if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof MosaChangerItem) {

							if ($itemStack.getItem() == RyusoulgerItems.MOSA_CHANGER.get()) {
								if ($entity.getItemBySlot(EquipmentSlot.FEET).getItem()==RyusoulgerItems.GOLD_MOSA_CHANGER.get()){
									if (MosaChangerItem.get_Form_Item(belt, 2).getFormName(false)!="") return 2;
									else return 1;
								}
								else return 0;
							}
						}
						else {
							return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
						}
						return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
					}
					return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
					//return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
				});
			}

			for (int i = 0; i < CHANGE_CHANGER_TEXTURE.size(); i++) {
				ItemProperties.register(CHANGE_CHANGER_TEXTURE.get(i), ResourceLocation.parse("change"), ($itemStack, $level, $entity, $seed) -> {
					if ($entity == null) {
						return 0.0F;
					} else {
						if ($itemStack.getItem() == LuPatRangerItems.LUPAT_X_CHANGER.get()) {
							if (RangerChangerItem.get_Form_Item($itemStack, 1).getBeltTex() == "lupinranger_belt") return 1;
							else return 0;
						}
					}
					return $entity.getUseItem() != $itemStack ? 0.0F : 1.0F;
					//return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
				});
			}
		}

		@SubscribeEvent
		public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
			event.registerEntityRenderer(MobsCore.ZOLDERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.CRIMERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.MACHINEMEN.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.UNGLERS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.WUMPERS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.SIGNALMAN_EVIL.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.YARTOTS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.BLACK_KNIGHT.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.ORGETTES.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.DUKE_ORG_ROUKI.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.NANASHIS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.GEDOU_SHINKEN_RED.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.PORDERMEN.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.DRUNNS.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.GAISOULG.get(), BasicEntityRenderer::new);
			event.registerEntityRenderer(MobsCore.RYUSOUL_MORIA.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.NEJIRETTAS.get(), BasicEntityRenderer::new);

			event.registerEntityRenderer(MobsCore.EXPLOSIVE_PROJECTILE.get(), ThrownItemRenderer::new);
			event.registerEntityRenderer(MobsCore.WEAPON_PROJECTILE.get(), ThrownWeaponRenderer::new);
			event.registerEntityRenderer(MobsCore.SHURIKEN_PROJECTILE.get(), ThrownShurikenRenderer::new);
		}
	}
}