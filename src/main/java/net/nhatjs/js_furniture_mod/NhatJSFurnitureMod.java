package net.nhatjs.js_furniture_mod;

import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.event.ModelEvent;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import net.nhatjs.js_furniture_mod.core.ModBlockEntities;
import net.nhatjs.js_furniture_mod.core.ModEntities;
import net.nhatjs.js_furniture_mod.core.ModCreativeModeTabs;
import net.nhatjs.js_furniture_mod.core.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import static net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient.*;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(NhatJSFurnitureMod.MOD_ID)
public class NhatJSFurnitureMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "js_furniture_mod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public NhatJSFurnitureMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            NhatJSFurnitureModClient.init(modEventBus);
        }

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener((ModelEvent.RegisterAdditional e) -> {
            e.register(CEILING_FAN_BLADES);
            e.register(CEILING_FAN_BLADES);
            e.register(CEILING_FAN_BLADES_B);
            e.register(WASHING_MACHINE_AI_SCREEN);
            e.register(MIRROR_BLACK);
            e.register(WOOD_LIGHT_CEILING_FAN_BLADES_BLACK);
            e.register(WOOD_MEDIUM_CEILING_FAN_BLADES_BLACK);
            e.register(BLACK_CEILING_FAN_BLADES_BLACK);
            e.register(WHITE_CEILING_FAN_BLADES_BLACK);
            e.register(WOOD_LIGHT_CEILING_FAN_BLADES_WHITE);
            e.register(WOOD_MEDIUM_CEILING_FAN_BLADES_WHITE);
            e.register(BLACK_CEILING_FAN_BLADES_WHITE);
            e.register(WHITE_CEILING_FAN_BLADES_WHITE);
            e.register(LAPTOP_OPENED_ON_EMISSIVE);
            e.register(LAPTOP_OPENED_ON_PORTABLE_EMISSIVE);
            e.register(MONITOR_SETUP_ON_EMISSIVE);
            e.register(MODERN_LIGHT_EMISSIVE);
            e.register(PC_EMISSIVE);
            e.register(PC_RGB1_EMISSIVE);
            e.register(MIDI_STANDALONE_GROOVEBOX_ON_EMISSIVE);
            e.register(MIDI_STANDALONE_GROOVEBOX_2_ON_EMISSIVE);
            e.register(MIDI_STANDALONE_GROOVEBOX_3_ON_EMISSIVE);
            e.register(MIDI_KEYBOARD_CONTROLLER_ON_EMISSIVE);
            e.register(LED_FLOOR_LAMP_ON_EMISSIVE);
            e.register(LED_FLOOR_LAMP_RGB_ON_EMISSIVE);
            e.register(LED_FLOOR_LAMP_RGB_ON_2_EMISSIVE);
            e.register(LED_RGB_TRIANGLE_PANEL_ON_EMISSIVE);
            e.register(STUDIO_LIGHT_ON_EMISSIVE);

            e.register(MONITOR_SCREEN_BACK_1);
            e.register(MONITOR_SCREEN_BACK_2);
            e.register(MONITOR_SCREEN_BACK_3);
            e.register(MONITOR_SCREEN_BACK_4);
            e.register(MONITOR_STAND_MAIN_CENTER);
            e.register(MONITOR_STAND_MAIN_LEFT);
            e.register(MONITOR_STAND_MAIN_RIGHT);
            e.register(MONITOR_STAND_PART_1);
            e.register(MONITOR_STAND_PART_2);
            e.register(MONITOR_STAND_PART_3);
            e.register(MONITOR_STAND_PART_4);
            e.register(MONITOR_STAND_PART_5);
            e.register(MONITOR_STAND_PART_6);
            e.register(MONITOR_STAND_PART_7);
            e.register(MONITOR_STAND_PART_8);
            e.register(MONITOR_STAND_PART_9);
            e.register(MONITOR_ARM_PART_1);
            e.register(MONITOR_ARM_PART_2);
            e.register(MONITOR_ARM_PART_3);
            e.register(MONITOR_ARM_PART_4A);
            e.register(MONITOR_ARM_PART_4B);
            e.register(MONITOR_ARM_PART_5A);
            e.register(MONITOR_ARM_PART_5B);
            e.register(MONITOR_ARM_PART_6A);
            e.register(MONITOR_ARM_PART_6B);
            e.register(MONITOR_ARM_PART_7A);
            e.register(MONITOR_ARM_PART_7B);
            e.register(MONITOR_ARM_PART_8);
            e.register(MONITOR_ARM_PART_9);
        });

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = NhatJSFurnitureMod.MOD_ID, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
