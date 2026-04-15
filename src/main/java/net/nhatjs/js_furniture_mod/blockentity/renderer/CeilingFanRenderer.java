package net.nhatjs.js_furniture_mod.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import net.nhatjs.js_furniture_mod.blockentity.CeilingFanBlockEntity;

import static net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient.*;

public class CeilingFanRenderer implements BlockEntityRenderer<CeilingFanBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();
    ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
    private final BakedModel blades_black;
    private final BakedModel blades_white;

    private final BakedModel woodLightBladesBlack;
    private final BakedModel woodMediumBladesBlack;
    private final BakedModel blackBladesBlack;
    private final BakedModel whiteBladesBlack;
    private final BakedModel woodLightBladesWhite;
    private final BakedModel woodMediumBladesWhite;
    private final BakedModel blackBladesWhite;
    private final BakedModel whiteBladesWhite;

    public CeilingFanRenderer(BlockEntityRendererProvider.Context ctx) {
        blades_black = mc.getModelManager().getModel(CEILING_FAN_BLADES);
        blades_white = mc.getModelManager().getModel(CEILING_FAN_BLADES_B);

        woodLightBladesBlack = mc.getModelManager().getModel(WOOD_LIGHT_CEILING_FAN_BLADES_BLACK);
        woodMediumBladesBlack = mc.getModelManager().getModel(WOOD_MEDIUM_CEILING_FAN_BLADES_BLACK);
        blackBladesBlack = mc.getModelManager().getModel(BLACK_CEILING_FAN_BLADES_BLACK);
        whiteBladesBlack = mc.getModelManager().getModel(WHITE_CEILING_FAN_BLADES_BLACK);
        woodLightBladesWhite = mc.getModelManager().getModel(WOOD_LIGHT_CEILING_FAN_BLADES_WHITE);
        woodMediumBladesWhite = mc.getModelManager().getModel(WOOD_MEDIUM_CEILING_FAN_BLADES_WHITE);
        blackBladesWhite = mc.getModelManager().getModel(BLACK_CEILING_FAN_BLADES_WHITE);
        whiteBladesWhite = mc.getModelManager().getModel(WHITE_CEILING_FAN_BLADES_WHITE);
    }

    @Override
    public void render(CeilingFanBlockEntity be, float tickDelta,
                       PoseStack ps, MultiBufferSource buf, int light, int overlay) {
        Level level = be.getLevel();
        if (level == null) return;

        BlockPos pos = be.getBlockPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        VertexConsumer vc = buf.getBuffer(RenderType.cutoutMipped());
        Block blockState = (level.getBlockState(BlockPos.containing(x, y, z))).getBlock();

        ps.pushPose();
        ps.translate(0.5, 0.9375, 0.5);
        ps.mulPose(Axis.YP.rotationDegrees(be.getAngle(tickDelta)));
        ps.translate(-0.5, -0.9375, -0.5);

        //unused
        if (blockState == ModBlocks.CEILING_FAN.get()) {
            bmr.tesselateWithAO(level, blades_black, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }

        else if (blockState == ModBlocks.CEILING_FAN_B.get()) {
            bmr.tesselateWithAO(level, blades_white, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        //unused

        if (blockState == ModBlocks.WOOD_LIGHT_CEILING_FAN_BLACK.get()) {
            bmr.tesselateWithAO(level, woodLightBladesBlack, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        else if (blockState == ModBlocks.WOOD_MEDIUM_CEILING_FAN_BLACK.get()) {
            bmr.tesselateWithAO(level, woodMediumBladesBlack, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        else if (blockState == ModBlocks.BLACK_CEILING_FAN_BLACK.get()) {
            bmr.tesselateWithAO(level, blackBladesBlack, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        else if (blockState == ModBlocks.WHITE_CEILING_FAN_BLACK.get()) {
            bmr.tesselateWithAO(level, whiteBladesBlack, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        else if (blockState == ModBlocks.WOOD_LIGHT_CEILING_FAN_WHITE.get()) {
            bmr.tesselateWithAO(level, woodLightBladesWhite, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        else if (blockState == ModBlocks.WOOD_MEDIUM_CEILING_FAN_WHITE.get()) {
            bmr.tesselateWithAO(level, woodMediumBladesWhite, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        else if (blockState == ModBlocks.BLACK_CEILING_FAN_WHITE.get()) {
            bmr.tesselateWithAO(level, blackBladesWhite, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        else if (blockState == ModBlocks.WHITE_CEILING_FAN_WHITE.get()) {
            bmr.tesselateWithAO(level, whiteBladesWhite, be.getBlockState(), pos, ps, vc, false, level.random, light, overlay);
        }
        ps.popPose();
    }
}