package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class SecretsOfTheRiverCities extends ExpansionSet {

    private static final SecretsOfTheRiverCities instance = new SecretsOfTheRiverCities();

    public static SecretsOfTheRiverCities getInstance() {
        return instance;
    }

    private SecretsOfTheRiverCities() {
        super("Secrets of the River Cities", "SRC", ExpansionSet.buildDate(2020, 1, 1), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Adamant Will", 2, Rarity.COMMON, mage.cards.a.AdamantWill.class));
        //cards.add(new SetCardInfo("Ameret's Sanctity", 3, Rarity.RARE, mage.cards.a.AmeretsSanctity.class));
        //cards.add(new SetCardInfo("Angelic Embezzler", 4, Rarity.UNCOMMON, mage.cards.a.AngelicEmbezzler.class));
        //cards.add(new SetCardInfo("Archbishop of the Way", 5, Rarity.RARE, mage.carda.a.ArchbishopOfTheWay.class));
        cards.add(new SetCardInfo("Arrest", 6, Rarity.UNCOMMON, mage.cards.a.Arrest.class));
        //cards.add(new SetCardInfo("Backup Brigade", 7, Rarity.COMMON, mage.cards.b.BackupBrigade.class));
        //cards.add(new SetCardInfo("Blessing of Hope", 8, Rarity.COMMOn, mage.cards.b.BlessingOfHope.class));
        cards.add(new SetCardInfo("Burden of Guilt", 9, Rarity.COMMON, mage.cards.b.BurdenOfGuilt.class));

        cards.add(new SetCardInfo("Master Thief", 64, Rarity.UNCOMMON, mage.cards.m.MasterThief.class));

        cards.add(new SetCardInfo("Rescue", 71, Rarity.COMMON, mage.cards.r.Rescue.class));

        cards.add(new SetCardInfo("Duress", 90, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Exsanguinate", 91, Rarity.UNCOMMON, mage.cards.e.Exsanguinate.class));

        cards.add(new SetCardInfo("Murder", 107, Rarity.UNCOMMON, mage.cards.m.Murder.class));

        cards.add(new SetCardInfo("Act on Impulse", 123, Rarity.UNCOMMON, mage.cards.a.ActOnImpulse.class));

        cards.add(new SetCardInfo("Fleeting Options", 138, Rarity.UNCOMMON, mage.cards.f.FleetingOptions.class));

        cards.add(new SetCardInfo("Epic Confrontation", 170, Rarity.COMMON, mage.cards.e.EpicConfrontation.class));

        cards.add(new SetCardInfo("Henry, River Cities Mayor", 212, Rarity.MYTHIC, mage.cards.h.HenryRiverCitiesMayor.class));

        cards.add(new SetCardInfo("Coveted Jewel", 228, Rarity.RARE, mage.cards.c.CovetedJewel.class));

        cards.add(new SetCardInfo("Magnifying Glass", 233, Rarity.UNCOMMON, mage.cards.m.MagnifyingGlass.class));

        cards.add(new SetCardInfo("Warped Landscape", 249, Rarity.COMMON, mage.cards.w.WarpedLandscape.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
