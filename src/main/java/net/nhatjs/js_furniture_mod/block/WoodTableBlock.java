package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WoodTableBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public WoodTableBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(-16, 14.5, 0, 32, 16, 16),
            Block.box(-14.7, 13.5, 0, 30.75, 14.5, 0.9),
            Block.box(-16, 0, 14.75, -14.75, 14.5, 16),
            Block.box(-16, 0, 0, -14.75, 14.5, 1.25),
            Block.box(30.75, 0, 14.75, 32, 14.5, 16),
            Block.box(30.75, 0, 0, 32, 14.5, 1.25),
            Block.box(-14.75, 13.5, 15.1, 30.75, 14.5, 16),
            Block.box(32, 13.5, 1.25, 32, 14.5, 14.75),
            Block.box(-16, 13.5, 1.25, -15.1, 14.5, 14.75)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(0, 14.5, -16, 16, 16, 32),
            Block.box(15.1, 13.5, -14.75, 16, 14.5, 30.75),
            Block.box(0, 0, -16, 1.25, 14.5, -14.75),
            Block.box(14.75, 0, -16, 16, 14.5, -14.75),
            Block.box(0, 0, 30.75, 1.25, 14.5, 32),
            Block.box(14.75, 0, 30.75, 16, 14.5, 32),
            Block.box(0, 13.5, -14.75, 0.9, 14.5, 30.75),
            Block.box(1.25, 13.5, 31.1, 14.75, 14.5, 32),
            Block.box(1.25, 13.5, -16, 14.75, 14.5, -15.1)
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