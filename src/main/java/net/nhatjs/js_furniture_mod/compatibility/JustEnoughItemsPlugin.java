package net.nhatjs.js_furniture_mod.compatibility;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;

@JeiPlugin
public class JustEnoughItemsPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(NhatJSFurnitureMod.MOD_ID, "jei_plugin");
    }
}
