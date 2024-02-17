package net.heyt3ch.t3chsmod.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class RedSandGrass extends FlowerBlock {
    public RedSandGrass(StatusEffect stewEffect, int duration, Settings settings) {
        super(stewEffect, duration, settings);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
    {
        BlockPos blockBelowPos = pos.down();
        BlockState blockBelow = world.getBlockState(blockBelowPos);
        return blockBelow.getBlock() == Blocks.RED_SAND;
    }

}
