package net.nhatjs.js_furniture_mod.blockentity.client;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.block.CeilingFanBlock;
import net.nhatjs.js_furniture_mod.blockentity.ModBlockEntities;

public class CeilingFanBlockEntity extends BlockEntity {
    public float angle = 0f;
    public float speed = 0f;

    private static final float MAX_SPEED = 35f;
    private static final float ACCEL = 0.98f;

    private boolean isOn = false;

    public CeilingFanBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CEILING_FAN.get(), pos, state);
    }

    public void tick() {
        if (level == null) return;
        boolean on = getBlockState().getValue(CeilingFanBlock.TURN_ON);

        float target = on ? MAX_SPEED : 0f;

        speed = Mth.lerp(0.02f, speed, target);
        if (Math.abs(speed) < 0.01f && target == 0f) speed = 0f;

        angle = (angle + speed) % 360f;
    }

    public float getAngle(float tickDelta) {
        return angle + speed * tickDelta;
    }

    public void toggle() {
        isOn = !isOn;
    }
}