package net.nhatjs.js_furniture_mod;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.model.standalone.StandaloneModelKey;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.blockentity.ModBlockEntities;
import net.nhatjs.js_furniture_mod.blockentity.renderer.CeilingFanRenderer;
import net.nhatjs.js_furniture_mod.blockentity.renderer.CoffeeTableRenderer;
import net.nhatjs.js_furniture_mod.entity.ModEntities;
import net.nhatjs.js_furniture_mod.entity.renderer.SeatRenderer;

public final class NhatJSFurnitureModClient {
    public static void init(IEventBus eventBus) {
        eventBus.addListener(NhatJSFurnitureModClient::onClientSetup);
    }

    public static final ResourceLocation CEILING_FAN_BLADES = ResourceLocation.fromNamespaceAndPath(
            NhatJSFurnitureMod.MOD_ID, "block/ceiling_fan_blades");
    public static final ResourceLocation CEILING_FAN_BLADES_B = ResourceLocation.fromNamespaceAndPath(
            NhatJSFurnitureMod.MOD_ID, "block/ceiling_fan_blades_b");

    public static final StandaloneModelKey<BlockStateModel> CEILING_FAN_BLADES_ID = new StandaloneModelKey<BlockStateModel>(CEILING_FAN_BLADES);
    public static final StandaloneModelKey<BlockStateModel> CEILING_FAN_BLADES_B_ID = new StandaloneModelKey<BlockStateModel>(CEILING_FAN_BLADES_B);


    @SubscribeEvent
    @SuppressWarnings({"deprecated", "removal"})
    private static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_CHAIR.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_CHAIR.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CHAIR.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TABLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_TABLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TABLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_COFFEE_TABLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_COFFEE_TABLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_DESK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_DESK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_3_DRAWER_DRESSER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_3_DRAWER_DRESSER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TV_STAND.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TV_STAND.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_DRAWERS.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_DRAWERS_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STRIPED_WALL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_MIRROR.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VERTICAL_BLINDS.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOCKET.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOOR_STANDING_SPEAKER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CLOCK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_LIGHT.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_RGB_TRIANGLE_PANEL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STUDIO_LIGHT.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_SETUP.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_MOUSE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_RGB1_OFF.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PORTABLE_LAPTOP_STAND.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKTOP.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_A.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHOWER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WASHING_MACHINE_AI.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLANT_POT.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BOOKS.get(), RenderType.cutoutMipped());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_TOWER_GLASS.get(), RenderType.TRANSLUCENT);

            EntityRenderers.register(ModEntities.CHAIR.get(), SeatRenderer::new);
            EntityRenderers.register(ModEntities.SOFA.get(), SeatRenderer::new);

            //1.0.2 update
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEILING_FAN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_GAMING_CHAIR.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_GAMING_CHAIR.get(), RenderType.cutoutMipped());
            BlockEntityRenderers.register(ModBlockEntities.CEILING_FAN.get(), CeilingFanRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.COFFEE_TABLE.get(), CoffeeTableRenderer::new);
            //end

            //1.0.3 update
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOILET.get(), RenderType.cutoutMipped());
            //end

            //1.0.4 update
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEILING_FAN_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_SOFA.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_KEYBOARD_CONTROLLER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_TV_STAND.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_CHAIR.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_DESK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_TABLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get(), RenderType.cutoutMipped());
            //end
        });
    }
}
