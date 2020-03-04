package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Jannada extends ExpansionSet {

    private static final Jannada instance = new Jannada();

    public static Jannada getInstance() {
        return instance;
    }

    private Jannada() {
        super("Jannada", "JAN", ExpansionSet.buildDate(2017, 11, 5), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Corpse Churn", 83, Rarity.COMMON, mage.cards.c.CorpseChurn.class));

        cards.add(new SetCardInfo("Fling", 127, Rarity.COMMON, mage.cards.f.Fling.class));

        cards.add(new SetCardInfo("Wrangle", 152, Rarity.COMMON, mage.cards.w.Wrangle.class));

        cards.add(new SetCardInfo("The Circle of Life", 157, Rarity.MYTHIC, mage.cards.t.TheCircleOfLife.class));
        //cards.add(new SetCardInfo("Clean Shot", 158, Rarity.COMMON, mage.cards.c.CleanShot.class));
        //cards.add(new SetCardInfo("Collective Pilgrimage", 159, Rarity.COMMON, mage.cards.c.CollectivePilgrimage.class));
        cards.add(new SetCardInfo("Cultivate", 160, Rarity.COMMON, mage.cards.c.Cultivate.class));
        //cards.add(new SetCardInfo("Deathcradle Weaver", 161, Rarity.COMMON, mage.cards.d.DeathcradleWeaver.class));
        //cards.add(new SetCardInfo("Dragon Trapper", 162, Rarity.UNCOMMON, mage.cards.d.DragonTrapper.class));
        //cards.add(new SetCardInfo("Enforcer of the Wild", 163, Rarity.RARE, mage.cards.e.EnforcerOfTheWild.class));
        cards.add(new SetCardInfo("Giant Growth", 164, Rarity.COMMON, mage.cards.g.GiantGrowth.class));

        cards.add(new SetCardInfo("Junmra, Wild Sovereign", 196, Rarity.MYTHIC, mage.cards.j.JunmraWildSovereign.class));

        cards.add(new SetCardInfo("Lord of Extinction", 201, Rarity.RARE, mage.cards.l.LordOfExtinction.class));

        cards.add(new SetCardInfo("Dewdrop Rainforest", 221, Rarity.UNCOMMON, mage.cards.d.DewdropRainforest.class));
        cards.add(new SetCardInfo("Flooded Bog", 222, Rarity.UNCOMMON, mage.cards.f.FloodedBog.class));
        cards.add(new SetCardInfo("Nimbus Maze", 223, Rarity.UNCOMMON, mage.cards.n.NimbusMaze.class));
        cards.add(new SetCardInfo("Ominous Caldera", 224, Rarity.UNCOMMON, mage.cards.o.OminousCaldera.class));
        cards.add(new SetCardInfo("Overgrown Ruins", 225, Rarity.UNCOMMON, mage.cards.o.OvergrownRuins.class));
        cards.add(new SetCardInfo("Savage Wildlands", 226, Rarity.UNCOMMON, mage.cards.s.SavageWildlands.class));
        cards.add(new SetCardInfo("Savannah Encampment", 227, Rarity.UNCOMMON, mage.cards.s.SavannahEncampment.class));
        cards.add(new SetCardInfo("Splendid Oasis", 228, Rarity.UNCOMMON, mage.cards.s.SplendidOasis.class));
        cards.add(new SetCardInfo("Tattered Temple", 229, Rarity.UNCOMMON, mage.cards.t.TatteredTemple.class));
        cards.add(new SetCardInfo("Totemic Waterfall", 231, Rarity.UNCOMMON, mage.cards.t.TotemicWaterfall.class));
        //cards.add(new SetCardInfo("Unspoiled Expanse", 232, Rarity.COMMON, mage.cards.u.UnspoiledExpanse.class));
        cards.add(new SetCardInfo("Plains", 233, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 234, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 235, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 236, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 237, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 238, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 239, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 240, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 241, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 242, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
    }
}
