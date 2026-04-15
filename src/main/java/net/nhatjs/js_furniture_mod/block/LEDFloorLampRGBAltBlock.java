package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
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
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.LampBlockEntity;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import net.nhatjs.js_furniture_mod.core.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class LEDFloorLampRGBAltBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public LEDFloorLampRGBAltBlock(Properties settings) {
        super(settings.lightLevel(st -> st.getValue(TURN_ON) ? 12 : 0));
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false));
    }

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(1, 0, 15, 6, 0.75, 15.75),
            Block.box(0.25, 0, 10, 1, 0.75, 15.75),
            Block.box(0.25, 0.75, 15, 1, 32, 15.75)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(10, 0, 0.25, 15, 0.75, 1),
            Block.box(15, 0, 0.25, 15.75, 0.75, 6),
            Block.box(15, 0.75, 0.25, 15.75, 32, 1)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(0.25, 0, 1, 1, 0.75, 6),
            Block.box(0.25, 0, 0.25, 6, 0.75, 1),
            Block.box(0.25, 0.75, 0.25, 1, 32, 1)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(15, 0, 10, 15.75, 0.75, 15),
            Block.box(10, 0, 15, 15.75, 0.75, 15.75),
            Block.box(15, 0.75, 15, 15.75, 32, 15.75)
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TURN_ON);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LampBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                   Player player, BlockHitResult hit) {
        if (level.isClientSide()) return InteractionResult.SUCCESS;
        ItemStack held = player.getMainHandItem();
        boolean turnOn = state.getValue(TURN_ON);
        BlockEntity entity = level.getBlockEntity(pos);
        if (!(entity instanceof LampBlockEntity lampRGB)) return InteractionResult.PASS;

        if (!held.is(ModItems.REMOTE_CONTROL_RGB)) {
            boolean current = state.getValue(TURN_ON);
            level.setBlock(pos, state.setValue(TURN_ON, !current), Block.UPDATE_ALL);
            lampRGB.setPowered(!lampRGB.isPowered());
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        }

        if (held.is(ModItems.REMOTE_CONTROL_RGB)) {
            Direction facing =  state.getValue(HorizontalDirectionalBlock.FACING);
            boolean wasPowered = lampRGB.isPowered();
            lampRGB.setPowered(lampRGB.isPowered());
            BlockState newState = ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get().defaultBlockState()
                    .setValue(HorizontalDirectionalBlock.FACING, facing)
                    .setValue(LEDFloorLampRGBBlock.TURN_ON, turnOn);
            level.setBlock(pos, newState, Block.UPDATE_ALL);
            BlockEntity newEntity = level.getBlockEntity(pos);
            if (newEntity instanceof LampBlockEntity lampRGBAlt) {
                lampRGBAlt.setPowered(wasPowered);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        return Collections.singletonList(new ItemStack(ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2));
    }
}
