package com.liasdan.supersentaicraft.network.payload;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record MechaAttackPayload(int attackType) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<MechaAttackPayload> TYPE = new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "mecha_attack"));

    public static final StreamCodec<FriendlyByteBuf, MechaAttackPayload> STREAM_CODEC = StreamCodec.ofMember(
            MechaAttackPayload::write, MechaAttackPayload::new
    );

    public MechaAttackPayload(FriendlyByteBuf buf) {
        this(buf.readInt());
    }

    public void write(FriendlyByteBuf buf) {
        buf.writeInt(attackType);
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
