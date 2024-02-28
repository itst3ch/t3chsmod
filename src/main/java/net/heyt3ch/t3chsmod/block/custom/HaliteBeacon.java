package net.heyt3ch.t3chsmod.block.custom;

import net.minecraft.block.BeaconBlock;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class HaliteBeacon extends BeaconBlock implements BlockEntityProvider
{
    public HaliteBeacon(Settings settings)
    {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new HaliteBeaconBlockEntity(pos, state);
    }
}
