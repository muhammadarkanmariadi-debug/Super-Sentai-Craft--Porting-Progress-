package com.liasdan.supersentaicraft.items.sentai_50.kyuranger;

import com.liasdan.supersentaicraft.items.sentai_50.KyurangerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.effect.MobEffectInstance;

public class KyutamaItem extends RangerFormChangeItem {

    public KyutamaItem(Properties properties, int belt, String formName, String ridername, String beltTex, MobEffectInstance... effects) {
        super(properties, belt, formName, ridername, beltTex, effects);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

        // --- Standard transformation logic (equip changer to FEET) ---
        Item offhandItem = player.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
        if (offhandItem == KyurangerItems.SEIZA_BLASTER.get() || 
            offhandItem == KyurangerItems.RYUTSUEDER.get() ||
            offhandItem == KyurangerItems.HOUOU_BLADE.get() ||
            offhandItem == KyurangerItems.DARK_SEIZA_BLASTER.get()) {
            if (offhandItem == KyurangerItems.SEIZA_BLASTER.get()) {
                int mode = getKyutamaMode(this);
                if (mode > 0) com.liasdan.supersentaicraft.items.others.BaseBlasterItem.set_mode(player.getItemBySlot(EquipmentSlot.OFFHAND), mode);
            } else if (offhandItem == KyurangerItems.RYUTSUEDER.get()) {
                if (this == KyurangerItems.RYU_KYUTAMA.get()) {
                    com.liasdan.supersentaicraft.items.others.BaseBlasterItem.set_mode(player.getItemBySlot(EquipmentSlot.OFFHAND), 1);
                }
            } else if (offhandItem == KyurangerItems.DARK_SEIZA_BLASTER.get()) {
                if (this == KyurangerItems.HEBITSUKAI_KYUTAMA.get() || this == KyurangerItems.DARK_SHISHI_KYUTAMA.get()) {
                    com.liasdan.supersentaicraft.items.others.BaseBlasterItem.set_mode(player.getItemBySlot(EquipmentSlot.OFFHAND), 1);
                }
            }
            

            if (belt.isEmpty()) {
                if (offhandItem == KyurangerItems.SEIZA_BLASTER.get()) {
                    ItemStack newBelt = ItemStack.EMPTY;
                    if (this == KyurangerItems.SHISHI_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.RED_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.SASORI_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.ORANGE_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.OOKAMI_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.BLUE_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.TENBIN_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.GOLD_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.OUSHI_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.BLACK_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.HEBITSUKAI_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.SILVER_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.CHAMELEON_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.GREEN_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.WASHI_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.PINK_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.KAJIKI_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.YELLOW_SEIZA_BLASTER.get());
                    } else if (this == KyurangerItems.KOGUMA_KYUTAMA.get()) {
                        newBelt = new ItemStack(KyurangerItems.SKY_BLUE_SEIZA_BLASTER.get());
                    }

                    if (!newBelt.isEmpty()) {
                        RangerChangerItem.set_Form_Item(newBelt, this, 1);
                        player.setItemSlot(EquipmentSlot.FEET, newBelt);
                        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                    }
                } else if (offhandItem == KyurangerItems.RYUTSUEDER.get()) {
                    if (this == KyurangerItems.RYU_KYUTAMA.get()) {
                        ItemStack newBelt = new ItemStack(KyurangerItems.COMMANDER_RYUTSUEDER.get());
                        RangerChangerItem.set_Form_Item(newBelt, this, 1);
                        player.setItemSlot(EquipmentSlot.FEET, newBelt);
                        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                    }
                } else if (offhandItem == KyurangerItems.HOUOU_BLADE.get()) {
                    if (this == KyurangerItems.HOUOU_KYUTAMA.get()) {
                        ItemStack newBelt = new ItemStack(KyurangerItems.HOUOU_BLADE_SHIELD.get());
                        RangerChangerItem.set_Form_Item(newBelt, this, 1);
                        player.setItemSlot(EquipmentSlot.FEET, newBelt);
                        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                    }
                } else if (offhandItem == KyurangerItems.DARK_SEIZA_BLASTER.get()) {
                    if (this == KyurangerItems.DARK_SHISHI_KYUTAMA.get()) {
                        ItemStack newBelt = new ItemStack(KyurangerItems.DARK_RED_SEIZA_BLASTER.get());
                        RangerChangerItem.set_Form_Item(newBelt, this, 1);
                        player.setItemSlot(EquipmentSlot.FEET, newBelt);
                        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                    } else if (this == KyurangerItems.HEBITSUKAI_KYUTAMA.get()) {
                        ItemStack newBelt = new ItemStack(KyurangerItems.METAL_DARK_SEIZA_BLASTER.get());
                        RangerChangerItem.set_Form_Item(newBelt, this, 1);
                        player.setItemSlot(EquipmentSlot.FEET, newBelt);
                        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                    }
                }
            }
        }
        
