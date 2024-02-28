package net.heyt3ch.t3chsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.heyt3ch.t3chsmod.block.ModdedBlocks;
import net.heyt3ch.t3chsmod.item.ModdedItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModdedBlocks.ROSE_GOLD_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModdedBlocks.ROSE_GOLD_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModdedBlocks.PINK_ROCK_SALT_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModdedBlocks.PINK_ROCK_SALT_BLOCK);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModdedBlocks.BLUE_ROCK_SALT_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModdedBlocks.BLUE_ROCK_SALT_BLOCK);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModdedBlocks.GREEN_ROCK_SALT_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModdedBlocks.GREEN_ROCK_SALT_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModdedBlocks.HALITE_INFUSED_GLASS);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModdedBlocks.HALITE_INFUSED_GLASS);
    }
}
