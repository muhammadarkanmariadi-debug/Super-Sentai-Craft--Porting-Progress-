package com.liasdan.supersentaicraft.items.sentai_40.zyuohger;

import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.ZyuohgerItems;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class ZyuohWhaleChangeGunItem extends BaseBlasterItem {

    public ZyuohWhaleChangeGunItem(Tier tier, int damageModifier, float speedModifier, Properties properties) {
        super(tier, damageModifier, speedModifier, properties);
        com.liasdan.supersentaicraft.SuperSentaiCraftCore.FORM_WEAPON_ITEM.add(this);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack gun = player.getItemInHand(hand);

        // Changer Logic
        if (player.isShiftKeyDown()) {
            ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);
            if (!belt.isEmpty() && belt.getItem() instanceof RangerChangerItem rangerBelt) {
                if (rangerBelt.Rider.equals("zyuoh_eagle")) {
                    // Cek form saat ini
                    RangerFormChangeItem currentForm = RangerChangerItem.get_Form_Item(belt, 1);
                    RangerFormChangeItem whaleCube = (RangerFormChangeItem) ZyuohgerItems.WHALE_CUBE.get();
                    
                    if (currentForm != whaleCube) {
                        RangerChangerItem.set_Form_Item(belt, whaleCube, 1);
                        // Lock 0 = tidak ada overlay yasei kaihou
                        // Jika 1.21.1 butuh set lock, set di slot 2 (atau sesuaikan dengan mekanisme 1.21.1)
                        // Karena ini ZyuohChanger, Whale form tidak menggunakan overlay khusus (getUnlimitedTextures mereturn blank untuk whale)
                    } else {
                        // Kembali ke base form (Eagle)
                        RangerChangerItem.set_Form_Item(belt, (RangerFormChangeItem) ZyuohgerItems.EAGLE_CUBE.get(), 1);
                    }
                    
                    // Return success agar tidak menembak
                    return InteractionResultHolder.success(gun);
                }
            }
        }

        // Jika bukan kondisi Changer, lakukan Gun Logic bawaan (tembak)
        return super.use(level, player, hand);
    }
}
