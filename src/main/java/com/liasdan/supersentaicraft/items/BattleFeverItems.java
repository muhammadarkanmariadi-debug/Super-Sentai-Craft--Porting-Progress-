package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.goranger.GorangerBeltItem;
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

public class BattleFeverItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> BATTLE_FEVER_LOGO = ITEMS.register("battle_fever_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> JAPAN_BADGE_ORIGINAL = ITEMS.register("japan_badge_original",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_original","battle_japan","battle_japan_belt_o",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}
	);

	public static final DeferredItem<Item> JAPAN_BADGE = ITEMS.register("japan_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_japan","battle_japan_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.RED_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.addSwitchForm(JAPAN_BADGE_ORIGINAL.get()).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> COSSACK_BADGE_ORIGINAL = ITEMS.register("cossack_badge_original",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_original","battle_cossack","battle_cossack_belt_o",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.ORANGE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}
	);

	public static final DeferredItem<Item> COSSACK_BADGE = ITEMS.register("cossack_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_cossack","battle_cossack_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.ORANGE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.addSwitchForm(COSSACK_BADGE_ORIGINAL.get()).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> FRANCE_BADGE_EARLY = ITEMS.register("france_badge_early",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_early","battle_france","battle_france_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}
	);

	public static final DeferredItem<Item> FRANCE_BADGE_ORIGINAL = ITEMS.register("france_badge_original",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_original","battle_france","battle_france_belt_o",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.addNeedForm(FRANCE_BADGE_EARLY.get(),1).addAlternative(FRANCE_BADGE_EARLY.get()));

	public static final DeferredItem<Item> FRANCE_BADGE = ITEMS.register("france_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_france","battle_france_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLUE_MORPHIN_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.addNeedForm(FRANCE_BADGE_ORIGINAL.get(),1).addAlternative(FRANCE_BADGE_ORIGINAL.get()).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> KENYA_BADGE_ORIGINAL = ITEMS.register("kenya_badge_original",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_original","battle_kenya","battle_kenya_belt_o",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 50, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 50, 0, 0, 0, 1);
				}
			}
	);

	public static final DeferredItem<Item> KENYA_BADGE = ITEMS.register("kenya_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_kenya","battle_kenya_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.BLACK_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 50, 0, 0, 0, 1);
					((ServerLevel) player.level()).sendParticles(ModParticles.GREEN_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 50, 0, 0, 0, 1);
				}
			}.addSwitchForm(KENYA_BADGE_ORIGINAL.get()).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> AMERICA_BADGE_ORIGINAL = ITEMS.register("america_badge_original",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_original","miss_america","miss_america_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.PINK_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}
	);

	public static final DeferredItem<Item> AMERICA_BADGE = ITEMS.register("america_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","miss_america","miss_america_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			{
				public void OnTransformation(ItemStack itemstack, LivingEntity player) {
					super.OnTransformation(itemstack,player);
					((ServerLevel) player.level()).sendParticles(ModParticles.PINK_SPARK_PARTICLES.get(),
							player.getX(), player.getY()+1,
							player.getZ(), 100, 0, 0, 0, 1);
				}
			}.addSwitchForm(AMERICA_BADGE_ORIGINAL.get()).AddToTabList(RangerTabs.BATTLE_FEVER));
	
	public static final DeferredItem<Item> BATTLE_FEVER_HELMET = ITEMS.register("battle_fever_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> BATTLE_FEVER_CHESTPLATE = ITEMS.register("battle_fever_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> BATTLE_FEVER_LEGGINGS = ITEMS.register("battle_fever_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    
    public static final DeferredItem<Item> JAPAN_BATTLECEIVER = ITEMS.register("japan_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_japan",JAPAN_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> COSSACK_BATTLECEIVER = ITEMS.register("cossack_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_cossack",COSSACK_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> FRANCE_BATTLECEIVER = ITEMS.register("france_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_france",FRANCE_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> KENYA_BATTLECEIVER = ITEMS.register("kenya_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_kenya",KENYA_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> AMERICA_BATTLECEIVER = ITEMS.register("america_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"miss_america",AMERICA_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));

	public static final DeferredItem<SwordItem> COMMAND_BAT = ITEMS.register("command_bat",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));

	public static final DeferredItem<SwordItem> JAPAN_SPEAR = ITEMS.register("japan_spear",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
	public static final DeferredItem<SwordItem> COSSACK_SAI = ITEMS.register("cossack_sai",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
	public static final DeferredItem<SwordItem> FRANCE_FENCING_SWORD = ITEMS.register("france_fencing_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
	public static final DeferredItem<SwordItem> KENYA_WHIP = ITEMS.register("kenya_whip",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
	public static final DeferredItem<BaseThrowableItem> AMERICA_THROWING_KNIFE = ITEMS.register("america_throwing_knife",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));

	public static final DeferredItem<Item> BATTLE_FEVER_ROBO = ITEMS.register("battle_fever_robo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_fever_robo", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)));

	public static final DeferredItem<Item> BATTLE_FEVER_ROBO_BOOTS = ITEMS.register("battle_fever_robo_boots",
			() -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<Item> BATTLE_FEVER_ROBO_LEGGINGS = ITEMS.register("battle_fever_robo_legs",
			() -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<Item> BATTLE_FEVER_ROBO_CHESTPLATE = ITEMS.register("battle_fever_robo_torso",
			() -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<Item> BATTLE_FEVER_ROBO_HELMET = ITEMS.register("battle_fever_robo_head",
			() -> new MechaGattaiItem(ArmorMaterials.NETHERITE,"battle_fever_robo",BATTLE_FEVER_ROBO,BATTLE_FEVER_ROBO_CHESTPLATE,BATTLE_FEVER_ROBO_LEGGINGS,BATTLE_FEVER_ROBO_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static final DeferredItem<SwordItem> DENKOUKEN = ITEMS.register("denkouken",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<SwordItem> SWORD_FEVER = ITEMS.register("sword_fever",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<SwordItem> FEVER_AXE = ITEMS.register("fever_axe",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<SwordItem> STICK_ATTACKER = ITEMS.register("stick_attacker",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<SwordItem> ATTACK_LANCER = ITEMS.register("attack_lancer",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<SwordItem> CANE_KNOCKER = ITEMS.register("cane_knocker",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
	public static final DeferredItem<Item> BATTLE_SHIELD = ITEMS.register("battle_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}