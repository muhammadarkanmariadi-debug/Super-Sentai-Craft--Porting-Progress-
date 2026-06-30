package com.liasdan.supersentaicraft.items.sentai_50;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.sentai_50.king_ohger.*;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class KingOhgerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static List<Item> SHUGODOM= new ArrayList<>();
	public static List<Item> NKOSOPA= new ArrayList<>();
	public static List<Item> ISHABANA= new ArrayList<>();
	public static List<Item> GOKKAN= new ArrayList<>();
	public static List<Item> TOUFU= new ArrayList<>();
	public static List<Item> BUG_NARAKU= new ArrayList<>();

	public static final DeferredItem<Item> KING_OHGER_LOGO = ITEMS.register("king_ohger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

    public static final DeferredItem<Item> EMPTY_SHUGOD_SOUL = ITEMS.register("empty_shugod_soul",
            () -> new BaseDropItem(new Item.Properties(), ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "items/empty_shugod_soul")).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KUWAGATA_SOUL_RI = ITEMS.register("god_kuwagata_soul_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ryouga_issen","kuwagata_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
			.IsGlowing().ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(SHUGODOM));

	public static final DeferredItem<Item> GOD_KUWAGATA_SOUL = ITEMS.register("god_kuwagata_soul",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","kuwagata_ohger","king_ohger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.addShiftForm(GOD_KUWAGATA_SOUL_RI.get()).ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_TONBO_SOUL_RI = ITEMS.register("god_tonbo_soul_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ryouga_issen","tonbo_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 3,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 3,true,false),
					new MobEffectInstance(EffectCore.THUNDERSHOT, 40, 3,true,false))
			.IsGlowing().ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(NKOSOPA));

	public static final DeferredItem<Item> GOD_TONBO_SOUL = ITEMS.register("god_tonbo_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","tonbo_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			.addShiftForm(GOD_TONBO_SOUL_RI.get()).ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KAMAKIRI_SOUL_RI = ITEMS.register("god_kamakiri_soul_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ryouga_issen","kamakiri_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 3,true,false))
			.IsGlowing().ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(ISHABANA));

	public static final DeferredItem<Item> GOD_KAMAKIRI_SOUL = ITEMS.register("god_kamakiri_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","kamakiri_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.addShiftForm(GOD_KAMAKIRI_SOUL_RI.get()).ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_PAPILLON_SOUL_RI = ITEMS.register("god_papillon_soul_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ryouga_issen","papillon_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false))
			.IsGlowing().ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(GOKKAN));

	public static final DeferredItem<Item> GOD_PAPILLON_SOUL = ITEMS.register("god_papillon_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","papillon_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.addShiftForm(GOD_PAPILLON_SOUL_RI.get()).ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_HACHI_SOUL_RI = ITEMS.register("god_hachi_soul_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ryouga_issen","hachi_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(EffectCore.FIRESLASH, 40, 3,true,false))
			.IsGlowing().ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(TOUFU));

	public static final DeferredItem<Item> GOD_HACHI_SOUL = ITEMS.register("god_hachi_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","hachi_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false))
			.addShiftForm(GOD_HACHI_SOUL_RI.get()).ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_TARANTULA_SOUL_RI = ITEMS.register("god_tarantula_soul_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ryouga_issen","spider_kumonos","spider_kumonos_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(EffectCore.CLIMBING, 40, 3,true,false)).AddNeedItemList(BUG_NARAKU).IsGlowing());

	public static final DeferredItem<Item> GOD_TARANTULA_SOUL = ITEMS.register("god_tarantula_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","spider_kumonos","spider_kumonos_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(EffectCore.CLIMBING, 40, 2,true,false))
			.addShiftForm(GOD_TARANTULA_SOUL_RI.get()).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KUWAGATA_ZERO_SOUL_RI = ITEMS.register("god_kuwagata_zero_soul_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ryouga_issen","oh_kuwagata_ohger","oh_kuwagata_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
			.IsGlowing().ChangeModel("kuwagata_ohger_ryouga_issen.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(SHUGODOM));

	public static final DeferredItem<Item> GOD_KUWAGATA_ZERO_SOUL = ITEMS.register("god_kuwagata_zero_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","oh_kuwagata_ohger","oh_kuwagata_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
			.addShiftForm(GOD_KUWAGATA_ZERO_SOUL_RI.get()).ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KABUTO_SOUL_CORRUPTED = ITEMS.register("god_kabuto_soul_corrupted",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KABUTO_SOUL = ITEMS.register("god_kabuto_soul",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> GOD_SCORPION_SOUL = ITEMS.register("god_scorpion_soul",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> GOD_HOPPER_SOUL = ITEMS.register("god_hopper_soul",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> OHGER_CROWN_ZERO_RI = ITEMS.register("ohger_crown_zero_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_king_ryouga_issen","oh_kuwagata_ohger","oh_kuwagata_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false))
			.ChangeModel("king_king_ohger_ryouga_issen.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(SHUGODOM));

	public static final DeferredItem<Item> OHGER_CROWN_ZERO = ITEMS.register("ohger_crown_zero",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_king","oh_kuwagata_ohger","oh_kuwagata_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false))
			.ChangeModel("king_king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json"));

	public static final DeferredItem<Item> OHGER_CROWN_RI = ITEMS.register("ohger_crown_ri",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_king_ryouga_issen","kuwagata_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false))
			.addAlternative(OHGER_CROWN_ZERO_RI.get()).ChangeModel("king_king_ohger_ryouga_issen.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddNeedItemList(SHUGODOM));

	public static final DeferredItem<Item> OHGER_CROWN = ITEMS.register("ohger_crown",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_king","kuwagata_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false))
			.addShiftForm(OHGER_CROWN_RI.get()).addAlternative(OHGER_CROWN_ZERO.get()).ChangeModel("king_king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> CHANGE_KUMONOS_KEY = ITEMS.register("change_kumonos_key",
			() -> new KumonosKeyItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> VENOMIX_KUMONOS_KEY = ITEMS.register("venomix_kumonos_key",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> SHUGOD_KUMONOS_KEY = ITEMS.register("shugod_kumonos_key",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> SHUGODOM_CROWN = ITEMS.register("shugodom_crown",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).AddToList(SHUGODOM));
	public static final DeferredItem<Item> NKOSOPA_EARRING = ITEMS.register("nkosopa_earring",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).AddToList(NKOSOPA));
	public static final DeferredItem<Item> ISHABANA_TIARA = ITEMS.register("ishabana_tiara",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).AddToList(ISHABANA));
	public static final DeferredItem<Item> GOKKAN_BRACELET = ITEMS.register("gokkan_bracelet",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).AddToList(GOKKAN));
	public static final DeferredItem<Item> TOUFU_NECKLACE = ITEMS.register("toufu_necklace",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).AddToList(TOUFU));
	public static final DeferredItem<Item> BUG_NARAKU_CRYSTAL = ITEMS.register("bug_naraku_crystal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).AddToList(BUG_NARAKU));

	public static final DeferredItem<Item> KING_OHGER_HELMET = ITEMS.register("king_ohger_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
    public static final DeferredItem<Item> KING_OHGER_CHESTPLATE = ITEMS.register("king_ohger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
    public static final DeferredItem<Item> KING_OHGER_LEGGINGS = ITEMS.register("king_ohger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

    public static final DeferredItem<Item> KUWAGATA_OHGER_CALIBUR = ITEMS.register("kuwagata_ohger_calibur",
    		() -> new OhgerCaliburItem(ArmorMaterials.DIAMOND,"kuwagata_ohger",GOD_KUWAGATA_SOUL,KING_OHGER_HELMET,KING_OHGER_CHESTPLATE,KING_OHGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<Item> TONBO_OHGER_CALIBUR = ITEMS.register("tonbo_ohger_calibur",
			() -> new OhgerCaliburItem(ArmorMaterials.DIAMOND,"tonbo_ohger",GOD_TONBO_SOUL,KING_OHGER_HELMET,KING_OHGER_CHESTPLATE,KING_OHGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<Item> KAMAKIRI_OHGER_CALIBUR = ITEMS.register("kamakiri_ohger_calibur",
			() -> new OhgerCaliburItem(ArmorMaterials.DIAMOND,"kamakiri_ohger",GOD_KAMAKIRI_SOUL,KING_OHGER_HELMET,KING_OHGER_CHESTPLATE,KING_OHGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<Item> PAPILLON_OHGER_CALIBUR = ITEMS.register("papillon_ohger_calibur",
			() -> new OhgerCaliburItem(ArmorMaterials.DIAMOND,"papillon_ohger",GOD_PAPILLON_SOUL,KING_OHGER_HELMET,KING_OHGER_CHESTPLATE,KING_OHGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<Item> HACHI_OHGER_CALIBUR = ITEMS.register("hachi_ohger_calibur",
			() -> new OhgerCaliburItem(ArmorMaterials.DIAMOND,"hachi_ohger",GOD_HACHI_SOUL,KING_OHGER_HELMET,KING_OHGER_CHESTPLATE,KING_OHGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<Item> SPIDER_KUMONO_SLAYER = ITEMS.register("spider_kumono_slayer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"spider_kumonos",GOD_TARANTULA_SOUL,KING_OHGER_HELMET,KING_OHGER_CHESTPLATE,KING_OHGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<Item> OH_KUWAGATA_OHGER_CALIBUR_ZERO = ITEMS.register("oh_kuwagata_ohger_calibur_zero",
			() -> new OhgerCaliburZeroItem(ArmorMaterials.DIAMOND,"oh_kuwagata_ohger",GOD_KUWAGATA_ZERO_SOUL,KING_OHGER_HELMET,KING_OHGER_CHESTPLATE,KING_OHGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> OHGER_CALIBUR = ITEMS.register("ohger_calibur",
			() -> new OhgerCaliburSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> KUMONO_SLAYER = ITEMS.register("kumono_slayer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> OHGER_CALIBUR_ZERO = ITEMS.register("ohger_calibur_zero",
			() -> new OhgerCaliburSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> OHGER_CROWN_LANCE = ITEMS.register("ohger_crown_lance",
			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties()).AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<Item> KINGS_WEAPON_SHIELD = ITEMS.register("kings_weapon_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<SwordItem> KINGS_WEAPON_SWORD = ITEMS.register("kings_weapon_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<BaseBlasterItem> KINGS_WEAPON_GUN = ITEMS.register("kings_weapon_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<SwordItem> KINGS_WEAPON_SICKLE = ITEMS.register("kings_weapon_sickle",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<BaseBlasterItem> KINGS_WEAPON_BOW = ITEMS.register("kings_weapon_bow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<SwordItem> KINGS_WEAPON_CLAW = ITEMS.register("kings_weapon_claw",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> KINGS_WEAPON_NAGINATA = ITEMS.register("kings_weapon_naginata",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).KeepDifItem(OHGER_CALIBUR.get()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<SwordItem> KINGS_WEAPON_SCYTHE = ITEMS.register("kings_weapon_scythe",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).KeepDifItem(OHGER_CALIBUR.get()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<BaseBlasterItem> VENOMIX_SHOOTER = ITEMS.register("venomix_shooter",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}