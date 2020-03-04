package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class ScripturesOfUrshad extends ExpansionSet {

    private static final ScripturesOfUrshad instance = new ScripturesOfUrshad();

    public static ScripturesOfUrshad getInstance() {
        return instance;
    }

    private ScripturesOfUrshad() {
        super("Scriptures of Urshad", "SOU", ExpansionSet.buildDate(2019, 5, 29), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Divine Verdict", 7, Rarity.COMMON, mage.cards.d.DivineVerdict.class));

        cards.add(new SetCardInfo("Inspired Charge", 21, Rarity.COMMON, mage.cards.i.InspiredCharge.class));

        cards.add(new SetCardInfo("Master of Marble Row", 26, Rarity.MYTHIC, mage.cards.m.MasterOfMarbleRow.class));

        cards.add(new SetCardInfo("Solemn Offering", 37, Rarity.COMMON, mage.cards.s.SolemnOffering.class));

        cards.add(new SetCardInfo("Ekebram the Scholar", "53a", Rarity.MYTHIC, mage.cards.e.EkebramChroniclerOfAges.class));
        cards.add(new SetCardInfo("Ekebram, Chronicler of Ages", "53b", Rarity.MYTHIC, mage.cards.e.EkebramChroniclerOfAges.class));

        cards.add(new SetCardInfo("Golden Age", 59, Rarity.RARE, mage.cards.g.GoldenAge.class));

        cards.add(new SetCardInfo("Spell Pierce", 78, Rarity.COMMON, mage.cards.s.SpellPierce.class));

        cards.add(new SetCardInfo("Act of Treason", 125, Rarity.COMMON, mage.cards.a.ActOfTreason.class));

        cards.add(new SetCardInfo("Currency", 135, Rarity.RARE, mage.cards.c.Currency.class));

        cards.add(new SetCardInfo("Shatter", 155, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shock", 156, Rarity.COMMON, mage.cards.s.Shock.class));
        //cards.add(new SetCardInfo("Slaughtered Steps Taskmaster", 157, Rarity.COMMON, mage.cards.s.SlaughteredStepsTaskmaster.class));
        //cards.add(new SetCardInfo("Strongarm", 158, Rarity.UNCOMMON, mage.cards.s.Strongarm.class));
        //cards.add(new SetCardInfo("Sunnula's Firebird", 159, Rarity.RARE, mage.cards.s.SunnulasFirebird.class));
        cards.add(new SetCardInfo("Sure Strike", 160, Rarity.COMMON, mage.cards.s.SureStrike.class));

        cards.add(new SetCardInfo("Grapple with the Past", 175, Rarity.COMMON, mage.cards.g.GrappleWithThePast.class));
        cards.add(new SetCardInfo("Harrow", 176, Rarity.UNCOMMON, mage.cards.h.Harrow.class));

        cards.add(new SetCardInfo("Pierce the Sky", 188, Rarity.COMMON, mage.cards.p.PierceTheSky.class));

        cards.add(new SetCardInfo("Anku the Primordial", 205, Rarity.MYTHIC, mage.cards.a.AnkuThePrimordial.class));

        cards.add(new SetCardInfo("Imperator Namuzzar", 214, Rarity.RARE, mage.cards.i.ImperatorNamuzzar.class));

        cards.add(new SetCardInfo("Sunblessed Orator", 225, Rarity.UNCOMMON, mage.cards.s.SunblessedOrator.class));

        cards.add(new SetCardInfo("Manalith", 235, Rarity.COMMON, mage.cards.m.Manalith.class));

        cards.add(new SetCardInfo("Evolving Wilds", 249, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));

        cards.add(new SetCardInfo("Mana Confluence", 254, Rarity.RARE, mage.cards.m.ManaConfluence.class));
        //cards.add(new SetCardInfo("Mustering Grounds", 255, Rarity.UNCOMMON, mage.cards.m.MusteringGrounds.class));
        cards.add(new SetCardInfo("Rupture Spire", 256, Rarity.COMMON, mage.cards.r.RuptureSpire.class));
        //cards.add(new SetCardInfo("Wondrous Bazaar", 257, Rarity.UNCOMMON, mage.cards.w.WondrousBazaar.class));
        cards.add(new SetCardInfo("Plains", 258, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Island", 259, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Mountain", 261, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Forest", 262, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ));
    }
}
