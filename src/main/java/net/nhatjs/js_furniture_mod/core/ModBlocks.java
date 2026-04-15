package net.nhatjs.js_furniture_mod.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.block.*;
import net.nhatjs.js_furniture_mod.block.added.*;
import net.nhatjs.js_furniture_mod.block.core.NonFunctionalSimpleBlock;

import java.util.function.Supplier;

import static net.nhatjs.js_furniture_mod.NhatJSFurnitureMod.MOD_ID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredBlock<Block> BLACK_MIRROR = registerBlock("black_mirror",
            () -> new BlackMirrorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.3f).noOcclusion()));

    public static final DeferredBlock<Block> BLACK_STANDING_DESK = registerBlock("black_standing_desk",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_STANDING_DESK_B = registerBlock("black_standing_desk_b",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_TABLE = registerBlock("black_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BOOKS = registerBlock("books",
            () -> new BooksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.1f).noOcclusion()));
    public static final DeferredBlock<Block> COMPUTER_MOUSE = registerBlock("computer_mouse",
            () -> new ComputerMouseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.2f).noOcclusion()));
    public static final DeferredBlock<Block> COOKTOP = registerBlock("cooktop",
            () -> new CooktopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_STANDING_SPEAKER = registerBlock("floor_standing_speaker",
            () -> new FloorStandingSpeakerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.9f).noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_A = registerBlock("fridge_a",
            () -> new FridgeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_B = registerBlock("fridge_b",
            () -> new FridgeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> KEYBOARD = registerBlock("keyboard",
            () -> new KeyboardBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.7f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM = registerBlock("kitchen_cabinet_bottom",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_WITH_SINK = registerBlock("kitchen_cabinet_bottom_with_sink",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_2 = registerBlock("kitchen_cabinet_bottom_2",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_2_EXTRA = registerBlock("kitchen_cabinet_bottom_2_extra",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_B = registerBlock("kitchen_cabinet_bottom_b",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_B_WITH_SINK = registerBlock("kitchen_cabinet_bottom_b_with_sink",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_B_2 = registerBlock("kitchen_cabinet_bottom_b_2",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_TOP = registerBlock("kitchen_cabinet_top",
            () -> new KitchenTopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_TOP_B = registerBlock("kitchen_cabinet_top_b",
            () -> new KitchenTopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_DRAWERS = registerBlock("kitchen_drawers",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_DRAWERS_B = registerBlock("kitchen_drawers_b",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LAPTOP = registerBlock("laptop",
            () -> new LaptopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND = registerBlock("laptop_closed_portable_laptop_stand",
            () -> new PortableLaptopStandAddedBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LED_FLOOR_LAMP = registerBlock("led_floor_lamp",
            () -> new LEDFloorLampBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LED_FLOOR_LAMP_RGB_OFF = registerBlock("led_floor_lamp_rgb_off",
            () -> new LEDFloorLampRGBBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LED_FLOOR_LAMP_RGB_OFF_2 = registerBlock("led_floor_lamp_rgb_off_2",
            () -> new LEDFloorLampRGBAltBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LED_RGB_TRIANGLE_PANEL = registerBlock("led_rgb_triangle_panel",
            () -> new LEDRGBTrianglePanelBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.8f).noOcclusion()));
    public static final DeferredBlock<Block> MIDI_STANDALONE_GROOVEBOX = registerBlock("midi_standalone_groovebox",
            () -> new GrooveboxBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MIDI_STANDALONE_GROOVEBOX_2 = registerBlock("midi_standalone_groovebox_2",
            () -> new Groovebox2Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MIDI_STANDALONE_GROOVEBOX_3 = registerBlock("midi_standalone_groovebox_3",
            () -> new Groovebox3Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_BATHROOM_MIRROR_SHELF = registerBlock("modern_bathroom_mirror_shelf",
            () -> new BathroomMirrorShelfBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_BATHROOM_SINK_STORAGE = registerBlock("modern_bathroom_sink_storage",
            () -> new BathroomSinkStorageBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_CHAIR = registerBlock("modern_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_CLOCK = registerBlock("modern_clock",
            () -> new ModernClockBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.4f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_LIGHT = registerBlock("modern_light",
            () -> new ModernLightBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.2f).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR = registerBlock("monitor",
            () -> new MonitorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR_SETUP = registerBlock("monitor_setup",
            () -> new MonitorSetupBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PC = registerBlock("pc",
            () -> new DesktopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PC_RGB1_OFF = registerBlock("pc_rgb1_off",
            () -> new DesktopAltBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PC_TOWER_GLASS = registerBlock("pc_tower_glass",
            () -> new DesktopTowerGlassBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.GLASS).strength(0.4f).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> PLANT_POT = registerBlock("plant_pot",
            () -> new PotBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.4f).noOcclusion()));
    public static final DeferredBlock<Block> PORTABLE_LAPTOP_STAND = registerBlock("portable_laptop_stand",
            () -> new PortableLaptopStandBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> SHOWER = registerBlock("shower",
            () -> new ShowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SOCKET = registerBlock("socket",
            () -> new SocketBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.2f).noOcclusion()));
    public static final DeferredBlock<Block> SOFA = registerBlock("sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> STUDIO_LIGHT = registerBlock("studio_light",
            () -> new StudioLightBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f).noOcclusion()));
    public static final DeferredBlock<Block> TV = registerBlock("tv",
            () -> new TVBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> VERTICAL_BLINDS = registerBlock("vertical_blinds",
            () -> new VerticalBlindsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.7f).noOcclusion()));
    public static final DeferredBlock<Block> WASHING_MACHINE_AI = registerBlock("washing_machine_ai",
            () -> new WashingMachineBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_3_DRAWER_DRESSER = registerBlock("white_3_drawer_dresser",
            () -> new ThreeDrawerDresserBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_CHAIR = registerBlock("white_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_COFFEE_TABLE = registerBlock("white_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_DESK = registerBlock("white_desk",
            () -> new DeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_STANDING_DESK = registerBlock("white_standing_desk",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_STANDING_DESK_B = registerBlock("white_standing_desk_b",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_TABLE = registerBlock("white_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_TV_STAND = registerBlock("white_tv_stand",
            () -> new TVStandBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_3_DRAWER_DRESSER = registerBlock("wood_3_drawer_dresser",
            () -> new ThreeDrawerDresserBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_CHAIR = registerBlock("wood_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_COFFEE_TABLE = registerBlock("wood_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_DESK = registerBlock("wood_desk",
            () -> new DeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_TABLE = registerBlock("wood_light_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_TV_STAND = registerBlock("wood_light_tv_stand",
            () -> new TVStandBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_STANDING_DESK = registerBlock("wood_standing_desk",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_STANDING_DESK_B = registerBlock("wood_standing_desk_b",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_STRIPED_WALL = registerBlock("wood_striped_wall",
            () -> new WoodStripedWallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.3f).noOcclusion()));

    public static final DeferredBlock<Block> CEILING_FAN = registerBlock("ceiling_fan",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_GAMING_CHAIR = registerBlock("black_gaming_chair",
            () -> new GamingChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_GAMING_CHAIR = registerBlock("white_gaming_chair",
            () -> new GamingChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));

    public static final DeferredBlock<Block> TOILET = registerBlock("toilet",
            () -> new ToiletBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));

    public static final DeferredBlock<Block> CEILING_FAN_B = registerBlock("ceiling_fan_b",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SOFA = registerBlock("black_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MIDI_KEYBOARD_CONTROLLER = registerBlock("midi_keyboard_controller",
            () -> new MIDIKeyboardBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_TV_STAND = registerBlock("wood_medium_tv_stand",
            () -> new TVStandBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_3_DRAWER_DRESSER = registerBlock("wood_medium_3_drawer_dresser",
            () -> new ThreeDrawerDresserBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_CHAIR = registerBlock("wood_medium_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_COFFEE_TABLE = registerBlock("wood_medium_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_DESK = registerBlock("wood_medium_desk",
            () -> new DeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_STANDING_DESK = registerBlock("wood_medium_standing_desk",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_STANDING_DESK_B = registerBlock("wood_medium_standing_desk_b",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_STRIPED_WALL = registerBlock("wood_medium_striped_wall",
            () -> new WoodStripedWallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.3f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_TABLE = registerBlock("wood_medium_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM = registerBlock("wood_medium_kitchen_cabinet_bottom",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK = registerBlock("wood_medium_kitchen_cabinet_bottom_with_sink",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2 = registerBlock("wood_medium_kitchen_cabinet_bottom_2",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA = registerBlock("wood_medium_kitchen_cabinet_bottom_2_extra",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B = registerBlock("wood_medium_kitchen_cabinet_bottom_b",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK = registerBlock("wood_medium_kitchen_cabinet_bottom_b_with_sink",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2 = registerBlock("wood_medium_kitchen_cabinet_bottom_b_2",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_TOP = registerBlock("wood_medium_kitchen_cabinet_top",
            () -> new KitchenTopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_CABINET_TOP_B = registerBlock("wood_medium_kitchen_cabinet_top_b",
            () -> new KitchenTopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_DRAWERS = registerBlock("wood_medium_kitchen_drawers",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_DRAWERS_B = registerBlock("wood_medium_kitchen_drawers_b",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));

    public static final DeferredBlock<Block> COMPUTER_CASE = registerBlock("computer_case",
            () -> new ComputerCaseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_1 = registerBlock("pc_added_1",
            () -> new PCAdded1Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_2 = registerBlock("pc_added_2",
            () -> new PCAdded2Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_3 = registerBlock("pc_added_3",
            () -> new PCAdded3Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_4 = registerBlock("pc_added_4",
            () -> new PCAdded4Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_5 = registerBlock("pc_added_5",
            () -> new PCAdded5Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_6 = registerBlock("pc_added_6",
            () -> new PCAdded6Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_7 = registerBlock("pc_added_7",
            () -> new PCAdded7Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_8 = registerBlock("pc_added_8",
            () -> new PCAdded8Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_9 = registerBlock("pc_added_9",
            () -> new PCAdded9Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_10 = registerBlock("pc_added_10",
            () -> new PCAdded10Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> PC_ADDED_11 = registerBlock("pc_added_11",
            () -> new PCAdded11Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));

    public static final DeferredBlock<Block> BLACK_CHAIR = registerBlock("black_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_COFFEE_TABLE = registerBlock("black_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_3_DRAWER_DRESSER = registerBlock("black_3_drawer_dresser",
            () -> new ThreeDrawerDresserBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_DRAWER_SINGLE = registerBlock("wood_light_drawer_single",
            () -> new DrawerSingleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_DRAWER_SINGLE = registerBlock("wood_medium_drawer_single",
            () -> new DrawerSingleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_DRAWER_SINGLE = registerBlock("black_drawer_single",
            () -> new DrawerSingleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_DRAWER_SINGLE = registerBlock("white_drawer_single",
            () -> new DrawerSingleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.75f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_DESK = registerBlock("black_desk",
            () -> new DeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_TV_STAND = registerBlock("black_tv_stand",
            () -> new TVStandBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_DESK_COLUMN = registerBlock("black_desk_column",
            () -> new DeskColumnBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_DESK_COLUMN = registerBlock("white_desk_column",
            () -> new DeskColumnBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_VERTICAL_BLINDS = registerBlock("black_vertical_blinds",
            () -> new VerticalBlindsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.7f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_CEILING_FAN_BLACK = registerBlock("wood_light_ceiling_fan_black",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_CEILING_FAN_BLACK = registerBlock("wood_medium_ceiling_fan_black",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_CEILING_FAN_BLACK = registerBlock("black_ceiling_fan_black",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_CEILING_FAN_BLACK = registerBlock("white_ceiling_fan_black",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_CEILING_FAN_WHITE = registerBlock("wood_light_ceiling_fan_white",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_CEILING_FAN_WHITE = registerBlock("wood_medium_ceiling_fan_white",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_CEILING_FAN_WHITE = registerBlock("black_ceiling_fan_white",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_CEILING_FAN_WHITE = registerBlock("white_ceiling_fan_white",
            () -> new CeilingFanBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_SOFA = registerBlock("white_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_COMPARTMENT_STORAGE_CABINET = registerBlock("wood_light_compartment_storage_cabinet",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_COMPARTMENT_STORAGE_CABINET = registerBlock("wood_medium_compartment_storage_cabinet",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_COMPARTMENT_STORAGE_CABINET = registerBlock("black_compartment_storage_cabinet",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_COMPARTMENT_STORAGE_CABINET = registerBlock("white_compartment_storage_cabinet",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET = registerBlock("wood_light_kitchen_compartment_storage_cabinet",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET = registerBlock("wood_medium_kitchen_compartment_storage_cabinet",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_COMPARTMENT_STORAGE_CABINET_B = registerBlock("wood_light_kitchen_compartment_storage_cabinet_b",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_MEDIUM_KITCHEN_COMPARTMENT_STORAGE_CABINET_B = registerBlock("wood_medium_kitchen_compartment_storage_cabinet_b",
            () -> new NonFunctionalSimpleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_VERTICAL_BLINDS = registerBlock("white_vertical_blinds",
            () -> new VerticalBlindsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.7f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_3_DRAWER_DRESSER = registerBlock("wood_light_3_drawer_dresser",
            () -> new ThreeDrawerDresserBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_CHAIR = registerBlock("wood_light_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_COFFEE_TABLE = registerBlock("wood_light_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_DESK = registerBlock("wood_light_desk",
            () -> new DeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_STANDING_DESK = registerBlock("wood_light_standing_desk",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_STANDING_DESK_B = registerBlock("wood_light_standing_desk_b",
            () -> new StandingDeskBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_BOTTOM = registerBlock("wood_light_kitchen_cabinet_bottom",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_WITH_SINK = registerBlock("wood_light_kitchen_cabinet_bottom_with_sink",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2 = registerBlock("wood_light_kitchen_cabinet_bottom_2",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_2_EXTRA = registerBlock("wood_light_kitchen_cabinet_bottom_2_extra",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B = registerBlock("wood_light_kitchen_cabinet_bottom_b",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_WITH_SINK = registerBlock("wood_light_kitchen_cabinet_bottom_b_with_sink",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_BOTTOM_B_2 = registerBlock("wood_light_kitchen_cabinet_bottom_b_2",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_TOP = registerBlock("wood_light_kitchen_cabinet_top",
            () -> new KitchenTopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_CABINET_TOP_B = registerBlock("wood_light_kitchen_cabinet_top_b",
            () -> new KitchenTopBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_DRAWERS = registerBlock("wood_light_kitchen_drawers",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_KITCHEN_DRAWERS_B = registerBlock("wood_light_kitchen_drawers_b",
            () -> new KitchenBottomBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_KEYBOARD = registerBlock("black_keyboard",
            () -> new KeyboardBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_COMPUTER_MOUSE = registerBlock("black_computer_mouse",
            () -> new ComputerMouseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
