package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.nhatjs.js_furniture_mod.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.WOOD_CHAIR.get());
        dropSelf(ModBlocks.WHITE_CHAIR.get());
        dropSelf(ModBlocks.MODERN_CHAIR.get());
        dropSelf(ModBlocks.SOFA.get());
        dropSelf(ModBlocks.WOOD_LIGHT_TABLE.get());
        dropSelf(ModBlocks.BLACK_TABLE.get());
        dropSelf(ModBlocks.WHITE_TABLE.get());
        dropSelf(ModBlocks.WOOD_COFFEE_TABLE.get());
        dropSelf(ModBlocks.WHITE_COFFEE_TABLE.get());
        dropSelf(ModBlocks.WOOD_DESK.get());
        dropSelf(ModBlocks.WHITE_DESK.get());
        dropSelf(ModBlocks.WOOD_STANDING_DESK.get());
        dropSelf(ModBlocks.WOOD_STANDING_DESK_B.get());
        dropSelf(ModBlocks.BLACK_STANDING_DESK.get());
        dropSelf(ModBlocks.BLACK_STANDING_DESK_B.get());
        dropSelf(ModBlocks.WHITE_STANDING_DESK.get());
        dropSelf(ModBlocks.WHITE_STANDING_DESK_B.get());
        dropSelf(ModBlocks.WOOD_3_DRAWER_DRESSER.get());
        dropSelf(ModBlocks.WHITE_3_DRAWER_DRESSER.get());
        dropSelf(ModBlocks.WOOD_LIGHT_TV_STAND.get());
        dropSelf(ModBlocks.WHITE_TV_STAND.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get());
        dropSelf(ModBlocks.KITCHEN_DRAWERS.get());
        dropSelf(ModBlocks.KITCHEN_DRAWERS_B.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_TOP.get());
        dropSelf(ModBlocks.KITCHEN_CABINET_TOP_B.get());
        dropSelf(ModBlocks.WOOD_STRIPED_WALL.get());
        dropSelf(ModBlocks.BLACK_MIRROR.get());
        dropSelf(ModBlocks.VERTICAL_BLINDS.get());
        dropSelf(ModBlocks.SOCKET.get());
        dropSelf(ModBlocks.TV.get());
        dropSelf(ModBlocks.FLOOR_STANDING_SPEAKER.get());
        dropSelf(ModBlocks.MODERN_CLOCK.get());
        dropSelf(ModBlocks.MODERN_LIGHT.get());
        dropSelf(ModBlocks.LED_FLOOR_LAMP.get());
        dropSelf(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get());
        dropSelf(ModBlocks.LED_RGB_TRIANGLE_PANEL.get());
        dropSelf(ModBlocks.STUDIO_LIGHT.get());
        dropSelf(ModBlocks.MONITOR_SETUP.get());
        dropSelf(ModBlocks.MONITOR.get());
        dropSelf(ModBlocks.KEYBOARD.get());
        dropSelf(ModBlocks.COMPUTER_MOUSE.get());
        dropSelf(ModBlocks.PC.get());
        dropSelf(ModBlocks.PC_RGB1_OFF.get());
        dropSelf(ModBlocks.LAPTOP.get());
        dropSelf(ModBlocks.PORTABLE_LAPTOP_STAND.get());
        dropSelf(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get());
        dropSelf(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get());
        dropSelf(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get());
        dropSelf(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get());
        dropSelf(ModBlocks.COOKTOP.get());
        dropSelf(ModBlocks.FRIDGE_A.get());
        dropSelf(ModBlocks.FRIDGE_B.get());
        dropSelf(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get());
        dropSelf(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get());
        dropSelf(ModBlocks.SHOWER.get());
        dropSelf(ModBlocks.WASHING_MACHINE_AI.get());
        dropSelf(ModBlocks.PLANT_POT.get());
        dropSelf(ModBlocks.BOOKS.get());

        dropSelf(ModBlocks.PC_TOWER_GLASS.get());


        //1.0.2 update
        dropSelf(ModBlocks.CEILING_FAN.get());
        dropSelf(ModBlocks.BLACK_GAMING_CHAIR.get());
        dropSelf(ModBlocks.WHITE_GAMING_CHAIR.get());
        //end

        //1.0.3 update
        dropSelf(ModBlocks.TOILET.get());
        //end

        //1.0.4 update
        dropSelf(ModBlocks.CEILING_FAN_B.get());
        dropSelf(ModBlocks.BLACK_SOFA.get());
        dropSelf(ModBlocks.MIDI_KEYBOARD_CONTROLLER.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_TV_STAND.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_CHAIR.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_DESK.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_TABLE.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get());
        dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get());
        //end
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