        // Form change logic when already transformed
        if (!belt.isEmpty() && belt.getItem() instanceof RangerChangerItem) {
            String overlay = null;
            if (this == KyurangerItems.IKKAKUJU_KYUTAMA.get()) {
                overlay = "kyu_ikkakuju_arm";
            } else if (this == KyurangerItems.PEGASUS_KYUTAMA.get() || this == KyurangerItems.KYU_PEGASUS_KYUTAMA.get()) {
                overlay = "kyu_pegasus";
            } else if (this == KyurangerItems.HIKARI_KYUTAMA_TAIYOU.get()) {
                overlay = "kyu_taiyou_mode";
            } else if (this == KyurangerItems.HIKARI_KYUTAMA_TSUKI.get()) {
                overlay = "kyu_tsuki_mode";
            }

            if (overlay != null) {
                final String finalOverlay = overlay;
                java.util.function.Consumer<net.minecraft.nbt.CompoundTag> data = form -> {
                    if (form.getString("overlay_right").equals(finalOverlay)) {
                        form.putString("overlay_right", "");
                    } else {
                        form.putString("overlay_right", finalOverlay);
                    }
                    form.putBoolean("Update_form", true);
                };
                net.minecraft.world.item.component.CustomData.update(net.minecraft.core.component.DataComponents.CUSTOM_DATA, belt, data);
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }

        return super.use(level, player, hand);
    }

    public static int getKyutamaMode(Item kyutama) {
        if (kyutama == KyurangerItems.SHISHI_KYUTAMA.get()) return 1;
        if (kyutama == KyurangerItems.SASORI_KYUTAMA.get()) return 2;
        if (kyutama == KyurangerItems.OOKAMI_KYUTAMA.get()) return 3;
        if (kyutama == KyurangerItems.TENBIN_KYUTAMA.get()) return 4;
        if (kyutama == KyurangerItems.OUSHI_KYUTAMA.get()) return 5;
        if (kyutama == KyurangerItems.HEBITSUKAI_KYUTAMA.get()) return 6;
        if (kyutama == KyurangerItems.CHAMELEON_KYUTAMA.get()) return 7;
        if (kyutama == KyurangerItems.WASHI_KYUTAMA.get()) return 8;
        if (kyutama == KyurangerItems.KAJIKI_KYUTAMA.get()) return 9;
        if (kyutama == KyurangerItems.KOGUMA_KYUTAMA.get()) return 10;
        if (kyutama.toString().contains("ikkakuju")) return 11;
        if (kyutama.toString().contains("pegasus")) return 12;
        if (kyutama == KyurangerItems.HIKARI_KYUTAMA_TAIYOU.get()) return 14;
        if (kyutama == KyurangerItems.HIKARI_KYUTAMA_TSUKI.get()) return 15;
        if (kyutama == KyurangerItems.SAIKO_KYUTAMA.get()) return 16;
        if (kyutama == KyurangerItems.DARK_SHISHI_KYUTAMA.get()) return 18;
        return 0;
    }
}
