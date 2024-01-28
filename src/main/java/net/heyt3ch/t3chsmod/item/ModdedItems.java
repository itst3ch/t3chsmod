package net.heyt3ch.t3chsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.heyt3ch.t3chsmod.T3CHsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModdedItems
{
    public static void registerModItems(){
        T3CHsMod.LOGGER.info("Registering mod items for " + T3CHsMod.MOD_ID); //runs at init to register all items
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModdedItems :: addItemsToFoodTab);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(T3CHsMod.MOD_ID, name), item); //method to use for registration of items
    }

    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings())); //registers mango item

    private  static  void addItemsToFoodTab(FabricItemGroupEntries entries){
        entries.add(MANGO);
    }
}
