package com.liasdan.supersentaicraft.world.attribute;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.IModBusEvent;
import net.neoforged.neoforge.common.BooleanAttribute;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = SuperSentaiCraftCore.MODID, bus=EventBusSubscriber.Bus.MOD)
public class AttributeRegistry extends Event implements IModBusEvent {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(Registries.ATTRIBUTE, SuperSentaiCraftCore.MODID);

    public static final DeferredHolder<Attribute, Attribute> CAPE_ROT_OLD = ATTRIBUTES.register("cape_rotation_old",
            () -> new RangedAttribute(
                    "attribute.kamenridercraftcore.cape_rotation_old",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );


    public static final DeferredHolder<Attribute, Attribute> CAPE_ROT = ATTRIBUTES.register("cape_rotation",
            () -> new RangedAttribute(
                    "attribute.kamenridercraftcore.cape_rotation",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> WHEEL_ROT_OLD = ATTRIBUTES.register("wheel_rotation_old",
            () -> new RangedAttribute(
                    "attribute.kamenridercraftcore.wheel_rotation_old",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );


    public static final DeferredHolder<Attribute, Attribute> WHEEL_ROT = ATTRIBUTES.register("wheel_rotation",
            () -> new RangedAttribute(
                    "attribute.kamenridercraftcore.wheel_rotation",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> BALL_ROT_OLD = ATTRIBUTES.register("ball_rotation_old",
            () -> new RangedAttribute(
                    "attribute.kamenridercraftcore.cape_rotation_old",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );


    public static final DeferredHolder<Attribute, Attribute> BALL_ROT = ATTRIBUTES.register("ball_rotation",
            () -> new RangedAttribute(
                    "attribute.kamenridercraftcore.ball_rotation",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> IS_TRANSFORMING_OLD = ATTRIBUTES.register("is_transforming_old",
            () -> new RangedAttribute(
                    "attribute.kamenridercraftcore.is_transforming",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> IS_TRANSFORMING = ATTRIBUTES.register("is_transforming",
            () -> new RangedAttribute(
                    "attribute.supersentaicraft.is_transforming",
                    0,
                    0,
                    30
            ).setSyncable(true)
    );



    public static final DeferredHolder<Attribute, Attribute> CLIMBING = ATTRIBUTES.register("climbing",
            () -> new RangedAttribute(
                    "attribute.supersentaicraft.climbing",
                    0,
                    0,
                    255
            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> PLAYER_SIZE_X = ATTRIBUTES.register("player_size_x",
            () -> new RangedAttribute(
                    "attribute.supersentaicraft.player_size",
                    1,
                    0,
                    255
            ).setSyncable(true)
    );
    public static final DeferredHolder<Attribute, Attribute> PLAYER_SIZE_Y = ATTRIBUTES.register("player_size_y",
            () -> new RangedAttribute(
                    "attribute.supersentaicraft.player_size",
                    1,
                    0,
                    255
            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> PLAYER_SIZE_Z = ATTRIBUTES.register("player_size_z",
            () -> new RangedAttribute(
                    "attribute.supersentaicraft.player_size",
                    1,
                    0,
                    255
            ).setSyncable(true)
    );



    public static final DeferredHolder<Attribute, Attribute> ABILITY_METER = ATTRIBUTES.register("ability_meter",
            () -> new RangedAttribute(
                    "attribute.supersentaicraft.ability_meter",
                    0,
                    0,
                    300
            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> USING_ABILITY = ATTRIBUTES.register("using_ability",
            () -> new BooleanAttribute(
                    "attribute.supersentaicraft.using_ability",
                    false

            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> IS_TRANSFORMED = ATTRIBUTES.register("is_transformed",
            () -> new BooleanAttribute(
                    "attribute.supersentaicraft.is_transformed",
                    false

            ).setSyncable(true)
    );

    public static final DeferredHolder<Attribute, Attribute> POSING = ATTRIBUTES.register("posing",
            () -> new BooleanAttribute(
                    "attribute.supersentaicraft.posing",
                    false

            ).setSyncable(true)
    );


    public static final DeferredHolder<Attribute, Attribute> POSE_COOLDOWN = ATTRIBUTES.register("pose_cooldown",
            () -> new RangedAttribute(
                    "attribute.supersentaicraft.pose_cooldown",
                    0,
                    0,
                    9999
            ).setSyncable(true)
    );


   @SubscribeEvent
    public static void modifyEntityAttributes(EntityAttributeModificationEvent eMod) {
           eMod.getTypes().forEach(entity -> ATTRIBUTES.getEntries().forEach(attribute -> eMod.add(entity, attribute)));
          // eMod.getTypes().forEach(entity -> eMod.add(entity, HEAD_SIZE));
       }

//    @SubscribeEvent
//    public static void addAttributes(EntityAttributeModificationEvent event) {
//        event.add(EntityType.PLAYER, POSING);
//        event.add(EntityType.PLAYER, POSE_COOLDOWN);
//        event.add(EntityType.PLAYER, HAZARD_LEVEL);
//    }

}
