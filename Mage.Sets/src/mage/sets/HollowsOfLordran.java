package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class HollowsOfLordran extends ExpansionSet {

    private static final HollowsOfLordran instance = new HollowsOfLordran();

    public static HollowsOfLordran getInstance() {
        return instance;
    }

    private HollowsOfLordran() {
        super("Hollows of Lordran", "HLW", ExpansionSet.buildDate(2018, 1, 21), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Arrest", 1, Rarity.COMMON, mage.cards.a.Arrest.class));

        cards.add(new SetCardInfo("Big Hat Logan", 46, Rarity.RARE, mage.cards.b.BigHatLogan.class));
        //cards.add(new SetCardInfo("Blue Crystal Golem", 47, Rarity.COMMON, mage.cards.b.BlueCrystalGolem.class));
        cards.add(new SetCardInfo("Cancel", 48, Rarity.COMMON, mage.cards.c.Cancel.class));

        cards.add(new SetCardInfo("Essence Scatter", 61, Rarity.COMMON, mage.cards.e.EssenceScatter.class));

        cards.add(new SetCardInfo("Duress", 98, Rarity.COMMON, mage.cards.d.Duress.class));

        cards.add(new SetCardInfo("Pillar of Flame", 156, Rarity.COMMON, mage.cards.p.PillarOfFlame.class));
        //cards.add(new SetCardInfo("Power Within", 157, Rarity.RARE, mage.cards.p.PowerWithin.class));
        //cards.add(new SetCardInfo("Pyromancer's Flame", 158, Rarity.COMMON, mage.cards.p.PyromancersFlame.class));
        //cards.add(new SetCardInfo("Pyromancer's Wisdom", 159, Rarity.UNCOMMON, mage.cards.p.PyromancersWisdom.class));
        cards.add(new SetCardInfo("Quelaag, Chaos Witch", 160, Rarity.RARE, mage.cards.q.QuelaagChaosWitch.class));

        cards.add(new SetCardInfo("Giant Growth", 188, Rarity.COMMON, mage.cards.g.GiantGrowth.class));

        cards.add(new SetCardInfo("Mushroom Family", 201, Rarity.UNCOMMON, mage.cards.m.MushroomFamily.class));

        cards.add(new SetCardInfo("Sentinel Spider", 207, Rarity.COMMON, mage.cards.s.SentinelSpider.class));

        cards.add(new SetCardInfo("Quelana, Mother of Pyromancy", 225, Rarity.RARE, mage.cards.q.QuelanaMotherOfPyromancy.class));

        cards.add(new SetCardInfo("Evolving Wilds", 243, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));

        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
