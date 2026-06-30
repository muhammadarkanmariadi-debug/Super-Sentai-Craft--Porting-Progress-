package com.liasdan.supersentaicraft.events;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.mecha.BaseMechaEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ViewportEvent;

@EventBusSubscriber(modid = SuperSentaiCraftCore.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onComputeFov(ViewportEvent.ComputeFov event) {
        Player player = Minecraft.getInstance().player;
        if (player != null && player.getVehicle() instanceof BaseMechaEntity mecha && !Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
            boolean isKaiser = "patkaiser".equals(mecha.NAME) || "lupinkaiser".equals(mecha.NAME);
            event.setFOV(isKaiser ? 120.0D : 90.0D); // Memperluas FOV secara signifikan saat menaiki mecha raksasa
        }
    }

    @SubscribeEvent
    public static void onComputeCameraAngles(ViewportEvent.ComputeCameraAngles event) {
        Player player = Minecraft.getInstance().player;
        if (player != null && player.getVehicle() instanceof BaseMechaEntity mecha && !Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
            Camera camera = event.getCamera();
            boolean isKaiser = "patkaiser".equals(mecha.NAME) || "lupinkaiser".equals(mecha.NAME);
            
            // Memundurkan kamera jauh ke belakang
            camera.move(isKaiser ? -90.0F : -10.0F, 0.0F, 0.0F);
            
            // Menaikkan kamera agar tidak terjebak di dalam model mecha (posisi absolut Y dinaikkan)
            Vec3 pos = camera.getPosition();
            camera.setPosition(pos.x, pos.y + (isKaiser ? 30.0D : 3.0D), pos.z);
        }
    }

    @SubscribeEvent
    public static void onKeyInput(net.neoforged.neoforge.client.event.InputEvent.InteractionKeyMappingTriggered event) {
        Player player = Minecraft.getInstance().player;
        if (player != null && player.getVehicle() instanceof BaseMechaEntity) {
            if (event.isAttack()) {
                // Klik kiri (Slash)
                net.neoforged.neoforge.network.PacketDistributor.sendToServer(new com.liasdan.supersentaicraft.network.payload.MechaAttackPayload(0));
                event.setCanceled(true);
                event.setSwingHand(false);
            } else if (event.isUseItem()) {
                // Klik kanan (Shot)
                net.neoforged.neoforge.network.PacketDistributor.sendToServer(new com.liasdan.supersentaicraft.network.payload.MechaAttackPayload(1));
                event.setCanceled(true);
                event.setSwingHand(false);
            }
        }
    }
}