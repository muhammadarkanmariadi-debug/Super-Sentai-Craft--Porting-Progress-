package com.liasdan.supersentaicraft.particle;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, SuperSentaiCraftCore.MODID);

    public static final Supplier<SimpleParticleType> WHITE_SPARK_PARTICLES =
            PARTICLE_TYPES.register("white_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> RED_SPARK_PARTICLES =
            PARTICLE_TYPES.register("red_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> BLUE_SPARK_PARTICLES =
            PARTICLE_TYPES.register("blue_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> GREEN_SPARK_PARTICLES =
            PARTICLE_TYPES.register("green_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> DARK_GREEN_SPARK_PARTICLES =
            PARTICLE_TYPES.register("dark_green_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> PURPLE_SPARK_PARTICLES =
            PARTICLE_TYPES.register("purple_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> YELLOW_SPARK_PARTICLES =
            PARTICLE_TYPES.register("yellow_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> PINK_SPARK_PARTICLES =
            PARTICLE_TYPES.register("pink_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> GOLD_SPARK_PARTICLES =
            PARTICLE_TYPES.register("gold_spark_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> BLACK_SPARK_PARTICLES =
            PARTICLE_TYPES.register("black_spark_particles", () -> new SimpleParticleType(true));



    public static final Supplier<SimpleParticleType> GOZYUGER_PARTICLES =
            PARTICLE_TYPES.register("gozyuger_particles", () -> new SimpleParticleType(true));


    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}