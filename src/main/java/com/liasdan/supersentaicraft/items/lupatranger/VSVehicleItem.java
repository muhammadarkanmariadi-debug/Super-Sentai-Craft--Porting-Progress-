package com.liasdan.supersentaicraft.items.lupatranger;

import com.liasdan.supersentaicraft.items.LuPatRangerItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class VSVehicleItem extends RangerFormChangeItem {

	public VSVehicleItem(Properties properties, int belt, String formName, String ridername, String beltTex, MobEffectInstance... effects) {
		super( properties, belt, formName, ridername, beltTex, effects);
	}
	
	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (BELT.getItem() instanceof RangerChangerItem belt) {

			if (SHIFT_ITEM instanceof RangerFormChangeItem& p_41129_.isShiftKeyDown()) {
				((RangerFormChangeItem)SHIFT_ITEM).use(p_41128_, p_41129_, p_41130_);
			}
			else if (CanChange(p_41129_,belt,BELT)) {
				if (RESET_FORM)RangerChangerItem.reset_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET));
				if (alsoChange2ndSlot !=null)RangerChangerItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),alsoChange2ndSlot, 2);

				if (BELT.getItem() == LuPatRangerItems.LUPAT_X_CHANGER.get() |
						BELT.getItem() == RyusoulgerItems.RED_RYUSOUL_CHANGER.get() |
						BELT.getItem() == RyusoulgerItems.BLUE_RYUSOUL_CHANGER.get() |
						BELT.getItem() == RyusoulgerItems.PINK_RYUSOUL_CHANGER.get() |	
						BELT.getItem() == RyusoulgerItems.GREEN_RYUSOUL_CHANGER.get() | 
						BELT.getItem() == RyusoulgerItems.BLACK_RYUSOUL_CHANGER.get() |
						BELT.getItem() == RyusoulgerItems.GOLD_MOSA_CHANGER.get()) {
					
					if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()==LuPatRangerItems.VS_CHANGER.get())
					{
						RangerChangerItem.set_Form_Item(BELT,this, Slot);
					}
				}
				else RangerChangerItem.set_Form_Item(BELT,this, Slot);
			
			}else if(!alternative.isEmpty()){

				for (int i = 0; i < alternative.size(); i++)
				{
					RangerFormChangeItem alternativeItem_form_change = alternative.get(i);
					alternativeItem_form_change.use(p_41128_, p_41129_, p_41130_);
				}
			}
		}
		if (p_41129_.getItemBySlot(EquipmentSlot.OFFHAND).getItem()==LuPatRangerItems.VS_CHANGER.get())
		{
			if (BELT.isEmpty())
			{
				if (this == LuPatRangerItems.RED_DIAL_FIGHTER.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(LuPatRangerItems.RED_VS_CHANGER.get()));
				}
				if (this == LuPatRangerItems.BLUE_DIAL_FIGHTER.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(LuPatRangerItems.BLUE_VS_CHANGER.get()));
				}
				if (this == LuPatRangerItems.YELLOW_DIAL_FIGHTER.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(LuPatRangerItems.YELLOW_VS_CHANGER.get()));
				}
				if (this == LuPatRangerItems.TRIGGER_MACHINE_ICHIGOU.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(LuPatRangerItems.ICHIGOU_VS_CHANGER.get()));
				}
				if (this == LuPatRangerItems.TRIGGER_MACHINE_NIGOU.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(LuPatRangerItems.NIGOU_VS_CHANGER.get()));
				}
				if (this == LuPatRangerItems.TRIGGER_MACHINE_SANGOU.get())
				{
					p_41129_.setItemSlot(EquipmentSlot.FEET, new ItemStack(LuPatRangerItems.SANGOU_VS_CHANGER.get()));
				}
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}