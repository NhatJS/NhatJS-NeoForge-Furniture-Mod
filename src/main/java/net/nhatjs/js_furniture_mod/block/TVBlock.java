package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class TVBlock extends FurnitureHorizontalBlock {
    public static final EnumProperty<Mount> MOUNT = EnumProperty.create("mount", Mount.class);

    public TVBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(MOUNT, Mount.STAND));
    }

    public enum Mount implements StringRepresentable
    {
        STAND("stand"),
        WALL("wall");

        private final String name;

        Mount(String name)
        {
            this.name = name;
        }

        @Override
        public String getSerializedName()
        {
            return name;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, MOUNT);
    }

    private static final VoxelShape NORTH_MOUNT = Block.box(0, 0, 15, 16, 16, 16);
    private static final VoxelShape SOUTH_MOUNT = Block.box(0, 0, 0, 16, 16, 1);
    private static final VoxelShape WEST_MOUNT = Block.box(15, 0, 0, 16, 16, 16);
    private static final VoxelShape EAST_MOUNT = Block.box(0, 0, 0, 1, 16, 16);

    private static final VoxelShape NORTH_STAND = Block.box(0, 0, 14, 16, 15, 15);
    private static final VoxelShape SOUTH_STAND = Block.box(0, 0, 1, 16, 15, 2);
    private static final VoxelShape WEST_STAND = Block.box(14, 0, 0, 15, 15, 16);
    private static final VoxelShape EAST_STAND = Block.box(1, 0, 0, 2, 15, 16);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        boolean wall = state.getValue(MOUNT) == Mount.WALL;
        return switch (state.getValue(FACING)) {
            default -> wall ? NORTH_MOUNT : Shapes.or(NORTH_STAND);
            case SOUTH -> wall ? SOUTH_MOUNT : Shapes.or(SOUTH_STAND);
            case EAST -> wall ? EAST_MOUNT : Shapes.or(EAST_STAND);
            case WEST -> wall ? WEST_MOUNT : Shapes.or(WEST_STAND);
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Direction face = ctx.getClickedFace();
        if (face.getAxis().isHorizontal()) {
            BlockPos back = ctx.getClickedPos().offset(face.getOpposite().getNormal());
            if (hasSupport(ctx.getLevel(), back, face)) {
                return defaultBlockState()
                        .setValue(FACING, face)
                        .setValue(MOUNT, Mount.WALL);
            }
            return null;
        }
        return defaultBlockState()
                .setValue(FACING, ctx.getHorizontalDirection().getOpposite())
                .setValue(MOUNT, Mount.STAND);
    }

    private boolean hasSupport(LevelAccessor world, BlockPos pos, Direction supportFace) {
        BlockState bs = world.getBlockState(pos);
        return bs.isFaceSturdy(world, pos, supportFace) || bs.isRedstoneConductor(world, pos);
    }
}
