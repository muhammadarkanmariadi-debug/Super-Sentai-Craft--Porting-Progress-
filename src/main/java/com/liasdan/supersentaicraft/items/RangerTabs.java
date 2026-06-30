package com.liasdan.supersentaicraft.items;

import java.util.ArrayList;
import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.RangerBlocks;
import com.liasdan.supersentaicraft.entity.MobsCore;

import com.liasdan.supersentaicraft.items.project_red.GavanInfinityItems;
import com.liasdan.supersentaicraft.items.sentai_50.*;
import com.liasdan.supersentaicraft.items.sentai_40.*;
import com.liasdan.supersentaicraft.items.sentai_30.*;
import com.liasdan.supersentaicraft.items.sentai_20.*;
import com.liasdan.supersentaicraft.items.sentai_10.*;

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

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
			Registries.CREATIVE_MODE_TAB,
			SuperSentaiCraftCore.MODID);

	/*
	 * public static DeferredItem<CreativeModeTab> RiderblockTab =
	 * CREATIVE_MODE_TABS.register("krc_999_blocks_tab", () ->
	 * CreativeModeTab.builder().icon(() -> new
	 * ItemStack(Rider_Blocks.PURE_GAIA_MEMORY_BLOCK.get())).withBackgroundLocation(
	 * new ResourceLocation(KamenRiderCraftCore.MODID+
	 * "textures/gui/tab_iichigo_items.png"))
	 * .title(Component.literal("Rider Blocks")).build());
	 */

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GorangerTab = CREATIVE_MODE_TABS.register("ssc001",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GorangerItems.GORANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_goranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.goranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> JAKQTab = CREATIVE_MODE_TABS.register("ssc002",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(JAKQItems.JAKQ_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_jakq_items.png"))
					.title(Component.translatable("tab.supersentaicraft.jakq")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> BattleFeverTab = CREATIVE_MODE_TABS.register(
			"ssc003",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(BattleFeverItems.BATTLE_FEVER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_battle_fever_items.png"))
					.title(Component.translatable("tab.supersentaicraft.battle_fever")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> SunVulcanTab = CREATIVE_MODE_TABS.register("ssc005",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(SunVulcanItems.SUN_VULCAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_sun_vulcan_items.png"))
					.title(Component.translatable("tab.supersentaicraft.sun_vulcan")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> MaskmanTab = CREATIVE_MODE_TABS.register("ssc011",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(MaskmanItems.MASKMAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_maskman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.maskman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> TurborangerTab = CREATIVE_MODE_TABS.register(
			"ssc013",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(TurborangerItems.TURBORANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_turboranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.turboranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> CarrangerTab = CREATIVE_MODE_TABS.register("ssc020",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(CarrangerItems.CARRANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_carranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.carranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GingamanTab = CREATIVE_MODE_TABS.register("ssc022",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GingamanItems.GINGAMAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_gingaman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gingaman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GoGoVTab = CREATIVE_MODE_TABS.register("ssc023",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GoGoVItems.GOGO_V_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_gogo_v_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gogo_v")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> TimerangerTab = CREATIVE_MODE_TABS.register("ssc024",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_20.TimerangerItems.TIMERANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_timeranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.timeranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GaorangerTab = CREATIVE_MODE_TABS.register("ssc025",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GaorangerItems.GAORANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_gaoranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gaoranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> MagirangerTab = CREATIVE_MODE_TABS.register("ssc029",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_20.MagirangerItems.MAGIRANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_magiranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.magiranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> BoukengerTab = CREATIVE_MODE_TABS.register("ssc030",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(BoukengerItems.BOUKENGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_boukenger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.boukenger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> ShinkengerTab = CREATIVE_MODE_TABS.register("ssc033",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ShinkengerItems.SHINKENGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_shinkenger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.shinkenger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GoseigerTab = CREATIVE_MODE_TABS.register("ssc034",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_30.GoseigerItems.GOSEIGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_goseiger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.goseiger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GoBustersTab = CREATIVE_MODE_TABS.register("ssc036",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GoBustersItems.GO_BUSTERS_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_go_busters_items.png"))
					.title(Component.translatable("tab.supersentaicraft.go_busters")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> KyoryugerTab = CREATIVE_MODE_TABS.register("ssc037",
			() -> CreativeModeTab.builder()
					.icon(() -> new ItemStack(
							com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems.KYORYUGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_kyoryuger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.kyoryuger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> LuPatRangerTab = CREATIVE_MODE_TABS.register(
			"ssc042",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(LuPatRangerItems.LUPATRANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_lupat_items.png"))
					.title(Component.translatable("tab.supersentaicraft.lupat")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> RyusoulgerTab = CREATIVE_MODE_TABS.register("ssc043",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(RyusoulgerItems.RYUSOULGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_ryusoulger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.ryusoulger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> KingOhgerTab = CREATIVE_MODE_TABS.register("ssc047",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(KingOhgerItems.KING_OHGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_king_ohger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.king_ohger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> BoonboomgerTab = CREATIVE_MODE_TABS.register(
			"ssc048",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(BoonboomgerItems.BOONBOOMGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_boonboomger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.boonboomger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GozyugerTab = CREATIVE_MODE_TABS.register("ssc050",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GozyugerItems.GOZYUGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_gozyuger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gozyuger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GavanInfinityTab = CREATIVE_MODE_TABS.register(
			"ssc051",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GavanInfinityItems.GAVAN_INFINITY_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_gavan_infinity_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gavan_infinity")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> DenzimanTab = CREATIVE_MODE_TABS.register("ssc004",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(DenzimanItems.DENZIMAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_denziman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.denziman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GoggleVTab = CREATIVE_MODE_TABS.register("ssc006",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GoggleVItems.GOGGLE_V_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_goggle_v_items.png"))
					.title(Component.translatable("tab.supersentaicraft.goggle_v")).build());

	// TODO: Uncomment when Dynaman is ported to 1.21.1
	// public static DeferredHolder<CreativeModeTab, CreativeModeTab> DynamanTab = CREATIVE_MODE_TABS.register("ssc007",
	// 		() -> CreativeModeTab.builder().icon(() -> new ItemStack(OtherItems.SUPER_SENTAI_LOGO.get()))
	// 				.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
	// 						"textures/gui/tab_dynaman_items.png"))
	// 				.title(Component.translatable("tab.supersentaicraft.dynaman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> BiomanTab = CREATIVE_MODE_TABS.register("ssc008",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(BiomanItems.BIOMAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_bioman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.bioman")).build());

	// TODO: Uncomment when Changeman is ported to 1.21.1
	// public static DeferredHolder<CreativeModeTab, CreativeModeTab> ChangemanTab = CREATIVE_MODE_TABS.register("ssc009",
	// 		() -> CreativeModeTab.builder().icon(() -> new ItemStack(OtherItems.SUPER_SENTAI_LOGO.get()))
	// 				.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
	// 						"textures/gui/tab_misc_items.png"))
	// 				.title(Component.translatable("tab.supersentaicraft.changeman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> FlashmanTab = CREATIVE_MODE_TABS.register("ssc010",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(FlashmanItems.FLASHMAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_flashman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.flashman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> LivemanTab = CREATIVE_MODE_TABS.register("ssc012",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(LivemanItems.LIVEMAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_liveman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.liveman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> JetmanTab = CREATIVE_MODE_TABS.register("ssc015",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(JetmanItems.JETMAN_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_jetman_items.png"))
					.title(Component.translatable("tab.supersentaicraft.jetman")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> ZyurangerTab = CREATIVE_MODE_TABS.register("ssc016",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ZyurangerItems.ZYURANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_zyuranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.zyuranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> DairangerTab = CREATIVE_MODE_TABS.register("ssc017",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(DairangerItems.DAIRANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_dairanger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.dairanger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> KakurangerTab = CREATIVE_MODE_TABS.register("ssc018",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(KakurangerItems.KAKURANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_kakuranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.kakuranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> OhrangerTab = CREATIVE_MODE_TABS.register("ssc019",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_10.OhrangerItems.OHRANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_ohranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.ohranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> MegarangerTab = CREATIVE_MODE_TABS.register("ssc021",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(MegarangerItems.MEGARANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_megaranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.megaranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> HurricanegerTab = CREATIVE_MODE_TABS.register("ssc026",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_20.HurricanegerItems.HURRICANEGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_hurricanger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.hurricaneger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> AbarangerTab = CREATIVE_MODE_TABS.register("ssc027",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(AbarangerItems.ABARANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_abaranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.abaranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> DekarangerTab = CREATIVE_MODE_TABS.register("ssc028",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(DekarangerItems.DEKARANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_dekaranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.dekaranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GekirangerTab = CREATIVE_MODE_TABS.register("ssc031",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GekirangerItems.GEKIRANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_gekiranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gekiranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GoOngerTab = CREATIVE_MODE_TABS.register("ssc032",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(GoOngerItems.GO_ONGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_go_onger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.go_onger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> ZyuohgerTab = CREATIVE_MODE_TABS.register("ssc040",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ZyuohgerItems.ZYUOHGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_zyuohger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.zyuohger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> KIRAMEIGERTab = CREATIVE_MODE_TABS.register("ssc044",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(KiramagerItems.KIRAMEIGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_kirameiger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.kirameiger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> KyurangerTab = CREATIVE_MODE_TABS.register("ssc041",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(KyurangerItems.KYURANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_kyuranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.kyuranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> ToqgerTab = CREATIVE_MODE_TABS.register("ssc038",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ToqgerItems.TOQGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_toqger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.toqger")).build());


	public static DeferredHolder<CreativeModeTab, CreativeModeTab> NinningerTab = CREATIVE_MODE_TABS.register("ssc039",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_30.NinningerItems.NINNINGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_ninninger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.ninninger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> GokaigerTab = CREATIVE_MODE_TABS.register("ssc035",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_30.GokaigerItems.GOKAIGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_gokaiger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.gokaiger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> ZenkaigerTab = CREATIVE_MODE_TABS.register("ssc045",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_50.ZenkaigerItems.ZENKAIGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_zenkaiger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.zenkaiger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> DonbrothersTab = CREATIVE_MODE_TABS.register("ssc046",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_50.DonbrothersItems.DONBROTHERS_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_don_brothers_items.png"))
					.title(Component.translatable("tab.supersentaicraft.donbrothers")).build());
	public static DeferredHolder<CreativeModeTab, CreativeModeTab> MiscTab = CREATIVE_MODE_TABS.register("ssc900",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(OtherItems.SUPER_SENTAI_LOGO.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_misc_items.png"))
					.title(Component.translatable("tab.supersentaicraft.misc")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> AkibarangerTab = CREATIVE_MODE_TABS.register("ssc100",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(com.liasdan.supersentaicraft.items.sentai_50.AkibarangerItems.AKIBARANGER_HELMET.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_akibaranger_items.png"))
					.title(Component.translatable("tab.supersentaicraft.akibaranger")).build());

	public static DeferredHolder<CreativeModeTab, CreativeModeTab> BlockTab = CREATIVE_MODE_TABS.register("ssc901",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(RangerBlocks.RYUSOULGER_ORE.get()))
					.backgroundTexture(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID,
							"textures/gui/tab_misc_items.png"))
					.title(Component.translatable("tab.supersentaicraft.block")).build());

	public static List<Item> GORANGER = new ArrayList<Item>();
	public static List<Item> JAKQ = new ArrayList<Item>();
	public static List<Item> BATTLE_FEVER = new ArrayList<Item>();
	public static List<Item> SUN_VULCAN = new ArrayList<Item>();

	public static List<Item> MASKMAN = new ArrayList<Item>();
	public static List<Item> TURBORANGER = new ArrayList<Item>();
	public static List<Item> CARRANGER = new ArrayList<Item>();

	public static List<Item> GINGAMAN = new ArrayList<Item>();
	public static List<Item> GOGO_V = new ArrayList<Item>();
	public static List<Item> TIMERANGER = new ArrayList<Item>();
	public static List<Item> GAORANGER = new ArrayList<Item>();

	public static List<Item> MAGIRANGER = new ArrayList<Item>();
	public static List<Item> BOUKENGER = new ArrayList<Item>();
	public static List<Item> SHINKENGER = new ArrayList<Item>();
	public static List<Item> GOSEIGER = new ArrayList<Item>();

	public static List<Item> GO_BUSTERS = new ArrayList<Item>();
	public static List<Item> KYORYUGER = new ArrayList<Item>();

	public static List<Item> LUPATRANGER = new ArrayList<Item>();
	public static List<Item> RYUSOULGER = new ArrayList<Item>();
	public static List<Item> KING_OHGER = new ArrayList<Item>();
	public static List<Item> BOONBOOMGER = new ArrayList<Item>();
	public static List<Item> GOZYUGER = new ArrayList<Item>();

	public static List<Item> GAVAN_INFINITY = new ArrayList<Item>();

	public static List<Item> DENZIMAN = new ArrayList<Item>();
	public static List<Item> GOGGLE_V = new ArrayList<Item>();
	// public static List<Item> DYNAMAN = new ArrayList<Item>(); // TODO: Uncomment when ported
	public static List<Item> BIOMAN = new ArrayList<Item>();
	// public static List<Item> CHANGEMAN = new ArrayList<Item>(); // TODO: Uncomment when ported
	public static List<Item> FLASHMAN = new ArrayList<Item>();
	public static List<Item> LIVEMAN = new ArrayList<Item>();
	public static List<Item> JETMAN = new ArrayList<Item>();
	public static List<Item> ZYURANGER = new ArrayList<Item>();
	public static List<Item> DAIRANGER = new ArrayList<Item>();
	public static List<Item> KAKURANGER = new ArrayList<Item>();
	public static List<Item> OHRANGER = new ArrayList<Item>();
	public static List<Item> MEGARANGER = new ArrayList<Item>();
	public static List<Item> HURRICANEGER = new ArrayList<Item>();
	public static List<Item> ABARANGER = new ArrayList<Item>();
	public static List<Item> DEKARANGER = new ArrayList<Item>();
	public static List<Item> GEKIRANGER = new ArrayList<Item>();
	public static List<Item> GO_ONGER = new ArrayList<Item>();
	public static List<Item> ZYUOHGER = new ArrayList<Item>();
	public static List<Item> KIRAMEIGER = new ArrayList<Item>();
	public static List<Item> TOQGER = new ArrayList<Item>();
	public static List<Item> KYURANGER = new ArrayList<Item>();
	public static List<Item> NINNINGER = new ArrayList<Item>();
	public static List<Item> GOKAIGER = new ArrayList<Item>();
	public static List<Item> ZENKAIGER = new ArrayList<Item>();
	public static List<Item> DONBROTHERS = new ArrayList<Item>();
	public static List<Item> AKIBARANGER = new ArrayList<Item>();
	public static List<Item> MISC = new ArrayList<Item>();
	public static List<Block> BLOCKS = new ArrayList<Block>();

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}

	public static void AddItemsToTabs(BuildCreativeModeTabContentsEvent event) {

		if (event.getTab() == RangerTabs.GorangerTab.get()) {
			for (int i = 0; i < RangerTabs.GORANGER.size(); i++) {
				event.accept(RangerTabs.GORANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.JAKQTab.get()) {
			for (int i = 0; i < RangerTabs.JAKQ.size(); i++) {
				event.accept(RangerTabs.JAKQ.get(i));
			}

		} else if (event.getTab() == RangerTabs.BattleFeverTab.get()) {
			for (int i = 0; i < RangerTabs.BATTLE_FEVER.size(); i++) {
				event.accept(RangerTabs.BATTLE_FEVER.get(i));
			}

		} else if (event.getTab() == RangerTabs.SunVulcanTab.get()) {
			for (int i = 0; i < RangerTabs.SUN_VULCAN.size(); i++) {
				event.accept(RangerTabs.SUN_VULCAN.get(i));
			}

		} else if (event.getTab() == RangerTabs.MaskmanTab.get()) {
			for (int i = 0; i < RangerTabs.MASKMAN.size(); i++) {
				event.accept(RangerTabs.MASKMAN.get(i));
			}

		} else if (event.getTab() == RangerTabs.TurborangerTab.get()) {
			for (int i = 0; i < RangerTabs.TURBORANGER.size(); i++) {
				event.accept(RangerTabs.TURBORANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.CarrangerTab.get()) {
			for (int i = 0; i < RangerTabs.CARRANGER.size(); i++) {
				event.accept(RangerTabs.CARRANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GingamanTab.get()) {
			for (int i = 0; i < RangerTabs.GINGAMAN.size(); i++) {
				event.accept(RangerTabs.GINGAMAN.get(i));
			}

		} else if (event.getTab() == RangerTabs.GoGoVTab.get()) {
			for (int i = 0; i < RangerTabs.GOGO_V.size(); i++) {
				event.accept(RangerTabs.GOGO_V.get(i));
			}

		} else if (event.getTab() == RangerTabs.TimerangerTab.get()) {
			for (int i = 0; i < RangerTabs.TIMERANGER.size(); i++) {
				event.accept(RangerTabs.TIMERANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GaorangerTab.get()) {
			for (int i = 0; i < RangerTabs.GAORANGER.size(); i++) {
				event.accept(RangerTabs.GAORANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.MagirangerTab.get()) {
			for (int i = 0; i < RangerTabs.MAGIRANGER.size(); i++) {
				event.accept(RangerTabs.MAGIRANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.BoukengerTab.get()) {
			for (int i = 0; i < RangerTabs.BOUKENGER.size(); i++) {
				event.accept(RangerTabs.BOUKENGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.ShinkengerTab.get()) {
			for (int i = 0; i < RangerTabs.SHINKENGER.size(); i++) {
				event.accept(RangerTabs.SHINKENGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GoseigerTab.get()) {
			for (int i = 0; i < RangerTabs.GOSEIGER.size(); i++) {
				event.accept(RangerTabs.GOSEIGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GoBustersTab.get()) {
			for (int i = 0; i < RangerTabs.GO_BUSTERS.size(); i++) {
				event.accept(RangerTabs.GO_BUSTERS.get(i));
			}

		} else if (event.getTab() == RangerTabs.KyoryugerTab.get()) {
			for (int i = 0; i < RangerTabs.KYORYUGER.size(); i++) {
				event.accept(RangerTabs.KYORYUGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.LuPatRangerTab.get()) {
			for (int i = 0; i < RangerTabs.LUPATRANGER.size(); i++) {
				event.accept(RangerTabs.LUPATRANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.RyusoulgerTab.get()) {
			for (int i = 0; i < RangerTabs.RYUSOULGER.size(); i++) {
				event.accept(RangerTabs.RYUSOULGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.KingOhgerTab.get()) {
			for (int i = 0; i < RangerTabs.KING_OHGER.size(); i++) {
				event.accept(RangerTabs.KING_OHGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.BoonboomgerTab.get()) {
			for (int i = 0; i < RangerTabs.BOONBOOMGER.size(); i++) {
				event.accept(RangerTabs.BOONBOOMGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GozyugerTab.get()) {
			for (int i = 0; i < RangerTabs.GOZYUGER.size(); i++) {
				event.accept(RangerTabs.GOZYUGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GavanInfinityTab.get()) {
			for (int i = 0; i < RangerTabs.GAVAN_INFINITY.size(); i++) {
				event.accept(RangerTabs.GAVAN_INFINITY.get(i));
			}

		} else if (event.getTab() == RangerTabs.DenzimanTab.get()) {
			for (int i = 0; i < RangerTabs.DENZIMAN.size(); i++) {
				event.accept(RangerTabs.DENZIMAN.get(i));
			}

		} else if (event.getTab() == RangerTabs.GoggleVTab.get()) {
			for (int i = 0; i < RangerTabs.GOGGLE_V.size(); i++) {
				event.accept(RangerTabs.GOGGLE_V.get(i));
			}

		// } else if (event.getTab() == RangerTabs.DynamanTab.get()) { // TODO: Uncomment when ported
		// 	for (int i = 0; i < RangerTabs.DYNAMAN.size(); i++) {
		// 		event.accept(RangerTabs.DYNAMAN.get(i));
		// 	}

		} else if (event.getTab() == RangerTabs.BiomanTab.get()) {
			for (int i = 0; i < RangerTabs.BIOMAN.size(); i++) {
				event.accept(RangerTabs.BIOMAN.get(i));
			}

		// } else if (event.getTab() == RangerTabs.ChangemanTab.get()) { // TODO: Uncomment when ported
		// 	for (int i = 0; i < RangerTabs.CHANGEMAN.size(); i++) {
		// 		event.accept(RangerTabs.CHANGEMAN.get(i));
		// 	}

		} else if (event.getTab() == RangerTabs.FlashmanTab.get()) {
			for (int i = 0; i < RangerTabs.FLASHMAN.size(); i++) {
				event.accept(RangerTabs.FLASHMAN.get(i));
			}

		} else if (event.getTab() == RangerTabs.LivemanTab.get()) {
			for (int i = 0; i < RangerTabs.LIVEMAN.size(); i++) {
				event.accept(RangerTabs.LIVEMAN.get(i));
			}

		} else if (event.getTab() == RangerTabs.JetmanTab.get()) {
			for (int i = 0; i < RangerTabs.JETMAN.size(); i++) {
				event.accept(RangerTabs.JETMAN.get(i));
			}

		} else if (event.getTab() == RangerTabs.ZyurangerTab.get()) {
			for (int i = 0; i < RangerTabs.ZYURANGER.size(); i++) {
				event.accept(RangerTabs.ZYURANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.DairangerTab.get()) {
			for (int i = 0; i < RangerTabs.DAIRANGER.size(); i++) {
				event.accept(RangerTabs.DAIRANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.KakurangerTab.get()) {
			for (int i = 0; i < RangerTabs.KAKURANGER.size(); i++) {
				event.accept(RangerTabs.KAKURANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.OhrangerTab.get()) {
			for (int i = 0; i < RangerTabs.OHRANGER.size(); i++) {
				event.accept(RangerTabs.OHRANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.MegarangerTab.get()) {
			for (int i = 0; i < RangerTabs.MEGARANGER.size(); i++) {
				event.accept(RangerTabs.MEGARANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.HurricanegerTab.get()) {
			for (int i = 0; i < RangerTabs.HURRICANEGER.size(); i++) {
				event.accept(RangerTabs.HURRICANEGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.AbarangerTab.get()) {
			for (int i = 0; i < RangerTabs.ABARANGER.size(); i++) {
				event.accept(RangerTabs.ABARANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.DekarangerTab.get()) {
			for (int i = 0; i < RangerTabs.DEKARANGER.size(); i++) {
				event.accept(RangerTabs.DEKARANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GekirangerTab.get()) {
			for (int i = 0; i < RangerTabs.GEKIRANGER.size(); i++) {
				event.accept(RangerTabs.GEKIRANGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GoOngerTab.get()) {
			for (int i = 0; i < RangerTabs.GO_ONGER.size(); i++) {
				event.accept(RangerTabs.GO_ONGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.ZyuohgerTab.get()) {
			for (int i = 0; i < RangerTabs.ZYUOHGER.size(); i++) {
				event.accept(RangerTabs.ZYUOHGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.KIRAMEIGERTab.get()) {
			for (int i = 0; i < RangerTabs.KIRAMEIGER.size(); i++) {
				event.accept(RangerTabs.KIRAMEIGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.KyurangerTab.get()) {
			for (int i = 0; i < RangerTabs.KYURANGER.size(); i++) {
				event.accept(RangerTabs.KYURANGER.get(i));
			}
		} else if (event.getTab() == RangerTabs.ToqgerTab.get()) {
			for (int i = 0; i < RangerTabs.TOQGER.size(); i++) {
				event.accept(RangerTabs.TOQGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.NinningerTab.get()) { // TODO: Uncomment when ported
			for (int i = 0; i < RangerTabs.NINNINGER.size(); i++) {
				event.accept(RangerTabs.NINNINGER.get(i));
			}

		} else if (event.getTab() == RangerTabs.GokaigerTab.get()) { // TODO: Uncomment when ported
			for (int i = 0; i < RangerTabs.GOKAIGER.size(); i++) {
				event.accept(RangerTabs.GOKAIGER.get(i));
			}
		} else if (event.getTab() == RangerTabs.ZenkaigerTab.get()) {
			for (int i = 0; i < RangerTabs.ZENKAIGER.size(); i++) {
				event.accept(RangerTabs.ZENKAIGER.get(i));
			}
		} else if (event.getTab() == RangerTabs.DonbrothersTab.get()) {
			for (int i = 0; i < RangerTabs.DONBROTHERS.size(); i++) {
				event.accept(RangerTabs.DONBROTHERS.get(i));
			}
		} else if (event.getTab() == RangerTabs.AkibarangerTab.get()) {
			for (int i = 0; i < RangerTabs.AKIBARANGER.size(); i++) {
				event.accept(RangerTabs.AKIBARANGER.get(i));
			}
		} else if (event.getTab() == RangerTabs.MiscTab.get()) {

			event.accept(MobsCore.ZOLDERS_SPAWN_EGG);

			event.accept(MobsCore.CRIMERS_SPAWN_EGG);

			event.accept(MobsCore.CUTMEN_SPAWN_EGG);

			event.accept(MobsCore.MACHINEMEN_SPAWN_EGG);

			event.accept(MobsCore.UNGLERS_SPAWN_EGG);

			event.accept(MobsCore.ULARS_SPAWN_EGG);
			event.accept(MobsCore.ULAR_CAPTAIN_SPAWN_EGG);

			event.accept(MobsCore.WUMPERS_SPAWN_EGG);
			event.accept(MobsCore.SIGNALMAN_EVIL_SPAWN_EGG);

			event.accept(MobsCore.YARTOTS_SPAWN_EGG);
			event.accept(MobsCore.BLACK_KNIGHT_SPAWN_EGG);

			event.accept(MobsCore.IMPS_SPAWN_EGG);

			event.accept(MobsCore.ORGETTES_SPAWN_EGG);
			event.accept(MobsCore.DUKE_ORG_ROUKI_SPAWN_EGG);

			event.accept(MobsCore.CURSES_SPAWN_EGG);
			event.accept(MobsCore.JARYUU_SPAWN_EGG);
			event.accept(MobsCore.RYUUWON_SPAWN_EGG);
			event.accept(MobsCore.ZUBAAN_SPAWN_EGG);

			event.accept(MobsCore.NANASHIS_SPAWN_EGG);
			event.accept(MobsCore.GEDOU_SHINKEN_RED_SPAWN_EGG);

			event.accept(MobsCore.BUGLERS_SPAWN_EGG);
			event.accept(MobsCore.DARK_BUSTER_SPAWN_EGG);

			event.accept(MobsCore.PORDERMEN_SPAWN_EGG);

			event.accept(MobsCore.DRUNNS_SPAWN_EGG);
			event.accept(MobsCore.GAISOULG_SPAWN_EGG);
			event.accept(MobsCore.RYUSOUL_MORIA_SPAWN_EGG);

			event.accept(MobsCore.SANAGIMS_SPAWN_EGG);
			event.accept(MobsCore.OH_KUWAGATA_OHGER_SPAWN_EGG);

			event.accept(MobsCore.NEJIRETTAS_SPAWN_EGG);

			// Kyoryuger
			event.accept(MobsCore.DOGOLD_SPAWN_EGG);
			event.accept(MobsCore.ZORIMAS_SPAWN_EGG);
			event.accept(MobsCore.DEATHRYUGER_SPAWN_EGG);
			event.accept(MobsCore.BRAVE_KYORYU_GOLD_SPAWN_EGG);
			event.accept(MobsCore.CHAOS_RYUGER_SPAWN_EGG);

			// Kyuranger
			event.accept(MobsCore.INDAVER_BLUE_SPAWN_EGG);
			event.accept(MobsCore.INDAVER_GREEN_SPAWN_EGG);
			event.accept(MobsCore.INDAVER_WHITE_SPAWN_EGG);
			event.accept(MobsCore.DARK_SHISHI_RED_SPAWN_EGG);
			event.accept(MobsCore.HEBITSUKAI_METAL_SPAWN_EGG);

						event.accept(MobsCore.DUSTLERS_SPAWN_EGG);
			event.accept(MobsCore.SPOTMEN_SPAWN_EGG);
			event.accept(MobsCore.MECHACLONES_SPAWN_EGG);
			event.accept(MobsCore.ZOLOHS_SPAWN_EGG);
			event.accept(MobsCore.JIMMERS_SPAWN_EGG);
			event.accept(MobsCore.GRINAMS_SPAWN_EGG);
			event.accept(MobsCore.GOLEMS_1_SPAWN_EGG);
			event.accept(MobsCore.GOLEMS_2_SPAWN_EGG);
			event.accept(MobsCore.COTPOTROS_SPAWN_EGG);
			event.accept(MobsCore.DORODOROS_SPAWN_EGG);
			event.accept(MobsCore.KUNEKUNES_SPAWN_EGG);
			event.accept(MobsCore.BARMIAS_BLACK_SPAWN_EGG);
			event.accept(MobsCore.BARMIAS_WHITE_SPAWN_EGG);
			event.accept(MobsCore.ANAROIDS_SPAWN_EGG);
			event.accept(MobsCore.IGAROIDS_SPAWN_EGG);
			event.accept(MobsCore.BATSUROIDS_SPAWN_EGG);
			event.accept(MobsCore.KARTHS_SPAWN_EGG);
			event.accept(MobsCore.RINSHIS_SPAWN_EGG);
			event.accept(MobsCore.UGATZ_SPAWN_EGG);
			event.accept(MobsCore.DROANS_SPAWN_EGG);
			event.accept(MobsCore.KUROS_SPAWN_EGG);
			event.accept(MobsCore.MOEBAS_SPAWN_EGG);
			event.accept(MobsCore.BECHATS_SPAWN_EGG);
			event.accept(MobsCore.KUDAKKS_SPAWN_EGG);
			event.accept(MobsCore.ANOUNIS_SPAWN_EGG);

			for (int i = 0; i < RangerTabs.MISC.size(); i++) {
				event.accept(RangerTabs.MISC.get(i));
			}

			event.accept(OtherItems.SUSUME_GORANGER_MUSIC_DISC);

			event.accept(OtherItems.TAIYOU_SENTAI_SUN_VULCAN_MUSIC_DISC);

			event.accept(OtherItems.HIKARI_SENTAI_MASKMAN_MUSIC_DISC);

			event.accept(OtherItems.GAORANGER_HOERO_MUSIC_DISC);

			event.accept(OtherItems.SAMURAI_SENTAI_SHINKENGER_MUSIC_DISC);

			event.accept(OtherItems.WINNER_GOZYUGER_MUSIC_DISC);
		} else if (event.getTab() == RangerTabs.BlockTab.get()) {
			for (int i = 0; i < RangerTabs.BLOCKS.size(); i++) {
				event.accept(RangerTabs.BLOCKS.get(i));
			}

		}

	}

}
