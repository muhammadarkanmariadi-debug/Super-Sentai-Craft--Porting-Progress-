package com.liasdan.supersentaicraft.items.others;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MissingRecipesItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);



    // UNREFINED_ENETRON removed - already registered as a BlockItem via RangerBlocks

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}