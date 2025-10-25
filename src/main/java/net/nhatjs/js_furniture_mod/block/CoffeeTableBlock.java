package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.blockentity.client.CoffeeTableBlockEntity;
import org.jetbrains.annotations.Nullable;

public class CoffeeTableBlock extends Block implements EntityBlock {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty HAS_ITEM = BooleanProperty.create("has_item");

    public CoffeeTableBlock(Properties settings) {
        super(settings);
        registerDefaultState(getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(HAS_ITEM, false));
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
        builder.add(FACING, HAS_ITEM);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CoffeeTableBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        if (level.isClientSide()) return InteractionResult.SUCCESS;

        CoffeeTableBlockEntity be = (CoffeeTableBlockEntity) level.getBlockEntity(pos);
        ItemStack held = player.getMainHandItem();

        assert be != null;
        if (be.getItem().isEmpty() && !held.isEmpty()) {
            ItemStack put = held.copy(); put.setCount(1);
            be.setItem(put);
            held.shrink(1);
        } else if (!be.getItem().isEmpty()) {
            Containers.dropItemStack(level, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, be.getItem());
            be.setItem(ItemStack.EMPTY);
        }
        return InteractionResult.CONSUME; // đã xử lý
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos,
                                BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof CoffeeTableBlockEntity ct) {
                ItemStack s = ct.getItem();
                NonNullList<ItemStack> items = NonNullList.withSize(1, ItemStack.EMPTY);
                items.set(0, s);
            }
            super.onRemove(state, level, pos, newState, moved);
        } else super.onRemove(state, level, pos, newState, moved);
    }
}