package com.liasdan.supersentaicraft.items.sentai_50.kiramager;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class KiramagerChangerItem extends RangerChangerItem {

    public KiramagerChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String riderName) {
        if (equipmentSlot == EquipmentSlot.FEET) {
            return super.GET_TEXT(itemstack, equipmentSlot, rider, riderName);
        }
        
        boolean fly = rider.getAttribute(com.liasdan.supersentaicraft.world.attribute.AttributeRegistry.WINGS_OUT).getBaseValue() == 1;
        String formRangerName = get_Form_Item(itemstack, 1).getRangerName(riderName);
        String formName = get_Form_Item(itemstack, 1).getFormName(fly);
        
        if (formRangerName.endsWith("_go") || formRangerName.endsWith("_visor")) {
            // Strip the _go or _visor suffix so the base model loads the regular ranger suit (with arms and legs)
            String baseRangerName = formRangerName;
            if (formRangerName.endsWith("_go")) {
                baseRangerName = formRangerName.replace("_go", "");
            } else if (formRangerName.endsWith("_visor")) {
                baseRangerName = formRangerName.replace("_visor", "");
            }
            return baseRangerName + formName;
        }

        return super.GET_TEXT(itemstack, equipmentSlot, rider, riderName);
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (num == 1) {
            boolean fly = rider.getAttribute(com.liasdan.supersentaicraft.world.attribute.AttributeRegistry.WINGS_OUT).getBaseValue() == 1;
            String formRangerName = get_Form_Item(itemstack, 1).getRangerName(riderName);
            String formName = get_Form_Item(itemstack, 1).getFormName(fly);
            
            // If the active form is Go or Visor, render its specialized texture as an overlay
            if (formRangerName.endsWith("_go") || formRangerName.endsWith("_visor")) {
                return formRangerName + formName;
            }
        }
        return "blank";
    }
}
