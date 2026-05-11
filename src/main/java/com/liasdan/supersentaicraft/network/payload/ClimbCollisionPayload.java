package com.liasdan.supersentaicraft.network.payload;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record ClimbCollisionPayload(int hand) implements CustomPacketPayload {
    public static final Type<ClimbCollisionPayload> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath("supersentaicraft", "climb_collision"));

    public static final StreamCodec<ByteBuf, ClimbCollisionPayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT, ClimbCollisionPayload::hand,
            ClimbCollisionPayload::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
