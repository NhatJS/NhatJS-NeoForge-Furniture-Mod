package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModernTableBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public ModernTableBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(-12, 15, 0, 28, 16, 16),
            Block.box(-11.75, 0, 0.25, -10.75, 15, 1.25),
            Block.box(-11.75, 0, 14.75, -10.75, 15, 15.75),
            Block.box(26.75, 0, 14.75, 27.75, 15, 15.75),
            Block.box(26.75, 0, 0.25, 27.75, 15, 1.25),
            Block.box(26.85, 0.4, 1.25, 27.65, 1.2, 14.75),
            Block.box(-11.65, 0.4, 1.25, -10.85, 1.2, 14.75)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(0, 15, -12, 16, 16, 28),
            Block.box(14.75, 0, -11.75, 15.75, 15, -10.75),
            Block.box(0.25, 0, -11.75, 1.25, 15, -10.75),
            Block.box(0.25, 0, 26.75, 1.25, 15, 27.75),
            Block.box(14.75, 0, 26.75, 15.75, 15, 27.75),
            Block.box(1.25, 0.4, 26.85, 14.75, 1.2, 27.65),
            Block.box(1.25, 0.4, -11.65, 14.75, 1.2, -10.85)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> HORIZONTAL;
            case SOUTH -> HORIZONTAL;
            case EAST -> VERTICAL;
            case WEST -> VERTICAL;
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}