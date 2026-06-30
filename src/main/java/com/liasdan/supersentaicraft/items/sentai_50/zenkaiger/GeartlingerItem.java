package com.liasdan.supersentaicraft.items.sentai_50.zenkaiger;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.minecraft.core.Holder;

public class GeartlingerItem extends RangerChangerItem {
    
    public static final String[] Zenkaiger= new String[] {"","_normal","_jetman"};
    public static final String[] Zenkaizer= new String[] {"","_super","_jetman"};
    public static final String[] Twokaizer= new String[] {"","_jetman"};
    public static final String[] Stacaesar= new String[] {"","_kyoka"};
    public static final String[] Hakaizer= new String[] {"","_kai"};
    public static final String[] Mecha= new String[] {"akaranger","spade_ace","battle_fever_robo","dai_denzin","sun_vulcan_robo","goggle_robo","dyna_robo","bio_robo","change_robo","flash_king","great_five","live_robo","turbo_robo","five_robo","jet_icarus","dai_zyujin","ryusei_oh","muteki_shogun","ohranger_robo","rv_robo","galaxy_mega","gingai_oh","victory_robo","time_robo_alpha","gao_king","senpuu_jin","abaren_oh","dekaranger_robo","magi_king","dai_bouken","geki_tohja","engine_oh","shinken_oh","gosei_great","gokai_oh","go_buster_oh","kyoryu_zin","toq_oh","shuriken_jin","zyuoh_king","kyuren_oh","lupin_kaiser","pat_kaiser","kishiryu_oh","kiramei_zin","don_momotarou"};

    public GeartlingerItem(Holder<ArmorMaterial> pMaterial, String pRangerName, DeferredItem<Item> ItemForm, DeferredItem<Item> head, DeferredItem<Item> chest, DeferredItem<Item> legs, Properties pProperties) {
        super(pMaterial, pRangerName, ItemForm, head, chest, legs, pProperties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String GET_TEXT(net.minecraft.world.item.ItemStack itemstack, net.minecraft.world.entity.EquipmentSlot equipmentSlot, net.minecraft.world.entity.LivingEntity rider, String rangerName) {
        if (equipmentSlot == net.minecraft.world.entity.EquipmentSlot.FEET) {
            String belt = ((RangerChangerItem) itemstack.getItem()).BELT_TEXT;
            if (belt == null) {
                belt = get_Form_Item(itemstack, 1).getBeltTex();
            }
            return "belts/" + belt;
        } else {
            int core = 0;
            if (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
                core = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe().getInt("core");
            }

            if (rangerName.equals("mecha") && core >= 0 && core < Mecha.length) {
                return "mecha/" + Mecha[core];
            }
            boolean fly = rider instanceof net.minecraft.world.entity.player.Player player && player.getAbilities().flying;
            String baseRanger = get_Form_Item(itemstack, 1).getRangerName(rangerName);
            
            // Handle untransformed state
            if (baseRanger == null || baseRanger.isEmpty() || baseRanger.equals("none")) {
                return "";
            }
            
            // For Twokaizer and Twokai Flint, their base suit NEVER changes. The forms (Ricky/Cutanner/Super) are strictly OVERLAYS!
            if (rangerName.equals("twokaizer") || rangerName.equals("twokai_flint")) {
                return rangerName;
            }
            
            return baseRanger + get_Form_Item(itemstack, 1).getFormName(fly);
        }
    }

    @Override
    public String getUnlimitedTextures(net.minecraft.world.item.ItemStack itemstack, net.minecraft.world.entity.LivingEntity rider, String riderName, int num) {
        if (num == 1) {
            if (((RangerChangerItem) itemstack.getItem()).Num_Base_Form_Item >= 2) {
                com.liasdan.supersentaicraft.items.others.RangerFormChangeItem formItem = get_Form_Item(itemstack, 2);
                com.liasdan.supersentaicraft.items.others.RangerFormChangeItem formItem1 = get_Form_Item(itemstack, 1);
                if (riderName.equals("twokaizer") || riderName.equals("twokai_flint")) {
                    String form1Name = formItem1.getRangerName(riderName);
                    if (form1Name.equals("zenkaizer_super")) return "twokaizer_super";
                    
                    // Ricky, Cutanner, and Kirameki Zenkaiju are equipped in Slot 2!
                    if (formItem != com.liasdan.supersentaicraft.items.OtherItems.BLANK_FORM.get()) {
                        String tex = formItem.getRangerName(riderName) + formItem.getFormName(false);
                        if (!tex.equals(riderName) && !tex.isEmpty() && !tex.equals("none")) {
                            return tex;
                        }
                    }
                    
                    return "blank"; // Base Twokaizer does not have an overlay
                }

                if (formItem != com.liasdan.supersentaicraft.items.OtherItems.BLANK_FORM.get()) {
                    String tex = formItem.getRangerName(riderName) + formItem.getFormName(false);
                    if (!tex.equals(riderName) && !tex.isEmpty() && !tex.equals("none")) {
                        return tex;
                    }
                }
                
                return "blank";
            }
        }
        return "blank";
    }
    @Override
    public net.minecraft.resources.ResourceLocation getModelResource(net.minecraft.world.item.ItemStack itemstack, com.liasdan.supersentaicraft.items.others.RangerArmorItem animatable, net.minecraft.world.entity.EquipmentSlot slot, net.minecraft.world.entity.LivingEntity rider) {
        if (this.Rider.equals("hakaizer")) {
            return net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(com.liasdan.supersentaicraft.SuperSentaiCraftCore.MODID, "geo/rangerwing.geo.json");
        }
        return super.getModelResource(itemstack, animatable, slot, rider);
    }
    
    @Override
    public boolean HasCape(net.minecraft.world.item.ItemStack itemstack) {
        // Twokaizer forms (including Twokaizer Super) never have a cape.
        if (this.Rider.equals("twokaizer") || this.Rider.equals("twokai_flint")) {
            return false;
        }
        return super.HasCape(itemstack);
    }
}
