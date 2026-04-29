package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.boukenger.AccellularItem;
import com.liasdan.supersentaicraft.items.boukenger.GoGoChangerItem;
import com.liasdan.supersentaicraft.items.boukenger.SeikenZubaanItem;
import com.liasdan.supersentaicraft.items.king_ohger.OhgerCaliburItem;
import com.liasdan.supersentaicraft.items.king_ohger.OhgerCaliburZeroItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KingOhgerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static final DeferredItem<Item> KING_OHGER_LOGO = ITEMS.register("king_ohger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

    public static final DeferredItem<Item> EMPTY_SHUGOD_SOUL = ITEMS.register("empty_shugod_soul",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KUWAGATA_SOUL = ITEMS.register("god_kuwagata_soul",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","kuwagata_ohger","king_ohger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
                    .ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_TONBO_SOUL = ITEMS.register("god_tonbo_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","tonbo_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
					.ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KAMAKIRI_SOUL = ITEMS.register("god_kamakiri_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","kamakiri_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
					.ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_PAPILLON_SOUL = ITEMS.register("god_papillon_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","papillon_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
					.ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_HACHI_SOUL = ITEMS.register("god_hachi_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","hachi_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false))
					.ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_TARANTULA_SOUL = ITEMS.register("god_tarantula_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","spider_kumonos","spider_kumonos_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false)).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KUWAGATA_ZERO_SOUL = ITEMS.register("god_kuwagata_zero_soul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","oh_kuwagata_ohger","oh_kuwagata_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
					.ChangeModel("king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KABUTO_SOUL_CORRUPTED = ITEMS.register("god_kabuto_soul_corrupted",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> GOD_KABUTO_SOUL = ITEMS.register("god_kabuto_soul",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> GOD_SCORPION_SOUL = ITEMS.register("god_scorpion_soul",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> GOD_HOPPER_SOUL = ITEMS.register("god_hopper_soul",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> OHGER_CROWN_ZERO = ITEMS.register("ohger_crown_zero",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_king","oh_kuwagata_ohger","oh_kuwagata_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false))
			.ChangeModel("king_king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json"));

	public static final DeferredItem<Item> OHGER_CROWN = ITEMS.register("ohger_crown",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_king","kuwagata_ohger","king_ohger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false))
			.addAlternative(OHGER_CROWN_ZERO.get()).ChangeModel("king_king_ohger.geo.json").ChangeBeltModel("rangerbeltweapon.geo.json").AddToTabList(RangerTabs.KING_OHGER));

	public static final DeferredItem<Item> CHANGE_KUMONOS_KEY = ITEMS.register("change_kumonos_key",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> VENOMIX_KUMONOS_KEY = ITEMS.register("venomix_kumonos_key",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));
	public static final DeferredItem<Item> SHUGOD_KUMONOS_KEY = ITEMS.register("shugod_kumonos_key",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER));

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
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> KUMONO_SLAYER = ITEMS.register("kumono_slayer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> OHGER_CALIBUR_ZERO = ITEMS.register("ohger_calibur_zero",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<SwordItem> OHGER_CROWN_LANCE = ITEMS.register("ohger_crown_lance",
			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

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
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));
	public static final DeferredItem<SwordItem> KINGS_WEAPON_SCYTHE = ITEMS.register("kings_weapon_scythe",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static final DeferredItem<BaseBlasterItem> VENOMIX_SHOOTER = ITEMS.register("venomix_shooter",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.KING_OHGER).ChangeRepairItem(EMPTY_SHUGOD_SOUL.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}