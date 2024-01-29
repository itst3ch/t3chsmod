package net.heyt3ch.t3chsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.heyt3ch.t3chsmod.T3CHsMod;
import net.heyt3ch.t3chsmod.block.custom.SandGrass;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModdedBlocks {
    public static void registerModBlocks() {
        T3CHsMod.LOGGER.info("Registering mod blocks for " + T3CHsMod.MOD_ID); //runs at init to register all blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModdedBlocks:: addItemsToNaturalTab); //adds entries to food tab
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(T3CHsMod.MOD_ID, name), block); //method to use for registration of items
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(T3CHsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private  static  void addItemsToNaturalTab(FabricItemGroupEntries entries){
        entries.add(SAND_GRASS);
    }

    public static final Block SAND_GRASS = registerBlock("sand_grass", new SandGrass(StatusEffects.ABSORPTION, 0, FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
}