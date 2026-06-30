package com.liasdan.supersentaicraft.items.others;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.google.common.collect.Lists;
import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.cache.GeckoLibCache;

public class RangerFormChangeItem extends BaseItem {

	private String FORM_NAME;
	public int Slot =1;
	private List<MobEffectInstance> potionEffectList;
	private int BELT;
	private List<Item> NEEDITEM = new ArrayList<Item>();
	protected String RANGER_NAME;
	protected String OVERRIDE_RANGER_NAME;
	private String BELT_TEX;
	private String UPDATED_MODEL;
	private String UPDATED_BELT;
	private String UPDATED_ANIMATION;
	private String FLYING_MODEL;
	private Boolean FLYING_TEXT = false;
	public Item SHIFT_ITEM = Items.APPLE;
	public Supplier<Item> SHIFT_ITEM_SUPPLIER = null;
	public Item SWITCH_ITEM;
	protected Boolean RESET_FORM = false;
	public List<RangerFormChangeItem> alternative = new ArrayList<RangerFormChangeItem>();
	public RangerFormChangeItem alsoChange2ndSlot;
	public String[] compatibilityList= new String[] {""};
	private Boolean HAS_NEED_ITEM_LIST = false;
	public List<Item> needItemList;
	private Boolean IS_GLOWING = false;
	private Boolean HAS_STATIC_WINGS = false;
	private Boolean IS_BELT_GLOWING = false;

	private RangerFormChangeItem NEED_FORM_SLOT_1;
	private RangerFormChangeItem NEED_FORM_SLOT_2;
	private RangerFormChangeItem NEED_FORM_SLOT_3;
	private RangerFormChangeItem NEED_FORM_SLOT_4;

	private Boolean SET_SHOW_FACE = false;
	private Boolean SET_SHOW_UNDER = false;

	private Boolean USE_WALK = false;
	private Boolean HAS_CAPE = false;


	public RangerFormChangeItem( Properties properties,int belt,String formName,String rangername,String beltTex, MobEffectInstance... effects) {
		super( properties);

		potionEffectList = Lists.newArrayList(effects);
		FORM_NAME = formName;
		BELT_TEX = beltTex;
		BELT = belt;
		RANGER_NAME = rangername;
	}

	public RangerFormChangeItem( Properties properties,int belt,String formName,String rangername, MobEffectInstance... effects) {
		super( properties);

		potionEffectList = Lists.newArrayList(effects);
		FORM_NAME = formName;
		BELT = belt;
		RANGER_NAME = rangername;
	}

	public List<MobEffectInstance> getPotionEffectList() {
		return potionEffectList;
	}

	public int getBelt() {
		return BELT;
	}

	public String getFormName(Boolean isFlaying) {
		if (isFlaying&FLYING_TEXT) return FORM_NAME+"_wing";
		else return FORM_NAME;
	}


	public String getBeltTex() {
		return BELT_TEX;
	}

