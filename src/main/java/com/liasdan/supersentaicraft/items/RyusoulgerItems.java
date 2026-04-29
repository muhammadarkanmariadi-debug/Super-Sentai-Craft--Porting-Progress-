package com.liasdan.supersentaicraft.items;

import java.util.ArrayList;
import java.util.List;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.events.ModClientEvents;
import com.liasdan.supersentaicraft.items.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseShieldItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.ryusoulger.BlankRyusoulItem;
import com.liasdan.supersentaicraft.items.ryusoulger.GaisoulKenItem;
import com.liasdan.supersentaicraft.items.ryusoulger.MosaChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulCaliburItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulChangerItem;
import com.liasdan.supersentaicraft.items.ryusoulger.RyusoulItem;
import com.liasdan.supersentaicraft.items.shinkenger.ShodoPhoneItem;
import com.liasdan.supersentaicraft.items.shinkenger.SushiChangerItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RyusoulgerItems {

	public static String[] RYUSOULGERS= new String[] {"ryusoul_red","ryusoul_blue","ryusoul_pink","ryusoul_green","ryusoul_black","ryusoul_gold","gaisoulg","ryusoul_brown","ryusoul_moria","lupin_red","lupin_blue","lupin_yellow","patren_1gou","patren_2gou","patren_3gou"};
	public static String[] RYUSOULGER= new String[] {"ryusoul_red","ryusoul_blue","ryusoul_pink","ryusoul_green","ryusoul_black","ryusoul_gold"};
	public static String[] OTHERS=new String[] {"gaisoulg","ryusoul_brown","ryusoul_moria"};

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> RYUSOULGER_LOGO = ITEMS.register("ryusoulger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> BLANK_RYUSOUL = ITEMS.register("blank_ryusoul",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> RYUSOUL = ITEMS.register("ryusoul",
    		() -> new BlankRyusoulItem(new Item.Properties()));

	public static final DeferredItem<Item> RED_RYUSOUL = ITEMS.register("red_ryusoul",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ryusoul_red","ryusoul_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("ryusoulger_belt.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> BLUE_RYUSOUL = ITEMS.register("blue_ryusoul",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ryusoul_blue","ryusoul_blue_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 3,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("ryusoulger_belt.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> PINK_RYUSOUL = ITEMS.register("pink_ryusoul",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ryusoul_pink","ryusoul_pink_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("ryusoulger_belt.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> GREEN_RYUSOUL = ITEMS.register("green_ryusoul",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ryusoul_green","ryusoul_green_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("ryusoulger_belt.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> BLACK_RYUSOUL = ITEMS.register("black_ryusoul",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","ryusoul_black","ryusoul_black_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("ryusoulger_belt.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> GOLD_RYUSOUL = ITEMS.register("gold_ryusoul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"","ryusoul_gold","ryusoul_gold_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> GAI_SOUL = ITEMS.register("gai_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"","gaisoulg","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> BROWN_RYUSOUL = ITEMS.register("brown_ryusoul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.RARE),0,"","ryusoul_brown","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddToTabList(RangerTabs.RYUSOULGER));

	public static final DeferredItem<Item> MORIA_RYUSOUL = ITEMS.register("moria_ryusoul",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","ryusoul_moria","ryusoul_red_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("ryusoulger_belt.geo.json").HasCape());
    
	public static final DeferredItem<Item> TSUYO_SOUL = ITEMS.register("tsuyo_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_tsuyo_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> NOBI_SOUL = ITEMS.register("nobi_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_nobi_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> OMO_SOUL = ITEMS.register("omo_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_omo_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> HAYA_SOUL = ITEMS.register("haya_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_haya_soul","","blank",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KATA_SOUL = ITEMS.register("kata_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kata_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KIKE_SOUL = ITEMS.register("kike_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kike_soul","","blank")
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KUSA_SOUL = ITEMS.register("kusa_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kusa_soul","","blank",
            		new MobEffectInstance(EffectCore.SMOKE, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> MIE_SOUL = ITEMS.register("mie_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mie_soul","","blank",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> MUKIMUKI_SOUL = ITEMS.register("mukimuki_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mukimuki_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> CHIISA_SOUL = ITEMS.register("chiisa_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_chiisa_soul","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SMALL, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> MABUSHI_SOUL = ITEMS.register("mabushi_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mabushi_soul","","blank",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> MIST_SOUL = ITEMS.register("mist_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mist_soul","","blank",
            		new MobEffectInstance(EffectCore.SMOKE, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KARU_SOUL = ITEMS.register("karu_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_karu_soul","","blank",
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> GYAKU_SOUL = ITEMS.register("gyaku_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_gyaku_soul","","blank",
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 3,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KOTAE_SOUL = ITEMS.register("kotae_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kotae_soul","","blank")
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> MIGAKE_SOUL = ITEMS.register("migake_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_migake_soul","","blank",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KUNKUN_SOUL = ITEMS.register("kunkun_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kunkun_soul","","blank")
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> PUKUPUKU_SOUL = ITEMS.register("pukupuku_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_pukupuku_soul","","blank",
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KAKURE_SOUL = ITEMS.register("kakure_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kakure_soul","","blank",
            		new MobEffectInstance(MobEffects.INVISIBILITY, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> FUE_SOUL = ITEMS.register("fue_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_fue_soul","","blank")
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> NEMU_SOUL = ITEMS.register("nemu_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_nemu_soul","","blank")
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> MAWARI_SOULD = ITEMS.register("mawari_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_mawari_soul","","blank",
            		new MobEffectInstance(MobEffects.CONFUSION, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> KAWAKI_SOUL = ITEMS.register("kawaki_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_kawaki_soul","","blank")
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> YAWARAKA_SOUL = ITEMS.register("yawaraka_soul",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_yawaraka_soul","","blank")
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER).AddToTabList(BlankRyusoulItem.RYUSOUL, 1));
    
	public static final DeferredItem<Item> MERAMERA_SOUL = ITEMS.register("meramera_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"ryusoul_meramera","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIREPUNCH, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> BIRIBIRI_SOUL = ITEMS.register("biribiri_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"ryusoul_biribiri","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> BYUBYU_SOUL = ITEMS.register("byubyu_soul",
    		() -> new BaseItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> KURAYAMI_SOUL = ITEMS.register("kurayami_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"ryusoul_kurayami","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> KAGAYAKI_SOUL = ITEMS.register("kagayaki_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"ryusoul_kagayaki","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> COSMO_SOUL = ITEMS.register("cosmo_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"ryusoul_cosmo","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 3,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.SATURATION, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SHOTBOOST, 40, 3,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> KANAE_SOUL = ITEMS.register("kanae_soul",
    		() -> new BaseItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> DOSSHIN_SOUL = ITEMS.register("dosshin_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"ryusoul_dosshin","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.PUNCH, 40, 5,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGERS).AddToTabList(RangerTabs.RYUSOULGER));

	public static final DeferredItem<Item> HIEHIE_SOUL_2 = ITEMS.register("hiehie_soul_2",
			() -> new RyusoulItem(new Item.Properties(),0,"","","blank",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false),
					new MobEffectInstance(EffectCore.FROSTWALKER, 40, 5,true,false))
			.ChangeSlot(2).BackToBase().AddCompatibilityList(OTHERS));

	public static final DeferredItem<Item> HIEHIE_SOUL = ITEMS.register("hiehie_soul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"ryusoul_hiehie","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING, 40, 5,true,false),
            		new MobEffectInstance(EffectCore.FROSTWALKER, 40, 0,true,false))
			.addAlternative(HIEHIE_SOUL_2.get()).ChangeSlot(2).BackToBase().ChangeModel("rangerwing.geo.json").ifFlyingModelResource("geo/rangerwing.geo.json").AddCompatibilityList(RYUSOULGER).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> MAX_RYUSOUL = ITEMS.register("max_ryusoul",
            () -> new RyusoulItem(new Item.Properties().rarity(Rarity.RARE),0,"_max","ryusoul_red","ryusoul_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("ryusoulger_belt.geo.json").AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> NOBLESSE = ITEMS.register("noblesse",
            () -> new RyusoulItem(new Item.Properties(),0,"ryusoul_noblesse","","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 5,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(RYUSOULGER).ChangeModel("noblesse.geo.json"));
    
	public static final DeferredItem<Item> SHIAWASE_SOUL = ITEMS.register("shiawase_soul",
    		() -> new BaseItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.RYUSOULGER));
    
	public static final DeferredItem<Item> YAMAMORI_SOUL = ITEMS.register("yamamori_soul",
    		() -> new BaseItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.RYUSOULGER));

	public static final DeferredItem<Item> LUPIN_YELLOW_SOUL = ITEMS.register("lupin_yellow_soul",
			() -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_pink","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeRangerName("lupin_yellow"));

	public static final DeferredItem<Item> LUPIN_BLUE_SOUL = ITEMS.register("lupin_blue_soul",
			() -> new RyusoulItem(new Item.Properties(),0,"","ryusoul_blue","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeRangerName("lupin_blue").addAlternative(LUPIN_YELLOW_SOUL.get()));

	public static final DeferredItem<Item> LUPINRANGER_SOUL = ITEMS.register("lupinranger_soul",
			() -> new RyusoulItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"","ryusoul_red","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeRangerName("lupin_red").addAlternative(LUPIN_BLUE_SOUL.get()).AddToTabList(RangerTabs.RYUSOULGER));

	public static final DeferredItem<Item> UNFINISHED_RYUSOUL_CALIBUR = ITEMS.register("unfinished_ryusoul_calibur",
    		() -> new BaseItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.RYUSOULGER));
    
    public static final DeferredItem<Item> RYUSOULGER_HELMET = ITEMS.register("ryusoulger_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> RYUSOULGER_CHESTPLATE = ITEMS.register("ryusoulger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> RYUSOULGER_LEGGINGS = ITEMS.register("ryusoulger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<Item> RED_RYUSOUL_CHANGER = ITEMS.register("red_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_red",RED_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> BLUE_RYUSOUL_CHANGER = ITEMS.register("blue_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_blue",BLUE_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> PINK_RYUSOUL_CHANGER = ITEMS.register("pink_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_pink",PINK_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> GREEN_RYUSOUL_CHANGER = ITEMS.register("green_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_green",GREEN_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> BLACK_RYUSOUL_CHANGER = ITEMS.register("black_ryusoul_changer",
    		() -> new RyusoulChangerItem(ArmorMaterials.DIAMOND,"ryusoul_black",BLACK_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> GOLD_MOSA_CHANGER = ITEMS.register("gold_mosa_changer",
    		() -> new MosaChangerItem(ArmorMaterials.DIAMOND,"ryusoul_gold",GOLD_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties().rarity(Rarity.UNCOMMON))
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<Item> GAISOULG_CHANGER = ITEMS.register("gaisorg_changer",
    		() -> new GaisoulKenItem(ArmorMaterials.DIAMOND,"gaisoulg",GAI_SOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties().rarity(Rarity.UNCOMMON))
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> BROWN_CHANGER = ITEMS.register("brown_changer",
    		() -> new GaisoulKenItem(ArmorMaterials.DIAMOND,"ryusoul_brown",BROWN_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties().rarity(Rarity.RARE))
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> MORIA_RYUSOUL_CHANGER = ITEMS.register("moria_ryusoul_changer",
    		() -> new GaisoulKenItem(ArmorMaterials.DIAMOND,"ryusoul_moria",MORIA_RYUSOUL,RYUSOULGER_HELMET,RYUSOULGER_CHESTPLATE,RYUSOULGER_LEGGINGS,new Item.Properties().rarity(Rarity.RARE))
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<SwordItem> RYUSOUL_KEN = ITEMS.register("ryusoul_ken",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<BaseBlasterItem> MOSA_CHANGER = ITEMS.register("mosa_changer",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
	public static final DeferredItem<SwordItem> MOSA_BLADE = ITEMS.register("mosa_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<BaseBlasterItem> MOSA_BREAKER = ITEMS.register("mosa_breaker",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties().rarity(Rarity.RARE)).IsSuperGun().KeepDifItem(MOSA_CHANGER.get()).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<SwordItem> GAISOUL_KEN = ITEMS.register("gaisoul_ken",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> GAISOUL_SHIELD = ITEMS.register("gaisoul_shield",
			() -> new BaseShieldItem(new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<SwordItem> BROWN_RYUSOUL_KEN = ITEMS.register("brown_ryusoul_ken",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    public static final DeferredItem<Item> BROWN_RYUSOUL_SHIELD = ITEMS.register("brown_ryusoul_shield",
			() -> new BaseShieldItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<SwordItem> MAX_RYUSOUL_CHANGER = ITEMS.register("max_ryusoul_changer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().rarity(Rarity.RARE)).AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));
    
    public static final DeferredItem<BaseSwordItem> RYUSOUL_CALIBUR = ITEMS.register("ryusoul_calibur",
			() -> new RyusoulCaliburItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties().rarity(Rarity.EPIC)).AddToTabList(RangerTabs.RYUSOULGER).ChangeRepairItem(BLANK_RYUSOUL.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}