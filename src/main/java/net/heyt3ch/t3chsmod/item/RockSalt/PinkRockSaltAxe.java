package net.heyt3ch.t3chsmod.item.RockSalt;

import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class PinkRockSaltAxe extends AxeItem
{
    public PinkRockSaltAxe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(net.minecraft.item.ItemStack stack, net.minecraft.entity.LivingEntity target, net.minecraft.entity.LivingEntity attacker)
    {
        // Check if the tool is a pink salt tool
        if (stack.getItem() instanceof PinkRockSaltAxe)
        {
            // Customize the logic to increase food drops
            // Example: Increase the drop chance of meat by 20%
            if (target instanceof AnimalEntity) {
                // Adjust the drop chance as needed
                if (Math.random() < 0.2) {
                    if (target instanceof CowEntity || target instanceof MooshroomEntity)
                    {
                        target.dropItem(Items.BEEF, 5);
                    }
                    if (target instanceof PigEntity || target instanceof HoglinEntity)
                    {
                        target.dropItem(Items.PORKCHOP, 4);
                    }
                    if (target instanceof SheepEntity)
                    {
                        target.dropItem(Items.MUTTON, 4);
                    }
                    if (target instanceof ChickenEntity)
                    {
                        target.dropItem(Items.CHICKEN, 4);
                    }
                    if (target instanceof CodEntity || target instanceof DolphinEntity)
                    {
                        target.dropItem(Items.COD, 3);
                    }
                    if (target instanceof TropicalFishEntity)
                    {
                        target.dropItem(Items.TROPICAL_FISH, 3);
                    }
                    if (target instanceof SalmonEntity)
                    {
                        target.dropItem(Items.SALMON, 3);
                    }
                    if (target instanceof PufferfishEntity)
                    {
                        target.dropItem(Items.PUFFERFISH, 2);
                    }
                    if (target instanceof RabbitEntity)
                    {
                        target.dropItem(Items.RABBIT, 2);
                    }
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }
}