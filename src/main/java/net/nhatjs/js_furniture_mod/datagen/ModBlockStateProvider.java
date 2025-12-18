package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NhatJSFurnitureMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        horizontalBlock(ModBlocks.BLACK_GAMING_CHAIR.get(), modLoc("block/black_gaming_chair"));
        horizontalBlock(ModBlocks.BLACK_MIRROR.get(), modLoc("block/black_mirror"));
        horizontalBlock(ModBlocks.BLACK_STANDING_DESK.get(), modLoc("block/black_standing_desk"));
        horizontalBlock(ModBlocks.BLACK_STANDING_DESK_B.get(), modLoc("block/black_standing_desk_b"));
        horizontalBlock(ModBlocks.BLACK_TABLE.get(), modLoc("block/black_table"));
        horizontalBlock(ModBlocks.BOOKS.get(), modLoc("block/books"));
        horizontalBlock(ModBlocks.COMPUTER_CASE.get(), modLoc("block/computer_case"));
        horizontalBlock(ModBlocks.COMPUTER_MOUSE.get(), modLoc("block/computer_mouse"));
        horizontalBlock(ModBlocks.COOKTOP.get(), modLoc("block/cooktop"));
        horizontalBlock(ModBlocks.FLOOR_STANDING_SPEAKER.get(), modLoc("block/floor_standing_speaker"));
        horizontalBlock(ModBlocks.FRIDGE_A.get(), modLoc("block/fridge_a"));
        horizontalBlock(ModBlocks.FRIDGE_B.get(), modLoc("block/fridge_b"));
        horizontalBlock(ModBlocks.KEYBOARD.get(), modLoc("block/keyboard"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM.get(), modLoc("block/light_wood_kitchen_cabinet_bottom"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), modLoc("block/light_wood_kitchen_cabinet_bottom_2"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), modLoc("block/light_wood_kitchen_cabinet_bottom_2_extra"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), modLoc("block/light_wood_kitchen_cabinet_bottom_b"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), modLoc("block/light_wood_kitchen_cabinet_bottom_b_2"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), modLoc("block/light_wood_kitchen_cabinet_bottom_b_with_sink"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), modLoc("block/light_wood_kitchen_cabinet_bottom_with_sink"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_TOP.get(), modLoc("block/light_wood_kitchen_cabinet_top"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_TOP_B.get(), modLoc("block/light_wood_kitchen_cabinet_top_b"));
        horizontalBlock(ModBlocks.KITCHEN_DRAWERS.get(), modLoc("block/light_wood_kitchen_drawers"));
        horizontalBlock(ModBlocks.KITCHEN_DRAWERS_B.get(), modLoc("block/light_wood_kitchen_drawers_b"));
        horizontalBlock(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get(), modLoc("block/modern_bathroom_mirror_shelf"));
        horizontalBlock(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get(), modLoc("block/modern_bathroom_sink_storage"));
        horizontalBlock(ModBlocks.MODERN_CHAIR.get(), modLoc("block/modern_chair"));
        horizontalBlock(ModBlocks.MODERN_CLOCK.get(), modLoc("block/modern_clock"));
        horizontalBlock(ModBlocks.MONITOR.get(), modLoc("block/monitor"));
        horizontalBlock(ModBlocks.PC_ADDED_1.get(), modLoc("block/pc_added_1"));
        horizontalBlock(ModBlocks.PC_ADDED_2.get(), modLoc("block/pc_added_2"));
        horizontalBlock(ModBlocks.PC_ADDED_3.get(), modLoc("block/pc_added_3"));
        horizontalBlock(ModBlocks.PC_ADDED_4.get(), modLoc("block/pc_added_4"));
        horizontalBlock(ModBlocks.PC_ADDED_5.get(), modLoc("block/pc_added_5"));
        horizontalBlock(ModBlocks.PC_ADDED_6.get(), modLoc("block/pc_added_6"));
        horizontalBlock(ModBlocks.PC_ADDED_7.get(), modLoc("block/pc_added_7"));
        horizontalBlock(ModBlocks.PC_ADDED_8.get(), modLoc("block/pc_added_8"));
        horizontalBlock(ModBlocks.PC_ADDED_9.get(), modLoc("block/pc_added_9"));
        horizontalBlock(ModBlocks.PC_ADDED_10.get(), modLoc("block/pc_added_10"));
        horizontalBlock(ModBlocks.PC_ADDED_11.get(), modLoc("block/pc_added_11"));
        horizontalBlock(ModBlocks.PC_TOWER_GLASS.get(), modLoc("block/pc_tower_glass"));
        horizontalBlock(ModBlocks.PLANT_POT.get(), modLoc("block/plant_pot"));
        horizontalBlock(ModBlocks.PORTABLE_LAPTOP_STAND.get(), modLoc("block/portable_laptop_stand"));
        horizontalBlock(ModBlocks.SHOWER.get(), modLoc("block/shower"));
        facingBlock(ModBlocks.SOCKET.get(), modLoc("block/socket"));
        horizontalBlock(ModBlocks.TOILET.get(), modLoc("block/toilet"));
        horizontalBlock(ModBlocks.WHITE_3_DRAWER_DRESSER.get(), modLoc("block/white_3_drawer_dresser"));
        horizontalBlock(ModBlocks.WHITE_CHAIR.get(), modLoc("block/white_chair"));
        horizontalBlock(ModBlocks.WHITE_COFFEE_TABLE.get(), modLoc("block/white_coffee_table"));
        horizontalBlock(ModBlocks.WHITE_DESK.get(), modLoc("block/white_desk"));
        horizontalBlock(ModBlocks.WHITE_GAMING_CHAIR.get(), modLoc("block/white_gaming_chair"));
        horizontalBlock(ModBlocks.WHITE_STANDING_DESK.get(), modLoc("block/white_standing_desk"));
        horizontalBlock(ModBlocks.WHITE_STANDING_DESK_B.get(), modLoc("block/white_standing_desk_b"));
        horizontalBlock(ModBlocks.WHITE_TABLE.get(), modLoc("block/white_table"));
        horizontalBlock(ModBlocks.WHITE_TV_STAND.get(), modLoc("block/tv_stand_2"));
        horizontalBlock(ModBlocks.WOOD_3_DRAWER_DRESSER.get(), modLoc("block/light_wood_3_drawer_dresser"));
        horizontalBlock(ModBlocks.WOOD_CHAIR.get(), modLoc("block/light_wood_chair"));
        horizontalBlock(ModBlocks.WOOD_COFFEE_TABLE.get(), modLoc("block/light_wood_coffee_table"));
        horizontalBlock(ModBlocks.WOOD_DESK.get(), modLoc("block/light_wood_desk"));
        horizontalBlock(ModBlocks.WOOD_LIGHT_TABLE.get(), modLoc("block/light_wood_table"));
        horizontalBlock(ModBlocks.WOOD_LIGHT_TV_STAND.get(), modLoc("block/light_wood_tv_stand"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get(), modLoc("block/medium_wood_3_drawer_dresser"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_CHAIR.get(), modLoc("block/medium_wood_chair"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get(), modLoc("block/medium_wood_coffee_table"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_DESK.get(), modLoc("block/medium_wood_desk"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get(), modLoc("block/medium_wood_kitchen_cabinet_bottom"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get(), modLoc("block/medium_wood_kitchen_cabinet_bottom_2"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), modLoc("block/medium_wood_kitchen_cabinet_bottom_2_extra"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get(), modLoc("block/medium_wood_kitchen_cabinet_bottom_b"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get(), modLoc("block/medium_wood_kitchen_cabinet_bottom_b_2"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), modLoc("block/medium_wood_kitchen_cabinet_bottom_b_with_sink"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), modLoc("block/medium_wood_kitchen_cabinet_bottom_with_sink"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get(), modLoc("block/medium_wood_kitchen_cabinet_top"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get(), modLoc("block/medium_wood_kitchen_cabinet_top_b"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get(), modLoc("block/medium_wood_kitchen_drawers"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get(), modLoc("block/medium_wood_kitchen_drawers_b"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get(), modLoc("block/medium_wood_standing_desk"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get(), modLoc("block/medium_wood_standing_desk_b"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get(), modLoc("block/medium_wood_striped_wall"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_TABLE.get(), modLoc("block/medium_wood_table"));
        horizontalBlock(ModBlocks.WOOD_MEDIUM_TV_STAND.get(), modLoc("block/medium_wood_tv_stand"));
        horizontalBlock(ModBlocks.WOOD_STANDING_DESK.get(), modLoc("block/light_wood_standing_desk"));
        horizontalBlock(ModBlocks.WOOD_STANDING_DESK_B.get(), modLoc("block/light_wood_standing_desk_b"));
        horizontalBlock(ModBlocks.WOOD_STRIPED_WALL.get(), modLoc("block/light_wood_striped_wall"));
    }

    private void horizontalBlock(Block block, ResourceLocation resourceLocation) {
        getVariantBuilder(block).forAllStates(state -> {
            Direction direction = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotY = switch (direction) {
                default -> 0;
                case SOUTH -> 180;
                case EAST -> 90;
                case WEST -> 270;
            };
            return ConfiguredModel.builder().modelFile(models().getExistingFile(resourceLocation)).rotationY(rotY).build();
        });
    }

    private void facingBlock(Block block, ResourceLocation resourceLocation) {
        getVariantBuilder(block).forAllStates(state -> {
            Direction direction = state.getValue(BlockStateProperties.FACING);
            int rotX = 0;
            int rotY = 0;
            switch (direction) {
                case DOWN -> rotX = 180;
                case UP -> rotX = 0;
                case NORTH -> {
                    rotX = 90;
                    rotY = 180;
                }
                case SOUTH -> {
                    rotX = 90;
                    rotY = 0;
                }
                case WEST -> {
                    rotX = 90;
                    rotY = 90;
                }
                case EAST -> {
                    rotX = 90;
                    rotY = 270;
                }
            }

            return ConfiguredModel.builder()
                    .modelFile(models().getExistingFile(resourceLocation))
                    .rotationX(rotX)
                    .rotationY(rotY)
                    .build();
        });
    }
}