	public String get_Model(String rangerName) {
		if (UPDATED_MODEL!=null) return UPDATED_MODEL;
		else if (HAS_CAPE) return "rangercape.geo.json";
		ResourceLocation FORM_MODEL = ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+getRangerName(rangerName)+FORM_NAME+".geo.json");
		return (GeckoLibCache.getBakedModels().get(FORM_MODEL)!=null ? getRangerName(rangerName)+FORM_NAME+".geo.json" : (get_Has_Static_Wings() ? "rangerwing.geo.json" : "ranger.geo.json"));
	}

	public String getBeltModel() {
		if (UPDATED_BELT!=null) return UPDATED_BELT;
		return "rangerbelt.geo.json";
	}

	public String get_Animation() {
		return (UPDATED_ANIMATION!=null ? "animations/"+UPDATED_ANIMATION : "animations/ranger.animation.json");
	}

	public Boolean get_Show_Face() {
		return SET_SHOW_FACE;
	}

	public Boolean get_Show_Under() {
		return SET_SHOW_UNDER;
	}

	public Boolean get_Is_Glowing() {
		return IS_GLOWING;
	}

	public Boolean get_Is_Belt_Glowing() {
		return IS_BELT_GLOWING;
	}

	public String getRangerName(String name) {
		return (OVERRIDE_RANGER_NAME!=null ? OVERRIDE_RANGER_NAME : name);
	}

	public String get_FlyingModel(String riderName) {
		if (FLYING_MODEL!=null) return FLYING_MODEL;
		ResourceLocation FORM_MODEL = ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/"+getRangerName(riderName)+FORM_NAME+"_wing.geo.json");
		return (GeckoLibCache.getBakedModels().get(FORM_MODEL)!=null ? getRangerName(riderName)+FORM_NAME+"_wing.geo.json" : "rangerwing.geo.json");
	}
	public Boolean HasWingsIfFlying() {
		return FLYING_TEXT;
	}
	public Boolean get_Has_Static_Wings() {
		return HAS_STATIC_WINGS;
	}

	public RangerFormChangeItem Has_Static_Wings(Boolean glow) {
		this.HAS_STATIC_WINGS = glow;
		return this;
	}


	public Boolean get_has_cape() {
		return HAS_CAPE;
	}
	public Boolean get_Walk() {
		return USE_WALK;
	}
	
	public RangerFormChangeItem alsoChange2ndSlot(Item item) {
		alsoChange2ndSlot=  (RangerFormChangeItem) item;
		return this;
	}

	public RangerFormChangeItem IsGlowing() {
		IS_GLOWING=true;
		return this;
	}

	public RangerFormChangeItem HasCape() {
		HAS_CAPE=true;
		return this;
	}

	public RangerFormChangeItem ChangeModel(String s) {
		this.UPDATED_MODEL = s;
		return this;
	}


	public RangerFormChangeItem ChangeAnimation(String animation) {
		UPDATED_ANIMATION=animation;
		return this;
	}

	public RangerFormChangeItem ChangeBeltModel(String beltmodel) {
		UPDATED_BELT=beltmodel;
		return this;
	}

	public RangerFormChangeItem SetShowFace() {
		SET_SHOW_FACE = true;
		return this;
	}

	public RangerFormChangeItem SetShowUnder() {
		SET_SHOW_UNDER = true;
		return this;
	}

	public RangerFormChangeItem ChangeRangerName(String name) {
		OVERRIDE_RANGER_NAME=name;
		return this;
	}
	
	public RangerFormChangeItem ChangeSlot(int slot) {
		Slot=slot;
		return this;
	}

	public RangerFormChangeItem ifFlyingModelResource(String model) {
		FLYING_TEXT=true;
		FLYING_MODEL=model;
		return this;
	}

	public RangerFormChangeItem addAlternative( Item item) {
		alternative.add((RangerFormChangeItem) item);
		return this;
	}

	public RangerFormChangeItem BackToBase() {
		RESET_FORM=true;
		return this;
	}

	public RangerFormChangeItem addNeedForm(Item  item, int slot) {
		if (slot==1)NEED_FORM_SLOT_1=((RangerFormChangeItem)item);
		else if (slot==2)NEED_FORM_SLOT_2=((RangerFormChangeItem)item);
		else if (slot==3)NEED_FORM_SLOT_3=((RangerFormChangeItem)item);
		else if (slot==4)NEED_FORM_SLOT_4=((RangerFormChangeItem)item);
		return this;
	}
	
	public RangerFormChangeItem addNeedItem( Item item) {
		NEEDITEM.add(item);
		return this;
	}

	public List<Supplier<Item>> NEEDITEM_SUPPLIER = new ArrayList<>();
	public RangerFormChangeItem addNeedItemDeferred(Supplier<Item> item) {
		NEEDITEM_SUPPLIER.add(item);
		return this;
	}

	public RangerFormChangeItem addShiftForm(Item item) {
		SHIFT_ITEM=item;
		return this;
	}

	public RangerFormChangeItem addShiftFormDeferred(Supplier<Item> item) {
		SHIFT_ITEM_SUPPLIER = item;
		return this;
	}
	
	public RangerFormChangeItem addSwitchForm(Item item) {
		SWITCH_ITEM=item;
		return this;
	}

	public RangerFormChangeItem AddNeedItemList(List<Item> needChangerItem) {
		needItemList=needChangerItem;
		HAS_NEED_ITEM_LIST=true;
		return this;
	}
	
	public RangerFormChangeItem AddCompatibilityList(String[] List) {
		 compatibilityList=List;
		return this;
	}

	public Boolean iscompatible(String rider) {
		
		for (int i = 0; i < compatibilityList.length; i++)
		{
			if (compatibilityList[i]==rider){
				return true;
			}
		}
		
		return false;
	}
	
	public Boolean CanChange(Player player,RangerChangerItem belt, ItemStack stack) {

		if (this == OtherItems.BLANK_FORM.get()) {
			return true;
		}
		if(belt.Rider!=RANGER_NAME&!iscompatible(belt.Rider)) {
			return false;
		}
		if ( !NEEDITEM.isEmpty()) {
			for (int i = 0; i < NEEDITEM.size(); i++)
			{
				if (player.getInventory().countItem(NEEDITEM.get(i))==0){
					return false;
				}
			}
		}
		if (!NEEDITEM_SUPPLIER.isEmpty()) {
			for (int i = 0; i < NEEDITEM_SUPPLIER.size(); i++) {
				if (player.getInventory().countItem(NEEDITEM_SUPPLIER.get(i).get()) == 0) {
					return false;
				}
			}
		}
		if (NEED_FORM_SLOT_1!=null )if (RangerChangerItem.get_Form_Item(stack, 1)!=NEED_FORM_SLOT_1)return false;
		if (NEED_FORM_SLOT_2!=null )if (RangerChangerItem.get_Form_Item(stack, 2)!=NEED_FORM_SLOT_2)return false;
		if (NEED_FORM_SLOT_3!=null )if (RangerChangerItem.get_Form_Item(stack, 3)!=NEED_FORM_SLOT_3)return false;
		if (NEED_FORM_SLOT_4!=null )if (RangerChangerItem.get_Form_Item(stack, 4)!=NEED_FORM_SLOT_4)return false;
		
		if  (HAS_NEED_ITEM_LIST) {
			for (int i = 0; i < needItemList.size(); i++)
			{
				if (player.getInventory().countItem(needItemList.get(i))==0){
					return false;
				}
			}
		}
		return true;
	}

	public Boolean CanChangeMecha(Player player,MechaGattaiItem belt, ItemStack stack) {

		if (this == OtherItems.BLANK_FORM.get()) {
			return true;
		}
		if(belt.Rider!=RANGER_NAME&!iscompatible(belt.Rider)) {
			return false;
		}
		if ( !NEEDITEM.isEmpty()) {
			for (int i = 0; i < NEEDITEM.size(); i++)
			{
				if (player.getInventory().countItem(NEEDITEM.get(i))==0){
					return false;
				}
			}
		}
		if (!NEEDITEM_SUPPLIER.isEmpty()) {
			for (int i = 0; i < NEEDITEM_SUPPLIER.size(); i++) {
				if (player.getInventory().countItem(NEEDITEM_SUPPLIER.get(i).get()) == 0) {
					return false;
				}
			}
		}
		if (NEED_FORM_SLOT_1!=null )if (MechaGattaiItem.get_Form_Item(stack, 1)!=NEED_FORM_SLOT_1)return false;
		if (NEED_FORM_SLOT_2!=null )if (MechaGattaiItem.get_Form_Item(stack, 2)!=NEED_FORM_SLOT_2)return false;
		if (NEED_FORM_SLOT_3!=null )if (MechaGattaiItem.get_Form_Item(stack, 3)!=NEED_FORM_SLOT_3)return false;
		if (NEED_FORM_SLOT_4!=null )if (MechaGattaiItem.get_Form_Item(stack, 4)!=NEED_FORM_SLOT_4)return false;

		if  (HAS_NEED_ITEM_LIST) {
			for (int i = 0; i < needItemList.size(); i++)
			{
				if (player.getInventory().countItem(needItemList.get(i))==0){
					return false;
				}
			}
		}
		return true;
	}
	
	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);
		ItemStack MECHA = p_41129_.getItemBySlot(EquipmentSlot.HEAD);

		if (BELT.getItem() instanceof RangerChangerItem belt) {
			Item actualShiftItem = SHIFT_ITEM_SUPPLIER != null ? SHIFT_ITEM_SUPPLIER.get() : SHIFT_ITEM;

			if (actualShiftItem instanceof RangerFormChangeItem& p_41129_.isShiftKeyDown()) {
				((RangerFormChangeItem)actualShiftItem).use(p_41128_, p_41129_, p_41130_);
			}
			else if (CanChange(p_41129_,belt,BELT)) {
  				// Donbrothers Alter Crafting Logic
  				RangerFormChangeItem currentFormItem = RangerChangerItem.get_Form_Item(BELT, 1);
  				if (currentFormItem != null && currentFormItem.getFormName(false) != null && currentFormItem.getFormName(false).contains("_alter")) {
					String gearName = net.minecraft.core.registries.BuiltInRegistries.ITEM.getKey(this).getPath();
					String dropName = null;
					String dropName2 = null;
					if (gearName.equals("patranger_avatarou_gear_alter")) dropName = "don_patren_alter";
					else if (gearName.equals("lupinranger_avatarou_gear_alter")) dropName = "don_lupin_alter";
					else if (gearName.equals("ryusoulger_avatarou_gear_alter")) {
						dropName = "don_ryusoul_alter";
						dropName2 = "don_ryusoul_alter_shield";
					} else if (gearName.equals("ninninger_avatarou_gear_alter") || gearName.equals("zyuohger_avatarou_gear_alter")) {
					    // Don't drop items for these, they are rendered on the back
					    dropName = null;
					} else {
					    dropName = gearName + "_alter";
					}


					if (dropName != null) {
						ResourceLocation alterId = ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, dropName);
						if (net.minecraft.core.registries.BuiltInRegistries.ITEM.containsKey(alterId)) {
							Item alterVariant = net.minecraft.core.registries.BuiltInRegistries.ITEM.get(alterId);
							if (alterVariant != Items.AIR && alterVariant != null) {
								if (!p_41128_.isClientSide()) {
									p_41129_.spawnAtLocation(new ItemStack(alterVariant, 1));
									if (dropName2 != null) {
										ResourceLocation alterId2 = ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, dropName2);
										Item alterVariant2 = net.minecraft.core.registries.BuiltInRegistries.ITEM.get(alterId2);
										if (alterVariant2 != null && alterVariant2 != Items.AIR) {
											p_41129_.spawnAtLocation(new ItemStack(alterVariant2, 1));
										}
									}
									if (!p_41129_.isCreative()) {
										itemstack.shrink(1);
									}
								}
								return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
							}
						}
					}
				}

				if (RESET_FORM)RangerChangerItem.reset_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET));

				if (alsoChange2ndSlot !=null)RangerChangerItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),alsoChange2ndSlot, 2);

				if (SWITCH_ITEM!=null&RangerChangerItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET), Slot)==this) RangerChangerItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),SWITCH_ITEM, Slot);
					else RangerChangerItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),this, Slot);

			}else if(!alternative.isEmpty()){

				for (int i = 0; i < alternative.size(); i++)
				{
					RangerFormChangeItem alternativeItem_form_change = alternative.get(i);
					alternativeItem_form_change.use(p_41128_, p_41129_, p_41130_);
				}
			}
		}

		if (MECHA.getItem() instanceof MechaGattaiItem head) {
			Item actualShiftItem = SHIFT_ITEM_SUPPLIER != null ? SHIFT_ITEM_SUPPLIER.get() : SHIFT_ITEM;

			if (actualShiftItem instanceof RangerFormChangeItem& p_41129_.isShiftKeyDown()) {
				((RangerFormChangeItem)actualShiftItem).use(p_41128_, p_41129_, p_41130_);
			}
			else if (CanChangeMecha(p_41129_,head,MECHA)) {
				if (alsoChange2ndSlot !=null)MechaGattaiItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.HEAD),alsoChange2ndSlot, 2);

				if (SWITCH_ITEM!=null&MechaGattaiItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.HEAD), Slot)==this) MechaGattaiItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.HEAD),SWITCH_ITEM, Slot);
				else MechaGattaiItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.HEAD),this, Slot);

			}else if(!alternative.isEmpty()){

				for (int i = 0; i < alternative.size(); i++)
				{
					RangerFormChangeItem alternativeItem_form_change = alternative.get(i);
					alternativeItem_form_change.use(p_41128_, p_41129_, p_41130_);
				}
			}
		}

		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}

	public void OnTransformation(ItemStack itemstack, LivingEntity entity) {
		if (entity.level() instanceof ServerLevel sl) {
			sl.sendParticles(ParticleTypes.GUST,
					entity.getX(), entity.getY() + 1.0,
					entity.getZ(), 1, 0, 0, 0, 1);
		}
	}
}

/**
	public Item getWing() {
		return WINGS;
	}


	public boolean getNeedItem(Player  playerIn) {
		boolean NEED = true;
		if (NEEDSITEM.isEmpty()){
			NEED=true;
		}
		else {
			for (int i = 0; i < NEEDSITEM.size(); i++)
			{
				if (!playerIn.inventory.hasItemStack(new ItemStack(NEEDSITEM.get(i)))){
						(new ItemStack(NEEDSITEM.get(i)))){
					NEED=false;
				}
			}
		}
		return NEED;
	}


	public RiderFormChangeItem addWing(Item wings) {
		WINGS = wings;
		return this;
	}
	public RiderFormChangeItem ShiftForm(Item ShiftItem) {
		STIFT_ITEM = ShiftItem;
		return this;
	}

	public RiderFormChangeItem addAlternative(RiderFormChangeItem alternativeItem) {
		alternative.add(alternativeItem);
		return this;
	}
	public RiderFormChangeItem addNeedItem(Item needitem) {
		NEEDSITEM.add(needitem);
		return this;
	}



 **/
