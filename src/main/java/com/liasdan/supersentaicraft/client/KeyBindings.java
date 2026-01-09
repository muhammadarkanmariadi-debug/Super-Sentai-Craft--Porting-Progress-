package com.liasdan.supersentaicraft.client;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.client.settings.KeyConflictContext;

public class KeyBindings {
    public static final KeyBindings INSTANCE = new KeyBindings();

    private static final String CATEGORY = "key.categories." + SuperSentaiCraftCore.MODID;

    public final KeyMapping AbilityKey = new KeyMapping(
            "key."+ SuperSentaiCraftCore.MODID +".ability",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_V, -1),
            CATEGORY
    );
}


