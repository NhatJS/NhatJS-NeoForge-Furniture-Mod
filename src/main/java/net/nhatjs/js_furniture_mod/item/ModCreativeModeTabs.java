package net.nhatjs.js_furniture_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NhatJSFurnitureMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> JS_FURNITURE_MOD_TABS = CREATIVE_MODE_TAB.register("js_furniture_logo",
            () -> CreativeModeTab.builder().title(Component.translatable("itemgroup.js_furniture_mod.js_furniture_tab"))
                            .icon(() -> new ItemStack(ModBlocks.BLACK_TABLE.get()))
                                    .displayItems((parameters, output) -> {
                                        output.accept(ModBlocks.WOOD_CHAIR.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_CHAIR.get()); //1.0.4 update
                                        output.accept(ModBlocks.WHITE_CHAIR.get());
                                        output.accept(ModBlocks.MODERN_CHAIR.get());
                                        output.accept(ModBlocks.SOFA.get());
                                        output.accept(ModBlocks.BLACK_SOFA.get());
                                        output.accept(ModBlocks.WOOD_LIGHT_TABLE.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_TABLE.get()); //1.0.4 update
                                        output.accept(ModBlocks.BLACK_TABLE.get());
                                        output.accept(ModBlocks.WHITE_TABLE.get());
                                        output.accept(ModBlocks.WOOD_COFFEE_TABLE.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get()); //1.0.4 update
                                        output.accept(ModBlocks.WHITE_COFFEE_TABLE.get());
                                        output.accept(ModBlocks.WOOD_DESK.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_DESK.get()); //1.0.4 update
                                        output.accept(ModBlocks.WHITE_DESK.get());
                                        output.accept(ModBlocks.WOOD_STANDING_DESK.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_STANDING_DESK_B.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get()); //1.0.4 update
                                        output.accept(ModBlocks.BLACK_STANDING_DESK.get());
                                        output.accept(ModBlocks.BLACK_STANDING_DESK_B.get());
                                        output.accept(ModBlocks.WHITE_STANDING_DESK.get());
                                        output.accept(ModBlocks.WHITE_STANDING_DESK_B.get());
                                        output.accept(ModBlocks.WOOD_3_DRAWER_DRESSER.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get()); //1.0.4 update
                                        output.accept(ModBlocks.WHITE_3_DRAWER_DRESSER.get());
                                        output.accept(ModBlocks.WOOD_LIGHT_TV_STAND.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_TV_STAND.get()); //1.0.4 update
                                        output.accept(ModBlocks.WHITE_TV_STAND.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get());
                                        output.accept(ModBlocks.KITCHEN_DRAWERS.get());
                                        output.accept(ModBlocks.KITCHEN_DRAWERS_B.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_TOP.get());
                                        output.accept(ModBlocks.KITCHEN_CABINET_TOP_B.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get()); //1.0.4 update
                                        output.accept(ModBlocks.WOOD_STRIPED_WALL.get());
                                        output.accept(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get()); //1.0.4 update
                                        output.accept(ModBlocks.BLACK_MIRROR.get());
                                        output.accept(ModBlocks.VERTICAL_BLINDS.get());
                                        output.accept(ModBlocks.CEILING_FAN.get()); //1.0.2 update
                                        output.accept(ModBlocks.CEILING_FAN_B.get()); //1.0.4 update
                                        output.accept(ModBlocks.SOCKET.get());
                                        output.accept(ModBlocks.TV.get());
                                        output.accept(ModBlocks.FLOOR_STANDING_SPEAKER.get());
                                        output.accept(ModBlocks.MODERN_CLOCK.get());
                                        output.accept(ModBlocks.MODERN_LIGHT.get());
                                        output.accept(ModBlocks.LED_FLOOR_LAMP.get());
                                        output.accept(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get());
                                        output.accept(ModBlocks.LED_RGB_TRIANGLE_PANEL.get());
                                        output.accept(ModBlocks.STUDIO_LIGHT.get());
                                        output.accept(ModBlocks.BLACK_GAMING_CHAIR.get()); //1.0.2 update
                                        output.accept(ModBlocks.WHITE_GAMING_CHAIR.get()); //1.0.2 update
                                        output.accept(ModBlocks.MONITOR_SETUP.get());
                                        output.accept(ModBlocks.MONITOR.get());
                                        output.accept(ModBlocks.KEYBOARD.get());
                                        output.accept(ModBlocks.COMPUTER_MOUSE.get());
                                        output.accept(ModBlocks.PC.get());
                                        output.accept(ModBlocks.PC_TOWER_GLASS.get());
                                        output.accept(ModBlocks.LAPTOP.get());
                                        output.accept(ModBlocks.PORTABLE_LAPTOP_STAND.get());
                                        output.accept(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get());
                                        output.accept(ModBlocks.MIDI_KEYBOARD_CONTROLLER.get()); //1.0.4 update
                                        output.accept(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get());
                                        output.accept(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get());
                                        output.accept(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get());
                                        output.accept(ModBlocks.COOKTOP.get());
                                        output.accept(ModBlocks.FRIDGE_A.get());
                                        output.accept(ModBlocks.FRIDGE_B.get());
                                        output.accept(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get());
                                        output.accept(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get());
                                        output.accept(ModBlocks.SHOWER.get());
                                        output.accept(ModBlocks.TOILET.get()); //1.0.3 update
                                        output.accept(ModBlocks.WASHING_MACHINE_AI.get());
                                        output.accept(ModBlocks.PLANT_POT.get());
                                        output.accept(ModBlocks.BOOKS.get());
                                        output.accept(ModItems.REMOTE_CONTROL_RGB.get());
                                        output.accept(ModBlocks.COMPUTER_CASE.get()); //1.0.5 update
                                        output.accept(ModItems.CPU.get()); //1.0.5 update
                                        output.accept(ModItems.MAINBOARD.get()); //1.0.5 update
                                        output.accept(ModItems.RAM.get()); //1.0.5 update
                                        output.accept(ModItems.AIO_COOLER.get()); //1.0.5 update
                                        output.accept(ModItems.COMPUTER_FAN.get()); //1.0.5 update
                                        output.accept(ModItems.GPU.get()); //1.0.5 update
                                        output.accept(ModItems.PSU.get()); //1.0.5 update
                                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
