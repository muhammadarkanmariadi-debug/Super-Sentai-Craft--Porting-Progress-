package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.goranger.GorangerBeltItem;
import com.liasdan.supersentaicraft.items.gozyuger.TegaSwordItem;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.particle.ModParticles;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GozyugerItems {

	public static String[] GOZYUGERS = new String[] {"gozyu_wolf","gozyu_leon","gozyu_tyranno","gozyu_eagle","gozyu_unicorn","universe_senshi"};
	public static String[] GOZYUGER = new String[] {"gozyu_wolf","gozyu_leon","gozyu_tyranno","gozyu_eagle","gozyu_unicorn"};
	public static String[] GOZYUGER2 = new String[] {"gozyu_leon","gozyu_tyranno","gozyu_eagle","gozyu_unicorn"};

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> GOZYUGER_LOGO = ITEMS.register("gozyuger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYUGER_RING = ITEMS.register("gozyuger_ring",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_WOLF_RING = ITEMS.register("gozyu_wolf_ring",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_wolf","gozyuger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
				}
			}.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_LEON_RING = ITEMS.register("gozyu_leon_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_leon","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
				}
			}.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_TYRANNO_RING = ITEMS.register("gozyu_tyranno_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_tyranno","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.YELLOW_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
				}
			}.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_EAGLE_RING = ITEMS.register("gozyu_eagle_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_eagle","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_UNICORN_RING = ITEMS.register("gozyu_unicorn_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_unicorn","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_POLAR_RING_2 = ITEMS.register("gozyu_polar_ring2",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_polar","gozyu_polar_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).ChangeBeltModel("geo/gozyuger_belt.geo.json"));

	public static final DeferredItem<Item> GOZYU_POLAR_RING = ITEMS.register("gozyu_polar_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_robe","gozyu_polar","gozyu_polar_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.addSwitchForm(GOZYU_POLAR_RING_2.get()).ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TEGA_JUNE_RING = ITEMS.register("tega_june_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","ring_hunter_garyudo","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
	 		.HasCape().AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TEGA_JUNE_RING_GARYUDO = ITEMS.register("tega_june_ring_garyudo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_tega_june","ring_hunter_garyudo","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
			.HasCape());

	public static final DeferredItem<Item> WILD_GOZYU_WOLF_RING = ITEMS.register("wild_gozyu_wolf_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_wild","gozyu_wolf","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 30, 0, 0, 0, 1);
				}
			}.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> RYOU_TEGA_SWORD_RING_OTHERS = ITEMS.register("ryou_tega_sword_ring_others",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 5,true,false),
					new MobEffectInstance(EffectCore.FIRESLASH, 40, 5,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RANDOM_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.BackToBase().ChangeSlot(2).HasCape().AddCompatibilityList(GOZYUGER2));

	public static final DeferredItem<Item> RYOU_TEGA_SWORD_RING = ITEMS.register("ryou_tega_sword_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_tega_sword","gozyu_wolf","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 5,true,false),
					new MobEffectInstance(EffectCore.FIRESLASH, 40, 5,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RANDOM_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).HasCape().addAlternative(RYOU_TEGA_SWORD_RING_OTHERS.get()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TEGA_NAGURE_RING_2 = ITEMS.register("tega_nagure_ring2",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_tega_nagure","gozyu_polar","gozyu_polar_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false)).ChangeBeltModel("geo/gozyuger_belt.geo.json"));

	public static final DeferredItem<Item> TEGA_NAGURE_RING = ITEMS.register("tega_nagure_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_tega_nagure_robe","gozyu_polar","gozyu_polar_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
					.addSwitchForm(TEGA_NAGURE_RING_2.get()).ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GORANGER_RING_GOZYU = ITEMS.register("goranger_ring_gozyu",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_01",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.BOOST, 40, 2,true,false))
			.ChangeRangerName("akaranger").ChangeBeltModel("geo/gozyuger_belt.geo.json").HasCape());

	public static final DeferredItem<Item> GORANGER_RING = ITEMS.register("goranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_01",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.BOOST, 40, 2,true,false))
			.ChangeRangerName("akaranger_gozyu").ChangeBeltModel("geo/gozyuger_belt.geo.json").HasCape()
			.addAlternative(GORANGER_RING_GOZYU.get()).AddCompatibilityList(GOZYUGER).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> JAKQ_RING = ITEMS.register("jakq_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_02",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeRangerName("spade_ace").ChangeBeltModel("geo/gozyuger_belt.geo.json").HasCape().AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BATTLE_FEVER_RING_KILLER = ITEMS.register("battle_fever_ring_killer",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_killer","universe_senshi","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false))
			.ChangeRangerName("battle_japan"));

	public static final DeferredItem<Item> BATTLE_FEVER_RING_GOZYU = ITEMS.register("battle_fever_ring_gozyu",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_03",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("battle_japan").ChangeBeltModel("geo/gozyuger_belt.geo.json").addSwitchForm(BATTLE_FEVER_RING_KILLER.get()));

	public static final DeferredItem<Item> BATTLE_FEVER_RING = ITEMS.register("battle_fever_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_03",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("battle_japan").ChangeBeltModel("geo/gozyuger_belt.geo.json").addAlternative(BATTLE_FEVER_RING_GOZYU.get())
			.AddCompatibilityList(GOZYUGER).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DENZIMAN_RING = ITEMS.register("denziman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_04",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("denzi_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> SUN_VULCAN_RING = ITEMS.register("sun_vulcan_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_05",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("vul_eagle").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOGGLE_V_RING = ITEMS.register("goggle_v_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_06",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("goggle_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DYNAMAN_RING = ITEMS.register("dynaman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_07",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("dyna_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BIOMAN_RING = ITEMS.register("bioman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_08",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("red_one").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> CHANGEMAN_RING = ITEMS.register("changeman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_09",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("change_dragon").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> FLASHMAN_RING = ITEMS.register("flashman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_10",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
            .ChangeRangerName("red_flash").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> MASKMAN_RING = ITEMS.register("maskman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_11",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false))
			.ChangeRangerName("red_mask").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> LIVEMAN_RING = ITEMS.register("liveman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_12",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("red_falcon").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TURBORANGER_RING = ITEMS.register("turboranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_13",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("red_turbo").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS)	.AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> FIVEMAN_RING = ITEMS.register("fiveman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_14",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("five_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> JETMAN_RING = ITEMS.register("jetman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_15",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false))
			.ChangeRangerName("red_hawk").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ZYURANGER_RING = ITEMS.register("zyuranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_16",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
			.ChangeRangerName("tyranno_ranger").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DAIRANGER_RING = ITEMS.register("dairanger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_17",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(EffectCore.FIREPUNCH, 40, 2,true,false))
			.ChangeRangerName("ryuu_ranger").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KAKURANGER_RING = ITEMS.register("kakuranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_18",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(EffectCore.NINJA_SMOKE, 40, 0,true,false))
			.ChangeRangerName("ninja_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> OHRANGER_RING = ITEMS.register("ohranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_19",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("oh_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> CARRANGER_RING = ITEMS.register("carranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_20",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("red_racer").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> CARRANGER_RING_BOUSOU = ITEMS.register("carranger_ring_bousou",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_bousou","universe_senshi","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("red_racer").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> MEGARANGER_RING = ITEMS.register("megaranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_21",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
			.ChangeRangerName("mega_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GINGAMAN_RING = ITEMS.register("gingaman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_22",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("ginga_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOGO_V_RING = ITEMS.register("gogo_v_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_23",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
            .ChangeRangerName("go_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TIMERANGER_RING = ITEMS.register("timeranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_24",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("time_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GAORANGER_RING = ITEMS.register("gaoranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_25",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeRangerName("gao_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> HURRICANEGER_RING = ITEMS.register("hurricaneger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_26",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("hurricane_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ABARANGER_RING = ITEMS.register("abaranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_27",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 2,true,false))
			.ChangeRangerName("aba_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DEKARANGER_RING_ARMED = ITEMS.register("dekaranger_ring_armed",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_premier","universe_senshi","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("deka_red"));

	public static final DeferredItem<Item> DEKARANGER_RING_GOZYU = ITEMS.register("dekaranger_ring_gozyu",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_28",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("deka_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").addSwitchForm(DEKARANGER_RING_ARMED.get()));

	public static final DeferredItem<Item> DEKARANGER_RING = ITEMS.register("dekaranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_28",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("deka_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGER).addAlternative(DEKARANGER_RING_GOZYU.get()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> MAGIRANGER_RING = ITEMS.register("magiranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_29",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("magi_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BOUKENGER_RING = ITEMS.register("boukenger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","don_momotarou","gozyuger_belt_30",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("bouken_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GEKIRANGER_RING = ITEMS.register("gekiranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_31",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("geki_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GO_ONGER_RING = ITEMS.register("go_onger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_32",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .ChangeRangerName("go_on_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> SHINKENGER_RING = ITEMS.register("shinkenger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_33",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false),
                    new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false))
            .ChangeRangerName("shinken_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

    public static final DeferredItem<Item> SHINKENGER_RING_BOOSTED = ITEMS.register("shinkenger_ring_boosted",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_33_1",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING, 40, 4,true,false))
            .ChangeRangerName("shinken_red_super").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOSEIGER_RING = ITEMS.register("goseiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_34",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("gosei_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOKAIGER_RING = ITEMS.register("gokaiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_35",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("gokai_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GO_BUSTERS_RING = ITEMS.register("go_busters_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_36",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false))
            .ChangeRangerName("red_buster").ChangeBeltModel("geo/gozyuger_belt1.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KYORYUGER_RING = ITEMS.register("kyoryuger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_37",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
			.ChangeRangerName("kyoryu_red_gozyu").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TOQGER_RING = ITEMS.register("toqger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_38",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("toq_1gou").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> NINNINGER_RING = ITEMS.register("ninninger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_39",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("aka_ninger").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ZYUOHGER_RING_GORILLA = ITEMS.register("zyuohger_ring_gorilla",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_leon","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 2,true,false)).ChangeRangerName("zyuoh_gorilla"));

	public static final DeferredItem<Item> ZYUOHGER_RING = ITEMS.register("zyuohger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_40",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false))
			.addSwitchForm(ZYUOHGER_RING_GORILLA.get()).ifFlyingModelResource("geo/rangerwing.geo.json")
			.ChangeRangerName("zyuoh_eagle").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KYURANGER_RING = ITEMS.register("kyuranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_41",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.LUCK, 40, 2,true,false))
			.ChangeRangerName("shishi_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> LUPINRANGER_RING_SUPER = ITEMS.register("lupinranger_ring_super",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","universe_senshi","gozyuger_belt_42_1",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 5,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false))
			.ChangeRangerName("lupin_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").HasCape().AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> LUPINRANGER_RING = ITEMS.register("lupinranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_42",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			.ChangeRangerName("lupin_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").HasCape().AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> PATRANGER_RING_SUPER = ITEMS.register("patranger_ring_super",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_super","universe_senshi","gozyuger_belt_43_1",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 5,true,false))
			.ChangeRangerName("patren_1gou").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> PATRANGER_RING = ITEMS.register("patranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_43",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			.ChangeRangerName("patren_1gou").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> RYUSOULGER_RING = ITEMS.register("ryusoulger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_44",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("ryusoul_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

    public static final DeferredItem<Item> KIRAMEIGER_RING_GOZYU = ITEMS.register("kirameiger_ring_gozyu",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_45",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
            .ChangeRangerName("kiramei_red").ChangeBeltModel("geo/gozyuger_belt.geo.json"));

    public static final DeferredItem<Item> KIRAMEIGER_RING = ITEMS.register("kirameiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_45",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
            .ChangeRangerName("kiramei_red_gozyu").ChangeBeltModel("geo/gozyuger_belt.geo.json")
			.addAlternative(KIRAMEIGER_RING_GOZYU.get()).AddCompatibilityList(GOZYUGER).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ZENKAIGER_RING_BLACK = ITEMS.register("zenkaiger_ring_black",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_46",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("zenkaizer_black").ChangeBeltModel("geo/gozyuger_belt.geo.json"));

	public static final DeferredItem<Item> ZENKAIGER_RING_GOZYU = ITEMS.register("zenkaiger_ring_gozyu",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_46",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("zenkaizer").ChangeBeltModel("geo/gozyuger_belt.geo.json").addSwitchForm(ZENKAIGER_RING_BLACK.get()));

	public static final DeferredItem<Item> ZENKAIGER_RING = ITEMS.register("zenkaiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_46",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("zenkaizer").ChangeBeltModel("geo/gozyuger_belt.geo.json").addAlternative(ZENKAIGER_RING_GOZYU.get()).AddCompatibilityList(GOZYUGER).AddToTabList(RangerTabs.GOZYUGER));

    public static final DeferredItem<Item> DONBROTHERS_RING_GOZYU2 = ITEMS.register("donbrothers_ring_gozyu2",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_pm","universe_senshi","gozyuger_belt_47",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
            .ChangeRangerName("don_momotarou").ChangeBeltModel("geo/gozyuger_belt.geo.json"));

    public static final DeferredItem<Item> DONBROTHERS_RING_GOZYU = ITEMS.register("donbrothers_ring_gozyu",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt_47",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("don_momotarou").ChangeBeltModel("geo/gozyuger_belt.geo.json").addSwitchForm(DONBROTHERS_RING_GOZYU2.get()));

	public static final DeferredItem<Item> DONBROTHERS_RING = ITEMS.register("donbrothers_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_47",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("don_momotarou_gozyu").ChangeBeltModel("geo/gozyuger_belt.geo.json")
			.addAlternative(DONBROTHERS_RING_GOZYU.get()).AddCompatibilityList(GOZYUGER).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KING_OHGER_RING = ITEMS.register("king_ohger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_48",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("kuwagata_ohger").ChangeBeltModel("geo/gozyuger_belt.geo.json").ChangeModel("king_ohger.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BOONBOOMGER_RING = ITEMS.register("boonboomger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_49",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("bun_red").ChangeBeltModel("geo/gozyuger_belt.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));
	
	public static final DeferredItem<Item> GOZYUGER_HELMET = ITEMS.register("gozyuger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
    public static final DeferredItem<Item> GOZYUGER_CHESTPLATE = ITEMS.register("gozyuger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
    public static final DeferredItem<Item> GOZYUGER_LEGGINGS = ITEMS.register("gozyuger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
    
    public static final DeferredItem<Item> WOLF_TEGA_SWORD = ITEMS.register("wolf_tega_sword",
    		() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_wolf",GOZYU_WOLF_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> LEON_TEGA_SWORD = ITEMS.register("leon_tega_sword",
			() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_leon",GOZYU_LEON_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> TYRANNO_TEGA_SWORD = ITEMS.register("tyranno_tega_sword",
			() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_tyranno",GOZYU_TYRANNO_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> EAGLE_TEGA_SWORD = ITEMS.register("eagle_tega_sword",
			() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_eagle",GOZYU_EAGLE_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> UNICORN_TEGA_SWORD = ITEMS.register("unicorn_tega_sword",
			() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_unicorn",GOZYU_UNICORN_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<Item> POLAR_GOODE_BURN = ITEMS.register("polar_goode_burn",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gozyu_polar",GOZYU_POLAR_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties())
					.AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<Item> GARYUDO_TEGA_JUNE = ITEMS.register("garyudo_tega_june",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"ring_hunter_garyudo",TEGA_JUNE_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<Item> UNIVERSE_TEGA_SWORD_SILVER = ITEMS.register("universe_tega_sword_silver",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"universe_senshi",KING_OHGER_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> TEGA_SWORD = ITEMS.register("tega_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<SwordItem> TEGA_SWORD_ORIGIN = ITEMS.register("tega_sword_origin",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> GOODE_BURN = ITEMS.register("goode_burn",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<SwordItem> TEGA_NAGURE = ITEMS.register("tega_nagure",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<BaseBlasterItem> TEGA_JUNE = ITEMS.register("tega_june",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> TEGA_SWORD_SILVER = ITEMS.register("tega_sword_silver",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> WOLF_DE_CALIBUR_50 = ITEMS.register("wolf_de_calibur_50",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<SwordItem> DARK_WOLF_DE_CALIBUR_50 = ITEMS.register("dark_wolf_de_calibur_50",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<SwordItem> GARYUU_DE_CALIBUR_50 = ITEMS.register("garyuu_de_calibur_50",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<BaseBlasterItem> ORCA_BOOSTER_5050 = ITEMS.register("orca_booster_5050",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<BaseBlasterItem> ORCA_BOOSTER_5050_BLACK = ITEMS.register("orca_booster_5050_black",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<BaseBlasterItem> LEON_BUSTER_50 = ITEMS.register("leon_buster_50",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> TYRANNO_HAMMER_50 = ITEMS.register("tyranno_hammer_50",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<BaseBlasterItem> EAGLE_SHOOTER_50 = ITEMS.register("eagle_shooter_50",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> UNICORN_DRILL_50 = ITEMS.register("unicorn_drill_50",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<BaseBlasterItem> BEAR_KUMA_50 = ITEMS.register("bear_kuma_50",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> RYOU_TEGA_SWORD = ITEMS.register("ryou_tega_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}