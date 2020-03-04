package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Vastuum extends ExpansionSet {

    private static final Vastuum instance = new Vastuum();

    public static Vastuum getInstance() {
        return instance;
    }

    private Vastuum() {
        super("Vastuum", "VST", ExpansionSet.buildDate(2018, 6, 18), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Isolation Zone", 15, Rarity.COMMON, mage.cards.i.IsolationZone.class));

        cards.add(new SetCardInfo("Seize the Initiative", 32, Rarity.COMMON, mage.cards.s.SeizeTheInitiative.class));

        cards.add(new SetCardInfo("Essence Scatter", 46, Rarity.COMMON, mage.cards.e.EssenceScatter.class));

        cards.add(new SetCardInfo("Unprecedented Genius", 77, Rarity.MYTHIC, mage.cards.u.UnprecedentedGenius.class));

        cards.add(new SetCardInfo("Blood Feud", 120, Rarity.UNCOMMON, mage.cards.b.BloodFeud.class));
        cards.add(new SetCardInfo("Bloodrage Brawler", 121, Rarity.UNCOMMON, mage.cards.b.BloodrageBrawler.class));

        cards.add(new SetCardInfo("Market Festival", 180, Rarity.COMMON, mage.cards.m.MarketFestival.class));

        cards.add(new SetCardInfo("Irradiated Amalgam", 203, Rarity.UNCOMMON, mage.cards.i.IrradiatedAmalgam.class));

        cards.add(new SetCardInfo("Buried Ruin", 240, Rarity.UNCOMMON, mage.cards.b.BuriedRuin.class));
        cards.add(new SetCardInfo("Field of Ruin", 241, Rarity.UNCOMMON, mage.cards.f.FieldOfRuin.class));
        //cards.add(new SetCardInfo("Fractured Remnant", 242, Rarity.RARE, mage.cards.f.FracturedRemnant.class));
        cards.add(new SetCardInfo("Holdout Settlement", 243, Rarity.COMMON, mage.cards.h.HoldoutSettlement.class));

        cards.add(new SetCardInfo("Wastes", 248, Rarity.LAND, mage.cards.w.Wastes.class));
        cards.add(new SetCardInfo("Plains", 249, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 250, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 251, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 252, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 253, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
