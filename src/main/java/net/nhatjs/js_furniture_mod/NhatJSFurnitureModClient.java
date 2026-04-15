package net.nhatjs.js_furniture_mod;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.nhatjs.js_furniture_mod.blockentity.renderer.*;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import net.nhatjs.js_furniture_mod.core.ModBlockEntities;
import net.nhatjs.js_furniture_mod.core.ModEntities;
import net.nhatjs.js_furniture_mod.entity.renderer.SeatRenderer;

public final class NhatJSFurnitureModClient {
    private NhatJSFurnitureModClient() {}

    public static void init(IEventBus eventBus) {
        eventBus.addListener(NhatJSFurnitureModClient::onClientSetup);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(NhatJSFurnitureMod.MOD_ID, path);
    }

    public static final ModelResourceLocation CEILING_FAN_BLADES = ModelResourceLocation.standalone(id("block/ceiling_fan_blades"));
    public static final ModelResourceLocation CEILING_FAN_BLADES_B = ModelResourceLocation.standalone(id("block/ceiling_fan_blades_b"));
    public static final ModelResourceLocation WASHING_MACHINE_AI_SCREEN = ModelResourceLocation.standalone(id("extra/washing_machine_ai_screen"));
    public static final ModelResourceLocation MIRROR_BLACK = ModelResourceLocation.standalone(id("extra/mirror_black"));
    public static final ModelResourceLocation WOOD_LIGHT_CEILING_FAN_BLADES_BLACK = ModelResourceLocation.standalone(id("block/wood_light_ceiling_fan_blades_black"));
    public static final ModelResourceLocation WOOD_MEDIUM_CEILING_FAN_BLADES_BLACK = ModelResourceLocation.standalone(id("extra/wood_medium_ceiling_fan_blades_black"));
    public static final ModelResourceLocation BLACK_CEILING_FAN_BLADES_BLACK = ModelResourceLocation.standalone(id("extra/black_ceiling_fan_blades_black"));
    public static final ModelResourceLocation WHITE_CEILING_FAN_BLADES_BLACK = ModelResourceLocation.standalone(id("extra/white_ceiling_fan_blades_black"));
    public static final ModelResourceLocation WOOD_LIGHT_CEILING_FAN_BLADES_WHITE = ModelResourceLocation.standalone(id("extra/wood_light_ceiling_fan_blades_white"));
    public static final ModelResourceLocation WOOD_MEDIUM_CEILING_FAN_BLADES_WHITE = ModelResourceLocation.standalone(id("extra/wood_medium_ceiling_fan_blades_white"));
    public static final ModelResourceLocation BLACK_CEILING_FAN_BLADES_WHITE = ModelResourceLocation.standalone(id("extra/black_ceiling_fan_blades_white"));
    public static final ModelResourceLocation WHITE_CEILING_FAN_BLADES_WHITE = ModelResourceLocation.standalone(id("extra/white_ceiling_fan_blades_white"));
    public static final ModelResourceLocation LAPTOP_OPENED_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/laptop_opened_on_emissive"));
    public static final ModelResourceLocation LAPTOP_OPENED_ON_PORTABLE_EMISSIVE = ModelResourceLocation.standalone(id("extra/laptop_opened_on_portable_emissive"));
    public static final ModelResourceLocation MONITOR_SETUP_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/monitor_setup_on_emissive"));
    public static final ModelResourceLocation MODERN_LIGHT_EMISSIVE = ModelResourceLocation.standalone(id("extra/modern_light_emissive"));
    public static final ModelResourceLocation PC_EMISSIVE = ModelResourceLocation.standalone(id("extra/pc_emissive"));
    public static final ModelResourceLocation PC_RGB1_EMISSIVE = ModelResourceLocation.standalone(id("extra/pc_rgb1_emissive"));
    public static final ModelResourceLocation MIDI_STANDALONE_GROOVEBOX_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/midi_standalone_groovebox_on_emissive"));
    public static final ModelResourceLocation MIDI_STANDALONE_GROOVEBOX_2_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/midi_standalone_groovebox_2_on_emissive"));
    public static final ModelResourceLocation MIDI_STANDALONE_GROOVEBOX_3_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/midi_standalone_groovebox_3_on_emissive"));
    public static final ModelResourceLocation MIDI_KEYBOARD_CONTROLLER_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/midi_keyboard_controller_on_emissive"));
    public static final ModelResourceLocation LED_FLOOR_LAMP_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/led_floor_lamp_on_emissive"));
    public static final ModelResourceLocation LED_FLOOR_LAMP_RGB_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/led_floor_lamp_rgb_on_emissive"));
    public static final ModelResourceLocation LED_FLOOR_LAMP_RGB_ON_2_EMISSIVE = ModelResourceLocation.standalone(id("extra/led_floor_lamp_rgb_on_2_emissive"));
    public static final ModelResourceLocation LED_RGB_TRIANGLE_PANEL_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/led_rgb_triangle_panel_on_emissive"));
    public static final ModelResourceLocation STUDIO_LIGHT_ON_EMISSIVE = ModelResourceLocation.standalone(id("extra/studio_light_on_emissive"));

