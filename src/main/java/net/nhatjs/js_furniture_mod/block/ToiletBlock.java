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

public class ToiletBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public ToiletBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(4, 0, 13.35, 12, 7.85, 14.675),
            Block.box(4, 7.85, 13.35, 12, 17.35, 16),
            Block.box(4, 6.35, 2.15, 12, 9.325, 13.35),
            Block.box(5.325, 0, 5.35, 10.675, 6.35, 13.35)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(4, 0, 1.325, 12, 7.85, 2.65),
            Block.box(4, 7.85, 0, 12, 17.35, 2.65),
            Block.box(4, 6.35, 2.65, 12, 9.325, 13.85),
            Block.box(5.325, 0, 2.65, 10.675, 6.35, 10.65)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(1.325, 0, 4, 2.65, 7.85, 12),
            Block.box(0, 7.85, 4, 2.65, 17.35, 12),
            Block.box(2.65, 6.35, 4, 13.85, 9.325, 12),
            Block.box(2.65, 0, 5.325, 10.65, 6.35, 10.675)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(13.35, 0, 4, 14.675, 7.85, 12),
            Block.box(13.35, 7.85, 4, 16, 17.35, 12),
            Block.box(2.15, 6.35, 4, 13.35, 9.325, 12),
            Block.box(5.35, 0, 5.325, 13.35, 6.35, 10.675)
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