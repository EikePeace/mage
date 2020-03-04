package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Rakoa extends ExpansionSet {

    private static final Rakoa instance = new Rakoa();

    public static Rakoa getInstance() {
        return instance;
    }

    private Rakoa() {
        super("Rakoa", "RAK", ExpansionSet.buildDate(2018, 8, 30), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Mighty Leap", 19, Rarity.COMMON, mage.cards.m.MightyLeap.class));

        cards.add(new SetCardInfo("Take Vengeance", 33, Rarity.COMMON, mage.cards.t.TakeVengeance.class));

        cards.add(new SetCardInfo("Coastal Discovery", 44, Rarity.UNCOMMON, mage.cards.c.CoastalDiscovery.class));

        cards.add(new SetCardInfo("Despise", 87, Rarity.UNCOMMON, mage.cards.d.Despise.class));

        cards.add(new SetCardInfo("Command the Storm", 123, Rarity.COMMON, mage.cards.c.CommandTheStorm.class));

        cards.add(new SetCardInfo("Smelt", 149, Rarity.COMMON, mage.cards.s.Smelt.class));
        cards.add(new SetCardInfo("Sure Strike", 150, Rarity.COMMON, mage.cards.s.SureStrike.class));
        //cards.add(new SetCardInfo("Toahanga's Slam", 151, Rarity.COMMON, mage.cards.t.ToahangasSlam.class));
        cards.add(new SetCardInfo("Tua Rahi Avenger", 152, Rarity.UNCOMMON, mage.cards.t.TuaRahiAvenger.class));
        //cards.add(new SetCardInfo("Unproven Hatchling", 153, Rarity.RARE, mage.cards.u.UnprovenHatchling.class));
        //cards.add(new SetCardInfo("Utamu Ravager", 154, Rarity.UNCOMMON, mage.cards.u.UtamuRavager.class));
        cards.add(new SetCardInfo("Volcanic Dragon", 155, Rarity.UNCOMMON, mage.cards.v.VolcanicDragon.class));

        cards.add(new SetCardInfo("Dryad Pummeler", 165, Rarity.COMMON, mage.cards.d.DryadPummeler.class));
        //cards.add(new SetCardInfo("Elemental Surge", 166, Rarity.COMMON, mage.cards.e.ElementalSurge.class));
        cards.add(new SetCardInfo("Farseek", 167, Rarity.UNCOMMON, mage.cards.f.Farseek.class));

        cards.add(new SetCardInfo("Spawning Grounds", 188, Rarity.RARE, mage.cards.s.SpawningGrounds.class));
        cards.add(new SetCardInfo("Titanic Growth", 189, Rarity.COMMON, mage.cards.t.TitanicGrowth.class));

        cards.add(new SetCardInfo("Paradise Mantle", 221, Rarity.UNCOMMON, mage.cards.p.ParadiseMantle.class));

        cards.add(new SetCardInfo("Plains", 246, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 247, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 248, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 249, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 252, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 253, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 256, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 257, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 259, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 261, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 262, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 263, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 264, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 266, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 267, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 268, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 269, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 270, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
    }
}
