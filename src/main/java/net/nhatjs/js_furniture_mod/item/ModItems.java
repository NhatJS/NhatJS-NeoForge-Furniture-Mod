package net.nhatjs.js_furniture_mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NhatJSFurnitureMod.MOD_ID);

    public static final DeferredItem<Item> REMOTE_CONTROL_RGB = ITEMS.register("remote_control_rgb", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CPU = ITEMS.register("cpu", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAINBOARD = ITEMS.register("mainboard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAM = ITEMS.register("ram", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AIO_COOLER = ITEMS.register("aio_cooler", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMPUTER_FAN = ITEMS.register("computer_fan", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GPU = ITEMS.register("gpu", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PSU = ITEMS.register("psu", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
