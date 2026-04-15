package net.nhatjs.js_furniture_mod.core;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.entity.SeatBlockEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, NhatJSFurnitureMod.MOD_ID);

    public static final Supplier<EntityType<SeatBlockEntity>> CHAIR =
            ENTITY_TYPES.register("chair_entity", () -> EntityType.Builder.of(SeatBlockEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.675f).build("chair_entity"));

    public static final Supplier<EntityType<SeatBlockEntity>> SOFA =
            ENTITY_TYPES.register("sofa_entity", () -> EntityType.Builder.of(SeatBlockEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.475f).build("sofa_entity"));

    public static final Supplier<EntityType<SeatBlockEntity>> GAMING_CHAIR =
            ENTITY_TYPES.register("gaming_chair_entity", () -> EntityType.Builder.of(SeatBlockEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.675f).build("gaming_chair_entity"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}