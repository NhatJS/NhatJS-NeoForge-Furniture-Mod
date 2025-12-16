package net.nhatjs.js_furniture_mod;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.block.model.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.Identifier;
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

    public static final Identifier CEILING_FAN_BLADES = Identifier.fromNamespaceAndPath(
            NhatJSFurnitureMod.MOD_ID, "block/ceiling_fan_blades");
    public static final Identifier CEILING_FAN_BLADES_B = Identifier.fromNamespaceAndPath(
            NhatJSFurnitureMod.MOD_ID, "block/ceiling_fan_blades_b");

    public static final StandaloneModelKey<BlockStateModel> CEILING_FAN_BLADES_ID = new StandaloneModelKey<BlockStateModel>(CEILING_FAN_BLADES::getPath);
    public static final StandaloneModelKey<BlockStateModel> CEILING_FAN_BLADES_B_ID = new StandaloneModelKey<BlockStateModel>(CEILING_FAN_BLADES_B::getPath);


    @SubscribeEvent
    @SuppressWarnings({"deprecated", "removal"})
    private static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_CHAIR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_CHAIR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CHAIR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TABLE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_TABLE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TABLE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_COFFEE_TABLE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_COFFEE_TABLE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_DESK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_DESK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_3_DRAWER_DRESSER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_3_DRAWER_DRESSER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TV_STAND.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TV_STAND.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_DRAWERS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_DRAWERS_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STRIPED_WALL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_MIRROR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VERTICAL_BLINDS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOCKET.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TV.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOOR_STANDING_SPEAKER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CLOCK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_LIGHT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_RGB_TRIANGLE_PANEL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STUDIO_LIGHT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_SETUP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_MOUSE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_RGB1_OFF.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PORTABLE_LAPTOP_STAND.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKTOP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_A.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHOWER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WASHING_MACHINE_AI.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLANT_POT.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BOOKS.get(), ChunkSectionLayer.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_TOWER_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

            EntityRenderers.register(ModEntities.CHAIR.get(), SeatRenderer::new);
            EntityRenderers.register(ModEntities.SOFA.get(), SeatRenderer::new);

            //1.0.2 update
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEILING_FAN.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_GAMING_CHAIR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_GAMING_CHAIR.get(), ChunkSectionLayer.CUTOUT);
            BlockEntityRenderers.register(ModBlockEntities.CEILING_FAN.get(), CeilingFanRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.COFFEE_TABLE.get(), CoffeeTableRenderer::new);
            //end

            //1.0.3 update
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOILET.get(), ChunkSectionLayer.CUTOUT);
            //end

            //1.0.4 update
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEILING_FAN_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_SOFA.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_KEYBOARD_CONTROLLER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_TV_STAND.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_CHAIR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_DESK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_TABLE.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get(), ChunkSectionLayer.CUTOUT);
            //end
        });
    }
}
