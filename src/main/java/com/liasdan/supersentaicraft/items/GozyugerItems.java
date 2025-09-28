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
					((ServerLevel) player.level()).sendParticles(ModParticles.GOZYUGER_PARTICLES.get(),
						player.getX(), player.getY()+1,
						player.getZ(), 1, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_LEON_RING = ITEMS.register("gozyu_leon_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_leon","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOZYUGER_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 1, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_TYRANNO_RING = ITEMS.register("gozyu_tyranno_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_tyranno","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOZYUGER_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 1, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.YELLOW_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_EAGLE_RING = ITEMS.register("gozyu_eagle_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_eagle","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOZYUGER_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 1, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_UNICORN_RING = ITEMS.register("gozyu_unicorn_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_unicorn","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOZYUGER_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 1, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GOLD_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_POLAR_RING_2 = ITEMS.register("gozyu_polar_ring2",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_polar","gozyu_polar_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)));

	public static final DeferredItem<Item> GOZYU_POLAR_RING = ITEMS.register("gozyu_polar_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_robe","gozyu_polar","gozyu_polar_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.addSwitchForm(GOZYU_POLAR_RING_2.get()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TEGA_JUNE_RING = ITEMS.register("tega_june_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","ring_hunter_garyudo","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
	 		.ChangeModel("geo/black_knight.geo.json").ChangeAnimation("black_knight.animation.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GORANGER_RING = ITEMS.register("goranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> JAKQ_RING = ITEMS.register("jakq_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeRangerName("spade_ace").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BATTLE_FEVER_RING = ITEMS.register("battle_fever_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DENZIMAN_RING = ITEMS.register("denziman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("denzi_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> SUN_VULCAN_RING = ITEMS.register("sun_vulcan_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("vul_eagle").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOGGLE_V_RING = ITEMS.register("goggle_v_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeRangerName("goggle_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DYNAMAN_RING = ITEMS.register("dynaman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BIOMAN_RING = ITEMS.register("bioman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> CHANGEMAN_RING = ITEMS.register("changeman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> FLASHMAN_RING = ITEMS.register("flashman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
            .ChangeRangerName("red_flash").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> MASKMAN_RING = ITEMS.register("maskman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> LIVEMAN_RING = ITEMS.register("liveman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("red_falcon").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TURBORANGER_RING = ITEMS.register("turboranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("red_turbo").AddCompatibilityList(GOZYUGERS)	.AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> FIVEMAN_RING = ITEMS.register("fiveman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("five_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> JETMAN_RING = ITEMS.register("jetman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false))
			.ChangeRangerName("red_hawk").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ZYURANGER_RING = ITEMS.register("zyuranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
			.ChangeRangerName("tyranno_ranger").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DAIRANGER_RING = ITEMS.register("dairanger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KAKURANGER_RING = ITEMS.register("kakuranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> OHRANGER_RING = ITEMS.register("ohranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("oh_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> CARRANGER_RING = ITEMS.register("carranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeRangerName("red_racer").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> CARRANGER_RING_BOUSOU = ITEMS.register("carranger_ring_bousou",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_bousou","universe_senshi","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
					.ChangeRangerName("red_racer").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> MEGARANGER_RING = ITEMS.register("megaranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GINGAMAN_RING = ITEMS.register("gingaman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
					.ChangeRangerName("ginga_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOGO_V_RING = ITEMS.register("gogo_v_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
                    .IsGlowing().ChangeRangerName("go_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TIMERANGER_RING = ITEMS.register("timeranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("time_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GAORANGER_RING = ITEMS.register("gaoranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeRangerName("gao_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> HURRICANEGER_RING = ITEMS.register("hurricaneger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt")
					.ChangeRangerName("hurricane_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ABARANGER_RING = ITEMS.register("abaranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_abaranger",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.PUNCH, 40, 2,true,false))
			.ChangeRangerName("aba_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DEKARANGER_RING = ITEMS.register("dekaranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> MAGIRANGER_RING = ITEMS.register("magiranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BOUKENGER_RING = ITEMS.register("boukenger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","don_momotarou","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("bouken_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GEKIRANGER_RING = ITEMS.register("gekiranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("geki_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GO_ONGER_RING = ITEMS.register("go_onger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .ChangeRangerName("go_on_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> SHINKENGER_RING = ITEMS.register("shinkenger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false),
                    new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false))
            .ChangeRangerName("shinken_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

    public static final DeferredItem<Item> SHINKENGER_RING_BOOSTED = ITEMS.register("shinkenger_ring_boosted",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(EffectCore.FIRESLASH, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 4,true,false),
            		new MobEffectInstance(EffectCore.FLYING, 40, 4,true,false))
            .ChangeRangerName("shinken_red_super").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOSEIGER_RING = ITEMS.register("goseiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("gosei_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOKAIGER_RING = ITEMS.register("gokaiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GO_BUSTERS_RING = ITEMS.register("go_busters_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_go_busters",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false))
            .ChangeRangerName("red_buster").AddCompatibilityList(GOZYUGERS).ChangeBeltModel("geo/rangerbelt1.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KYORYUGER_RING = ITEMS.register("kyoryuger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
			.ChangeRangerName("kyoryu_red_gozyu").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> TOQGER_RING = ITEMS.register("toqger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> NINNINGER_RING = ITEMS.register("ninninger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeRangerName("aka_ninger").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ZYUOHGER_RING_GORILLA = ITEMS.register("zyuohger_ring_gorilla",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_leon","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 2,true,false)).ChangeRangerName("zyuoh_gorilla"));

	public static final DeferredItem<Item> ZYUOHGER_RING = ITEMS.register("zyuohger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false))
			.addSwitchForm(ZYUOHGER_RING_GORILLA.get()).ifFlyingModelResource("geo/rangerwing.geo.json")
			.ChangeRangerName("zyuoh_eagle").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KYURANGER_RING = ITEMS.register("kyuranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> LUPINRANGER_RING = ITEMS.register("lupinranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> PATRANGER_RING = ITEMS.register("patranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> RYUSOULGER_RING = ITEMS.register("ryusoulger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_ryusoulger",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("ryusoul_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

    public static final DeferredItem<Item> KIRAMEIGER_RING_GOZYU = ITEMS.register("kirameiger_ring_gozyu",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","universe","gozyuger_belt_kirameiger",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
                    .ChangeRangerName("kiramei_red"));

    public static final DeferredItem<Item> KIRAMEIGER_RING = ITEMS.register("kirameiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_kirameiger",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
            .ChangeRangerName("kiramei_red_gozyu").addAlternative(KIRAMEIGER_RING_GOZYU.get()).AddCompatibilityList(GOZYUGER).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> ZENKAIGER_RING = ITEMS.register("zenkaiger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt").AddToTabList(RangerTabs.GOZYUGER));

    public static final DeferredItem<Item> DONBROTHERS_RING_GOZYU2 = ITEMS.register("donbrothers_ring_gozyu2",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"_pm","universe_senshi","gozyuger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
                    .ChangeRangerName("don_momotarou"));

    public static final DeferredItem<Item> DONBROTHERS_RING_GOZYU = ITEMS.register("donbrothers_ring_gozyu",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","universe_senshi","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("don_momotarou").addSwitchForm(DONBROTHERS_RING_GOZYU2.get()));

	public static final DeferredItem<Item> DONBROTHERS_RING = ITEMS.register("donbrothers_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false))
			.ChangeRangerName("don_momotarou_gozyu").addAlternative(DONBROTHERS_RING_GOZYU.get()).AddCompatibilityList(GOZYUGER).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KING_OHGER_RING = ITEMS.register("king_ohger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("kuwagata_ohger").ChangeModel("geo/king_ohger.geo.json").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BOONBOOMGER_RING = ITEMS.register("boonboomger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","","gozyuger_belt_boonboomger",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("bun_red").AddCompatibilityList(GOZYUGERS).AddToTabList(RangerTabs.GOZYUGER));
	
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
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> GOODE_BURN = ITEMS.register("goode_burn",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<BaseBlasterItem> TEGA_JUNE = ITEMS.register("tega_june",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> TEGA_SWORD_SILVER = ITEMS.register("tega_sword_silver",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}