package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        //wood
        Item saplingOak = Items.OAK_SAPLING;
        Block planksBirch = Blocks.BIRCH_PLANKS;
        Block slabBirch = Blocks.BIRCH_SLAB;
        Block planksJungle = Blocks.JUNGLE_PLANKS;
        Block slabJungle = Blocks.JUNGLE_SLAB;

        //stone
        Block buttonStone = Blocks.STONE_BUTTON;

        //wool
        Block woolBlack = Blocks.BLACK_WOOL;
        Block carpetBlack = Blocks.BLACK_CARPET;
        Block woolWhite = Blocks.WHITE_WOOL;

        //banner
        Block bannerWhite = Blocks.WHITE_BANNER;

        //concrete
        Block concreteBlack = Blocks.BLACK_CONCRETE;
        Block concreteGray = Blocks.GRAY_CONCRETE;
        Block concreteLightGray = Blocks.LIGHT_GRAY_CONCRETE;
        Block concreteWhite = Blocks.WHITE_CONCRETE;

        //dye
        Item dyeBlack = Items.BLACK_DYE;
        Item dyeGreen = Items.GREEN_DYE;
        Item dyeWhite = Items.WHITE_DYE;

        //misc
        Item ironIngot = Items.IRON_INGOT;
        Block ironBlock = Blocks.IRON_BLOCK;

        //glass pane
        Block glassPane = Blocks.GLASS_PANE;

        //electronic
        Item redstone = Items.REDSTONE;
        Item lever = Items.LEVER;
        Block redstoneLamp = Blocks.REDSTONE_LAMP;
        Item redstoneComparator = Items.COMPARATOR;

        //furniture mod
        DeferredBlock<Block> laptop = ModBlocks.LAPTOP;
        DeferredBlock<Block> portableLaptopStand = ModBlocks.PORTABLE_LAPTOP_STAND;
        DeferredBlock<Block> midiGroovebox = ModBlocks.MIDI_STANDALONE_GROOVEBOX;
        DeferredBlock<Block> monitor = ModBlocks.MONITOR;
        DeferredBlock<Block> keyboard = ModBlocks.KEYBOARD;
        DeferredBlock<Block> computerMouse = ModBlocks.COMPUTER_MOUSE;
        DeferredItem<Item> computerFan = ModItems.COMPUTER_FAN;

        //others
        Item book = Items.BOOK;
        Block noteBlock = Blocks.NOTE_BLOCK;
        Item endCrystal = Items.END_CRYSTAL;
        Block chest = Blocks.CHEST;
        Item bucket = Items.BUCKET;
        Block flowerPot = Blocks.FLOWER_POT;
        Item clock = Items.CLOCK;

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.AIO_COOLER)
                .pattern("111")
                .pattern("222")
                .pattern("3  ")
                .define('1', concreteBlack)
                .define('2', computerFan)
                .define('3', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_computer_fan", has(computerFan))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GAMING_CHAIR)
                .pattern("1  ")
                .pattern("121")
                .pattern("3 3")
                .define('1', woolBlack)
                .define('2', woolWhite)
                .define('3', concreteBlack)
                .unlockedBy("has_black_wool", has(woolBlack))
                .unlockedBy("has_white_wool", has(woolWhite))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_MIRROR)
                .pattern("1")
                .pattern("2")
                .pattern("1")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_glass_pane", has(glassPane))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_SOFA, 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolBlack)
                .unlockedBy("has_black_wool", has(woolBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STANDING_DESK)
                .pattern("111")
                .pattern("223")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', redstone)
                .define('3', lever)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STANDING_DESK_B)
                .pattern("111")
                .pattern("223")
                .pattern("4 4")
                .define('1', concreteBlack)
                .define('2', redstone)
                .define('3', lever)
                .define('4', concreteWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TABLE, 2)
                .pattern("111")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteBlack)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BOOKS, 2)
                .pattern("232")
                .pattern("111")
                .pattern("232")
                .define('1', book)
                .define('2', dyeWhite)
                .define('3', dyeBlack)
                .unlockedBy("has_book", has(book))
                .unlockedBy("has_white_dye", has(dyeWhite))
                .unlockedBy("has_black_dye", has(dyeBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CEILING_FAN)
                .pattern(" 2 ")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CEILING_FAN_B)
                .pattern(" 2 ")
                .pattern("111")
                .define('1', concreteWhite)
                .define('2', redstone)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COMPUTER_CASE)
                .pattern("212")
                .pattern("112")
                .pattern("112")
                .define('1', concreteBlack)
                .define('2', computerFan)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_computer_fan", has(computerFan))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.COMPUTER_FAN, 3)
                .pattern("121")
                .pattern("212")
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', concreteWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COMPUTER_MOUSE)
                .pattern("2")
                .pattern("1")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COOKTOP)
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.CPU)
                .pattern(" 2 ")
                .pattern("212")
                .pattern(" 2 ")
                .define('1', endCrystal)
                .define('2', dyeGreen)
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_green_dye", has(dyeGreen))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FLOOR_STANDING_SPEAKER)
                .pattern("2")
                .pattern("1")
                .pattern("1")
                .define('1', concreteBlack)
                .define('2', noteBlock)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_note_block", has(noteBlock))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FRIDGE_A)
                .pattern("414")
                .pattern("232")
                .pattern("414")
                .define('1', concreteBlack)
                .define('2', ironBlock)
                .define('3', endCrystal)
                .define('4', concreteGray)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_iron_block", has(ironBlock))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_gray_concrete", has(concreteGray))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FRIDGE_B)
                .pattern("414")
                .pattern("232")
                .pattern("414")
                .define('1', concreteBlack)
                .define('2', ironBlock)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_iron_block", has(ironBlock))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.GPU)
                .pattern("111")
                .pattern("333")
                .pattern("121")
                .define('1', concreteLightGray)
                .define('2', endCrystal)
                .define('3', computerFan)
                .unlockedBy("has_light_gray_concrete", has(concreteLightGray))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_computer_fan", has(computerFan))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KEYBOARD)
                .pattern("121")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM, 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', slabBirch)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_birch_slab", has(slabBirch))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_2, 2)
                .pattern("131")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA, 2)
                .pattern("111")
                .pattern("131")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_B, 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_B_2, 2)
                .pattern("111")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK, 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteWhite)
                .define('4', bucket)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_bucket", has(bucket))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK, 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', slabBirch)
                .define('4', bucket)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_birch_slab", has(slabBirch))
                .unlockedBy("has_bucket", has(bucket))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_TOP, 2)
                .pattern("11")
                .pattern("23")
                .pattern("11")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_TOP_B, 2)
                .pattern("11")
                .pattern("21")
                .pattern("11")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_DRAWERS, 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', slabBirch)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_birch_slab", has(slabBirch))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_DRAWERS_B, 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MAINBOARD)
                .pattern("111")
                .pattern("121")
                .pattern("111")
                .define('1', concreteGray)
                .define('2', endCrystal)
                .unlockedBy("has_gray_concrete", has(concreteGray))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LAPTOP)
                .pattern("111")
                .pattern("523")
                .pattern("141")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', buttonStone)
                .define('4', redstone)
                .define('5', noteBlock)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_note_block", has(noteBlock))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND)
                .pattern("1")
                .pattern("2")
                .define('1', laptop)
                .define('2', portableLaptopStand)
                .unlockedBy("has_laptop", has(laptop))
                .unlockedBy("has_portable_laptop_stand", has(portableLaptopStand))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_FLOOR_LAMP, 2)
                .pattern(" 1 ")
                .pattern(" 2 ")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_FLOOR_LAMP_RGB_OFF, 2)
                .pattern(" 1")
                .pattern(" 2")
                .pattern("11")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_RGB_TRIANGLE_PANEL)
                .pattern("12 ")
                .pattern("131")
                .pattern(" 21")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .define('3', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_KEYBOARD_CONTROLLER)
                .pattern("111")
                .pattern("244")
                .pattern("311")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX)
                .pattern("111")
                .pattern("132")
                .pattern("222")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX_2)
                .pattern("424")
                .pattern("232")
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_stone_button", has(buttonStone))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX_3)
                .pattern("11")
                .define('1', midiGroovebox)
                .unlockedBy("has_midi_standalone_groovebox", has(midiGroovebox))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_BATHROOM_MIRROR_SHELF)
                .pattern("121")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_glass_pane", has(glassPane))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_BATHROOM_SINK_STORAGE)
                .pattern(" 2 ")
                .pattern("111")
                .pattern("222")
                .define('1', concreteWhite)
                .define('2', concreteBlack)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_CHAIR, 4)
                .pattern("2  ")
                .pattern("121")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', woolWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_white_wool", has(woolWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_CLOCK)
                .pattern(" 1 ")
                .pattern("121")
                .pattern(" 1 ")
                .define('1', concreteBlack)
                .define('2', clock)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_clock", has(clock))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_LIGHT, 4)
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR)
                .pattern("121")
                .pattern(" 3 ")
                .pattern(" 1 ")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .define('3', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_glass_pane", has(glassPane))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR_SETUP)
                .pattern("14")
                .pattern("23")
                .define('1', monitor)
                .define('2', keyboard)
                .define('3', computerMouse)
                .define('4', carpetBlack)
                .unlockedBy("has_monitor", has(monitor))
                .unlockedBy("has_keyboard", has(keyboard))
                .unlockedBy("has_computer_mouse", has(computerMouse))
                .unlockedBy("has_black_carpet", has(carpetBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PC_TOWER_GLASS)
                .pattern("21")
                .pattern("21")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_glass_pane", has(glassPane))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PLANT_POT)
                .pattern(" 3 ")
                .pattern("121")
                .define('1', ironIngot)
                .define('2', flowerPot)
                .define('3', saplingOak)
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .unlockedBy("has_flower_pot", has(flowerPot))
                .unlockedBy("has_oak_sapling", has(saplingOak))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PORTABLE_LAPTOP_STAND)
                .pattern("1 1")
                .pattern("111")
                .pattern("1 1")
                .define('1', ironIngot)
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.PSU)
                .pattern("111")
                .pattern("321")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', redstoneComparator)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_redstone_comparator", has(redstoneComparator))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.RAM, 2)
                .pattern("211")
                .pattern("333")
                .define('1', concreteBlack)
                .define('2', ironIngot)
                .define('3', redstone)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SHOWER)
                .pattern("21")
                .define('1', dyeBlack)
                .define('2', ironIngot)
                .unlockedBy("has_black_dye", has(dyeBlack))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SOCKET, 4)
                .pattern("1")
                .pattern("2")
                .pattern("1")
                .define('1', concreteWhite)
                .define('2', redstone)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_redstone", has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SOFA, 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolWhite)
                .unlockedBy("has_white_wool", has(woolWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STUDIO_LIGHT, 2)
                .pattern("121")
                .pattern(" 1 ")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_redstone_lamp", has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TOILET)
                .pattern("1  ")
                .pattern("111")
                .pattern("11 ")
                .define('1', concreteWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TV)
                .pattern("121")
                .pattern("131")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', dyeWhite)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .unlockedBy("has_white_dye", has(dyeWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.VERTICAL_BLINDS)
                .pattern("111")
                .pattern("222")
                .pattern("222")
                .define('1', concreteWhite)
                .define('2', bannerWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_white_banner", has(bannerWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WASHING_MACHINE_AI)
                .pattern("121")
                .pattern("1 1")
                .pattern("131")
                .define('1', concreteGray)
                .define('2', redstone)
                .define('3', endCrystal)
                .unlockedBy("has_gray_concrete", has(concreteGray))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_end_crystal", has(endCrystal))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_3_DRAWER_DRESSER, 2)
                .pattern("121")
                .pattern("121")
                .pattern("121")
                .define('1', concreteWhite)
                .define('2', chest)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CHAIR, 4)
                .pattern("2  ")
                .pattern("122")
                .pattern("1 1")
                .define('1', concreteWhite)
                .define('2', woolWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_white_wool", has(woolWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_COFFEE_TABLE, 2)
                .pattern("111")
                .pattern("1 1")
                .define('1', concreteWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_DESK, 2)
                .pattern("121")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteWhite)
                .define('2', chest)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GAMING_CHAIR)
                .pattern("1  ")
                .pattern("121")
                .pattern("3 3")
                .define('1', woolWhite)
                .define('2', woolBlack)
                .define('3', concreteBlack)
                .unlockedBy("has_white_wool", has(woolWhite))
                .unlockedBy("has_black_wool", has(woolBlack))
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STANDING_DESK)
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', concreteWhite)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STANDING_DESK_B)
                .pattern("222")
                .pattern("334")
                .pattern("2 2")
                .define('2', concreteWhite)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TABLE, 2)
                .pattern("111")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteWhite)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TV_STAND)
                .pattern("111")
                .pattern("212")
                .define('1', concreteWhite)
                .define('2', chest)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_3_DRAWER_DRESSER, 2)
                .pattern("121")
                .pattern("121")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_CHAIR, 4)
                .pattern("2  ")
                .pattern("122")
                .pattern("1 1")
                .define('1', planksBirch)
                .define('2', woolWhite)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_white_wool", has(woolWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_COFFEE_TABLE, 2)
                .pattern("111")
                .pattern("1 1")
                .define('1', planksBirch)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_DESK, 2)
                .pattern("121")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_TABLE, 2)
                .pattern("222")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksBirch)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_birch_planks", has(planksBirch))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_TV_STAND, 2)
                .pattern("211")
                .pattern("1 1")
                .define('1', planksBirch)
                .define('2', concreteWhite)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER, 2)
                .pattern("121")
                .pattern("121")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_CHAIR, 4)
                .pattern("2  ")
                .pattern("122")
                .pattern("1 1")
                .define('1', planksJungle)
                .define('2', woolWhite)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_white_wool", has(woolWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_COFFEE_TABLE, 2)
                .pattern("111")
                .pattern("1 1")
                .define('1', planksJungle)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_DESK, 2)
                .pattern("121")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM, 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', slabJungle)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_jungle_slab", has(slabJungle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2, 2)
                .pattern("131")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA, 2)
                .pattern("111")
                .pattern("131")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B, 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2, 2)
                .pattern("111")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK, 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', concreteWhite)
                .define('4', bucket)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_bucket", has(bucket))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK, 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', slabJungle)
                .define('4', bucket)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_jungle_slab", has(slabJungle))
                .unlockedBy("has_bucket", has(bucket))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP, 2)
                .pattern("11")
                .pattern("23")
                .pattern("11")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_iron_ingot", has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B, 2)
                .pattern("11")
                .pattern("21")
                .pattern("11")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS, 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', slabJungle)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_jungle_slab", has(slabJungle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B, 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_chest", has(chest))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STANDING_DESK)
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksJungle)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STANDING_DESK_B)
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksJungle)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STRIPED_WALL, 4)
                .pattern("111")
                .pattern("111")
                .pattern("111")
                .define('1', planksJungle)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_TABLE, 2)
                .pattern("222")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksJungle)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_TV_STAND, 2)
                .pattern("211")
                .pattern("1 1")
                .define('1', planksJungle)
                .define('2', concreteWhite)
                .unlockedBy("has_jungle_planks", has(planksJungle))
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_STANDING_DESK)
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksBirch)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy("has_black_concrete", has(concreteBlack))
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_STANDING_DESK_B)
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteWhite)
                .define('2', planksBirch)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy("has_white_concrete", has(concreteWhite))
                .unlockedBy("has_birch_planks", has(planksBirch))
                .unlockedBy("has_redstone", has(redstone))
                .unlockedBy("has_lever", has(lever))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_STRIPED_WALL, 4)
                .pattern("111")
                .pattern("111")
                .pattern("111")
                .define('1', planksBirch)
                .unlockedBy("has_birch_planks", has(planksBirch))
                .save(recipeOutput);
    }
}
