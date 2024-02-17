package net.heyt3ch.t3chsmod.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModdedToolMaterial implements ToolMaterial
{
    ROSE_GOLD(350, 6.0f, 2.0f, MiningLevels.IRON, 14, () -> Ingredient.ofItems(ModdedItems.ROSE_GOLD_INGOT)),
    PINK_SALT_CRYSTAL(131, 5.0f, 2.0f, MiningLevels.IRON, 14, () -> Ingredient.ofItems(ModdedItems.PINK_ROCK_SALT_CRYSTAL)),
    BLUE_SALT_CRYSTAL(250, 6.0f, 3.0f, MiningLevels.IRON, 14, () -> Ingredient.ofItems(ModdedItems.BLUE_ROCK_SALT_CRYSTAL)),
    GREEN_SALT_CRYSTAL(200, 7.0f, 2.0f, MiningLevels.IRON, 14, () -> Ingredient.ofItems(ModdedItems.GREEN_ROCK_SALT_CRYSTAL));


    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModdedToolMaterial(int durability, float miningSpeed, float attackDamage, int miningLevel, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
