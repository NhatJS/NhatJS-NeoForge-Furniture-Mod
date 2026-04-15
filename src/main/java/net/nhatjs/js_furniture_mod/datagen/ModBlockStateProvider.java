package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.block.*;
import net.nhatjs.js_furniture_mod.core.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NhatJSFurnitureMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        horizontalBlockWithItem(ModBlocks.BLACK_COMPARTMENT_STORAGE_CABINET.get());
        horizontalBlockWithItem(ModBlocks.BLACK_COMPUTER_MOUSE.get());
        horizontalBlockWithItem(ModBlocks.BLACK_3_DRAWER_DRESSER.get());
        horizontalBlockWithItem(ModBlocks.BLACK_CHAIR.get());
        simpleBlock(ModBlocks.BLACK_CEILING_FAN_BLACK.get(), models().getExistingFile(modLoc("block/ceiling_fan_base_black")));
        simpleBlock(ModBlocks.BLACK_CEILING_FAN_WHITE.get(), models().getExistingFile(modLoc("block/ceiling_fan_base_white")));
        horizontalBlockWithItem(ModBlocks.BLACK_COFFEE_TABLE.get());
        horizontalBlockWithItem(ModBlocks.BLACK_DESK.get());
        horizontalBlockWithItem(ModBlocks.BLACK_DESK_COLUMN.get());
        horizontalBlockWithItem(ModBlocks.BLACK_DRAWER_SINGLE.get());
        horizontalBlockWithItem(ModBlocks.BLACK_GAMING_CHAIR.get());
        horizontalBlockWithItem(ModBlocks.BLACK_KEYBOARD.get());
        horizontalBlockWithoutItem(ModBlocks.BLACK_MIRROR.get());
        horizontalBlockWithItem(ModBlocks.BLACK_STANDING_DESK.get());
        horizontalBlockWithItem(ModBlocks.BLACK_STANDING_DESK_B.get());
        horizontalBlockWithItem(ModBlocks.BLACK_TABLE.get());
        horizontalBlockWithItem(ModBlocks.BLACK_TV_STAND.get());

        horizontalBlockWithBoolean(ModBlocks.BLACK_VERTICAL_BLINDS.get(), VerticalBlindsBlock.TURN_ON,
                models().getExistingFile(modLoc("black_vertical_blinds")),
                models().getExistingFile(modLoc("black_vertical_blinds_open")));

        horizontalBlockWithItem(ModBlocks.BOOKS.get());
        horizontalBlockWithItem(ModBlocks.COMPUTER_CASE.get());
        horizontalBlockWithItem(ModBlocks.COMPUTER_MOUSE.get());
        horizontalBlockWithItem(ModBlocks.COOKTOP.get());
        horizontalBlockWithItem(ModBlocks.FLOOR_STANDING_SPEAKER.get());
        horizontalBlockWithItem(ModBlocks.FRIDGE_A.get());
        horizontalBlockWithItem(ModBlocks.FRIDGE_B.get());
        horizontalBlockWithItem(ModBlocks.KEYBOARD.get());
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM.get(), modLoc("wood_light_kitchen_cabinet_bottom"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), modLoc("wood_light_kitchen_cabinet_bottom_2"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), modLoc("wood_light_kitchen_cabinet_bottom_2_extra"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), modLoc("wood_light_kitchen_cabinet_bottom_b"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), modLoc("wood_light_kitchen_cabinet_bottom_b_2"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), modLoc("wood_light_kitchen_cabinet_bottom_b_with_sink"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), modLoc("wood_light_kitchen_cabinet_bottom_with_sink"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_TOP.get(), modLoc("wood_light_kitchen_cabinet_top"));
        horizontalBlock(ModBlocks.KITCHEN_CABINET_TOP_B.get(), modLoc("wood_light_kitchen_cabinet_top_b"));
        horizontalBlock(ModBlocks.KITCHEN_DRAWERS.get(), modLoc("wood_light_kitchen_drawers"));
        horizontalBlock(ModBlocks.KITCHEN_DRAWERS_B.get(), modLoc("wood_light_kitchen_drawers_b"));

        horizontalBlockWithBoolean(ModBlocks.LED_FLOOR_LAMP.get(), LEDFloorLampBlock.TURN_ON,
                models().getExistingFile(modLoc("led_floor_lamp")), models().getExistingFile(modLoc("led_floor_lamp_on")));
        horizontalBlockWithBoolean(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get(), LEDFloorLampRGBBlock.TURN_ON,
                models().getExistingFile(modLoc("led_floor_lamp_rgb_off")), models().getExistingFile(modLoc("led_floor_lamp_rgb_on")));
        horizontalBlockWithBoolean(ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2.get(), LEDFloorLampRGBAltBlock.TURN_ON,
                models().getExistingFile(modLoc("led_floor_lamp_rgb_off_2")), models().getExistingFile(modLoc("led_floor_lamp_rgb_on_2")));
        horizontalBlockWithBoolean(ModBlocks.LED_RGB_TRIANGLE_PANEL.get(), LEDRGBTrianglePanelBlock.TURN_ON,
                models().getExistingFile(modLoc("led_rgb_triangle_panel")), models().getExistingFile(modLoc("led_rgb_triangle_panel_on")));
        horizontalBlockWithBoolean(ModBlocks.MIDI_KEYBOARD_CONTROLLER.get(), MIDIKeyboardBlock.TURN_ON,
                models().getExistingFile(modLoc("midi_keyboard_controller")), models().getExistingFile(modLoc("midi_keyboard_controller_on")));
        horizontalBlockWithBoolean(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get(), GrooveboxBlock.TURN_ON,
                models().getExistingFile(modLoc("midi_standalone_groovebox")), models().getExistingFile(modLoc("midi_standalone_groovebox_on")));
        horizontalBlockWithBoolean(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get(), Groovebox2Block.TURN_ON,
                models().getExistingFile(modLoc("midi_standalone_groovebox_2")), models().getExistingFile(modLoc("midi_standalone_groovebox_2_on")));
        horizontalBlockWithBoolean(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get(), Groovebox3Block.TURN_ON,
                models().getExistingFile(modLoc("midi_standalone_groovebox_3")), models().getExistingFile(modLoc("midi_standalone_groovebox_3_on")));

        horizontalBlockWithItem(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get());
        horizontalBlockWithItem(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get());
        horizontalBlockWithItem(ModBlocks.MODERN_CHAIR.get());
        horizontalBlockWithItem(ModBlocks.MODERN_CLOCK.get());

        directionalBlockWithBoolean(ModBlocks.MODERN_LIGHT.get(), ModernLightBlock.TURN_ON,
                models().getExistingFile(modLoc("modern_light")), models().getExistingFile(modLoc("modern_light_on")));

        horizontalBlockWithItem(ModBlocks.MONITOR.get());

        horizontalBlockWithBoolean(ModBlocks.MONITOR_SETUP.get(), MonitorSetupBlock.TURN_ON,
                models().getExistingFile(modLoc("monitor_setup")), models().getExistingFile(modLoc("monitor_setup_on")));
        horizontalBlockWithBoolean(ModBlocks.PC.get(), DesktopBlock.TURN_ON,
                models().getExistingFile(modLoc("pc")), models().getExistingFile(modLoc("pc_on")));
        horizontalBlockWithBoolean(ModBlocks.PC_RGB1_OFF.get(), DesktopAltBlock.TURN_ON,
                models().getExistingFile(modLoc("pc_rgb1_off")), models().getExistingFile(modLoc("pc_rgb1_on")));

        horizontalBlockWithItem(ModBlocks.PC_ADDED_1.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_2.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_3.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_4.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_5.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_6.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_7.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_8.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_9.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_10.get());
        horizontalBlockWithItem(ModBlocks.PC_ADDED_11.get());
        horizontalBlockWithItem(ModBlocks.PC_TOWER_GLASS.get());
        horizontalBlockWithItem(ModBlocks.PLANT_POT.get());
        horizontalBlockWithItem(ModBlocks.PORTABLE_LAPTOP_STAND.get());
        horizontalBlockWithItem(ModBlocks.SHOWER.get());
        directionalBlockWithItem(ModBlocks.SOCKET.get());

        horizontalBlockWithBoolean(ModBlocks.STUDIO_LIGHT.get(), StudioLightBlock.TURN_ON,
                models().getExistingFile(modLoc("studio_light")), models().getExistingFile(modLoc("studio_light_on")));
        horizontalBlockWithBoolean(ModBlocks.TOILET.get(), ToiletBlock.OPEN,
                models().getExistingFile(modLoc("toilet")), models().getExistingFile(modLoc("toilet_open")));
        registerTVStates(ModBlocks.TV.get(), TVBlock.MOUNT,
                models().getExistingFile(modLoc("tv")), models().getExistingFile(modLoc("tv_wall_mount")));
        horizontalBlockWithBoolean(ModBlocks.VERTICAL_BLINDS.get(), VerticalBlindsBlock.TURN_ON,
                models().getExistingFile(modLoc("white_vertical_blinds")), models().getExistingFile(modLoc("white_vertical_blinds_open")));
        horizontalBlockWithBoolean(ModBlocks.WASHING_MACHINE_AI.get(), WashingMachineBlock.TURN_ON,
                models().getExistingFile(modLoc("washing_machine_ai")), models().getExistingFile(modLoc("washing_machine_ai_open")));

        horizontalBlockWithItem(ModBlocks.WHITE_COMPARTMENT_STORAGE_CABINET.get());
        horizontalBlockWithItem(ModBlocks.WHITE_3_DRAWER_DRESSER.get());
        horizontalBlockWithItem(ModBlocks.WHITE_CHAIR.get());
        simpleBlock(ModBlocks.WHITE_CEILING_FAN_BLACK.get(), models().getExistingFile(modLoc("block/white_ceiling_fan_black")));
        simpleBlock(ModBlocks.WHITE_CEILING_FAN_WHITE.get(), models().getExistingFile(modLoc("block/white_ceiling_fan_white")));
        horizontalBlockWithItem(ModBlocks.WHITE_COFFEE_TABLE.get());
        horizontalBlockWithItem(ModBlocks.WHITE_DESK.get());
        horizontalBlockWithItem(ModBlocks.WHITE_DESK_COLUMN.get());
        horizontalBlockWithItem(ModBlocks.WHITE_DRAWER_SINGLE.get());
        horizontalBlockWithItem(ModBlocks.WHITE_GAMING_CHAIR.get());
        horizontalBlockWithItem(ModBlocks.WHITE_STANDING_DESK.get());
        horizontalBlockWithItem(ModBlocks.WHITE_STANDING_DESK_B.get());
        horizontalBlockWithItem(ModBlocks.WHITE_TABLE.get());
        horizontalBlockWithItem(ModBlocks.WHITE_TV_STAND.get());

        horizontalBlockWithBoolean(ModBlocks.WHITE_VERTICAL_BLINDS.get(), VerticalBlindsBlock.TURN_ON,
                models().getExistingFile(modLoc("white_vertical_blinds")), models().getExistingFile(modLoc("white_vertical_blinds_open")));

        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_COMPARTMENT_STORAGE_CABINET.get());
        horizontalBlock(ModBlocks.WOOD_3_DRAWER_DRESSER.get(), modLoc("block/wood_light_3_drawer_dresser"));
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_3_DRAWER_DRESSER.get());
        horizontalBlock(ModBlocks.WOOD_CHAIR.get(), modLoc("block/wood_light_chair"));
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_CHAIR.get());
        simpleBlock(ModBlocks.WOOD_LIGHT_CEILING_FAN_BLACK.get(), models().getExistingFile(modLoc("block/ceiling_fan_base_black")));
        simpleBlock(ModBlocks.WOOD_LIGHT_CEILING_FAN_WHITE.get(), models().getExistingFile(modLoc("block/ceiling_fan_base_white")));
        horizontalBlock(ModBlocks.WOOD_COFFEE_TABLE.get(), modLoc("block/wood_light_coffee_table"));
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_COFFEE_TABLE.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_DRAWER_SINGLE.get());
        horizontalBlock(ModBlocks.WOOD_DESK.get(), modLoc("block/wood_light_desk"));
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_DESK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2_EXTRA.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_2.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_WITH_SINK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_TOP.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_TOP_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_DRAWERS.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_KITCHEN_DRAWERS_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_STANDING_DESK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_STANDING_DESK_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_LIGHT_TABLE.get());
        horizontalBlock(ModBlocks.WOOD_LIGHT_TV_STAND.get(), modLoc("block/wood_light_tv_stand"));
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_COMPARTMENT_STORAGE_CABINET.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_CHAIR.get());
        simpleBlock(ModBlocks.WOOD_MEDIUM_CEILING_FAN_BLACK.get(), models().getExistingFile(modLoc("block/ceiling_fan_base_black")));
        simpleBlock(ModBlocks.WOOD_MEDIUM_CEILING_FAN_WHITE.get(), models().getExistingFile(modLoc("block/ceiling_fan_base_white")));
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_DRAWER_SINGLE.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_DESK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get());
        horizontalBlock(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get(), modLoc("block/medium_wood_striped_wall"));
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_TABLE.get());
        horizontalBlockWithItem(ModBlocks.WOOD_MEDIUM_TV_STAND.get());
        horizontalBlock(ModBlocks.WOOD_STANDING_DESK.get(), modLoc("block/wood_light_standing_desk"));
        horizontalBlock(ModBlocks.WOOD_STANDING_DESK_B.get(), modLoc("block/wood_light_standing_desk_b"));
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

    protected void horizontalBlockWithItem(Block block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + id.getPath()));
        horizontalBlock(block, model);
        simpleBlockItem(block, model);
    }

    protected void horizontalBlockWithoutItem(Block block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + id.getPath()));
        horizontalBlock(block, model);
    }

    private void horizontalBlockWithBoolean(Block block, BooleanProperty property, ModelFile offModel, ModelFile onModel) {
        this.getVariantBuilder(block).forAllStates(state -> {
            Direction direction = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            boolean flag = state.getValue(property);
            ModelFile model = flag ? onModel : offModel;
            int yRot = switch (direction) {
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        });
        this.simpleBlockItem(block, offModel);
    }

    private void horizontalBlockWithoutItemWithBoolean(Block block, BooleanProperty property, ModelFile offModel, ModelFile onModel) {
        this.getVariantBuilder(block).forAllStates(state -> {
            Direction direction = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            boolean flag = state.getValue(property);
            ModelFile model = flag ? onModel : offModel;
            int yRot = switch (direction) {
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        });
    }

    private void directionalBlockWithItem(Block block) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + id.getPath()));
        getVariantBuilder(block).forAllStates(state -> {
            Direction direction = state.getValue(BlockStateProperties.FACING);
            return ConfiguredModel.builder().modelFile(model).rotationX(direction == Direction.UP ? 270 :
                            direction == Direction.DOWN ? 90 : 0)
                    .rotationY(switch (direction) {
                        default -> 0;
                        case SOUTH -> 180;
                        case EAST -> 90;
                        case WEST -> 270;
                    }).build();
        });
        simpleBlockItem(block, model);
    }

    private void directionalBlockWithBoolean(Block block, BooleanProperty property, ModelFile offModel, ModelFile onModel) {
        this.getVariantBuilder(block).forAllStates(state -> {
            Direction dir = state.getValue(BlockStateProperties.FACING);
            boolean flag = state.getValue(property);
            ModelFile model = flag ? onModel : offModel;
            int xRot = dir == Direction.UP ? 270 : dir == Direction.DOWN ? 90 : 0;
            int yRot = switch (dir) {
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };
            return ConfiguredModel.builder().modelFile(model).rotationX(xRot).rotationY(yRot).build();
        });
        simpleBlockItem(block, offModel);
    }

    private void registerTVStates(Block block, EnumProperty<TVBlock.Mount> property, ModelFile stand, ModelFile wall) {
        this.getVariantBuilder(block).forAllStates(state -> {
            Direction direction = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            TVBlock.Mount mount = state.getValue(property);
            ModelFile modelFile;
            if (mount == TVBlock.Mount.WALL) {
                modelFile = wall;
            } else modelFile = stand;
            int yRot = switch (direction) {
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };
            return ConfiguredModel.builder().modelFile(modelFile).rotationY(yRot).build();
        });
        this.simpleBlockItem(block, stand);
    }
}