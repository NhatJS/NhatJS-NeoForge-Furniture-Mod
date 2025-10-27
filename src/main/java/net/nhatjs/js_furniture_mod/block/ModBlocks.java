package net.nhatjs.js_furniture_mod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.item.ModItems;

import java.util.function.Function;
import java.util.function.Supplier;

import static net.nhatjs.js_furniture_mod.NhatJSFurnitureMod.MOD_ID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredBlock<Block> MODERN_CHAIR = registerBlock("modern_chair",
            (properties) -> new ChairBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_CHAIR = registerBlock("wood_chair",
            (properties) -> new ChairBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_CHAIR = registerBlock("white_chair",
            (properties) -> new ChairBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> SOFA = registerBlock("sofa",
            (properties) -> new SofaBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_TABLE = registerBlock("wood_light_table",
            (properties) -> new WoodTableBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_TABLE = registerBlock("black_table",
            (properties) -> new ModernTableBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_TABLE = registerBlock("white_table",
            (properties) -> new ModernTableBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_COFFEE_TABLE = registerBlock("wood_coffee_table",
            (properties) -> new CoffeeTableBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_COFFEE_TABLE = registerBlock("white_coffee_table",
            (properties) -> new CoffeeTableBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_DESK = registerBlock("wood_desk",
            (properties) -> new DeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_DESK = registerBlock("white_desk",
            (properties) -> new DeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_STANDING_DESK = registerBlock("wood_standing_desk",
            (properties) -> new StandingDeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_STANDING_DESK_B = registerBlock("wood_standing_desk_b",
            (properties) -> new StandingDeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_STANDING_DESK = registerBlock("black_standing_desk",
            (properties) -> new StandingDeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_STANDING_DESK_B = registerBlock("black_standing_desk_b",
            (properties) -> new StandingDeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_STANDING_DESK = registerBlock("white_standing_desk",
            (properties) -> new StandingDeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_STANDING_DESK_B = registerBlock("white_standing_desk_b",
            (properties) -> new StandingDeskBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_3_DRAWER_DRESSER = registerBlock("wood_3_drawer_dresser",
            (properties) -> new ThreeDrawerDresserBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_3_DRAWER_DRESSER = registerBlock("white_3_drawer_dresser",
            (properties) -> new ThreeDrawerDresserBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_LIGHT_TV_STAND = registerBlock("wood_light_tv_stand",
            (properties) -> new TVStandBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_TV_STAND = registerBlock("white_tv_stand",
            (properties) -> new TVStand2Block(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM = registerBlock("kitchen_cabinet_bottom",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_WITH_SINK = registerBlock("kitchen_cabinet_bottom_with_sink",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_2 = registerBlock("kitchen_cabinet_bottom_2",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_2_EXTRA = registerBlock("kitchen_cabinet_bottom_2_extra",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_B = registerBlock("kitchen_cabinet_bottom_b",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_B_WITH_SINK = registerBlock("kitchen_cabinet_bottom_b_with_sink",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_BOTTOM_B_2 = registerBlock("kitchen_cabinet_bottom_b_2",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_DRAWERS = registerBlock("kitchen_drawers",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_DRAWERS_B = registerBlock("kitchen_drawers_b",
            (properties) -> new KitchenBottomBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_TOP = registerBlock("kitchen_cabinet_top",
            (properties) -> new KitchenTopBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KITCHEN_CABINET_TOP_B = registerBlock("kitchen_cabinet_top_b",
            (properties) -> new KitchenTopBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WOOD_STRIPED_WALL = registerBlock("wood_striped_wall",
            (properties) -> new WoodStripedWallBlock(properties.mapColor(MapColor.STONE).strength(0.3f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_MIRROR = registerBlock("black_mirror",
            (properties) -> new BlackMirrorBlock(properties.mapColor(MapColor.STONE).strength(0.3f).noOcclusion()));
    public static final DeferredBlock<Block> VERTICAL_BLINDS = registerBlock("vertical_blinds",
            (properties) -> new VerticalBlindsBlock(properties.mapColor(MapColor.STONE).strength(0.7f).noOcclusion()));
    public static final DeferredBlock<Block> SOCKET = registerBlock("socket",
            (properties) -> new SocketBlock(properties.mapColor(MapColor.STONE).strength(0.2f).noOcclusion()));
    public static final DeferredBlock<Block> TV = registerBlock("tv",
            (properties) -> new TVBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));;
    public static final DeferredBlock<Block> FLOOR_STANDING_SPEAKER = registerBlock("floor_standing_speaker",
            (properties) -> new FloorStandingSpeakerBlock(properties.mapColor(MapColor.STONE).strength(0.9f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_CLOCK = registerBlock("modern_clock",
            (properties) -> new ModernClockBlock(properties.mapColor(MapColor.STONE).strength(0.4f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_LIGHT = registerBlock("modern_light",
            (properties) -> new ModernLightBlock(properties.mapColor(MapColor.STONE).strength(0.2f).noOcclusion()));
    public static final DeferredBlock<Block> LED_FLOOR_LAMP = registerBlock("led_floor_lamp",
            (properties) -> new LEDFloorLampBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LED_FLOOR_LAMP_RGB_OFF = registerBlock("led_floor_lamp_rgb_off",
            (properties) -> new LEDFloorLampRGBBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LED_FLOOR_LAMP_RGB_OFF_2 = registerBlock("led_floor_lamp_rgb_off_2",
            (properties) -> new LEDFloorLampRGBAltBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LED_RGB_TRIANGLE_PANEL = registerBlock("led_rgb_triangle_panel",
            (properties) -> new LEDRGBTrianglePanelBlock(properties.mapColor(MapColor.STONE).strength(0.8f).noOcclusion()));
    public static final DeferredBlock<Block> STUDIO_LIGHT = registerBlock("studio_light",
            (properties) -> new StudioLightBlock(properties.mapColor(MapColor.STONE).strength(1.5f).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR_SETUP = registerBlock("monitor_setup",
            (properties) -> new MonitorSetupBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MONITOR = registerBlock("monitor",
            (properties) -> new MonitorBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> KEYBOARD = registerBlock("keyboard",
            (properties) -> new KeyboardBlock(properties.mapColor(MapColor.STONE).strength(0.7f).noOcclusion()));
    public static final DeferredBlock<Block> COMPUTER_MOUSE = registerBlock("computer_mouse",
            (properties) -> new ComputerMouseBlock(properties.mapColor(MapColor.STONE).strength(0.2f).noOcclusion()));
    public static final DeferredBlock<Block> PC = registerBlock("pc",
            (properties) -> new DesktopBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PC_RGB1_OFF = registerBlock("pc_rgb1_off",
            (properties) -> new DesktopAltBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PC_TOWER_GLASS = registerBlock("pc_tower_glass",
            (properties) -> new DesktopTowerGlassBlock(properties.mapColor(MapColor.STONE).sound(SoundType.GLASS).strength(0.4f).noOcclusion().noCollision()));
    public static final DeferredBlock<Block> LAPTOP = registerBlock("laptop",
            (properties) -> new LaptopBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PORTABLE_LAPTOP_STAND = registerBlock("portable_laptop_stand",
            (properties) -> new PortableLaptopStandBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND = registerBlock("laptop_closed_portable_laptop_stand",
            (properties) -> new PortableLaptopStandAddedBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MIDI_STANDALONE_GROOVEBOX = registerBlock("midi_standalone_groovebox",
            (properties) -> new GrooveboxBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MIDI_STANDALONE_GROOVEBOX_2 = registerBlock("midi_standalone_groovebox_2",
            (properties) -> new Groovebox2Block(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MIDI_STANDALONE_GROOVEBOX_3 = registerBlock("midi_standalone_groovebox_3",
            (properties) -> new Groovebox3Block(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> COOKTOP = registerBlock("cooktop",
            (properties) -> new CooktopBlock(properties.mapColor(MapColor.STONE).strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_A = registerBlock("fridge_a",
            (properties) -> new FridgeBlock(properties.mapColor(MapColor.STONE).strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_B = registerBlock("fridge_b",
            (properties) -> new FridgeBlock(properties.mapColor(MapColor.STONE).strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_BATHROOM_SINK_STORAGE = registerBlock("modern_bathroom_sink_storage",
            (properties) -> new BathroomSinkStorageBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> MODERN_BATHROOM_MIRROR_SHELF = registerBlock("modern_bathroom_mirror_shelf",
            (properties) -> new BathroomMirrorShelfBlock(properties.mapColor(MapColor.STONE).strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SHOWER = registerBlock("shower",
            (properties) -> new ShowerBlock(properties.mapColor(MapColor.STONE).strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> WASHING_MACHINE_AI = registerBlock("washing_machine_ai",
            (properties) -> new WashingMachineBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> PLANT_POT = registerBlock("plant_pot",
            (properties) -> new PotBlock(properties.mapColor(MapColor.STONE).strength(0.4f).noOcclusion()));
    public static final DeferredBlock<Block> BOOKS = registerBlock("books",
            (properties) -> new BooksBlock(properties.mapColor(MapColor.STONE).strength(0.1f).noOcclusion()));

    //1.0.2 update
    public static final DeferredBlock<Block> CEILING_FAN = registerBlock("ceiling_fan",
            (properties) -> new CeilingFanBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_GAMING_CHAIR = registerBlock("black_gaming_chair",
            (properties) -> new ChairBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_GAMING_CHAIR = registerBlock("white_gaming_chair",
            (properties) -> new ChairBlock(properties.mapColor(MapColor.STONE).strength(1.0f).noOcclusion()));
    //end

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private ModBlocks() {}
}
