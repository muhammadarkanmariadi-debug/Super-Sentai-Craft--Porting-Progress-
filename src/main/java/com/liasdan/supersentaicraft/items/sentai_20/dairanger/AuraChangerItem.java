package com.liasdan.supersentaicraft.items.sentai_20.dairanger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_20.DairangerItems;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class AuraChangerItem extends RangerChangerItem {

    public AuraChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Item.Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (get_Form_Item(itemstack, 1) == DairangerItems.KIBA_FORM.get()) {
            if (num == 1) return "kiba_ranger_base";
        }
        return "blank";
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
        String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
        boolean fly = !rider.onGround();

        if (equipmentSlot == EquipmentSlot.FEET) {
            Item mainHandItem = rider.getMainHandItem().getItem();
            Item offHandItem = rider.getOffhandItem().getItem();

            if (rangerName.equals("kiba_ranger")) {
                if (mainHandItem == DairangerItems.BYAKKOSHINKEN.get() || offHandItem == DairangerItems.BYAKKOSHINKEN.get()) {
                    belt = "kiba_belt_empty";
                } else {
                    belt = "kiba_belt";
                }
            } else {
                boolean hasStarCutter = mainHandItem == DairangerItems.STAR_CUTTER.get() || offHandItem == DairangerItems.STAR_CUTTER.get();
                boolean hasStarSword = mainHandItem == DairangerItems.STAR_SWORD.get() || offHandItem == DairangerItems.STAR_SWORD.get();

                if (hasStarCutter && hasStarSword) {
                    belt = "dairanger_belt_empty";
                } else if (hasStarCutter) {
                    belt = "dairanger_belt_empty_right";
                } else if (hasStarSword) {
                    belt = "dairanger_belt_empty_left";
                } else {
                    belt = get_Form_Item(itemstack, 1).getBeltTex();
                }
            }
            return "belts/" + belt;
        } else {
            return get_Form_Item(itemstack, 1).getRangerName(rangerName) + get_Form_Item(itemstack, 1).getFormName(fly);
        }
    }
}
