package mage.sets;


import mage.cards.ExpansionSet;
import mage.cards.n.NightmarishMorass;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Aenyr extends ExpansionSet {

    private static final Aenyr instance = new Aenyr();

    public static Aenyr getInstance() {
        return instance;
    }

    private Aenyr() {
        super("Aenyr", "AYR", ExpansionSet.buildDate(2016, 12, 8), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Blood Artist", 49, Rarity.UNCOMMON, mage.cards.b.BloodArtist.class));

        cards.add(new SetCardInfo("Ultimate Price", 66, Rarity.UNCOMMON, mage.cards.u.UltimatePrice.class));

        cards.add(new SetCardInfo("Kirsus Mongrel", 79, Rarity.COMMON, mage.cards.k.KirsusMongrel.class));

        cards.add(new SetCardInfo("Satyr Wayfinder", 106, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));

        cards.add(new SetCardInfo("Lyss, Duskwood Seer", 151, Rarity.RARE, mage.cards.l.LyssDuskwoodSeer.class));

        cards.add(new SetCardInfo("Thundersong Trumpeter", 185, Rarity.COMMON, mage.cards.t.ThundersongTrumpeter.class));

        cards.add(new SetCardInfo("Hand of Skiv", 206, Rarity.COMMON, mage.cards.h.HandOfSkiv.class));
        //cards.add(new SetCardInfo("Impromptu Performance", 207, Rarity.RARE, mage.cards.i.ImpromptuPerformance.class));
        //cards.add(new SetCardInfo("Luck of the Draw", 208, Rarity.RARE, mage.cards.l.LuckOfTheDraw.class));
        //cards.add(new SetCardInfo("Mental Trauma", 209, Rarity.UNCOMMON, mage.cards.m.MentalTrauma.class));
        cards.add(new SetCardInfo("Opera Ghost", 210, Rarity.COMMON, mage.cards.o.OperaGhost.class));
        cards.add(new SetCardInfo("Phantasmal Triad", 211, Rarity.COMMON, mage.cards.p.PhantasmalTriad.class));

        cards.add(new SetCardInfo("Ribbon Whirler", 216, Rarity.UNCOMMON, mage.cards.r.RibbonWhirler.class));
        //cards.add(new SetCardInfo("Search for Inspiration", 217, Rarity.COMMON, mage.cards.s.SearchForInspiration.class));
        //cards.add(new SetCardInfo("Skiv's Regards", 218, Rarity.RARE, mage.cards.s.SkivsRegards.class));
        cards.add(new SetCardInfo("Stoic Bihorn", 219, Rarity.COMMON, mage.cards.s.StoicBihorn.class));
        //cards.add(new SetCardInfo("Storytime", 220, Rarity.RARE, mage.cards.s.Storytime.class));
        cards.add(new SetCardInfo("Unfinished Creation", 221, Rarity.COMMON, mage.cards.u.UnfinishedCreation.class));

        cards.add(new SetCardInfo("Hulking Creation", 228, Rarity.COMMON, mage.cards.h.HulkingCreation.class));
        //cards.add(new SetCardInfo("Jest-In-The-Box", 229, Rarity.COMMON, mage.cards.j.JestInTheBox.class));
        cards.add(new SetCardInfo("Painter's Servant", 230, Rarity.RARE, mage.cards.p.PaintersServant.class));
        //cards.add(new SetCardInfo("Roaming Museum", 231, Rarity.UNCOMMON, mage.cards.r.RoamingMuseum.class));
        //cards.add(new SetCardInfo("Scapeforger Bauble", 232, Rarity.COMMON, mage.cards.s.ScapeforgerBauble.class));
        cards.add(new SetCardInfo("Springleaf Drum", 233, Rarity.COMMON, mage.cards.s.SpringleafDrum.class));
        //cards.add(new SetCardInfo("Strobe Light", 234, Rarity.COMMON, mage.cards.s.StrobeLight.class));
        //cards.add(new SetCardInfo("Tome of Infinity", 235, Rarity.RARE, mage.cards.t.TomeOfInfinity.class));
        //cards.add(new SetCardInfo("Boundless Halls", 236, Rarity.UNCOMMON, mage.cards.b.BoundlessHalls.class));
        cards.add(new SetCardInfo("City of Wonders", 237, Rarity.COMMON, mage.cards.c.CityOfWonders.class));
        cards.add(new SetCardInfo("Deserted Fairgrounds", 238, Rarity.COMMON, mage.cards.d.DesertedFairgrounds.class));
        cards.add(new SetCardInfo("Enlightened Valley", 239, Rarity.COMMON, mage.cards.e.EnlightenedValley.class));
        cards.add(new SetCardInfo("Ethereal Gardens", 240, Rarity.COMMON, mage.cards.e.EtherealGardens.class));
        cards.add(new SetCardInfo("Glamor District", 241, Rarity.COMMON, mage.cards.g.GlamorDistrict.class));
        //cards.add(new SetCardInfo("Heart of Inspiration", 242, Rarity.RARE, mage.cards.h.HeartOfInspiration.class));
        cards.add(new SetCardInfo("Lush Vale", 243, Rarity.COMMON, mage.cards.l.LushVale.class));
        cards.add(new SetCardInfo("Mistfire Ridge", 244, Rarity.COMMON, mage.cards.m.MistfireRidge.class));
        //cards.add(new SetCardInfo("Mount Chromaziel", 245, Rarity.MYTHIC, mage.cards.m.MountChromaziel.class));
        cards.add(new SetCardInfo("Nightmarish Morass", 246, Rarity.COMMON, NightmarishMorass.class));
        cards.add(new SetCardInfo("Sunlit Alley", 247, Rarity.COMMON, mage.cards.s.SunlitAlley.class));
        cards.add(new SetCardInfo("Twisted Woodlands", 248, Rarity.COMMON, mage.cards.t.TwistedWoodlands.class));
        //cards.add(new SetCardInfo("Vivid Paradise", 249, Rarity.UNCOMMON, mage.cards.v.VividParadise.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
