package net.nhatjs.js_furniture_mod.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient;
import net.nhatjs.js_furniture_mod.block.GrooveboxBlock;
import net.nhatjs.js_furniture_mod.blockentity.MIDIBlockEntity;
import net.nhatjs.js_furniture_mod.core.ModBlocks;

public class MIDIRenderer implements BlockEntityRenderer<MIDIBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();
    private final BakedModel midiStandaloneGrooveboxOnEmissive;
    private final BakedModel midiStandaloneGroovebox2OnEmissive;
    private final BakedModel midiStandaloneGroovebox3OnEmissive;
    private final BakedModel midiKeyboardControllerOnEmissive;

    public MIDIRenderer(BlockEntityRendererProvider.Context ctx) {
        midiStandaloneGrooveboxOnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.MIDI_STANDALONE_GROOVEBOX_ON_EMISSIVE);
        midiStandaloneGroovebox2OnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.MIDI_STANDALONE_GROOVEBOX_2_ON_EMISSIVE);
        midiStandaloneGroovebox3OnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.MIDI_STANDALONE_GROOVEBOX_3_ON_EMISSIVE);
        midiKeyboardControllerOnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.MIDI_KEYBOARD_CONTROLLER_ON_EMISSIVE);
    }

    @Override
    public void render(MIDIBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockPos pos = entity.getBlockPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        Block blockState = (level.getBlockState(BlockPos.containing(x, y, z))).getBlock();

        BlockState state = entity.getBlockState();
        float rotation = switch (state.getValue(GrooveboxBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        boolean powered = entity.isPowered();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);

        matrices.pushPose();
        matrices.translate(0.5, 0, 0.5);
        matrices.mulPose(Axis.YP.rotationDegrees(rotation));
        matrices.translate(-0.5, 0, -0.5);
        if (powered) {
            if (blockState == ModBlocks.MIDI_STANDALONE_GROOVEBOX.get()) {
                bmr.renderModel(matrices.last(), vc, state, midiStandaloneGrooveboxOnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get()) {
                bmr.renderModel(matrices.last(), vc, state, midiStandaloneGroovebox2OnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get()) {
                bmr.renderModel(matrices.last(), vc, state, midiStandaloneGroovebox3OnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.MIDI_KEYBOARD_CONTROLLER.get()) {
                bmr.renderModel(matrices.last(), vc, state, midiKeyboardControllerOnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
        }
        matrices.popPose();
    }
}
