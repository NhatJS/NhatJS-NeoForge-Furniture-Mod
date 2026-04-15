package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import net.nhatjs.js_furniture_mod.core.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NhatJSFurnitureMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.REMOTE_CONTROL_RGB.get());
        basicItem(ModItems.CPU.get());
        basicItem(ModBlocks.BLACK_MIRROR.toStack().getItem());
        basicItem(ModItems.MAINBOARD.get());
        basicItem(ModBlocks.MONITOR.toStack().getItem());
        basicItem(ModBlocks.MONITOR_SETUP.toStack().getItem());
        basicItem(ModItems.RAM.get());
        basicItem(ModItems.AIO_COOLER.get());
        basicItem(ModItems.COMPUTER_FAN.get());
        basicItem(ModItems.GPU.get());
        basicItem(ModItems.PSU.get());
        basicItem(ModItems.GARBAGE_ITEM.get());

        withExistingParent(ModBlocks.BLACK_CEILING_FAN_BLACK.getId().toString(), modLoc("block/black_ceiling_fan_black"));
        withExistingParent(ModBlocks.BLACK_CEILING_FAN_WHITE.getId().toString(), modLoc("block/black_ceiling_fan_white"));
        withExistingParent(ModBlocks.WHITE_CEILING_FAN_BLACK.getId().toString(), modLoc("block/white_ceiling_fan_black"));
        withExistingParent(ModBlocks.WHITE_CEILING_FAN_WHITE.getId().toString(), modLoc("block/white_ceiling_fan_white"));
        withExistingParent(ModBlocks.WOOD_LIGHT_CEILING_FAN_BLACK.getId().toString(), modLoc("block/wood_light_ceiling_fan_black"));
        withExistingParent(ModBlocks.WOOD_LIGHT_CEILING_FAN_WHITE.getId().toString(), modLoc("block/wood_light_ceiling_fan_white"));
        withExistingParent(ModBlocks.WOOD_MEDIUM_CEILING_FAN_BLACK.getId().toString(), modLoc("block/wood_medium_ceiling_fan_black"));
        withExistingParent(ModBlocks.WOOD_MEDIUM_CEILING_FAN_WHITE.getId().toString(), modLoc("block/wood_medium_ceiling_fan_white"));

        withExistingParent(ModBlocks.KITCHEN_CABINET_BOTTOM.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_bottom"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_BOTTOM_2.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_bottom_2"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_bottom_2_extra"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_BOTTOM_B.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_bottom_b"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_bottom_b_2"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_bottom_b_with_sink"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_bottom_with_sink"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_TOP.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_top"));
        withExistingParent(ModBlocks.KITCHEN_CABINET_TOP_B.getId().toString(), modLoc("block/wood_light_kitchen_cabinet_top_b"));
        withExistingParent(ModBlocks.KITCHEN_DRAWERS.getId().toString(), modLoc("block/wood_light_kitchen_drawers"));
        withExistingParent(ModBlocks.KITCHEN_DRAWERS_B.getId().toString(), modLoc("block/wood_light_kitchen_drawers_b"));
        withExistingParent(ModBlocks.LAPTOP.getId().toString(), modLoc("block/laptop_opened_off"));
        withExistingParent(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.getId().toString(), modLoc("block/laptop_opened_off_portable_laptop_stand"));
        withExistingParent(ModBlocks.VERTICAL_BLINDS.getId().toString(), modLoc("block/white_vertical_blinds"));
        withExistingParent(ModBlocks.WOOD_3_DRAWER_DRESSER.getId().toString(), modLoc("block/wood_light_3_drawer_dresser"));
        withExistingParent(ModBlocks.WOOD_CHAIR.getId().toString(), modLoc("block/wood_light_chair"));
        withExistingParent(ModBlocks.WOOD_COFFEE_TABLE.getId().toString(), modLoc("block/wood_light_coffee_table"));
        withExistingParent(ModBlocks.WOOD_DESK.getId().toString(), modLoc("block/wood_light_desk"));
        withExistingParent(ModBlocks.WOOD_LIGHT_TV_STAND.getId().toString(), modLoc("block/wood_light_tv_stand"));
        withExistingParent(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.getId().toString(), modLoc("block/medium_wood_striped_wall"));
        withExistingParent(ModBlocks.WOOD_STANDING_DESK.getId().toString(), modLoc("block/wood_light_standing_desk"));
        withExistingParent(ModBlocks.WOOD_STANDING_DESK_B.getId().toString(), modLoc("block/wood_light_standing_desk_b"));
        withExistingParent(ModBlocks.WOOD_STRIPED_WALL.getId().toString(), modLoc("block/light_wood_striped_wall"));
    }
}
