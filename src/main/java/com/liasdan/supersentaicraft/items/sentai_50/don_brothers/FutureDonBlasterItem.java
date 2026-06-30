package com.liasdan.supersentaicraft.items.sentai_50.don_brothers;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class FutureDonBlasterItem extends RangerChangerItem {

    public FutureDonBlasterItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem,
                                DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs,
                                Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (num == 1) {
            String rangerName = get_Form_Item(itemstack, 1).getRangerName(riderName);
            if (rangerName.equals("future_oni_sister")) {
                return "future_oni_sister_base";
            }
        }
        return "blank";
    }
}