    public static final ModelResourceLocation MONITOR_SCREEN_BACK_1 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_screen_back_1"));
    public static final ModelResourceLocation MONITOR_SCREEN_BACK_2 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_screen_back_2"));
    public static final ModelResourceLocation MONITOR_SCREEN_BACK_3 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_screen_back_3"));
    public static final ModelResourceLocation MONITOR_SCREEN_BACK_4 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_screen_back_4"));
    public static final ModelResourceLocation MONITOR_STAND_MAIN_CENTER = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_main_center"));
    public static final ModelResourceLocation MONITOR_STAND_MAIN_LEFT = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_main_left"));
    public static final ModelResourceLocation MONITOR_STAND_MAIN_RIGHT = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_main_right"));
    public static final ModelResourceLocation MONITOR_STAND_PART_1 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_1"));
    public static final ModelResourceLocation MONITOR_STAND_PART_2 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_2"));
    public static final ModelResourceLocation MONITOR_STAND_PART_3 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_3"));
    public static final ModelResourceLocation MONITOR_STAND_PART_4 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_4"));
    public static final ModelResourceLocation MONITOR_STAND_PART_5 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_5"));
    public static final ModelResourceLocation MONITOR_STAND_PART_6 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_6"));
    public static final ModelResourceLocation MONITOR_STAND_PART_7 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_7"));
    public static final ModelResourceLocation MONITOR_STAND_PART_8 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_8"));
    public static final ModelResourceLocation MONITOR_STAND_PART_9 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_stand_part_9"));
    public static final ModelResourceLocation MONITOR_ARM_PART_1 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_1"));
    public static final ModelResourceLocation MONITOR_ARM_PART_2 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_2"));
    public static final ModelResourceLocation MONITOR_ARM_PART_3 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_3"));
    public static final ModelResourceLocation MONITOR_ARM_PART_4A = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_4a"));
    public static final ModelResourceLocation MONITOR_ARM_PART_4B = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_4b"));
    public static final ModelResourceLocation MONITOR_ARM_PART_5A = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_5a"));
    public static final ModelResourceLocation MONITOR_ARM_PART_5B = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_5b"));
    public static final ModelResourceLocation MONITOR_ARM_PART_6A = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_6a"));
    public static final ModelResourceLocation MONITOR_ARM_PART_6B = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_6b"));
    public static final ModelResourceLocation MONITOR_ARM_PART_7A = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_7a"));
    public static final ModelResourceLocation MONITOR_ARM_PART_7B = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_7b"));
    public static final ModelResourceLocation MONITOR_ARM_PART_8 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_8"));
    public static final ModelResourceLocation MONITOR_ARM_PART_9 = ModelResourceLocation.standalone(id("extra/monitor_parts/monitor_arm_part_9"));

    @SubscribeEvent
    @SuppressWarnings({"deprecated", "removal"})
    private static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_CHAIR.get(), RenderType.cutoutMipped());
            RenderType cutout = RenderType.CUTOUT;

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_CHAIR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_CHAIR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CHAIR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_COFFEE_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_COFFEE_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_3_DRAWER_DRESSER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_3_DRAWER_DRESSER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TV_STAND.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TV_STAND.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_DRAWERS.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_DRAWERS_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_MIRROR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VERTICAL_BLINDS.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOCKET.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOOR_STANDING_SPEAKER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CLOCK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_LIGHT.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_RGB_TRIANGLE_PANEL.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STUDIO_LIGHT.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_SETUP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_MOUSE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_RGB1_OFF.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PORTABLE_LAPTOP_STAND.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKTOP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_A.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHOWER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WASHING_MACHINE_AI.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLANT_POT.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BOOKS.get(), cutout);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_TOWER_GLASS.get(), RenderType.TRANSLUCENT);

            EntityRenderers.register(ModEntities.CHAIR.get(), SeatRenderer::new);
            EntityRenderers.register(ModEntities.SOFA.get(), SeatRenderer::new);
            EntityRenderers.register(ModEntities.GAMING_CHAIR.get(), SeatRenderer::new);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_GAMING_CHAIR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_GAMING_CHAIR.get(), cutout);
            BlockEntityRenderers.register(ModBlockEntities.CEILING_FAN.get(), CeilingFanRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.COFFEE_TABLE.get(), CoffeeTableRenderer::new);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOILET.get(), cutout);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_SOFA.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_KEYBOARD_CONTROLLER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_TV_STAND.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_CHAIR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get(), cutout);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_CASE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_1.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_3.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_4.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_5.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_6.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_7.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_8.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_9.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_10.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_ADDED_11.get(), cutout);

            BlockEntityRenderers.register(ModBlockEntities.WASHING_MACHINE.get(), WashingMachineRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.MIRROR.get(), MirrorRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.LAPTOP.get(), LaptopRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.MONITOR.get(), MonitorRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.MONITOR.get(), MonitorSetupRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.LIGHT.get(), ModernLightRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.PC.get(), DesktopRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.MIDI.get(), MIDIRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.LAMP.get(), LampRenderer::new);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_CHAIR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_COFFEE_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_3_DRAWER_DRESSER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_DRAWER_SINGLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_DRAWER_SINGLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_DRAWER_SINGLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_DRAWER_SINGLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_DESK_COLUMN.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_DESK_COLUMN.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_VERTICAL_BLINDS.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_CEILING_FAN_BLACK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_CEILING_FAN_BLACK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_CEILING_FAN_BLACK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_CEILING_FAN_BLACK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_CEILING_FAN_WHITE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_CEILING_FAN_WHITE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_CEILING_FAN_WHITE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_CEILING_FAN_WHITE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_SOFA.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_COMPARTMENT_STORAGE_CABINET.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_COMPARTMENT_STORAGE_CABINET.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_COMPARTMENT_STORAGE_CABINET.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_COMPARTMENT_STORAGE_CABINET.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_VERTICAL_BLINDS.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_3_DRAWER_DRESSER.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_CHAIR.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_COFFEE_TABLE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_STANDING_DESK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_STANDING_DESK_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_2.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_DRAWERS.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_DRAWERS_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_TOP.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_TOP_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_COMPUTER_MOUSE.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_KEYBOARD.get(), cutout);

            //unused from now
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEILING_FAN.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEILING_FAN_B.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STRIPED_WALL.get(), cutout);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get(), cutout);
        });
    }
}
