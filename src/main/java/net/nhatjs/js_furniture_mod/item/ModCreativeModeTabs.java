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
                                        output.accept(ModBlocks.WOOD_CHAIR);
                                        output.accept(ModBlocks.MODERN_CHAIR);
                                        output.accept(ModBlocks.SOFA);
                                        output.accept(ModBlocks.WOOD_LIGHT_TABLE);
                                        output.accept(ModBlocks.BLACK_TABLE);
                                        output.accept(ModBlocks.WHITE_TABLE);
                                        output.accept(ModBlocks.WOOD_COFFEE_TABLE);
                                        output.accept(ModBlocks.WHITE_COFFEE_TABLE);
                                        output.accept(ModBlocks.WOOD_DESK);
                                        output.accept(ModBlocks.WHITE_DESK);
                                        output.accept(ModBlocks.WOOD_STANDING_DESK);
                                        output.accept(ModBlocks.WOOD_STANDING_DESK_B);
                                        output.accept(ModBlocks.BLACK_STANDING_DESK);
                                        output.accept(ModBlocks.BLACK_STANDING_DESK_B);
                                        output.accept(ModBlocks.WHITE_STANDING_DESK);
                                        output.accept(ModBlocks.WHITE_STANDING_DESK_B);
                                        output.accept(ModBlocks.WOOD_3_DRAWER_DRESSER);
                                        output.accept(ModBlocks.WHITE_3_DRAWER_DRESSER);
                                        output.accept(ModBlocks.WOOD_LIGHT_TV_STAND);
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM);
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK);
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_2);
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA);
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_B);
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK);
                                        output.accept(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2);
                                        output.accept(ModBlocks.KITCHEN_DRAWERS);
                                        output.accept(ModBlocks.KITCHEN_CABINET_TOP);
                                        output.accept(ModBlocks.KITCHEN_CABINET_TOP_B);
                                        output.accept(ModBlocks.WOOD_STRIPED_WALL);
                                        output.accept(ModBlocks.BLACK_MIRROR);
                                        output.accept(ModBlocks.SOCKET);
                                        output.accept(ModBlocks.MODERN_CLOCK);
                                        output.accept(ModBlocks.MODERN_LIGHT);
                                        output.accept(ModBlocks.LED_FLOOR_LAMP);
                                        output.accept(ModBlocks.LED_FLOOR_LAMP_RGB_OFF);
                                        output.accept(ModBlocks.STUDIO_LIGHT);
                                        output.accept(ModBlocks.MONITOR_SETUP);
                                        output.accept(ModBlocks.MONITOR);
                                        output.accept(ModBlocks.KEYBOARD);
                                        output.accept(ModBlocks.COMPUTER_MOUSE);
                                        output.accept(ModBlocks.PC);
                                        output.accept(ModBlocks.PC_TOWER_GLASS);
                                        output.accept(ModBlocks.LAPTOP);
                                        output.accept(ModBlocks.PORTABLE_LAPTOP_STAND);
                                        output.accept(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND);
                                        output.accept(ModBlocks.MIDI_STANDALONE_GROOVEBOX);
                                        output.accept(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2);
                                        output.accept(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3);
                                        output.accept(ModBlocks.COOKTOP);
                                        output.accept(ModBlocks.FRIDGE_A);
                                        output.accept(ModBlocks.FRIDGE_B);
                                        output.accept(ModBlocks.MODERN_BATHROOM_SINK_STORAGE);
                                        output.accept(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF);
                                        output.accept(ModBlocks.SHOWER);
                                        output.accept(ModBlocks.WASHING_MACHINE_AI);
                                        output.accept(ModBlocks.PLANT_POT);
                                        output.accept(ModItems.REMOTE_CONTROL_RGB);
                                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
