package net.heyt3ch.t3chsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.heyt3ch.t3chsmod.T3CHsMod;
import net.heyt3ch.t3chsmod.block.custom.HaliteBeacon;
import net.heyt3ch.t3chsmod.block.custom.RedSandGrass;
import net.heyt3ch.t3chsmod.block.custom.SandGrass;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModdedBlocks:: addItemsToNaturalTab); //adds entries to natural tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModdedBlocks:: addItemsToBuildingTab); //adds entries to building blocks tab

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
        entries.add(RED_SAND_GRASS);
        entries.add(HALITE_ORE);
    }

    private  static  void addItemsToBuildingTab(FabricItemGroupEntries entries){
        entries.add(ROSE_GOLD_BLOCK);
        entries.add(PINK_ROCK_SALT_BLOCK);
        entries.add(BLUE_ROCK_SALT_BLOCK);
        entries.add(GREEN_ROCK_SALT_BLOCK);
        entries.add(HALITE_CRYSTAL_BLOCK);
        entries.add(HALITE_INFUSED_GLASS);
        entries.add(HALITE_INFUSED_BEACON);
    }

    public static final Block SAND_GRASS = registerBlock("sand_grass", new SandGrass(StatusEffects.ABSORPTION, 0, FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
    public static final Block RED_SAND_GRASS = registerBlock("red_sand_grass", new RedSandGrass(StatusEffects.ABSORPTION, 0, FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PINK_ROCK_SALT_BLOCK = registerBlock("pink_rock_salt_block", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block GREEN_ROCK_SALT_BLOCK = registerBlock("green_rock_salt_block", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block BLUE_ROCK_SALT_BLOCK = registerBlock("blue_rock_salt_block", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));

    public static final Block HALITE_ORE = registerBlock("halite_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block HALITE_CRYSTAL_BLOCK = registerBlock("halite_crystal_block", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block HALITE_INFUSED_GLASS = registerBlock("halite_infused_glass", new Block(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS).nonOpaque()));
    public static final Block HALITE_INFUSED_BEACON = registerBlock("halite_infused_beacon", new HaliteBeacon(FabricBlockSettings.copyOf(Blocks.BEACON).nonOpaque()));
}