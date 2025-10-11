package net.nhatjs.js_furniture_mod;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.entity.ModEntities;
import net.nhatjs.js_furniture_mod.entity.client.renderer.ChairRenderer;

public class NhatJSFurnitureModClient {
    public static void init(IEventBus eventBus) {
        eventBus.addListener(NhatJSFurnitureModClient::onClientSetup);
    }

    private static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_CHAIR.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CHAIR.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOFA.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TABLE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_TABLE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TABLE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_COFFEE_TABLE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_COFFEE_TABLE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_DESK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_DESK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STANDING_DESK_B.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STANDING_DESK_B.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STANDING_DESK_B.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_3_DRAWER_DRESSER.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_3_DRAWER_DRESSER.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_LIGHT_TV_STAND.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_DRAWERS.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KITCHEN_CABINET_TOP_B.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOOD_STRIPED_WALL.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_MIRROR.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOCKET.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_CLOCK.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_LIGHT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STUDIO_LIGHT.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR_SETUP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MONITOR.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KEYBOARD.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMPUTER_MOUSE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_RGB1_OFF.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PORTABLE_LAPTOP_STAND.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKTOP.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_A.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIDGE_B.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHOWER.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WASHING_MACHINE_AI.get(), RenderType.CUTOUT_MIPPED);
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLANT_POT.get(), RenderType.CUTOUT_MIPPED);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PC_TOWER_GLASS.get(), RenderType.TRANSLUCENT);

            EntityRenderers.register(ModEntities.CHAIR.get(), ChairRenderer::new);
            EntityRenderers.register(ModEntities.SOFA.get(), ChairRenderer::new);
        });
    }
}
