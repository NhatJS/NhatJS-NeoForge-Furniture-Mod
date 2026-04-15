package net.nhatjs.js_furniture_mod.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.blockentity.*;

import java.util.function.Supplier;

public final class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, NhatJSFurnitureMod.MOD_ID);

    public static final Supplier<BlockEntityType<CeilingFanBlockEntity>> CEILING_FAN = BLOCK_ENTITIES.register("ceiling_fan", () ->
            BlockEntityType.Builder.of(CeilingFanBlockEntity::new,
                    ModBlocks.CEILING_FAN.get(),
                    ModBlocks.CEILING_FAN_B.get(),
                    ModBlocks.WOOD_LIGHT_CEILING_FAN_BLACK.get(),
                    ModBlocks.WOOD_MEDIUM_CEILING_FAN_BLACK.get(),
                    ModBlocks.BLACK_CEILING_FAN_BLACK.get(),
                    ModBlocks.WHITE_CEILING_FAN_BLACK.get(),
                    ModBlocks.WOOD_LIGHT_CEILING_FAN_WHITE.get(),
                    ModBlocks.WOOD_MEDIUM_CEILING_FAN_WHITE.get(),
                    ModBlocks.BLACK_CEILING_FAN_WHITE.get(),
                    ModBlocks.WHITE_CEILING_FAN_WHITE.get()).build(null));

    public static final Supplier<BlockEntityType<CoffeeTableBlockEntity>> COFFEE_TABLE = BLOCK_ENTITIES.register("coffee_table", () ->
            BlockEntityType.Builder.of(CoffeeTableBlockEntity::new,
                    ModBlocks.WOOD_COFFEE_TABLE.get(), //will be removed
                    ModBlocks.WOOD_LIGHT_COFFEE_TABLE.get(),
                    ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get(),
                    ModBlocks.BLACK_COFFEE_TABLE.get(),
                    ModBlocks.WHITE_COFFEE_TABLE.get()).build(null));

    public static final Supplier<BlockEntityType<WashingMachineBlockEntity>> WASHING_MACHINE = BLOCK_ENTITIES.register("washing_machine", () ->
            BlockEntityType.Builder.of(WashingMachineBlockEntity::new,
                    ModBlocks.WASHING_MACHINE_AI.get()).build(null));

    public static final Supplier<BlockEntityType<MirrorBlockEntity>> MIRROR = BLOCK_ENTITIES.register("mirror", () ->
            BlockEntityType.Builder.of(MirrorBlockEntity::new,
                    ModBlocks.BLACK_MIRROR.get()).build(null));

    public static final Supplier<BlockEntityType<DrawerBlockEntity>> DRAWER = BLOCK_ENTITIES.register("drawer", () ->
            BlockEntityType.Builder.of(DrawerBlockEntity::new,
                    ModBlocks.WOOD_3_DRAWER_DRESSER.get(), //will be removed
                    ModBlocks.WOOD_LIGHT_3_DRAWER_DRESSER.get(),
                    ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get(),
                    ModBlocks.BLACK_3_DRAWER_DRESSER.get(),
                    ModBlocks.WHITE_3_DRAWER_DRESSER.get()).build(null));

    public static final Supplier<BlockEntityType<LaptopBlockEntity>> LAPTOP = BLOCK_ENTITIES.register("laptop", () ->
            BlockEntityType.Builder.of(LaptopBlockEntity::new,
                    ModBlocks.LAPTOP.get(),
                    ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get()).build(null));

    public static final Supplier<BlockEntityType<MonitorBlockEntity>> MONITOR = BLOCK_ENTITIES.register("monitor", () ->
            BlockEntityType.Builder.of(MonitorBlockEntity::new,
                    ModBlocks.MONITOR.get(),
                    ModBlocks.MONITOR_SETUP.get()).build(null));

    public static final Supplier<BlockEntityType<LightBlockEntity>> LIGHT = BLOCK_ENTITIES.register("light", () ->
            BlockEntityType.Builder.of(LightBlockEntity::new,
                    ModBlocks.MODERN_LIGHT.get()).build(null));

    public static final Supplier<BlockEntityType<DesktopBlockEntity>> PC = BLOCK_ENTITIES.register("pc", () ->
            BlockEntityType.Builder.of(DesktopBlockEntity::new,
                    ModBlocks.PC.get(),
                    ModBlocks.PC_RGB1_OFF.get()).build(null));

    public static final Supplier<BlockEntityType<MIDIBlockEntity>> MIDI = BLOCK_ENTITIES.register("midi", () ->
            BlockEntityType.Builder.of(MIDIBlockEntity::new,
                    ModBlocks.MIDI_STANDALONE_GROOVEBOX.get(),
                    ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get(),
                    ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get(),
                    ModBlocks.MIDI_KEYBOARD_CONTROLLER.get()).build(null));

    public static final Supplier<BlockEntityType<LampBlockEntity>> LAMP = BLOCK_ENTITIES.register("lamp", () ->
            BlockEntityType.Builder.of(LampBlockEntity::new,
                    ModBlocks.LED_FLOOR_LAMP.get(),
                    ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get(),
                    ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2.get(),
                    ModBlocks.LED_RGB_TRIANGLE_PANEL.get(),
                    ModBlocks.STUDIO_LIGHT.get()).build(null));
}
