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

public class StandingDeskBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public StandingDeskBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(-11.8, 0, 0.25, -9.75, 0.75, 15.75),
            Block.box(-11.8, 0.75, 8.75, -9.75, 15.25, 11),
            Block.box(25.75, 0, 0.25, 27.8, 0.75, 15.75),
            Block.box(25.75, 0.75, 8.75, 27.8, 15.25, 11),
            Block.box(-9.75, 13.65, 8.25, 25.75, 15.25, 11.5),
            Block.box(-12.75, 15.25, 0, 28.75, 16, 16)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(-11.8, 0, 0.25, -9.75, 0.75, 15.75),
            Block.box(-11.8, 0.75, 5, -9.75, 15.25, 7.25),
            Block.box(25.75, 0, 0.25, 27.8, 0.75, 15.75),
            Block.box(25.75, 0.75, 5, 27.8, 15.25, 7.25),
            Block.box(-9.75, 13.65, 4.5, 25.75, 15.25, 7.75),
            Block.box(-12.75, 15.25, 0, 28.75, 16, 16)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(0.25, 0, -11.8, 15.75, 0.75, -9.75),
            Block.box(5, 0.75, -11.8, 7.25, 15.25, -9.75),
            Block.box(0.25, 0, 25.75, 15.75, 0.75, 27.8),
            Block.box(5, 0.75, 25.75, 7.25, 15.25, 27.8),
            Block.box(5, 13.65, -9.75, 7.75, 15.25, 25.75),
            Block.box(0, 15.25, -12.75, 16, 16, 28.75)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(0.25, 0, -11.8, 15.75, 0.75, -9.75),
            Block.box(8.75, 0.75, -11.8, 11, 15.25, -9.75),
            Block.box(0.25, 0, 25.75, 15.75, 0.75, 27.8),
            Block.box(8.75, 0.75, 25.75, 11, 15.25, 27.8),
            Block.box(8.25, 13.65, -9.75, 11.5, 15.25, 25.75),
            Block.box(0, 15.25, -12.75, 16, 16, 28.75)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> NORTH;
            case SOUTH -> SOUTH;
            case EAST -> EAST;
            case WEST -> WEST;
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