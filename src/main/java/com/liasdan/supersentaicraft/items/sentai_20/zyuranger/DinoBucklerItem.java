package com.liasdan.supersentaicraft.items.sentai_20.zyuranger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_20.ZyurangerItems;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class DinoBucklerItem extends RangerChangerItem {

    public DinoBucklerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Item.Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (num == 1) {
            Item formItem2 = get_Form_Item(itemstack, 2);
            if (formItem2 == ZyurangerItems.DRAGON_MEDAL.get()) {
                return "dragon_shield";
            }
        }
        return "blank";
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
        String belt = ((RangerChangerItem)itemstack.getItem()).BELT_TEXT;
        boolean fly = !rider.onGround();

        if (equipmentSlot == EquipmentSlot.FEET) {
            Item mainHand = rider.getMainHandItem().getItem();
            Item offHand = rider.getOffhandItem().getItem();

            boolean hasRangerSword = mainHand == ZyurangerItems.RANGER_SWORD.get() || offHand == ZyurangerItems.RANGER_SWORD.get();
            boolean hasZyusouken = mainHand == ZyurangerItems.ZYUSOUKEN.get() || offHand == ZyurangerItems.ZYUSOUKEN.get();

            RangerFormChangeItem formItem1 = get_Form_Item(itemstack, 1);
            RangerFormChangeItem formItem2 = get_Form_Item(itemstack, 2);

            boolean isArmed = formItem2 == ZyurangerItems.DRAGON_MEDAL.get();

            if (rangerName.equals("tyranno_ranger") && isArmed) {
                if (hasRangerSword && hasZyusouken) {
                    belt = "zyuranger_red_belt_empty";
                } else if (hasRangerSword) {
                    belt = "zyuranger_red_dragon_shield_belt_empty";
                } else if (hasZyusouken) {
                    belt = "zyuranger_red_belt";
                } else {
                    belt = "zyuranger_red_dragon_shield_belt";
                }
            } else if (rangerName.equals("dragon_ranger")) {
                if (hasZyusouken) {
                    belt = formItem1.getBeltTex() + "_empty";
                } else {
                    belt = formItem1.getBeltTex();
                }
            } else {
                if (hasRangerSword) {
                    belt = formItem1.getBeltTex() + "_empty";
                } else {
                    belt = formItem1.getBeltTex();
                }
            }
            return "belts/" + belt;
        } else {
            return get_Form_Item(itemstack, 1).getRangerName(rangerName) + get_Form_Item(itemstack, 1).getFormName(fly);
        }
    }

    @Override
    public ResourceLocation getModelResource(ItemStack itemstack, RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
        if (get_Form_Item(itemstack, 1).HasWingsIfFlying() && !rider.onGround()) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + get_Form_Item(itemstack, 1).get_FlyingModel(this.Rider));
        } else {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + get_Form_Item(itemstack, 1).get_Model(this.Rider));
        }
    }
}
