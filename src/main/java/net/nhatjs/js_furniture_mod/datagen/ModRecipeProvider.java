package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import net.nhatjs.js_furniture_mod.core.ModItems;

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
        Block bannerBlack = Blocks.BLACK_BANNER;

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
        Block redstoneLamp = Blocks.REDSTONE_LAMP;
        Item redstoneComparator = Items.COMPARATOR;

        //furniture mod
        DeferredBlock<Block> laptop = ModBlocks.LAPTOP;
        DeferredBlock<Block> portableLaptopStand = ModBlocks.PORTABLE_LAPTOP_STAND;
        DeferredBlock<Block> midiGroovebox = ModBlocks.MIDI_STANDALONE_GROOVEBOX;
        DeferredBlock<Block> monitor = ModBlocks.MONITOR;
        DeferredBlock<Block> blackKeyboard = ModBlocks.BLACK_KEYBOARD;
        DeferredBlock<Block> blackComputerMouse = ModBlocks.BLACK_COMPUTER_MOUSE;
        DeferredItem<Item> computerFan = ModItems.COMPUTER_FAN;
        DeferredBlock<Block> woodLightDrawerSingle = ModBlocks.WOOD_LIGHT_DRAWER_SINGLE;
        DeferredBlock<Block> woodLightCompartmentStorageCabinet = ModBlocks.WOOD_LIGHT_COMPARTMENT_STORAGE_CABINET;
        DeferredBlock<Block> woodLightKitchenCompartmentStorageCabinet = ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET;
        DeferredBlock<Block> woodLightKitchenCompartmentStorageCabinetB = ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET_B;
        DeferredBlock<Block> woodLightKitchenCabinetBottom = ModBlocks.KITCHEN_CABINET_BOTTOM;
        DeferredBlock<Block> woodLightKitchenCabinetBottomB = ModBlocks.KITCHEN_CABINET_BOTTOM_B;
        DeferredItem<Item> woodLightSquareStick = ModItems.WOOD_LIGHT_SQUARE_STICK;
        DeferredItem<Item> woodLightShortSquareStick = ModItems.WOOD_LIGHT_SHORT_SQUARE_STICK;
        DeferredItem<Item> woodLightPanel = ModItems.WOOD_LIGHT_PANEL;
        DeferredBlock<Block> woodMediumDrawerSingle = ModBlocks.WOOD_MEDIUM_DRAWER_SINGLE;
        DeferredBlock<Block> woodMediumCompartmentStorageCabinet = ModBlocks.WOOD_MEDIUM_COMPARTMENT_STORAGE_CABINET;
        DeferredBlock<Block> woodMediumKitchenCompartmentStorageCabinet = ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET;
        DeferredBlock<Block> woodMediumKitchenCompartmentStorageCabinetB = ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET_B;
        DeferredBlock<Block> woodMediumKitchenCabinetBottom = ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM;
        DeferredBlock<Block> woodMediumKitchenCabinetBottomB = ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B;
        DeferredItem<Item> woodMediumSquareStick = ModItems.WOOD_MEDIUM_SQUARE_STICK;
        DeferredItem<Item> woodMediumShortSquareStick = ModItems.WOOD_MEDIUM_SHORT_SQUARE_STICK;
        DeferredItem<Item> woodMediumPanel = ModItems.WOOD_MEDIUM_PANEL;
        DeferredBlock<Block> blackDrawerSingle = ModBlocks.BLACK_DRAWER_SINGLE;
        DeferredBlock<Block> blackCompartmentStorageCabinet = ModBlocks.BLACK_COMPARTMENT_STORAGE_CABINET;
        DeferredItem<Item> blackSquareStick = ModItems.BLACK_SQUARE_STICK;
        DeferredItem<Item> blackShortSquareStick = ModItems.BLACK_SHORT_SQUARE_STICK;
        DeferredItem<Item> blackPanel = ModItems.BLACK_PANEL;
        DeferredBlock<Block> blackDeskColumn = ModBlocks.BLACK_DESK_COLUMN;
        DeferredBlock<Block> whiteDrawerSingle = ModBlocks.WHITE_DRAWER_SINGLE;
        DeferredBlock<Block> whiteCompartmentStorageCabinet = ModBlocks.WHITE_COMPARTMENT_STORAGE_CABINET;
        DeferredItem<Item> whiteSquareStick = ModItems.WHITE_SQUARE_STICK;
        DeferredItem<Item> whiteShortSquareStick = ModItems.WHITE_SHORT_SQUARE_STICK;
        DeferredItem<Item> whitePanel = ModItems.WHITE_PANEL;
        DeferredBlock<Block> whiteDeskColumn = ModBlocks.WHITE_DESK_COLUMN;

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
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(computerFan), has(computerFan))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_3_DRAWER_DRESSER)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', blackCompartmentStorageCabinet)
                .define('2', blackDrawerSingle)
                .unlockedBy(getHasName(blackCompartmentStorageCabinet), has(blackCompartmentStorageCabinet))
                .unlockedBy(getHasName(blackDrawerSingle), has(blackDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CEILING_FAN_BLACK)
                .pattern(" 1 ")
                .pattern("121")
                .define('1', blackSquareStick)
                .define('2', blackShortSquareStick)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(blackShortSquareStick), has(blackShortSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CEILING_FAN_WHITE)
                .pattern(" 3 ")
                .pattern("121")
                .define('1', blackSquareStick)
                .define('2', whiteShortSquareStick)
                .define('3', whiteSquareStick)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(whiteShortSquareStick), has(whiteShortSquareStick))
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_CHAIR)
                .pattern("1  ")
                .pattern("111")
                .pattern("1 1")
                .define('1', blackSquareStick)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_COFFEE_TABLE)
                .pattern("22")
                .pattern("11")
                .define('1', blackShortSquareStick)
                .define('2', blackPanel)
                .unlockedBy(getHasName(blackShortSquareStick), has(blackShortSquareStick))
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(blackPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.BLACK_COMPARTMENT_STORAGE_CABINET)
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_COMPUTER_MOUSE)
                .pattern("3")
                .pattern("1")
                .pattern("2")
                .define('1', blackShortSquareStick)
                .define('2', redstone)
                .define('3', buttonStone)
                .unlockedBy(getHasName(blackShortSquareStick), has(blackShortSquareStick))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_DESK)
                .pattern("22")
                .pattern("33")
                .pattern("11")
                .define('1', blackSquareStick)
                .define('2', blackPanel)
                .define('3', blackDrawerSingle)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .unlockedBy(getHasName(blackDrawerSingle), has(blackDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_DESK_COLUMN)
                .pattern(" 12")
                .pattern(" 1 ")
                .pattern("111")
                .define('1', blackSquareStick)
                .define('2', redstone)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_DRAWER_SINGLE, 3)
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', chest)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(chest), has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GAMING_CHAIR)
                .pattern("1  ")
                .pattern("121")
                .pattern("3 3")
                .define('1', woolBlack)
                .define('2', woolWhite)
                .define('3', concreteBlack)
                .unlockedBy(getHasName(woolBlack), has(woolBlack))
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_KEYBOARD)
                .pattern("222")
                .pattern("131")
                .define('1', blackPanel)
                .define('2', blackShortSquareStick)
                .define('3', redstone)
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .unlockedBy(getHasName(blackShortSquareStick), has(blackShortSquareStick))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_MIRROR)
                .pattern("121")
                .pattern("121")
                .pattern("121")
                .define('1', blackSquareStick)
                .define('2', glassPane)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BLACK_PANEL)
                .pattern("11")
                .pattern("11")
                .define('1', blackSquareStick)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_SOFA, 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolBlack)
                .unlockedBy(getHasName(woolBlack), has(woolBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BLACK_SHORT_SQUARE_STICK, 2)
                .pattern("1")
                .define('1', blackSquareStick)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BLACK_SQUARE_STICK, 6)
                .pattern("1")
                .pattern("1")
                .pattern("1")
                .define('1', concreteBlack)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STANDING_DESK)
                .pattern("111")
                .pattern("232")
                .define('1', blackPanel)
                .define('2', blackDeskColumn)
                .define('3', blackSquareStick)
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .unlockedBy(getHasName(blackDeskColumn), has(blackDeskColumn))
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STANDING_DESK_B)
                .pattern("111")
                .pattern("232")
                .define('1', blackPanel)
                .define('2', whiteDeskColumn)
                .define('3', whiteSquareStick)
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .unlockedBy(getHasName(whiteDeskColumn), has(whiteDeskColumn))
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TABLE)
                .pattern("222")
                .pattern("1 1")
                .define('1', blackSquareStick)
                .define('2', blackPanel)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TV_STAND)
                .pattern(" 11")
                .pattern("111")
                .pattern("1 1")
                .define('1', blackPanel)
                .unlockedBy(getHasName(blackPanel), has(blackPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_VERTICAL_BLINDS)
                .pattern("111")
                .pattern("222")
                .pattern("222")
                .define('1', blackSquareStick)
                .define('2', bannerBlack)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(bannerBlack), has(bannerBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BOOKS, 2)
                .pattern("232")
                .pattern("111")
                .pattern("232")
                .define('1', book)
                .define('2', dyeWhite)
                .define('3', dyeBlack)
                .unlockedBy(getHasName(book), has(book))
                .unlockedBy(getHasName(dyeWhite), has(dyeWhite))
                .unlockedBy(getHasName(dyeBlack), has(dyeBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COMPUTER_CASE)
                .pattern("212")
                .pattern("112")
                .pattern("112")
                .define('1', concreteBlack)
                .define('2', computerFan)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(computerFan), has(computerFan))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.COMPUTER_FAN, 3)
                .pattern("121")
                .pattern("212")
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COOKTOP)
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.CPU)
                .pattern(" 2 ")
                .pattern("212")
                .pattern(" 2 ")
                .define('1', endCrystal)
                .define('2', dyeGreen)
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(dyeGreen), has(dyeGreen))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FLOOR_STANDING_SPEAKER)
                .pattern("2")
                .pattern("1")
                .pattern("1")
                .define('1', concreteBlack)
                .define('2', noteBlock)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(noteBlock), has(noteBlock))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FRIDGE_A)
                .pattern("414")
                .pattern("232")
                .pattern("414")
                .define('1', concreteBlack)
                .define('2', ironBlock)
                .define('3', endCrystal)
                .define('4', concreteGray)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(ironBlock), has(ironBlock))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteGray), has(concreteGray))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FRIDGE_B)
                .pattern("414")
                .pattern("232")
                .pattern("414")
                .define('1', concreteBlack)
                .define('2', ironBlock)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(ironBlock), has(ironBlock))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.GPU)
                .pattern("111")
                .pattern("333")
                .pattern("121")
                .define('1', concreteLightGray)
                .define('2', endCrystal)
                .define('3', computerFan)
                .unlockedBy(getHasName(concreteLightGray), has(concreteLightGray))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(computerFan), has(computerFan))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MAINBOARD)
                .pattern("111")
                .pattern("121")
                .pattern("111")
                .define('1', concreteGray)
                .define('2', endCrystal)
                .unlockedBy(getHasName(concreteGray), has(concreteGray))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
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
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(noteBlock), has(noteBlock))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND)
                .pattern("1")
                .pattern("2")
                .define('1', laptop)
                .define('2', portableLaptopStand)
                .unlockedBy(getHasName(laptop), has(laptop))
                .unlockedBy(getHasName(portableLaptopStand), has(portableLaptopStand))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_FLOOR_LAMP, 2)
                .pattern(" 1 ")
                .pattern(" 2 ")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_FLOOR_LAMP_RGB_OFF, 2)
                .pattern(" 1")
                .pattern(" 2")
                .pattern("11")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_RGB_TRIANGLE_PANEL)
                .pattern("12 ")
                .pattern("131")
                .pattern(" 21")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .define('3', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_KEYBOARD_CONTROLLER)
                .pattern("111")
                .pattern("244")
                .pattern("311")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX)
                .pattern("111")
                .pattern("132")
                .pattern("222")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX_2)
                .pattern("424")
                .pattern("232")
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX_3)
                .pattern("11")
                .define('1', midiGroovebox)
                .unlockedBy(getHasName(midiGroovebox), has(midiGroovebox))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_BATHROOM_MIRROR_SHELF)
                .pattern("121")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_BATHROOM_SINK_STORAGE)
                .pattern(" 2 ")
                .pattern("111")
                .pattern("222")
                .define('1', concreteWhite)
                .define('2', concreteBlack)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_CHAIR, 2)
                .pattern("2  ")
                .pattern("121")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', woolWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_CLOCK)
                .pattern(" 1 ")
                .pattern("121")
                .pattern(" 1 ")
                .define('1', concreteBlack)
                .define('2', clock)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(clock), has(clock))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_LIGHT, 4)
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR)
                .pattern("121")
                .pattern(" 3 ")
                .pattern(" 1 ")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .define('3', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR_SETUP)
                .pattern("14")
                .pattern("23")
                .define('1', monitor)
                .define('2', blackKeyboard)
                .define('3', blackComputerMouse)
                .define('4', carpetBlack)
                .unlockedBy(getHasName(monitor), has(monitor))
                .unlockedBy(getHasName(blackKeyboard), has(blackKeyboard))
                .unlockedBy(getHasName(blackComputerMouse), has(blackComputerMouse))
                .unlockedBy(getHasName(carpetBlack), has(carpetBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PC_TOWER_GLASS)
                .pattern("21")
                .pattern("21")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PLANT_POT)
                .pattern(" 3 ")
                .pattern("121")
                .define('1', ironIngot)
                .define('2', flowerPot)
                .define('3', saplingOak)
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .unlockedBy(getHasName(flowerPot), has(flowerPot))
                .unlockedBy(getHasName(saplingOak), has(saplingOak))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PORTABLE_LAPTOP_STAND)
                .pattern("1 1")
                .pattern("111")
                .pattern("1 1")
                .define('1', ironIngot)
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.PSU)
                .pattern("111")
                .pattern("321")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', redstoneComparator)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(redstoneComparator), has(redstoneComparator))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.RAM, 2)
                .pattern("211")
                .pattern("333")
                .define('1', concreteBlack)
                .define('2', ironIngot)
                .define('3', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SHOWER)
                .pattern("21")
                .define('1', dyeBlack)
                .define('2', ironIngot)
                .unlockedBy(getHasName(dyeBlack), has(dyeBlack))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SOCKET, 4)
                .pattern("1")
                .pattern("2")
                .pattern("1")
                .define('1', concreteWhite)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STUDIO_LIGHT, 2)
                .pattern("121")
                .pattern(" 1 ")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TOILET)
                .pattern("1  ")
                .pattern("111")
                .pattern("11 ")
                .define('1', concreteWhite)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TV)
                .pattern("121")
                .pattern("131")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', dyeWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(dyeWhite), has(dyeWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_VERTICAL_BLINDS)
                .pattern("111")
                .pattern("222")
                .pattern("222")
                .define('1', whiteSquareStick)
                .define('2', bannerWhite)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(bannerWhite), has(bannerWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WASHING_MACHINE_AI)
                .pattern("121")
                .pattern("1 1")
                .pattern("131")
                .define('1', concreteGray)
                .define('2', redstone)
                .define('3', endCrystal)
                .unlockedBy(getHasName(concreteGray), has(concreteGray))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_3_DRAWER_DRESSER)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', whiteCompartmentStorageCabinet)
                .define('2', whiteDrawerSingle)
                .unlockedBy(getHasName(whiteCompartmentStorageCabinet), has(whiteCompartmentStorageCabinet))
                .unlockedBy(getHasName(whiteDrawerSingle), has(whiteDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CEILING_FAN_BLACK)
                .pattern(" 1 ")
                .pattern("121")
                .define('1', whiteSquareStick)
                .define('2', whiteShortSquareStick)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(whiteShortSquareStick), has(whiteShortSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CEILING_FAN_WHITE)
                .pattern(" 3 ")
                .pattern("121")
                .define('1', whiteSquareStick)
                .define('2', blackShortSquareStick)
                .define('3', blackSquareStick)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(blackShortSquareStick), has(blackShortSquareStick))
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CHAIR)
                .pattern("1  ")
                .pattern("111")
                .pattern("1 1")
                .define('1', whiteSquareStick)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_COFFEE_TABLE)
                .pattern("22")
                .pattern("11")
                .define('1', whiteShortSquareStick)
                .define('2', whitePanel)
                .unlockedBy(getHasName(whiteShortSquareStick), has(whiteShortSquareStick))
                .unlockedBy(getHasName(whitePanel), has(whitePanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(whitePanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WHITE_COMPARTMENT_STORAGE_CABINET)
                .unlockedBy(getHasName(whitePanel), has(whitePanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_DESK)
                .pattern("22")
                .pattern("33")
                .pattern("11")
                .define('1', whiteSquareStick)
                .define('2', whitePanel)
                .define('3', whiteDrawerSingle)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(whitePanel), has(whitePanel))
                .unlockedBy(getHasName(whiteDrawerSingle), has(whiteDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_DESK_COLUMN)
                .pattern(" 12")
                .pattern(" 1 ")
                .pattern("111")
                .define('1', whiteSquareStick)
                .define('2', redstone)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_DRAWER_SINGLE, 3)
                .pattern("121")
                .define('1', concreteWhite)
                .define('2', chest)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(chest), has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GAMING_CHAIR)
                .pattern("1  ")
                .pattern("121")
                .pattern("3 3")
                .define('1', woolWhite)
                .define('2', woolBlack)
                .define('3', concreteBlack)
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .unlockedBy(getHasName(woolBlack), has(woolBlack))
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WHITE_PANEL)
                .pattern("11")
                .pattern("11")
                .define('1', whiteSquareStick)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WHITE_SHORT_SQUARE_STICK, 2)
                .pattern("1")
                .define('1', whiteSquareStick)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_SOFA, 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolWhite)
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WHITE_SQUARE_STICK, 6)
                .pattern("1")
                .pattern("1")
                .pattern("1")
                .define('1', concreteWhite)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STANDING_DESK)
                .pattern("111")
                .pattern("232")
                .define('1', whitePanel)
                .define('2', blackDeskColumn)
                .define('3', blackSquareStick)
                .unlockedBy(getHasName(whitePanel), has(whitePanel))
                .unlockedBy(getHasName(blackDeskColumn), has(blackDeskColumn))
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STANDING_DESK_B)
                .pattern("111")
                .pattern("232")
                .define('1', whitePanel)
                .define('2', whiteDeskColumn)
                .define('3', whiteSquareStick)
                .unlockedBy(getHasName(whitePanel), has(whitePanel))
                .unlockedBy(getHasName(whiteDeskColumn), has(whiteDeskColumn))
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TABLE)
                .pattern("222")
                .pattern("1 1")
                .define('1', whiteSquareStick)
                .define('2', whitePanel)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(whitePanel), has(whitePanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TV_STAND)
                .pattern(" 11")
                .pattern("111")
                .pattern("1 1")
                .define('1', whitePanel)
                .unlockedBy(getHasName(whitePanel), has(whitePanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_3_DRAWER_DRESSER)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', woodLightCompartmentStorageCabinet)
                .define('2', woodLightDrawerSingle)
                .unlockedBy(getHasName(woodLightCompartmentStorageCabinet), has(woodLightCompartmentStorageCabinet))
                .unlockedBy(getHasName(woodLightDrawerSingle), has(woodLightDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_CEILING_FAN_BLACK)
                .pattern(" 1 ")
                .pattern("323")
                .define('1', blackSquareStick)
                .define('2', blackShortSquareStick)
                .define('3', woodLightSquareStick)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(blackShortSquareStick), has(blackShortSquareStick))
                .unlockedBy(getHasName(woodLightSquareStick), has(woodLightSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_CEILING_FAN_WHITE)
                .pattern(" 1 ")
                .pattern("323")
                .define('1', whiteSquareStick)
                .define('2', whiteShortSquareStick)
                .define('3', woodLightSquareStick)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(whiteShortSquareStick), has(whiteShortSquareStick))
                .unlockedBy(getHasName(woodLightSquareStick), has(woodLightSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_CHAIR)
                .pattern("1  ")
                .pattern("111")
                .pattern("1 1")
                .define('1', woodLightSquareStick)
                .unlockedBy(getHasName(woodLightSquareStick), has(woodLightSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_COFFEE_TABLE)
                .pattern("22")
                .pattern("11")
                .define('1', woodLightShortSquareStick)
                .define('2', woodLightPanel)
                .unlockedBy(getHasName(woodLightShortSquareStick), has(woodLightShortSquareStick))
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_COMPARTMENT_STORAGE_CABINET)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_DRAWER_SINGLE, 3)
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_DESK)
                .pattern("22")
                .pattern("33")
                .pattern("11")
                .define('1', woodLightSquareStick)
                .define('2', woodLightPanel)
                .define('3', woodLightDrawerSingle)
                .unlockedBy(getHasName(woodLightSquareStick), has(woodLightSquareStick))
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .unlockedBy(getHasName(woodLightDrawerSingle), has(woodLightDrawerSingle))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2_EXTRA)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_2)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_WITH_SINK)
                .pattern("2")
                .pattern("1")
                .define('1', woodLightKitchenCabinetBottomB)
                .define('2', bucket)
                .unlockedBy(getHasName(woodLightKitchenCabinetBottomB), has(woodLightKitchenCabinetBottomB))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_WITH_SINK)
                .pattern("2")
                .pattern("1")
                .define('1', woodLightKitchenCabinetBottom)
                .define('2', bucket)
                .unlockedBy(getHasName(woodLightKitchenCabinetBottom), has(woodLightKitchenCabinetBottom))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_TOP)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_CABINET_TOP_B)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodLightPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET_B)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_DRAWERS)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', woodLightKitchenCompartmentStorageCabinet)
                .define('2', woodLightDrawerSingle)
                .unlockedBy(getHasName(woodLightKitchenCompartmentStorageCabinet), has(woodLightKitchenCompartmentStorageCabinet))
                .unlockedBy(getHasName(woodLightDrawerSingle), has(woodLightDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_KITCHEN_DRAWERS_B)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', woodLightKitchenCompartmentStorageCabinetB)
                .define('2', woodLightDrawerSingle)
                .unlockedBy(getHasName(woodLightKitchenCompartmentStorageCabinetB), has(woodLightKitchenCompartmentStorageCabinetB))
                .unlockedBy(getHasName(woodLightDrawerSingle), has(woodLightDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WOOD_LIGHT_PANEL)
                .pattern("11")
                .pattern("11")
                .define('1', woodLightSquareStick)
                .unlockedBy(getHasName(woodLightSquareStick), has(woodLightSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WOOD_LIGHT_SHORT_SQUARE_STICK, 2)
                .pattern("1")
                .define('1', woodLightSquareStick)
                .unlockedBy(getHasName(woodLightSquareStick), has(woodLightSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WOOD_LIGHT_SQUARE_STICK, 6)
                .pattern("1")
                .pattern("1")
                .pattern("1")
                .define('1', planksBirch)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_STANDING_DESK)
                .pattern("111")
                .pattern("232")
                .define('1', woodLightPanel)
                .define('2', blackDeskColumn)
                .define('3', blackSquareStick)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .unlockedBy(getHasName(blackDeskColumn), has(blackDeskColumn))
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_STANDING_DESK_B)
                .pattern("111")
                .pattern("232")
                .define('1', woodLightPanel)
                .define('2', whiteDeskColumn)
                .define('3', whiteSquareStick)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .unlockedBy(getHasName(whiteDeskColumn), has(whiteDeskColumn))
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_TABLE)
                .pattern("222")
                .pattern("1 1")
                .define('1', woodLightSquareStick)
                .define('2', woodLightPanel)
                .unlockedBy(getHasName(woodLightSquareStick), has(woodLightSquareStick))
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_TV_STAND)
                .pattern(" 11")
                .pattern("111")
                .pattern("1 1")
                .define('1', woodLightPanel)
                .unlockedBy(getHasName(woodLightPanel), has(woodLightPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', woodMediumCompartmentStorageCabinet)
                .define('2', woodMediumDrawerSingle)
                .unlockedBy(getHasName(woodMediumCompartmentStorageCabinet), has(woodMediumCompartmentStorageCabinet))
                .unlockedBy(getHasName(woodMediumDrawerSingle), has(woodMediumDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_CEILING_FAN_BLACK)
                .pattern(" 1 ")
                .pattern("323")
                .define('1', blackSquareStick)
                .define('2', blackShortSquareStick)
                .define('3', woodMediumSquareStick)
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .unlockedBy(getHasName(blackShortSquareStick), has(blackShortSquareStick))
                .unlockedBy(getHasName(woodMediumSquareStick), has(woodMediumSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_CEILING_FAN_WHITE)
                .pattern(" 1 ")
                .pattern("323")
                .define('1', whiteSquareStick)
                .define('2', whiteShortSquareStick)
                .define('3', woodMediumSquareStick)
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .unlockedBy(getHasName(whiteShortSquareStick), has(whiteShortSquareStick))
                .unlockedBy(getHasName(woodMediumSquareStick), has(woodMediumSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_CHAIR)
                .pattern("1  ")
                .pattern("111")
                .pattern("1 1")
                .define('1', woodMediumSquareStick)
                .unlockedBy(getHasName(woodMediumSquareStick), has(woodMediumSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_COFFEE_TABLE)
                .pattern("22")
                .pattern("11")
                .define('1', woodMediumShortSquareStick)
                .define('2', woodMediumPanel)
                .unlockedBy(getHasName(woodMediumShortSquareStick), has(woodMediumShortSquareStick))
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_COMPARTMENT_STORAGE_CABINET)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_DESK)
                .pattern("22")
                .pattern("33")
                .pattern("11")
                .define('1', woodMediumSquareStick)
                .define('2', woodMediumPanel)
                .define('3', woodMediumDrawerSingle)
                .unlockedBy(getHasName(woodMediumSquareStick), has(woodMediumSquareStick))
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .unlockedBy(getHasName(woodMediumDrawerSingle), has(woodMediumDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_DRAWER_SINGLE, 3)
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK)
                .pattern("2")
                .pattern("1")
                .define('1', woodMediumKitchenCabinetBottomB)
                .define('2', bucket)
                .unlockedBy(getHasName(woodMediumKitchenCabinetBottomB), has(woodMediumKitchenCabinetBottomB))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK)
                .pattern("2")
                .pattern("1")
                .define('1', woodMediumKitchenCabinetBottom)
                .define('2', bucket)
                .unlockedBy(getHasName(woodMediumKitchenCabinetBottom), has(woodMediumKitchenCabinetBottom))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(woodMediumPanel),
                        RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET_B)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', woodMediumKitchenCompartmentStorageCabinet)
                .define('2', woodMediumDrawerSingle)
                .unlockedBy(getHasName(woodMediumKitchenCompartmentStorageCabinet), has(woodMediumKitchenCompartmentStorageCabinet))
                .unlockedBy(getHasName(woodMediumDrawerSingle), has(woodMediumDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B)
                .pattern(" 2")
                .pattern("12")
                .pattern(" 2")
                .define('1', woodMediumKitchenCompartmentStorageCabinetB)
                .define('2', woodMediumDrawerSingle)
                .unlockedBy(getHasName(woodMediumKitchenCompartmentStorageCabinetB), has(woodMediumKitchenCompartmentStorageCabinetB))
                .unlockedBy(getHasName(woodMediumDrawerSingle), has(woodMediumDrawerSingle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WOOD_MEDIUM_PANEL)
                .pattern("11")
                .pattern("11")
                .define('1', woodMediumSquareStick)
                .unlockedBy(getHasName(woodMediumSquareStick), has(woodMediumSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WOOD_MEDIUM_SHORT_SQUARE_STICK, 2)
                .pattern("1")
                .define('1', woodMediumSquareStick)
                .unlockedBy(getHasName(woodMediumSquareStick), has(woodMediumSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WOOD_MEDIUM_SQUARE_STICK, 6)
                .pattern("1")
                .pattern("1")
                .pattern("1")
                .define('1', planksJungle)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STANDING_DESK)
                .pattern("111")
                .pattern("232")
                .define('1', woodMediumPanel)
                .define('2', blackDeskColumn)
                .define('3', blackSquareStick)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .unlockedBy(getHasName(blackDeskColumn), has(blackDeskColumn))
                .unlockedBy(getHasName(blackSquareStick), has(blackSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STANDING_DESK_B)
                .pattern("111")
                .pattern("232")
                .define('1', woodMediumPanel)
                .define('2', whiteDeskColumn)
                .define('3', whiteSquareStick)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .unlockedBy(getHasName(whiteDeskColumn), has(whiteDeskColumn))
                .unlockedBy(getHasName(whiteSquareStick), has(whiteSquareStick))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STRIPED_WALL, 4)
                .pattern("111")
                .pattern("111")
                .pattern("111")
                .define('1', planksJungle)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_TABLE)
                .pattern("222")
                .pattern("1 1")
                .define('1', woodMediumSquareStick)
                .define('2', woodMediumPanel)
                .unlockedBy(getHasName(woodMediumSquareStick), has(woodMediumSquareStick))
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_TV_STAND)
                .pattern(" 11")
                .pattern("111")
                .pattern("1 1")
                .define('1', woodMediumPanel)
                .unlockedBy(getHasName(woodMediumPanel), has(woodMediumPanel))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_STRIPED_WALL, 4)
                .pattern("111")
                .pattern("111")
                .pattern("111")
                .define('1', planksBirch)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .save(recipeOutput);
    }
}
