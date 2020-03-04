package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Eralou extends ExpansionSet {

    private static final Eralou instance = new Eralou();

    public static Eralou getInstance() {
        return instance;
    }

    private Eralou() {
        super("Eralou", "EAU", ExpansionSet.buildDate(2019, 2, 8), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Containment Priest", 5, Rarity.RARE, mage.cards.c.ContainmentPriest.class));

        cards.add(new SetCardInfo("Smite the Monstrous", 29, Rarity.COMMON, mage.cards.s.SmiteTheMonstrous.class));
        cards.add(new SetCardInfo("Solemn Offering", 30, Rarity.UNCOMMON, mage.cards.s.SolemnOffering.class));

        cards.add(new SetCardInfo("Divination", 55, Rarity.COMMON, mage.cards.d.Divination.class));

        cards.add(new SetCardInfo("Marshcroaker Drake", 67, Rarity.UNCOMMON, mage.cards.m.MarshcroakerDrake.class));
        cards.add(new SetCardInfo("Negate", 68, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Opt", 69, Rarity.COMMON, mage.cards.o.Opt.class));

        cards.add(new SetCardInfo("Blazing Volley", 129, Rarity.COMMON, mage.cards.b.BlazingVolley.class));

        cards.add(new SetCardInfo("Fervent Strike", 145, Rarity.COMMON, mage.cards.f.FerventStrike.class));

        cards.add(new SetCardInfo("Artisan's Sorrow", 170, Rarity.COMMON, mage.cards.a.ArtisansSorrow.class));

        cards.add(new SetCardInfo("Wild Instincts", 206, Rarity.COMMON, mage.cards.w.WildInstincts.class));

        cards.add(new SetCardInfo("Erollin, Eccentric Collector", 215, Rarity.MYTHIC, mage.cards.e.ErollinEccentricCollector.class));

        cards.add(new SetCardInfo("Gilded Lotus", 231, Rarity.RARE, mage.cards.g.GildedLotus.class));
        //cards.add(new SetCardInfo("Improvising Automaton", 232, Rarity.COMMON, mage.cards.i.ImprovisingAutomaton.class));
        //cards.add(new SetCardInfo("Ornate Incense", 233, Rarity.COMMON, mage.cards.o.OrnateIncense.class));
        cards.add(new SetCardInfo("Prophetic Prism", 234, Rarity.COMMON, mage.cards.p.PropheticPrism.class));

        cards.add(new SetCardInfo("Blessed Mausoleum", 239, Rarity.UNCOMMON, mage.cards.b.BlessedMausoleum.class));
        cards.add(new SetCardInfo("Dangerous Territory", 240, Rarity.UNCOMMON, mage.cards.d.DangerousTerritory.class));
        cards.add(new SetCardInfo("Eerie Bayou", 241, Rarity.UNCOMMON, mage.cards.e.EerieBayou.class));
        cards.add(new SetCardInfo("Forlorn Ruin", 242, Rarity.UNCOMMON, mage.cards.f.ForlornRuin.class));
        cards.add(new SetCardInfo("Lakeside Park", 243, Rarity.UNCOMMON, mage.cards.l.LakesidePark.class));
        cards.add(new SetCardInfo("Mushroom Lagoon", 244, Rarity.UNCOMMON, mage.cards.m.MushroomLagoon.class));
        cards.add(new SetCardInfo("Prayer Hall", 245, Rarity.UNCOMMON, mage.cards.p.PrayerHall.class));
        cards.add(new SetCardInfo("Ritzy Parlor", 246, Rarity.UNCOMMON, mage.cards.r.RitzyParlor.class));
        //cards.add(new SetCardInfo("Royal Domain", 247, Rarity.RARE, mage.cards.r.RoyalDomain.class));
        cards.add(new SetCardInfo("Sunlit Plaza", 248, Rarity.UNCOMMON, mage.cards.s.SunlitPlaza.class));
        cards.add(new SetCardInfo("Vacated Bar", 249, Rarity.UNCOMMON, mage.cards.v.VacatedBar.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
