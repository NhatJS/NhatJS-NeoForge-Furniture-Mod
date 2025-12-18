package net.nhatjs.js_furniture_mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NhatJSFurnitureMod.MOD_ID);

    public static final DeferredItem<Item> REMOTE_CONTROL_RGB = ITEMS.registerItem("remote_control_rgb", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CPU = ITEMS.registerItem("cpu", Item::new, new Item.Properties());
    public static final DeferredItem<Item> MAINBOARD = ITEMS.registerItem("mainboard", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAM = ITEMS.registerItem("ram", Item::new, new Item.Properties());
    public static final DeferredItem<Item> AIO_COOLER = ITEMS.registerItem("aio_cooler", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COMPUTER_FAN = ITEMS.registerItem("computer_fan", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GPU = ITEMS.registerItem("gpu", Item::new, new Item.Properties());
    public static final DeferredItem<Item> PSU = ITEMS.registerItem("psu", Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
