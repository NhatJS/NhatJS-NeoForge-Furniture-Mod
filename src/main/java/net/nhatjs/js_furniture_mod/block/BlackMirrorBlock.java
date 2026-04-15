package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.MirrorBlockEntity;
import org.jetbrains.annotations.Nullable;

public class BlackMirrorBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public BlackMirrorBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(2.5, -12, 15.2, 13.5, 28, 16);
            case SOUTH -> box(2.5, -12, 0, 13.5, 28, 0.8);
            case EAST -> box(0, -12, 2.5, 0.8, 28, 13.5);
            case WEST -> box(15.2, -12, 2.5, 16, 28, 13.5);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MirrorBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        BlockEntity entity = world.getBlockEntity(pos);
        if (!(entity instanceof MirrorBlockEntity mirror)) return InteractionResult.PASS;
        mirror.setStand(!mirror.makeStand());
        return InteractionResult.SUCCESS;
    }
}
