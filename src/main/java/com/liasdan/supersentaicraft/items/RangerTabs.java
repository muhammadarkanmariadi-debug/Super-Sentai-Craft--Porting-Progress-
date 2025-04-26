package com.liasdan.supersentaicraft.items;

import java.util.ArrayList;
import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.RangerBlocks;
import com.liasdan.supersentaicraft.entity.MobsCore;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RangerTabs {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
			SuperSentaiCraftCore.MODID) ;
	
    /*public static DeferredItem<CreativeModeTab> RiderblockTab = CREATIVE_MODE_TABS.register("krc_999_blocks_tab", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(Rider_Blocks.PURE_GAIA_MEMORY_BLOCK.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+"textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Rider Blocks")).build());*/
	
    public static DeferredHolder<CreativeModeTab, CreativeModeTab> GorangerTab = CREATIVE_MODE_TABS.register("ssc001", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(GorangerItems.GORANGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_goranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.goranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> JAKQTab = CREATIVE_MODE_TABS.register("ssc002", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(JAKQItems.JAKQ_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_jakq_items.png"))
					.title(Component.translatable("tab.supersentaicraft.jakq")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> SunVulcanTab = CREATIVE_MODE_TABS.register("ssc005", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(SunVulcanItems.SUN_VULCAN_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_sun_vulcan_items.png"))
					.title(Component.translatable("tab.supersentaicraft.sun_vulcan")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> MaskmanTab = CREATIVE_MODE_TABS.register("ssc011", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(MaskmanItems.MASKMAN_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_maskman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.maskman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> CarrangerTab = CREATIVE_MODE_TABS.register("ssc020", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(CarrangerItems.CARRANGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_carranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.carranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GingamanTab = CREATIVE_MODE_TABS.register("ssc022", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(GingamanItems.GINGAMAN_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_gingaman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gingaman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GaorangerTab = CREATIVE_MODE_TABS.register("ssc025", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(GaorangerItems.GAORANGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_gaoranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gaoranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> ShinkengerTab = CREATIVE_MODE_TABS.register("ssc033", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(ShinkengerItems.SHINKENGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_shinkenger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.shinkenger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> LuPatRangerTab = CREATIVE_MODE_TABS.register("ssc042", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(LuPatRangerItems.LUPATRANGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_lupat_items.png"))
					.title(Component.translatable("tab.supersentaicraft.lupat")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> RyusoulgerTab = CREATIVE_MODE_TABS.register("ssc043", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(RyusoulgerItems.RYUSOULGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_ryusoulger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.ryusoulger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> BoonboomgerTab = CREATIVE_MODE_TABS.register("ssc048", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(BoonboomgerItems.BOONBOOMGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_boonboomger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.boonboomger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GozyugerTab = CREATIVE_MODE_TABS.register("ssc050", () ->
			CreativeModeTab.builder().icon(() -> new ItemStack(GozyugerItems.GOZYUGER_HELMET.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_gozyuger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gozyuger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> MiscTab = CREATIVE_MODE_TABS.register("ssc900", () ->
    		CreativeModeTab.builder().icon(() -> new ItemStack(OtherItems.SUPER_SENTAI_LOGO.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_misc_items.png"))
					.title(Component.translatable("tab.supersentaicraft.misc")).build());
    
    public static DeferredHolder<CreativeModeTab, CreativeModeTab> BlockTab = CREATIVE_MODE_TABS.register("ssc901", () ->
    		CreativeModeTab.builder().icon(() -> new ItemStack(RangerBlocks.RYUSOULGER_ORE.get())).backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,"textures/gui/tab_misc_items.png"))
					.title(Component.translatable("tab.supersentaicraft.block")).build());
    
    public static List<Item> GORANGER= new ArrayList<Item>();
	public static List<Item> JAKQ= new ArrayList<Item>();
	public static List<Item> SUN_VULCAN= new ArrayList<Item>();

	public static List<Item> MASKMAN= new ArrayList<Item>();

	public static List<Item> CARRANGER= new ArrayList<Item>();
    public static List<Item> GINGAMAN= new ArrayList<Item>();

	public static List<Item> GAORANGER= new ArrayList<Item>();
    public static List<Item> SHINKENGER= new ArrayList<Item>();

	public static List<Item> LUPATRANGER= new ArrayList<Item>();
	public static List<Item> RYUSOULGER= new ArrayList<Item>();
	public static List<Item> BOONBOOMGER= new ArrayList<Item>();
	public static List<Item> GOZYUGER= new ArrayList<Item>();
    
    public static List<Item> MISC= new ArrayList<Item>();
    public static List<Block> BLOCKS= new ArrayList<Block>();

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
    
    public static void AddItemsToTabs(BuildCreativeModeTabContentsEvent event){

		if(event.getTab() == RangerTabs.GorangerTab.get()) {
			for (int i = 0; i < RangerTabs.GORANGER.size(); i++)
			{
				event.accept( RangerTabs.GORANGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.JAKQTab.get()) {
			for (int i = 0; i < RangerTabs.JAKQ.size(); i++)
			{
				event.accept( RangerTabs.JAKQ.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.SunVulcanTab.get()) {
			for (int i = 0; i < RangerTabs.SUN_VULCAN.size(); i++)
			{
				event.accept( RangerTabs.SUN_VULCAN.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.MaskmanTab.get()) {
			for (int i = 0; i < RangerTabs.MASKMAN.size(); i++)
			{
				event.accept( RangerTabs.MASKMAN.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.CarrangerTab.get()) {
			for (int i = 0; i < RangerTabs.CARRANGER.size(); i++)
			{
				event.accept( RangerTabs.CARRANGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.GingamanTab.get()) {
			for (int i = 0; i < RangerTabs.GINGAMAN.size(); i++)
			{
				event.accept( RangerTabs.GINGAMAN.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.GaorangerTab.get()) {
			for (int i = 0; i < RangerTabs.GAORANGER.size(); i++)
			{
				event.accept( RangerTabs.GAORANGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.ShinkengerTab.get()) {
			for (int i = 0; i < RangerTabs.SHINKENGER.size(); i++)
			{
				event.accept( RangerTabs.SHINKENGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.LuPatRangerTab.get()) {
			for (int i = 0; i < RangerTabs.LUPATRANGER.size(); i++)
			{
				event.accept( RangerTabs.LUPATRANGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.RyusoulgerTab.get()) {
			for (int i = 0; i < RangerTabs.RYUSOULGER.size(); i++)
			{
				event.accept( RangerTabs.RYUSOULGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.BoonboomgerTab.get()) {
			for (int i = 0; i < RangerTabs.BOONBOOMGER.size(); i++)
			{
				event.accept( RangerTabs.BOONBOOMGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.GozyugerTab.get()) {
			for (int i = 0; i < RangerTabs.GOZYUGER.size(); i++)
			{
				event.accept( RangerTabs.GOZYUGER.get(i));
			}

		}
		else if(event.getTab() == RangerTabs.MiscTab.get()) {

			event.accept(MobsCore.ZOLDERS_SPAWN_EGG);

			event.accept(MobsCore.CRIMERS_SPAWN_EGG);

			event.accept(MobsCore.MACHINEMEN_SPAWN_EGG);

			event.accept(MobsCore.UNGLERS_SPAWN_EGG);

			event.accept(MobsCore.WUMPERS_SPAWN_EGG);
			event.accept(MobsCore.SIGNALMAN_EVIL_SPAWN_EGG);

			event.accept(MobsCore.YARTOTS_SPAWN_EGG);
			event.accept(MobsCore.BLACK_KNIGHT_SPAWN_EGG);

			event.accept(MobsCore.ORGETTES_SPAWN_EGG);
			event.accept(MobsCore.DUKE_ORG_ROUKI_SPAWN_EGG);

			event.accept(MobsCore.NANASHIS_SPAWN_EGG);
			event.accept(MobsCore.GEDOU_SHINKEN_RED_SPAWN_EGG);

			event.accept(MobsCore.PORDERMEN_SPAWN_EGG);

			event.accept(MobsCore.DRUNNS_SPAWN_EGG);
			event.accept(MobsCore.GAISOULG_SPAWN_EGG);
			event.accept(MobsCore.RYUSOUL_MORIA_SPAWN_EGG);
			
			for (int i = 0; i < RangerTabs.MISC.size(); i++)
			{
				event.accept( RangerTabs.MISC.get(i));
			}

			event.accept(OtherItems.SUSUME_GORANGER_MUSIC_DISC);

			event.accept(OtherItems.SAMURAI_SENTAI_SHINKENGER_MUSIC_DISC);
		}
		else if(event.getTab() == RangerTabs.BlockTab.get()) {
			for (int i = 0; i < RangerTabs.BLOCKS.size(); i++)
			{
				event.accept( RangerTabs.BLOCKS.get(i));
			}

		}


    	
    }
    
}
