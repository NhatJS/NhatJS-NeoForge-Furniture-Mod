package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.CoffeeTableBlockEntity;
import org.jetbrains.annotations.Nullable;

public class CoffeeTableBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public static final BooleanProperty HAS_ITEM = BooleanProperty.create("has_item");

    public CoffeeTableBlock(Properties settings) {
        super(settings);
        registerDefaultState(getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(HAS_ITEM, false));
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            box(-2.5, 0, 2.25, -1, 7.75, 3.75),
            box(17, 0, 2.25, 18.5, 7.75, 3.75),
            box(17, 0, 12.25, 18.5, 7.75, 13.75),
            box(-2.5, 0, 12.25, -1, 7.75, 13.75),
            box(-2.5, 7.75, 2.25, 18.5, 9.25, 13.75),
            box(-2, 2.625, 3.75, 18, 3.625, 12.25)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            box(12.25, 0, -2.5, 13.75, 7.75, -1),
            box(12.25, 0, 17, 13.75, 7.75, 18.5),
            box(2.25, 0, 17, 3.75, 7.75, 18.5),
            box(2.25, 0, -2.5, 3.75, 7.75, -1),
            box(2.25, 7.75, -2.5, 13.75, 9.25, 18.5),
            box(3.75, 2.625, -2, 12.25, 3.625, 18)
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
        return InteractionResult.CONSUME;
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

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide()) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof CoffeeTableBlockEntity table) {
                ItemStack s = table.getItem();
                if (!s.isEmpty()) {
                    Containers.dropItemStack(level, pos.getX(), pos.getY(), pos.getZ(), s);
                    table.setItem(ItemStack.EMPTY);
                }
            }
        }
        super.playerWillDestroy(level, pos, state, player);
        return state;
    }
}