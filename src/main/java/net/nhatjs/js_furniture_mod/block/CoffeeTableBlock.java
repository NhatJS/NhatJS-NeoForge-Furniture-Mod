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

public class CoffeeTableBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public CoffeeTableBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(-2.5, 0, 2.25, -1.25, 8, 3.5),
            Block.box(17.25, 0, 2.25, 18.5, 8, 3.5),
            Block.box(17.25, 0, 12.5, 18.5, 8, 13.75),
            Block.box(-2.5, 0, 12.5, -1.25, 8, 13.75),
            Block.box(-2, 4.625, 3.5, 8, 4.975, 12.5),
            Block.box(-2.5, 8, 2.25, 18.5, 9.25, 13.75),
            Block.box(8, 4.625, 3.5, 18, 4.975, 12.5)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(12.5, 0, -2.5, 13.75, 8, -1.25),
            Block.box(12.5, 0, 17.25, 13.75, 8, 18.5),
            Block.box(2.25, 0, 17.25, 3.5, 8, 18.5),
            Block.box(2.25, 0, -2.5, 3.5, 8, -1.25),
            Block.box(3.5, 4.625, -2, 12.5, 4.975, 8),
            Block.box(2.25, 8, -2.5, 13.75, 9.25, 18.5),
            Block.box(3.5, 4.625, 8, 12.5, 4.975, 18)
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