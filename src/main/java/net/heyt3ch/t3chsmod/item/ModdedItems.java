package net.heyt3ch.t3chsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.heyt3ch.t3chsmod.T3CHsMod;
import net.heyt3ch.t3chsmod.item.RockSalt.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

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
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(ModdedFoodComponents.BANANA)));


    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget", new Item(new FabricItemSettings()));

    public static final Item PINK_ROCK_SALT_CRYSTAL = registerItem("pink_rock_salt_crystal", new Item(new FabricItemSettings()));
    public static final Item BLUE_ROCK_SALT_CRYSTAL = registerItem("blue_rock_salt_crystal", new Item(new FabricItemSettings()));
    public static final Item GREEN_ROCK_SALT_CRYSTAL = registerItem("green_rock_salt_crystal", new Item(new FabricItemSettings()));
    public static final Item HALITE_CRYSTAL = registerItem("halite_crystal", new Item(new FabricItemSettings()));

    private static SmithingTemplateItem createHaliteUpgrade()
    {
        return new SmithingTemplateItem(Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.applies_to"))).formatted(Formatting.BLUE),
                Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.ingredients"))).formatted(Formatting.BLUE),
                Text.translatable(Util.createTranslationKey("upgrade", new Identifier("halite_upgrade"))).formatted(Formatting.GRAY),
                Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.base_slot_description"))),
                Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.additions_slot_description"))),
                List.of(new Identifier("item/empty_armor_slot_helmet"), new Identifier("item/empty_armor_slot_chestplate"), new Identifier("item/empty_armor_slot_leggings"), new Identifier("item/empty_armor_slot_boots")),
                List.of(new Identifier("item/empty_slot_ingot"), new Identifier("item/empty_slot_redstone_dust"), new Identifier("item/empty_slot_lapis_lazuli"), new Identifier("item/empty_slot_quartz"), new Identifier("item/empty_slot_diamond"), new Identifier("item/empty_slot_emerald"), new Identifier("item/empty_slot_amethyst_shard")));
    }
    public static final Item HALITE_UPGRADE = registerItem("halite_upgrade", createHaliteUpgrade());

    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword", new SwordItem(ModdedToolMaterial.ROSE_GOLD, 3, -2.4f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe", new PickaxeItem(ModdedToolMaterial.ROSE_GOLD, 1, -2.8f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe", new AxeItem(ModdedToolMaterial.ROSE_GOLD, 6, -3.1f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe", new HoeItem(ModdedToolMaterial.ROSE_GOLD, 0, 2f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel", new ShovelItem(ModdedToolMaterial.ROSE_GOLD, 0, 2f, new FabricItemSettings()));

    public static final Item PINK_ROCK_SALT_SWORD = registerItem("pink_rock_salt_sword", new SwordItem(ModdedToolMaterial.PINK_SALT_CRYSTAL, 3, -2.4f, new FabricItemSettings()));
    public static final Item PINK_ROCK_SALT_PICKAXE = registerItem("pink_rock_salt_pickaxe", new PinkRockSaltSword(ModdedToolMaterial.PINK_SALT_CRYSTAL, 1, -2.8f, new FabricItemSettings()));
    public static final Item PINK_ROCK_SALT_AXE = registerItem("pink_rock_salt_axe", new PinkRockSaltAxe(ModdedToolMaterial.PINK_SALT_CRYSTAL, 6, -3.1f, new FabricItemSettings()));
    public static final Item PINK_ROCK_SALT_HOE = registerItem("pink_rock_salt_hoe", new HoeItem(ModdedToolMaterial.PINK_SALT_CRYSTAL, 0, 2f, new FabricItemSettings()));
    public static final Item PINK_ROCK_SALT_SHOVEL = registerItem("pink_rock_salt_shovel", new ShovelItem(ModdedToolMaterial.PINK_SALT_CRYSTAL, 0, 2f, new FabricItemSettings()));
    public static final Item BLUE_ROCK_SALT_SWORD = registerItem("blue_rock_salt_sword", new SwordItem(ModdedToolMaterial.BLUE_SALT_CRYSTAL, 3, -2.4f, new FabricItemSettings()));
    public static final Item BLUE_ROCK_SALT_PICKAXE = registerItem("blue_rock_salt_pickaxe", new BlueRockSaltPickaxe(ModdedToolMaterial.BLUE_SALT_CRYSTAL, 1, -2.8f, new FabricItemSettings()));
    public static final Item BLUE_ROCK_SALT_AXE = registerItem("blue_rock_salt_axe", new AxeItem(ModdedToolMaterial.BLUE_SALT_CRYSTAL, 6, -3.1f, new FabricItemSettings()));
    public static final Item BLUE_ROCK_SALT_HOE = registerItem("blue_rock_salt_hoe", new HoeItem(ModdedToolMaterial.BLUE_SALT_CRYSTAL, 0, 2f, new FabricItemSettings()));
    public static final Item BLUE_ROCK_SALT_SHOVEL = registerItem("blue_rock_salt_shovel", new ShovelItem(ModdedToolMaterial.BLUE_SALT_CRYSTAL, 0, 2f, new FabricItemSettings()));

    public static final Item GREEN_ROCK_SALT_SWORD = registerItem("green_rock_salt_sword", new SwordItem(ModdedToolMaterial.GREEN_SALT_CRYSTAL, 3, -2.4f, new FabricItemSettings()));
    public static final Item GREEN_ROCK_SALT_PICKAXE = registerItem("green_rock_salt_pickaxe", new PickaxeItem(ModdedToolMaterial.GREEN_SALT_CRYSTAL, 1, -2.8f, new FabricItemSettings()));
    public static final Item GREEN_ROCK_SALT_AXE = registerItem("green_rock_salt_axe", new AxeItem(ModdedToolMaterial.GREEN_SALT_CRYSTAL, 6, -3.1f, new FabricItemSettings()));
    public static final Item GREEN_ROCK_SALT_HOE = registerItem("green_rock_salt_hoe", new GreenRockSaltHoe(ModdedToolMaterial.GREEN_SALT_CRYSTAL, 0, 2f, new FabricItemSettings()));
    public static final Item GREEN_ROCK_SALT_SHOVEL = registerItem("green_rock_salt_shovel", new ShovelItem(ModdedToolMaterial.GREEN_SALT_CRYSTAL, 0, 2f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots", new ArmorItem(ModdedArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ROSE_GOLD_HORSE_ARMOR = registerItem("rose_gold_horse_armor", new HorseArmorItem(6, "rose_gold", new FabricItemSettings()));

    private  static  void addItemsToFoodTab(FabricItemGroupEntries entries){
        entries.add(MANGO);
        entries.add(BANANA);
        entries.add(HALITE_CRYSTAL);
    }

    private  static  void addItemsToIngTab(FabricItemGroupEntries entries){
        entries.add(ROSE_GOLD_INGOT);
        entries.add(ROSE_GOLD_NUGGET);
        entries.add(PINK_ROCK_SALT_CRYSTAL);
        entries.add(BLUE_ROCK_SALT_CRYSTAL);
        entries.add(GREEN_ROCK_SALT_CRYSTAL);
        entries.add(HALITE_UPGRADE);
    }

    private  static  void addItemsToWeaponsTab(FabricItemGroupEntries entries){
        entries.add(ROSE_GOLD_SWORD);
        entries.add(ROSE_GOLD_HELMET);
        entries.add(ROSE_GOLD_CHESTPLATE);
        entries.add(ROSE_GOLD_LEGGINGS);
        entries.add(ROSE_GOLD_BOOTS);
        entries.add(ROSE_GOLD_HORSE_ARMOR);

        entries.add(PINK_ROCK_SALT_SWORD);
        entries.add(BLUE_ROCK_SALT_SWORD);
        entries.add(GREEN_ROCK_SALT_SWORD);
    }

    private  static  void addItemsToUtilTab(FabricItemGroupEntries entries){
        entries.add(ROSE_GOLD_PICKAXE);
        entries.add(ROSE_GOLD_HOE);
        entries.add(ROSE_GOLD_SHOVEL);
        entries.add(ROSE_GOLD_AXE);

        entries.add(PINK_ROCK_SALT_PICKAXE);
        entries.add(PINK_ROCK_SALT_HOE);
        entries.add(PINK_ROCK_SALT_SHOVEL);
        entries.add(PINK_ROCK_SALT_AXE);
        entries.add(BLUE_ROCK_SALT_PICKAXE);
        entries.add(BLUE_ROCK_SALT_HOE);
        entries.add(BLUE_ROCK_SALT_SHOVEL);
        entries.add(BLUE_ROCK_SALT_AXE);
        entries.add(GREEN_ROCK_SALT_PICKAXE);
        entries.add(GREEN_ROCK_SALT_HOE);
        entries.add(GREEN_ROCK_SALT_SHOVEL);
        entries.add(GREEN_ROCK_SALT_AXE);
    }
}
