package net.nhatjs.js_furniture_mod.datagen;

import com.mojang.math.Quadrant;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.blockstates.PropertyValueList;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.client.renderer.block.model.VariantSelector;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.item.ModItems;

import java.util.Optional;
import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, NhatJSFurnitureMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        Optional empty = Optional.empty();
        //items
        itemModels.generateFlatItem(ModItems.REMOTE_CONTROL_RGB.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CPU.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModBlocks.BLACK_MIRROR.toStack().getItem(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MAINBOARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AIO_COOLER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.COMPUTER_FAN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GPU.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PSU.get(), ModelTemplates.FLAT_ITEM);

        //blocks
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BLACK_GAMING_CHAIR.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BLACK_MIRROR.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BLACK_STANDING_DESK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BLACK_STANDING_DESK_B.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BLACK_TABLE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.BOOKS.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.COMPUTER_CASE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.COMPUTER_MOUSE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.COOKTOP.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.FLOOR_STANDING_SPEAKER.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.FRIDGE_A.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.FRIDGE_B.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.KEYBOARD.get());
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_BOTTOM.get(), "light_wood_kitchen_cabinet_bottom");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), "light_wood_kitchen_cabinet_bottom_2");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), "light_wood_kitchen_cabinet_bottom_2_extra");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), "light_wood_kitchen_cabinet_bottom_b");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), "light_wood_kitchen_cabinet_bottom_b_2");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), "light_wood_kitchen_cabinet_bottom_b_with_sink");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), "light_wood_kitchen_cabinet_bottom_with_sink");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_TOP.get(), "light_wood_kitchen_cabinet_top");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_CABINET_TOP_B.get(), "light_wood_kitchen_cabinet_top_b");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_DRAWERS.get(), "light_wood_kitchen_drawers");
        horizontalWithCustomModel(blockModels, ModBlocks.KITCHEN_DRAWERS_B.get(), "light_wood_kitchen_drawers_b");
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MODERN_CHAIR.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MODERN_CLOCK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.MONITOR.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_1.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_2.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_3.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_4.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_5.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_6.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_7.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_8.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_9.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_10.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_ADDED_11.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PC_TOWER_GLASS.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PLANT_POT.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.PORTABLE_LAPTOP_STAND.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.SHOWER.get());
        allDirectionWithCustomModel(blockModels, ModBlocks.SOCKET.get(), "socket");
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.TOILET.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_3_DRAWER_DRESSER.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_CHAIR.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_COFFEE_TABLE.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_DESK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_GAMING_CHAIR.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_STANDING_DESK.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_STANDING_DESK_B.get());
        blockModels.createNonTemplateHorizontalBlock(ModBlocks.WHITE_TABLE.get());
        horizontalWithCustomModel(blockModels, ModBlocks.WHITE_TV_STAND.get(), "tv_stand_2");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_3_DRAWER_DRESSER.get(), "light_wood_3_drawer_dresser");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_CHAIR.get(), "light_wood_chair");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_COFFEE_TABLE.get(), "light_wood_coffee_table");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_DESK.get(), "light_wood_desk");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_LIGHT_TABLE.get(), "light_wood_table");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_LIGHT_TV_STAND.get(), "light_wood_tv_stand");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get(), "medium_wood_3_drawer_dresser");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_CHAIR.get(), "medium_wood_chair");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get(), "medium_wood_coffee_table");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_DESK.get(), "medium_wood_desk");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get(), "medium_wood_kitchen_cabinet_bottom");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get(), "medium_wood_kitchen_cabinet_bottom_2");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), "medium_wood_kitchen_cabinet_bottom_2_extra");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get(), "medium_wood_kitchen_cabinet_bottom_b");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get(), "medium_wood_kitchen_cabinet_bottom_b_2");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), "medium_wood_kitchen_cabinet_bottom_b_with_sink");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), "medium_wood_kitchen_cabinet_bottom_with_sink");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get(), "medium_wood_kitchen_cabinet_top");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get(), "medium_wood_kitchen_cabinet_top_b");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get(), "medium_wood_kitchen_drawers");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get(), "medium_wood_kitchen_drawers_b");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_STANDING_DESK.get(), "medium_wood_standing_desk");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get(), "medium_wood_standing_desk_b");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get(), "medium_wood_striped_wall");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_TABLE.get(), "medium_wood_table");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_MEDIUM_TV_STAND.get(), "medium_wood_tv_stand");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_STANDING_DESK.get(), "light_wood_standing_desk");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_STANDING_DESK_B.get(), "light_wood_standing_desk_b");
        horizontalWithCustomModel(blockModels, ModBlocks.WOOD_STRIPED_WALL.get(), "light_wood_striped_wall");
    }

    private void horizontalWithCustomModel(BlockModelGenerators blockModelGenerators, Block block, String name) {
        ResourceLocation model = ResourceLocation.fromNamespaceAndPath(NhatJSFurnitureMod.MOD_ID, "block/" + name);
        PropertyDispatch map = PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING)
                .select(Direction.NORTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)))
                .select(Direction.EAST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                .select(Direction.SOUTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                .select(Direction.WEST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));
        blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(map));

        blockModelGenerators.registerSimpleItemModel(block, model);
    }

    private void allDirectionWithCustomModel(BlockModelGenerators blockModelGenerators, Block block, String name) {
        ResourceLocation model = ResourceLocation.fromNamespaceAndPath(NhatJSFurnitureMod.MOD_ID, "block/" + name);
        PropertyDispatch map = PropertyDispatch.initial(BlockStateProperties.FACING)
                .select(Direction.NORTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)))
                .select(Direction.EAST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                .select(Direction.SOUTH,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                .select(Direction.WEST,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                .select(Direction.UP,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.X_ROT.withValue(Quadrant.R270)))
                .select(Direction.DOWN,  BlockModelGenerators.plainVariant(model).with(VariantMutator.MODEL.withValue(model)).with(VariantMutator.X_ROT.withValue(Quadrant.R90)));
        blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(map));

        blockModelGenerators.registerSimpleItemModel(block, model);
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().filter(x ->
                !x.is(ModBlocks.BLACK_SOFA) && !x.is(ModBlocks.CEILING_FAN) && !x.is(ModBlocks.CEILING_FAN_B) && !x.is(ModBlocks.LAPTOP)
                        && !x.is(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND) && !x.is(ModBlocks.LED_FLOOR_LAMP)
                        && !x.is(ModBlocks.LED_FLOOR_LAMP_RGB_OFF) && !x.is(ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2)
                        && !x.is(ModBlocks.LED_RGB_TRIANGLE_PANEL) && !x.is(ModBlocks.MIDI_KEYBOARD_CONTROLLER)
                        && !x.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX) && !x.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2)
                        && !x.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3) && !x.is(ModBlocks.MODERN_LIGHT) && !x.is(ModBlocks.MONITOR_SETUP)
                        && !x.is(ModBlocks.PC) && !x.is(ModBlocks.PC_RGB1_OFF) && !x.is(ModBlocks.SOFA) && !x.is(ModBlocks.STUDIO_LIGHT)
                        && !x.is(ModBlocks.TV) && !x.is(ModBlocks.VERTICAL_BLINDS) && !x.is(ModBlocks.WASHING_MACHINE_AI));
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream().filter(x -> x.get() != ModBlocks.BLACK_SOFA.asItem() && x.get() != ModBlocks.CEILING_FAN.asItem()
                && x.get() != ModBlocks.CEILING_FAN_B.asItem() && x.get() != ModBlocks.LAPTOP.asItem()
                && x.get() != ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND .asItem()&& x.get() != ModBlocks.LED_FLOOR_LAMP.asItem()
                && x.get() != ModBlocks.LED_FLOOR_LAMP_RGB_OFF.asItem() && x.get() != ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2.asItem()
                && x.get() != ModBlocks.LED_RGB_TRIANGLE_PANEL.asItem() && x.get() != ModBlocks.MIDI_KEYBOARD_CONTROLLER.asItem()
                && x.get() != ModBlocks.MIDI_STANDALONE_GROOVEBOX.asItem() && x.get() != ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.asItem()
                && x.get() != ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.asItem() && x.get() != ModBlocks.MODERN_LIGHT.asItem()
                && x.get() != ModBlocks.MONITOR_SETUP.asItem() && x.get() != ModBlocks.PC.asItem() && x.get() != ModBlocks.PC_RGB1_OFF.asItem()
                && x.get() != ModBlocks.SOFA.asItem() && x.get() != ModBlocks.STUDIO_LIGHT.asItem()  && x.get() != ModBlocks.TV.asItem()
                && x.get() != ModBlocks.VERTICAL_BLINDS.asItem() && x.get() != ModBlocks.WASHING_MACHINE_AI.asItem());
    }
}
