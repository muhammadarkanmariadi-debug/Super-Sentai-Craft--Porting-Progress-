package com.liasdan.supersentaicraft.items.sentai_30.kyoryuger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class GaburivolverItem extends RangerChangerItem {

    // Carnival arm overlay texture names (indexed by zyudenchi -> texture name)
    // Right arm overlays
    public static final String[] CARNIVAL_RIGHT_ARM = {
            "blank",                               // 0 = none
            "kyoryu_red_carnival_parasagun",        // 1 = Parasagun
            "kyoryu_red_carnival_stegotchi",        // 2 = Stegotchi
            "kyoryu_red_carnival_ankydon",          // 3 = Ankydon
            "kyoryu_red_carnival_plezuon"            // 4 = Plezuon
    };

    // Left arm overlays
    public static final String[] CARNIVAL_LEFT_ARM = {
            "blank",                               // 0 = none
            "kyoryu_red_carnival_zakutor",          // 1 = Zakutor
            "kyoryu_red_carnival_dricera",          // 2 = Dricera
            "kyoryu_red_carnival_bunpachy",         // 3 = Bunpachy
            "kyoryu_red_carnival_tobaspino"          // 4 = Tobaspino
    };

    public GaburivolverItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        Has_basic_belt_info = false;
        Unlimited_Textures = 2;
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        Item formItem = this.get_Form_Item(stack, 1);
        Item formItem2 = this.get_Form_Item(stack, 2);

        tooltipComponents.add(Component.literal("§eZyuden Sentai Kyoryuger"));
        if (formItem2 == OtherItems.BLANK_FORM.get()) {
            tooltipComponents.add(Component.literal("Ranger: ").append(Component.translatable(formItem.toString() + ".form")));
        } else {
            tooltipComponents.add(Component.literal("Ranger: ").append(Component.translatable(formItem.toString() + ".form")));
            tooltipComponents.add(Component.translatable(formItem2.toString() + ".form"));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
        String belt = ((RangerChangerItem) itemstack.getItem()).BELT_TEXT;
        boolean fly = rider instanceof Player player && player.getAbilities().flying;

        if (equipmentSlot == EquipmentSlot.FEET) {
            if (((RangerChangerItem) itemstack.getItem()).BELT_TEXT == null) {
                belt = get_Form_Item(itemstack, 1).getBeltTex();
            }
            return "belts/" + belt;
        } else if (equipmentSlot == EquipmentSlot.HEAD) {
            RangerFormChangeItem mainForm = get_Form_Item(itemstack, 1);
            if (mainForm == KyoryugerItems.CARNIVAL_ZYUDENCHI.get() || mainForm == KyoryugerItems.RED_GABUTYRA_ZYUDENCHI.get()) {
                return mainForm.getRangerName(rangerName) + mainForm.getFormName(fly);
            }
            if (get_Form_Item(itemstack, 2).getFormName(fly).equals("")) return "blank";
            return get_Form_Item(itemstack, 2).getFormName(fly);
        } else {
            return get_Form_Item(itemstack, 1).getRangerName(rangerName) + get_Form_Item(itemstack, 1).getFormName(fly);
        }
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        // Carnival arm overlays
        RangerFormChangeItem form1 = get_Form_Item(itemstack, 1);
        if (form1 == KyoryugerItems.CARNIVAL_ZYUDENCHI.get()) {
            if (num == 1) {
                // Right arm overlay (slot_tex3)
                int rightIdx = getCarnivalArmIndex(itemstack, 3);
                if (rightIdx >= 0 && rightIdx < CARNIVAL_RIGHT_ARM.length) {
                    return CARNIVAL_RIGHT_ARM[rightIdx];
                }
            } else if (num == 2) {
                // Left arm overlay (slot_tex4)
                int leftIdx = getCarnivalArmIndex(itemstack, 4);
                if (leftIdx >= 0 && leftIdx < CARNIVAL_LEFT_ARM.length) {
                    return CARNIVAL_LEFT_ARM[leftIdx];
                }
            }
        }
        
        // Generic arm overlays
        if (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
            CompoundTag tag = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
            if (num == 1) { // right arm
                String overlay = tag.getString("overlay_right");
                if (!overlay.isEmpty()) return overlay;
            } else if (num == 2) { // left arm
                String overlay = tag.getString("overlay_left");
                if (!overlay.isEmpty()) return overlay;
            }
        }
        
        return "blank";
    }

    /**
     * Read the carnival arm index from NBT slot_texN.
     * The value is stored as an integer string in the NBT tag.
     */
    private int getCarnivalArmIndex(ItemStack itemstack, int slot) {
        if (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
            CompoundTag tag = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
            String val = tag.getString("carnival_arm_" + slot);
            if (!val.isEmpty()) {
                try {
                    return Integer.parseInt(val);
                } catch (NumberFormatException e) {
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override
    public ResourceLocation getModelResource(ItemStack itemstack, RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
        int num = 1;
        if (slot == EquipmentSlot.HEAD) num = 2;

        RangerFormChangeItem formItem = get_Form_Item(itemstack, num);
        
        // Carnival and Overlay custom model logic
        RangerFormChangeItem mainForm = get_Form_Item(itemstack, 1);
        boolean isCarnival = (mainForm == KyoryugerItems.CARNIVAL_ZYUDENCHI.get());
        
        boolean hasRight = (isCarnival && getCarnivalArmIndex(itemstack, 3) > 0) || (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA) && !itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe().getString("overlay_right").isEmpty());
        boolean hasLeft = (isCarnival && getCarnivalArmIndex(itemstack, 4) > 0) || (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA) && !itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe().getString("overlay_left").isEmpty());
        
        if (hasRight && hasLeft) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/carnival_both.geo.json");
        } else if (hasRight) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/carnival_right.geo.json");
        } else if (hasLeft) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/carnival_left.geo.json");
        } else if (isCarnival) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/carnival.geo.json");
        }

        if (formItem.HasWingsIfFlying() && !rider.onGround()) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + formItem.get_FlyingModel(this.Rider));
        } else {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + formItem.get_Model(this.Rider));
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

