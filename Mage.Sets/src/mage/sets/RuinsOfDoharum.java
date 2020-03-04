package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class RuinsOfDoharum extends ExpansionSet {

    private static final RuinsOfDoharum instance = new RuinsOfDoharum();

    public static RuinsOfDoharum getInstance() {
        return instance;
    }

    private RuinsOfDoharum() {
        super("Ruins of Doharum", "DHM", ExpansionSet.buildDate(2018, 8, 30), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Cancel", 41, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Disdainful Stroke", 42, Rarity.COMMON, mage.cards.d.DisdainfulStroke.class));

        cards.add(new SetCardInfo("Buried Ruin", 245, Rarity.UNCOMMON, mage.cards.b.BuriedRuin.class));

        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
