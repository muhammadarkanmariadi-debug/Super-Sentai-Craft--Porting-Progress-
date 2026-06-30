package com.liasdan.supersentaicraft.items.sentai_50.kyuranger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_50.KyurangerItems;
import com.liasdan.supersentaicraft.world.attribute.AttributeRegistry;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class SeizaBlasterItem extends RangerChangerItem {

    public SeizaBlasterItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        Has_basic_belt_info = false;
        Unlimited_Textures = 1;
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
        String belt = ((RangerChangerItem) itemstack.getItem()).BELT_TEXT;
        boolean fly = rider instanceof Player player && player.getAbilities().flying;

        if (equipmentSlot == EquipmentSlot.FEET) {
            if (belt == null) {
                belt = get_Form_Item(itemstack, 1).getBeltTex();
            }
            return "belts/" + belt;
        }

        String baseName = get_Form_Item(itemstack, 1).getRangerName(rangerName);
        String formSuffix1 = get_Form_Item(itemstack, 1).getFormName(fly);
        String formSuffix2 = get_Form_Item(itemstack, 2).getFormName(fly);
        boolean isFullBodyOverride = formSuffix2.equals("_halloween") || formSuffix2.equals("_ya") || get_Form_Item(itemstack, 2) == KyurangerItems.YAGYUU_JUBEE_MASK.get();

        if (equipmentSlot == EquipmentSlot.HEAD) {
            String tex = get_Form_Item(itemstack, 2).getRangerName(baseName) + formSuffix2;
            if (tex.equals("kyuranger")) return "blank";
            if (itemstack.getItem() == KyurangerItems.METAL_DARK_SEIZA_BLASTER.get() && tex.equals("hebitsukai_silver")) {
                return "hebitsukai_metal_evil";
            }
            return tex;
        } else {
            String tex = baseName + formSuffix1;
            if (isFullBodyOverride) {
                tex = get_Form_Item(itemstack, 2).getRangerName(baseName) + formSuffix2;
            }
            if (itemstack.getItem() == KyurangerItems.METAL_DARK_SEIZA_BLASTER.get() && tex.equals("hebitsukai_silver")) {
                return "hebitsukai_metal_evil";
            }
            return tex;
        }
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
            net.minecraft.nbt.CompoundTag tag = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
            if (num == 1) { // right arm
                String overlay = tag.getString("overlay_right");
                if (!overlay.isEmpty()) return overlay;
            }
        }
        return "blank";
    }

    @Override
    public ResourceLocation getModelResource(ItemStack itemstack, RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
        int num = 1;
        if (slot == EquipmentSlot.HEAD) num = 2;

        if (get_Form_Item(itemstack, 1).HasWingsIfFlying() && rider.getAttribute(AttributeRegistry.WINGS_OUT).getBaseValue() == 1) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + get_Form_Item(itemstack, num).get_FlyingModel(this.Rider));
        } else {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + get_Form_Item(itemstack, num).get_Model(this.Rider));
        }
    }

    @Override
    public boolean getPartsForSlot(ItemStack itemBySlot, EquipmentSlot currentSlot, String part) {
        switch (currentSlot) {
            case HEAD -> {
                if (part.equals("head")) return true;
                if (part.equals("body")) return true;
                if (part.equals("rightArm")) return true;
                if (part.equals("leftArm")) return true;
                if (part.equals("rightLeg")) return true;
                if (part.equals("leftLeg")) return true;
            }
            case CHEST -> {
                if (part.equals("head")) return true;
                if (part.equals("body")) return true;
                if (part.equals("rightArm")) return true;
                if (part.equals("leftArm")) return true;
            }
            case LEGS -> {
                if (part.equals("rightLeg")) return true;
                if (part.equals("leftLeg")) return true;
            }
            default -> {}
        }
        return false;
    }
}
