package net.nhatjs.js_furniture_mod.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.entity.client.SeatBlockEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, NhatJSFurnitureMod.MOD_ID);

    public static ResourceKey<EntityType<?>> CHAIR_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.withDefaultNamespace("chair_entity"));

    public static final Supplier<EntityType<SeatBlockEntity>> CHAIR =
            ENTITY_TYPES.register("chair_entity", () -> EntityType.Builder.of(SeatBlockEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.675f).build(CHAIR_KEY));

    public static final Supplier<EntityType<SeatBlockEntity>> SOFA =
            ENTITY_TYPES.register("sofa_entity", () -> EntityType.Builder.of(SeatBlockEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.475f).build(CHAIR_KEY));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}