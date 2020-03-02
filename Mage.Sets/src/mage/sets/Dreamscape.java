package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Dreamscape extends ExpansionSet {

    private static final Dreamscape instance = new Dreamscape();

    public static Dreamscape getInstance() {
        return instance;
    }

    private Dreamscape() {
        super("Dreamscape", "DMS", ExpansionSet.buildDate(2016, 12, 8), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Dayblade Sentry", 8, Rarity.COMMON, mage.cards.d.DaybladeSentry.class));
        cards.add(new SetCardInfo("Recumbent Bliss", 27, Rarity.UNCOMMON, mage.cards.r.RecumbentBliss.class));
        cards.add(new SetCardInfo("Dissipate", 47, Rarity.UNCOMMON, mage.cards.d.Dissipate.class));
        cards.add(new SetCardInfo("Fortress Crab", 54, Rarity.COMMON, mage.cards.f.FortressCrab.class));
        cards.add(new SetCardInfo("Pestermite", 68, Rarity.COMMON, mage.cards.p.Pestermite.class));
        cards.add(new SetCardInfo("Sleep", 74, Rarity.UNCOMMON, mage.cards.s.Sleep.class));
        cards.add(new SetCardInfo("Think Twice", 78, Rarity.COMMON, mage.cards.t.ThinkTwice.class));
        cards.add(new SetCardInfo("Cloaked Phobia", 83, Rarity.COMMON, mage.cards.c.CloakedPhobia.class));
        cards.add(new SetCardInfo("Plague with Distress", 107, Rarity.UNCOMMON, mage.cards.p.PlagueWithDistress.class));
        cards.add(new SetCardInfo("Shambling Ghoul", 114, Rarity.COMMON, mage.cards.s.ShamblingGhoul.class));
        cards.add(new SetCardInfo("Hysteria Mori", 142, Rarity.COMMON, mage.cards.h.HysteriaMori.class));
        cards.add(new SetCardInfo("Abundant Growth", 162, Rarity.COMMON, mage.cards.a.AbundantGrowth.class));
        cards.add(new SetCardInfo("Shimmerhide Rhino", 186, Rarity.COMMON, mage.cards.s.ShimmerhideRhino.class));
        cards.add(new SetCardInfo("Whispering Bashe", 198, Rarity.COMMON, mage.cards.w.WhisperingBashe.class));
        cards.add(new SetCardInfo("Yemma's Mandate", 201, Rarity.RARE, mage.cards.y.YemmasMandate.class));
        cards.add(new SetCardInfo("Reev, Equinox Prophet", 220, Rarity.MYTHIC, mage.cards.r.ReevEquinoxProphet.class));
        cards.add(new SetCardInfo("Dreamsteel Servitor", 230, Rarity.COMMON, mage.cards.d.DreamsteelServitor.class));
        cards.add(new SetCardInfo("Blurred Horizons", 237, Rarity.RARE, mage.cards.b.BlurredHorizons.class));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 252, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 253, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 254, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 255, Rarity.LAND, mage.cards.basiclands.Forest.class));
   }
}
