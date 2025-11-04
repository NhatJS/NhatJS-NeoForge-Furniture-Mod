package net.nhatjs.js_furniture_mod.entity.client.renderer;

import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.nhatjs.js_furniture_mod.entity.client.SeatBlockEntity;

public class SeatRenderer extends EntityRenderer<SeatBlockEntity> {
    public SeatRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SeatBlockEntity entity) {
        return null;
    }

    @Override
    public boolean shouldRender(SeatBlockEntity entity, Frustum frustum, double x, double y, double z) {
        return true;
    }
}