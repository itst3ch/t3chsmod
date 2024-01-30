package net.heyt3ch.t3chsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.heyt3ch.t3chsmod.T3CHsMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModdedItems
{
    public static void registerModItems(){
        T3CHsMod.LOGGER.info("Registering mod items for " + T3CHsMod.MOD_ID); //runs at init to register all items
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModdedItems :: addItemsToFoodTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModdedItems :: addItemsToIngTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModdedItems :: addItemsToWeaponsTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModdedItems :: addItemsToUtilTab);

    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(T3CHsMod.MOD_ID, name), item); //method to use for registration of items
    }

    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(ModdedFoodComponents.MANGO)));


    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword", new SwordItem(ModdedToolMaterial.ROSE_GOLD, 3, -2.4f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe", new PickaxeItem(ModdedToolMaterial.ROSE_GOLD, 1, 2f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe", new AxeItem(ModdedToolMaterial.ROSE_GOLD, 6, -3.1f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe", new HoeItem(ModdedToolMaterial.ROSE_GOLD, 0, 2f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel", new ShovelItem(ModdedToolMaterial.ROSE_GOLD, 0, 2f, new FabricItemSettings()));

    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private  static  void addItemsToFoodTab(FabricItemGroupEntries entries){
        entries.add(MANGO);
    }

    private  static  void addItemsToIngTab(FabricItemGroupEntries entries){
        entries.add(ROSE_GOLD_INGOT);
    }

    private  static  void addItemsToWeaponsTab(FabricItemGroupEntries entries){
        entries.add(ROSE_GOLD_SWORD);
        entries.add(ROSE_GOLD_HELMET);
        entries.add(ROSE_GOLD_CHESTPLATE);
        entries.add(ROSE_GOLD_LEGGINGS);
        entries.add(ROSE_GOLD_BOOTS);
    }

    private  static  void addItemsToUtilTab(FabricItemGroupEntries entries){
        entries.add(ROSE_GOLD_PICKAXE);
        entries.add(ROSE_GOLD_HOE);
        entries.add(ROSE_GOLD_SHOVEL);
        entries.add(ROSE_GOLD_AXE);
    }
}
