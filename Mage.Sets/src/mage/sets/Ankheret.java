package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;


public final class Ankheret extends ExpansionSet {

    private static final Ankheret instance = new Ankheret();

    public static Ankheret getInstance() {
        return instance;
    }

    private Ankheret() {
        super("Ankheret", "ANK", ExpansionSet.buildDate(2016, 12, 8), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterSpecial = 0;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Bonds of Faith", 4, Rarity.COMMON, mage.cards.b.BondsOfFaith.class));
        //cards.add(new SetCardInfo("Boon Magnification", 5, Rarity.UNCOMMON, mage.cards.b.BoonMagnification.class));
        cards.add(new SetCardInfo("Champion of Ainorek", 6, Rarity.COMMON, mage.cards.c.ChampionOfAinorek.class));

        cards.add(new SetCardInfo("Sanctuary Cat", 28, Rarity.COMMON, mage.cards.s.SanctuaryCat.class));

        cards.add(new SetCardInfo("Annex", 39, Rarity.UNCOMMON, mage.cards.a.Annex.class));

        cards.add(new SetCardInfo("Divination", 45, Rarity.COMMON, mage.cards.d.Divination.class));
        //cards.add(new SetCardInfo("Drowning Trap", 46, Rarity.COMMON, mage.cards.d.DrowningTrap.class));
        //cards.add(new SetCardInfo("Duality of Truth", 47, Rarity.RARE, mage.cards.d.DualityOfTruth.class));
        //cards.add(new SetCardInfo("Dying of Thirst, 48, Rarity.COMMON, mage.cards.d.DyingOfThirst.class));
        cards.add(new SetCardInfo("Isle Turtle", 49, Rarity.COMMON, mage.cards.i.IsleTurtle.class));

        cards.add(new SetCardInfo("Disentomb", 82, Rarity.COMMON, mage.cards.d.Disentomb.class));

        cards.add(new SetCardInfo("Granary's Bane", 89, Rarity.COMMON, mage.cards.g.GranarysBane.class));

        cards.add(new SetCardInfo("Vengeful Pharaoh", 110, Rarity.RARE, mage.cards.v.VengefulPharaoh.class));

        cards.add(new SetCardInfo("Cone of Flame", 120, Rarity.UNCOMMON, mage.cards.c.ConeOfFlame.class));
        //cards.add(new SetCardInfo("Dack's Trickery", 121, Rarity.UNCOMMON, mage.cards.d.DacksTrickery.class));
        cards.add(new SetCardInfo("Demolish", 122, Rarity.COMMON, mage.cards.d.Demolish.class));

        cards.add(new SetCardInfo("Harness the Storm", 130, Rarity.RARE, mage.cards.h.HarnessTheStorm.class));

        cards.add(new SetCardInfo("Zebra Behemoth", 148, Rarity.COMMON, mage.cards.z.ZebraBehemoth.class));
        //cards.add(new SetCardInfo("Acolyte of Coils", 149, Rarity.UNCOMMON, mage.cards.a.AcolyteOfCoils.class));
        cards.add(new SetCardInfo("Cobra Trap", 150, Rarity.UNCOMMON, mage.cards.c.CobraTrap.class));

        cards.add(new SetCardInfo("Fade into Antiquity", 158, Rarity.COMMON, mage.cards.f.FadeIntoAntiquity.class));
        cards.add(new SetCardInfo("Giant Growth", 159, Rarity.COMMON, mage.cards.g.GiantGrowth.class));

        cards.add(new SetCardInfo("Ma'at, God of Harmony", 165, Rarity.MYTHIC, mage.cards.m.MaatGodOfHarmony.class));

        cards.add(new SetCardInfo("Savage Hippo", 174, Rarity.COMMON, mage.cards.s.SavageHippo.class));
        cards.add(new SetCardInfo("Scapeshift", 175, Rarity.RARE, mage.cards.s.Scapeshift.class));

        cards.add(new SetCardInfo("Wild Camelicorn", 185, Rarity.COMMON, mage.cards.w.WildCamelicorn.class));

        cards.add(new SetCardInfo("The Scorpion King", 202, Rarity.RARE, mage.cards.t.TheScorpionKing.class));
        //cards.add(new SetCardInfo("Sphere of Faith", 203, Rarity.UNCOMMON, mage.cards.s.SphereOfFaith.class));
        cards.add(new SetCardInfo("Sphinx's Revelation", 205, Rarity.MYTHIC, mage.cards.s.SphinxsRevelation.class));

        cards.add(new SetCardInfo("Expedition Map", 215, Rarity.COMMON, mage.cards.e.ExpeditionMap.class));

        cards.add(new SetCardInfo("Pilgrim's Eye", 220, Rarity.UNCOMMON, mage.cards.p.PilgrimsEye.class));

        cards.add(new SetCardInfo("Archive of Kariro", 228, Rarity.MYTHIC, mage.cards.a.ArchiveOfKariro.class));

        cards.add(new SetCardInfo("Crumbling Vestige", 233, Rarity.COMMON, mage.cards.c.CrumblingVestige.class));
        //cards.add(new SetCardInfo("Desert Temple", 234, Rarity.COMMON, mage.cards.d.DesertTemple.class));
        cards.add(new SetCardInfo("Desolate Lighthouse", 235, Rarity.RARE, mage.cards.d.DesolateLighthouse.class));
        //cards.add(new SetCardInfo("Forgotten Necropolis", 236, Rarity.RARE, mage.cards.f.ForgottenNecropolis.class));
        //cards.add(new SetCardInfo("Garden Oasis", 237, Rarity.UNCOMMON, mage.cards.g.GardenOasis.class));
        //cards.add(new SetCardInfo("Gelid Pyramids", 238, Rarity.RARE, mage.cards.g.GelidPyramids.class));
        cards.add(new SetCardInfo("Mana Confluence", 239, Rarity.RARE, mage.cards.m.ManaConfluence.class));

        cards.add(new SetCardInfo("Unknown Shores", 248, Rarity.COMMON, mage.cards.u.UnknownShores.class));
        //cards.add(new SetCardInfo("Valley of Pyramids", 249, Rarity.UNCOMMON, mage.cards.v.ValleyOfPyramids.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 253, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 256, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 257, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 259, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 260, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 261, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 262, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 263, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 264, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
    }
}
