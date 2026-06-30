package com.liasdan.supersentaicraft.items.sentai_40.kyoryuger;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;

import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;

public class ZyudenchiItem extends RangerFormChangeItem {

    public ZyudenchiItem(Properties properties, int belt, String formName, String ridername, String beltTex, MobEffectInstance... effects) {
        super(properties, belt, formName, ridername, beltTex, effects);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

        // --- Carnival arm overlay logic ---
        // If the player is already transformed and in Carnival form, swap arm overlays
        if (!belt.isEmpty() && belt.getItem() instanceof GaburivolverItem gaburivolver) {
            RangerFormChangeItem currentForm = RangerChangerItem.get_Form_Item(belt, 1);
            if (currentForm == KyoryugerItems.CARNIVAL_ZYUDENCHI.get()) {
                // Set right arm overlay
                int rightArm = -1;
                int leftArm = -1;

                if (this == KyoryugerItems.PARASAGUN_ZYUDENCHI.get())    rightArm = 1;
                else if (this == KyoryugerItems.STEGOTCHI_ZYUDENCHI.get())   rightArm = 2;
                else if (this == KyoryugerItems.ANKYDON_ZYUDENCHI.get())     rightArm = 3;
                else if (this == KyoryugerItems.PLEZUON_ZYUDENCHI.get())     rightArm = 4;
                else if (this == KyoryugerItems.ZAKUTOR_ZYUDENCHI.get())     leftArm = 1;
                else if (this == KyoryugerItems.DRICERA_ZYUDENCHI.get())     leftArm = 2;
                else if (this == KyoryugerItems.BUNPACHY_ZYUDENCHI.get())    leftArm = 3;
                else if (this == KyoryugerItems.BRAGIGAS_ZYUDENCHI.get())    leftArm = 4; // Tobaspino slot

                if (rightArm >= 0 && !player.isShiftKeyDown()) {
                    final int idx = rightArm;
                    Consumer<CompoundTag> data = form -> {
                        form.putString("carnival_arm_3", String.valueOf(idx));
                        form.putBoolean("Update_form", true);
                    };
                    CustomData.update(DataComponents.CUSTOM_DATA, belt, data);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
                if (leftArm >= 0 && !player.isShiftKeyDown()) {
                    final int idx = leftArm;
                    Consumer<CompoundTag> data = form -> {
                        form.putString("carnival_arm_4", String.valueOf(idx));
                        form.putBoolean("Update_form", true);
                    };
                    CustomData.update(DataComponents.CUSTOM_DATA, belt, data);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }

                // Revert using any other zyudenchi or if shifting
                RangerChangerItem.set_Form_Item(belt, KyoryugerItems.RED_GABUTYRA_ZYUDENCHI.get(), 1);
                Consumer<CompoundTag> resetData = form -> {
                    form.putString("carnival_arm_3", "");
                    form.putString("carnival_arm_4", "");
                    form.putBoolean("Update_form", true);
                };
                CustomData.update(DataComponents.CUSTOM_DATA, belt, resetData);
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }

        // --- Carnival activation: Carnival Zyudenchi while already transformed ---
        if (!belt.isEmpty() && belt.getItem() instanceof GaburivolverItem) {
            if (this == KyoryugerItems.CARNIVAL_ZYUDENCHI.get()) {
                Item offhand = player.getOffhandItem().getItem();
                Item mainhand = player.getMainHandItem().getItem();
                if (offhand == KyoryugerItems.GABUTYRA_DE_CARNIVAL.get() || mainhand == KyoryugerItems.GABUTYRA_DE_CARNIVAL.get()
                        || offhand == KyoryugerItems.GABURI_CARNIVAL.get() || mainhand == KyoryugerItems.GABURI_CARNIVAL.get()
                        || offhand == KyoryugerItems.GABUTYRA_DE_CARNIVAL_GUN.get() || mainhand == KyoryugerItems.GABUTYRA_DE_CARNIVAL_GUN.get()
                        || offhand == KyoryugerItems.GABURIVOLVER.get() || mainhand == KyoryugerItems.GABURIVOLVER.get()) {
                    RangerChangerItem.set_Form_Item(belt, this, 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.RED_GABUTYRA_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            }
        }

        // --- Generic Overlay logic ---
        if (!belt.isEmpty() && belt.getItem() instanceof RangerChangerItem) {
            String rightOverlay = null;
            String leftOverlay = null;

            if (this == KyoryugerItems.GABUTYRA_ZYUDENCHI.get() && player.isShiftKeyDown()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.GABUTYRA_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_RED_ZYUDENCHI.get()) {
                    rightOverlay = "kyoryu_armed_on";
                }
            }
            else if (this == KyoryugerItems.PARASAGUN_ZYUDENCHI.get() && player.isShiftKeyDown()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.PARASAGUN_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_BLACK_ZYUDENCHI.get()) {
                    rightOverlay = "kyoryu_armed_on";
                }
            }
            else if (this == KyoryugerItems.STEGOTCHI_ZYUDENCHI.get() && player.isShiftKeyDown()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.STEGOTCHI_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_BLUE_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.GHOST_BLUE_ZYUDENCHI.get()) {
                    rightOverlay = "kyoryu_armed_on";
                }
            }
            else if (this == KyoryugerItems.ZAKUTOR_ZYUDENCHI.get() && player.isShiftKeyDown()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.ZAKUTOR_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_GREEN_ZYUDENCHI.get()) {
                    rightOverlay = "kyoryu_armed_on";
                }
            }
            else if (this == KyoryugerItems.DRICERA_ZYUDENCHI.get() && player.isShiftKeyDown()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.DRICERA_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_PINK_ZYUDENCHI.get()) {
                    rightOverlay = "kyoryu_armed_on";
                }
            }
            else if (this == KyoryugerItems.PTERAGORDON_ZYUDENCHI.get() && player.isShiftKeyDown()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.PTERAGORDON_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_GOLD_ZYUDENCHI.get()) {
                    rightOverlay = "kyoryu_gold_armed_on";
                }
            }
            else if (this == KyoryugerItems.DOUBLE_GABUTYRA_ZYUDENCHI.get()) {
                rightOverlay = "kyoryu_gaburu_armed_on";
                leftOverlay = "kyoryu_gaburu_armed_on";
            }
            else if (this == KyoryugerItems.DEINOSGRANDER_ZYUDENCHI.get()) {
                rightOverlay = "kyoryu_deinosgrander";
                leftOverlay = "kyoryu_deinosgrander";
            }
            else if (this == KyoryugerItems.PLEZUON_ZYUDENCHI.get()) {
                rightOverlay = "kyoryu_plezuon_rocket";
            }
            else if (this == KyoryugerItems.DEBOTH_GABUTYRA_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.GABUTYRA_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.CURSED_RED_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_RED_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.GABUTYRA_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else if (this == KyoryugerItems.DEBOTH_PARASAGUN_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.PARASAGUN_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.CURSED_BLACK_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_BLACK_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.PARASAGUN_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else if (this == KyoryugerItems.DEBOTH_STEGOTCHI_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.STEGOTCHI_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.CURSED_BLUE_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_BLUE_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.STEGOTCHI_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else if (this == KyoryugerItems.DEBOTH_ZAKUTOR_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.ZAKUTOR_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.CURSED_GREEN_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_GREEN_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.ZAKUTOR_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else if (this == KyoryugerItems.DEBOTH_DRICERA_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.DRICERA_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.CURSED_PINK_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_PINK_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.DRICERA_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else if (this == KyoryugerItems.DEBOTH_PTERAGORDON_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.PTERAGORDON_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.CURSED_GOLD_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.CURSED_GOLD_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.PTERAGORDON_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else if (this == KyoryugerItems.GHOST_STEGOTCHI_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.STEGOTCHI_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.GHOST_BLUE_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.GHOST_BLUE_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.STEGOTCHI_ZYUDENCHI.get(), 1);
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else if (this == KyoryugerItems.SPIRIT_PTERAGORDON_ZYUDENCHI.get()) {
                rightOverlay = "kyoryu_gold_armed_on";
            } else if (this == KyoryugerItems.SPIRIT_PLEZUON_ZYUDENCHI.get()) {
                if (RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.PLEZUON_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.VIOLET_GUY_ZYUDENCHI.get() || RangerChangerItem.get_Form_Item(belt, 1) == KyoryugerItems.SPIRIT_PLEZUON_ZYUDENCHI.get()) {
                    RangerChangerItem.set_Form_Item(belt, KyoryugerItems.VIOLET_GUY_ZYUDENCHI.get(), 1);
                    rightOverlay = "kyoryu_plezuon_rocket";
                }
            }

            if (rightOverlay != null || leftOverlay != null) {
                final String finalRight = rightOverlay;
                final String finalLeft = leftOverlay;
                Consumer<CompoundTag> data = form -> {
                    if (finalRight != null) {
                        if (form.getString("overlay_right").equals(finalRight)) form.putString("overlay_right", "");
                        else form.putString("overlay_right", finalRight);
                    } else {
                        form.putString("overlay_right", "");
                    }
                    if (finalLeft != null) {
                        if (form.getString("overlay_left").equals(finalLeft)) form.putString("overlay_left", "");
                        else form.putString("overlay_left", finalLeft);
                    } else {
                        form.putString("overlay_left", "");
                    }
                    form.putBoolean("Update_form", true);
                };
                CustomData.update(DataComponents.CUSTOM_DATA, belt, data);
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }

        // --- Standard transformation logic (equip changer to FEET) ---
        Item offhandItem = player.getItemBySlot(EquipmentSlot.OFFHAND).getItem();
        if (offhandItem == KyoryugerItems.GABURIVOLVER.get() || 
            offhandItem == KyoryugerItems.GABURICHANGER.get() || 
            offhandItem == KyoryugerItems.GIGA_GABURIVOLVER.get() || 
            offhandItem == KyoryugerItems.FLUTE_BUSTER.get()) {
            
            if (belt.isEmpty()) {
                if (this == KyoryugerItems.PTERAGORDON_ZYUDENCHI.get() && offhandItem == KyoryugerItems.GABURICHANGER.get()) {
                    player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KyoryugerItems.KYORYU_GOLD_GABURICHANGER.get()));
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (this == KyoryugerItems.BRAGIGAS_ZYUDENCHI.get() && offhandItem == KyoryugerItems.GIGA_GABURIVOLVER.get()) {
                    player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KyoryugerItems.SILVER_GIGA_GABURIVOLVER.get()));
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (this == KyoryugerItems.DEBOTH_TOBASPINO_ZYUDENCHI.get() && offhandItem == KyoryugerItems.FLUTE_BUSTER.get()) {
                    player.setItemSlot(EquipmentSlot.FEET, new ItemStack(KyoryugerItems.DEATH_FLUTE_BUSTER.get()));
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                } else if (offhandItem == KyoryugerItems.GABURIVOLVER.get()) {
                    ItemStack newBelt = ItemStack.EMPTY;
                    if (this == KyoryugerItems.GABUTYRA_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.KYORYU_RED_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.PARASAGUN_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.KYORYU_BLACK_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.STEGOTCHI_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.KYORYU_BLUE_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.ZAKUTOR_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.KYORYU_GREEN_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.DRICERA_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.KYORYU_PINK_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.ANKYDON_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.CYAN_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.BUNPACHY_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.GREY_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.PLEZUON_ZYUDENCHI.get() || this == KyoryugerItems.SPIRIT_PLEZUON_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.VIOLET_GABURIVOLVER.get());
                    } else if (this == KyoryugerItems.TOBASPINO_ZYUDENCHI.get()) {
                        newBelt = new ItemStack(KyoryugerItems.NAVY_GABURIVOLVER.get());
                    }

                    if (!newBelt.isEmpty()) {
                        RangerChangerItem.set_Form_Item(newBelt, this, 1);
                        player.setItemSlot(EquipmentSlot.FEET, newBelt);
                        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                    }
                }
            }
        }
        
        // Fallback to super for generic form changing (like Future, Cursed, Spirit)
        return super.use(level, player, hand);
    }
}

