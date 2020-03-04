package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class MagicVillains extends ExpansionSet {

    private static final MagicVillains instance = new MagicVillains();

    public static MagicVillains getInstance() {
        return instance;
    }

    private MagicVillains() {
        super("Magic Villains", "VLN", ExpansionSet.buildDate(2017, 8, 6), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Cage of Hands", 4, Rarity.COMMON, mage.cards.c.CageOfHands.class));
        //cards.add(new SetCardInfo("Consortium Astrolabe", 5, Rarity.RARE, mage.cards.c.ConsortiumAstrolabe.class));
        cards.add(new SetCardInfo("Defiant Strike", 6, Rarity.COMMON, mage.cards.d.DefiantStrike.class));

        cards.add(new SetCardInfo("Guthram Shepherd", 20, Rarity.COMMON, mage.cards.g.GuthramShepherd.class));

        cards.add(new SetCardInfo("Frost Baloth", 55, Rarity.COMMON, mage.cards.f.FrostBaloth.class));

        cards.add(new SetCardInfo("Strategic Planning", 70, Rarity.COMMON, mage.cards.s.StrategicPlanning.class));
        //cards.add(new SetCardInfo("Tezzeret of Tidehollow", "71a", Rarity.MYTHIC, mage.cards.t.TezzeretOfTidehollow.class));
        //cards.add(new SetCardInfo("Tezzeret the Opportunist", "71b", Rarity.MYTHIC, mage.cards.t.TezzeretTheOpportunist.class));
        cards.add(new SetCardInfo("Tezzeret's Ambition", 72, Rarity.COMMON, mage.cards.t.TezzeretsAmbition.class));

        cards.add(new SetCardInfo("Bluster Ooze", 84, Rarity.COMMON, mage.cards.b.BlusterOoze.class));

        cards.add(new SetCardInfo("Disembowel", 94, Rarity.COMMON, mage.cards.d.Disembowel.class));

        cards.add(new SetCardInfo("Cavalier Fiend", 121, Rarity.COMMON, mage.cards.c.CavalierFiend.class));

        cards.add(new SetCardInfo("Baloth Cage Trap", 157, Rarity.UNCOMMON, mage.cards.b.BalothCageTrap.class));

        cards.add(new SetCardInfo("Pensive Jotun", 171, Rarity.COMMON, mage.cards.p.PensiveJotun.class));

        cards.add(new SetCardInfo("Satyr Wayfinder", 180, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));

        cards.add(new SetCardInfo("Woodharrow Offering", 194, Rarity.COMMON, mage.cards.w.WoodharrowOffering.class));

        cards.add(new SetCardInfo("Nemesis Mask", 226, Rarity.UNCOMMON, mage.cards.n.NemesisMask.class));
        //cards.add(new SetCardInfo("Oracle Cauldron", 227, Rarity.COMMON, mage.cards.o.OracleCauldron.class));
        cards.add(new SetCardInfo("Pilgrim's Eye", 228, Rarity.COMMON, mage.cards.p.PilgrimsEye.class));

        cards.add(new SetCardInfo("Evolving Wilds", 235, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));

        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 253, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 256, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 257, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 259, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 261, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 262, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 263, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 264, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 266, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 267, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 268, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 269, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
    }
}
