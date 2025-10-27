package net.nhatjs.js_furniture_mod.block.blockentity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.block.blockentity.client.CeilingFanBlockEntity;
import net.nhatjs.js_furniture_mod.block.blockentity.client.CoffeeTableBlockEntity;

import java.util.function.Supplier;


public final class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, NhatJSFurnitureMod.MOD_ID);

    //1.0.2 update
    public static final Supplier<BlockEntityType<CeilingFanBlockEntity>> CEILING_FAN = BLOCK_ENTITIES.register("ceiling_fan",
            () -> new BlockEntityType<>(CeilingFanBlockEntity::new, ModBlocks.CEILING_FAN.get()));

    public static final Supplier<BlockEntityType<CoffeeTableBlockEntity>> COFFEE_TABLE = BLOCK_ENTITIES.register("coffee_table",
            () -> new BlockEntityType<>(CoffeeTableBlockEntity::new, ModBlocks.WOOD_COFFEE_TABLE.get(), ModBlocks.WHITE_COFFEE_TABLE.get()));
    //end

    public static void registerModBlockEntities() {
        NhatJSFurnitureMod.LOGGER.info("Registering Mod Entities for " + NhatJSFurnitureMod.MOD_ID);
    }
}