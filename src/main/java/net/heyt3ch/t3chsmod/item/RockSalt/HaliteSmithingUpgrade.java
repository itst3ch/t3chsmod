package net.heyt3ch.t3chsmod.item.RockSalt;

import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class HaliteSmithingUpgrade extends SmithingTemplateItem
{
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Text HALITE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text HALITE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text HALITE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("halite_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text HALITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.base_slot_description")));
    private static final Text HALITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.additions_slot_description")));

    public HaliteSmithingUpgrade(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
    }

    public static SmithingTemplateItem createHaliteUpgrade()
    {
        return new SmithingTemplateItem(HALITE_APPLIES_TO_TEXT, HALITE_UPGRADE_INGREDIENTS_TEXT, HALITE_UPGRADE_TEXT, HALITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, HALITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, SmithingTemplateItem.createNetheriteUpgrade().getEmptyBaseSlotTextures(), SmithingTemplateItem.createNetheriteUpgrade().getEmptyAdditionsSlotTextures());
    }
}
