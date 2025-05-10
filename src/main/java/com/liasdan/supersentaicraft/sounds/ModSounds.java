package com.liasdan.supersentaicraft.sounds;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, SuperSentaiCraftCore.MODID);

    public static final Supplier<SoundEvent> SUSUME_GORANGER = registerSoundEvent("susume_goranger");
    public static final ResourceKey<JukeboxSong> SUSUME_GORANGER_KEY = createSong("susume_goranger");

    public static final Supplier<SoundEvent> TAIYOU_SENTAI_SUN_VULCAN = registerSoundEvent("taiyou_sentai_sun_vulcan");
    public static final ResourceKey<JukeboxSong> TAIYOU_SENTAI_SUN_VULCAN_KEY = createSong("taiyou_sentai_sun_vulcan");

    public static final Supplier<SoundEvent> SAMURAI_SENTAI_SHINKENGER = registerSoundEvent("samurai_sentai_shinkenger");
    public static final ResourceKey<JukeboxSong> SAMURAI_SENTAI_SHINKENGER_KEY = createSong("samurai_sentai_shinkenger");

    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}