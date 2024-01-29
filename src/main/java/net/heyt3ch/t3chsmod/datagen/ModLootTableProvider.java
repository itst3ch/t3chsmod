package net.heyt3ch.t3chsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.heyt3ch.t3chsmod.block.ModdedBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

    }
}
