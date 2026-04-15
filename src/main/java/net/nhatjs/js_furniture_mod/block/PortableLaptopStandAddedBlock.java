package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.LaptopBlockEntity;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import org.jetbrains.annotations.Nullable;

public class PortableLaptopStandAddedBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");
    public static final BooleanProperty OPEN = BooleanProperty.create("open");

    public PortableLaptopStandAddedBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false)
                .setValue(OPEN, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TURN_ON, OPEN);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(1.95, 0, 3.5, 14.05, 4.45, 12.5);
            case SOUTH -> Block.box(1.95, 0, 3.5, 14.05, 4.45, 12.5);
            case EAST -> Block.box(3.5, 0, 1.95, 12.5, 4.45, 14.05);
            case WEST -> Block.box(3.5, 0, 1.95, 12.5, 4.45, 14.05);
        };
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LaptopBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        if (level.isClientSide()) return InteractionResult.SUCCESS;

        boolean open = state.getValue(OPEN);
        boolean turnOn = state.getValue(TURN_ON);

        double x = hit.getBlockPos().getX();
        double y = hit.getBlockPos().getY();
        double z = hit.getBlockPos().getZ();

        if (player.isShiftKeyDown()) {
            if (open == false) {
                level.setBlock(pos, state.setValue(OPEN, true), Block.UPDATE_ALL);
                return InteractionResult.CONSUME;
            }
            if (open == true) {
                if (turnOn) return InteractionResult.CONSUME;
                level.setBlock(pos, state.setValue(OPEN, false), Block.UPDATE_ALL);
                return InteractionResult.CONSUME;
            }
            return InteractionResult.CONSUME;
        }
        else if (!player.isShiftKeyDown() && open == false && player.getMainHandItem().isEmpty()) {
            Direction facing =  state.getValue(HorizontalDirectionalBlock.FACING);
            level.setBlock(pos, ModBlocks.PORTABLE_LAPTOP_STAND.get().defaultBlockState()
                    .setValue(HorizontalDirectionalBlock.FACING, facing), Block.UPDATE_ALL);
            if (level instanceof ServerLevel _level) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModBlocks.LAPTOP));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }

            return InteractionResult.SUCCESS;
        }

        if (open == true) {
            if (turnOn) {
                level.setBlock(pos, state.setValue(TURN_ON, false), Block.UPDATE_ALL);
            } else {
                level.setBlock(pos, state.setValue(TURN_ON, true), Block.UPDATE_ALL);
            }
            BlockEntity entity = level.getBlockEntity(pos);
            if (!(entity instanceof LaptopBlockEntity light)) return InteractionResult.PASS;
            light.setPowered(!light.isPowered());
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        }

        return InteractionResult.CONSUME;
    }
}
