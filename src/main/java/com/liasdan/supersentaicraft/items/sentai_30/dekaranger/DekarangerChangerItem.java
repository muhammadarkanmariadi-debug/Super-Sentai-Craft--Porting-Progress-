package com.liasdan.supersentaicraft.items.sentai_30.dekaranger;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class DekarangerChangerItem extends RangerChangerItem {

    public DekarangerChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
        String base = super.GET_TEXT(itemstack, equipmentSlot, rider, rangerName);
        if (equipmentSlot != EquipmentSlot.FEET) {
            // Hilangkan akhiran untuk form yang menggunakan sistem overlay
            if (base.endsWith("_swat")) {
                return base.replace("_swat", "");
            }
            if (base.endsWith("_battlizer_armor")) {
                return base.replace("_battlizer_armor", "");
            }
            if (base.endsWith("_fire_squad_armor")) {
                return base.replace("_fire_squad_armor", "");
            }
        }
        return base;
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (num == 1) { // Overlay layer
            boolean fly = rider instanceof Player player && player.getAbilities().flying;
            String formName = get_Form_Item(itemstack, 1).getFormName(fly);
            
            if (formName.endsWith("_swat") || formName.endsWith("_battlizer_armor") || formName.endsWith("_fire_squad_armor")) {
                return get_Form_Item(itemstack, 1).getRangerName(riderName) + formName;
            }
        }
        return "blank";
    }
}
