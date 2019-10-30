package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author EikePace
 */
public final class Lorado extends ExpansionSet {

    private static final Lorado instance = new Lorado();

    public static Lorado getInstance() {
        return instance;
    }

    private Lorado() {
        super("Lorado", "LDO", ExpansionSet.buildDate(2016, 12, 15), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Aerial Shootout", 39, Rarity.COMMON, mage.cards.a.AerialShootout.class));
        cards.add(new SetCardInfo("Angelic Regulator", 1, Rarity.RARE, mage.cards.a.AngelicRegulator.class));
        cards.add(new SetCardInfo("Arrest", 2, Rarity.UNCOMMON, mage.cards.a.Arrest.class));
        cards.add(new SetCardInfo("Aven Dealer", 40, Rarity.COMMON, mage.cards.a.AvenDealer.class));
        cards.add(new SetCardInfo("Aven Deputy", 41, Rarity.UNCOMMON, mage.cards.a.AvenDeputy.class));
        cards.add(new SetCardInfo("Back in the Saddle", 3, Rarity.UNCOMMON, mage.cards.b.BackInTheSaddle.class));
        cards.add(new SetCardInfo("Bad Blood", 77, Rarity.COMMON, mage.cards.b.BadBlood.class));
        cards.add(new SetCardInfo("Blightwing Wildshaper", 78, Rarity.COMMON, mage.cards.b.BlightwingWildshaper.class));
        //cards.add(new SetCardInfo("Bloodshot Enforcer", 80, Rarity.COMMON, mage.cards.b.BloodshotEnforcer.class));
        cards.add(new SetCardInfo("Bulletproof Barrier", 42, Rarity.UNCOMMON, mage.cards.b.BulletproofBarrier.class)); //TODO Fix Sacrifice Ability
        cards.add(new SetCardInfo("Call your Bluff", 43, Rarity.COMMON, mage.cards.c.CallYourBluff.class));
        cards.add(new SetCardInfo("Career Criminal", 44, Rarity.UNCOMMON, mage.cards.c.CareerCriminal.class));
        cards.add(new SetCardInfo("Carnival Illusionist", 45, Rarity.RARE, mage.cards.c.CarnivalIllusionist.class));
        cards.add(new SetCardInfo("Cattle Drive", 4, Rarity.COMMON, mage.cards.c.CattleDrive.class));
        cards.add(new SetCardInfo("Chupacabra", 81, Rarity.COMMON, mage.cards.c.Chupacabra.class));
        cards.add(new SetCardInfo("Circle the Wagons", 5, Rarity.COMMON, mage.cards.c.CircleTheWagons.class));
        cards.add(new SetCardInfo("Claim Jumper", 46, Rarity.UNCOMMON, mage.cards.c.ClaimJumper.class));
        cards.add(new SetCardInfo("Coat with Venom", 82, Rarity.COMMON, mage.cards.c.CoatWithVenom.class));
        cards.add(new SetCardInfo("Conjure Frost", 47, Rarity.COMMON, mage.cards.c.ConjureFrost.class));
        cards.add(new SetCardInfo("Cyclone Rider", 48, Rarity.UNCOMMON, mage.cards.c.CycloneRider.class));
        cards.add(new SetCardInfo("Dadgum Vermints", 83, Rarity.COMMON, mage.cards.d.DadgumVermints.class));
        cards.add(new SetCardInfo("Dowsing Prospector", 49, Rarity.COMMON, mage.cards.d.DowsingProspector.class));
        cards.add(new SetCardInfo("Drag Behind", 6, Rarity.RARE, mage.cards.d.DragBehind.class));
        cards.add(new SetCardInfo("Drive Off", 50, Rarity.COMMON, mage.cards.d.DriveOff.class));
        cards.add(new SetCardInfo("Empty Night", 7, Rarity.RARE, mage.cards.e.EmptyNight.class));
        cards.add(new SetCardInfo("Expel", 51, Rarity.UNCOMMON, mage.cards.e.Expel.class));
        cards.add(new SetCardInfo("Farajo, Peacemaker", 8, Rarity.MYTHIC, mage.cards.f.FarajoPeacemaker.class));
        cards.add(new SetCardInfo("Farajo's Blessing", 9, Rarity.UNCOMMON, mage.cards.f.FarajosBlessing.class));
        cards.add(new SetCardInfo("Farajo's Shield", 10, Rarity.COMMON, mage.cards.f.FarajosShield.class));
        cards.add(new SetCardInfo("Featherswine", 11, Rarity.COMMON, mage.cards.f.FeatherSwine.class));
        cards.add(new SetCardInfo("Firstfeather Elders", 12, Rarity.COMMON, mage.cards.f.FirstfeatherElders.class));
        cards.add(new SetCardInfo("Firstfeather Stormwing", 52, Rarity.COMMON, mage.cards.f.FirstfeatherStormwing.class));
        cards.add(new SetCardInfo("Foretell", 53, Rarity.COMMON, mage.cards.f.Foretell.class));
        cards.add(new SetCardInfo("Fort Redemption Ranger", 13, Rarity.MYTHIC, mage.cards.f.FortRedemptionRanger.class));
        cards.add(new SetCardInfo("Giant Catfish", 55, Rarity.COMMON, mage.cards.g.GiantCatfish.class));
        cards.add(new SetCardInfo("Goat Herder", 14, Rarity.COMMON, mage.cards.g.GoatHerder.class));
        cards.add(new SetCardInfo("Gone Fishin", 56, Rarity.COMMON, mage.cards.g.GoneFishin.class));
        cards.add(new SetCardInfo("Grit", 15, Rarity.UNCOMMON, mage.cards.g.Grit.class));
        cards.add(new SetCardInfo("Guardian of the Dead", 16, Rarity.UNCOMMON, mage.cards.g.GuardianOfTheDead.class));
        cards.add(new SetCardInfo("Guthram Deputy", 17, Rarity.UNCOMMON, mage.cards.g.GuthramDeputy.class));
        cards.add(new SetCardInfo("Hasty Retreat", 57, Rarity.UNCOMMON, mage.cards.h.HastyRetreat.class));
        cards.add(new SetCardInfo("High Noon", 18, Rarity.RARE, mage.cards.h.HighNoon.class));
        cards.add(new SetCardInfo("Hogtie", 19, Rarity.COMMON, mage.cards.h.Hogtie.class));
        cards.add(new SetCardInfo("Horned Serpent", 58, Rarity.COMMON, mage.cards.h.HornedSerpent.class));
        cards.add(new SetCardInfo("Hyastee Sigil", 59, Rarity.COMMON, mage.cards.h.HyasteeSigil.class));
        cards.add(new SetCardInfo("Into the Sunset", 20, Rarity.COMMON, mage.cards.i.IntoTheSunset.class));
        cards.add(new SetCardInfo("Kill Shot", 21, Rarity.COMMON, mage.cards.k.KillShot.class));
        cards.add(new SetCardInfo("Lost in the Mist", 61, Rarity.COMMON, mage.cards.l.LostInTheMist.class));
        cards.add(new SetCardInfo("Mana Heist", 62, Rarity.RARE, mage.cards.m.ManaHeist.class));
        cards.add(new SetCardInfo("Manastorm Twister", 63, Rarity.UNCOMMON, mage.cards.m.ManastormTwister.class));
        cards.add(new SetCardInfo("Manifestation of Destiny", 22, Rarity.RARE, mage.cards.m.ManifestationOfDestiny.class));
        cards.add(new SetCardInfo("Mother Owls Herald", 64, Rarity.MYTHIC, mage.cards.m.MotherOwlsHerald.class));
        cards.add(new SetCardInfo("Naaki Healer", 23, Rarity.COMMON, mage.cards.n.NaakiHealer.class));
        cards.add(new SetCardInfo("Naaki Shepherd", 24, Rarity.COMMON, mage.cards.n.NaakiShepherd.class));
        cards.add(new SetCardInfo("Nimbus Hog", 25, Rarity.COMMON, mage.cards.n.NimbusHog.class));
        cards.add(new SetCardInfo("Paragon Dragonslayer", 26, Rarity.UNCOMMON, mage.cards.p.ParagonDragonslayer.class));
        cards.add(new SetCardInfo("Rallyridge Patrolman", 27, Rarity.COMMON, mage.cards.r.RallyridgePatrolman.class));
        cards.add(new SetCardInfo("Rallyridge Quartermaster", 28, Rarity.RARE, mage.cards.r.RallyridgeQuartermaster.class));
        cards.add(new SetCardInfo("Redeemed Lawbringer", 29, Rarity.COMMON, mage.cards.r.RedeemedLawbringer.class));
        cards.add(new SetCardInfo("Repel Siege", 30, Rarity.RARE, mage.cards.r.RepelSiege.class));
        cards.add(new SetCardInfo("Roaming Buffalo", 31, Rarity.COMMON, mage.cards.r.RoamingBuffalo.class));
        cards.add(new SetCardInfo("Sacredhoof Wildshaper", 32, Rarity.COMMON, mage.cards.s.SacredhoofWildshaper.class));
        cards.add(new SetCardInfo("Sheriff's Steed", 33, Rarity.COMMON, mage.cards.s.SheriffsSteed.class));
        cards.add(new SetCardInfo("Signature Strike", 34, Rarity.COMMON, mage.cards.s.SignatureStrike.class));
        cards.add(new SetCardInfo("Smoke the Peace Pipe", 35, Rarity.COMMON, mage.cards.s.SmokeThePeacePipe.class));
        cards.add(new SetCardInfo("Stunshot Centaur", 36, Rarity.UNCOMMON, mage.cards.s.StunshotCentaur.class));
        cards.add(new SetCardInfo("Trinket Peddler", 37, Rarity.COMMON, mage.cards.t.TrinketPeddler.class));
        cards.add(new SetCardInfo("Winged Constable", 38, Rarity.UNCOMMON, mage.cards.w.WingedConstable.class));

        //TODO Fix Rallyridge Quartermaster (look at Gift of Immortality) & High Noon.
        //TODO Bloodshot Coachthief, Dead Mans Hand, Deal at the Crossroads, Death Cheater,
        //TODO Fix Chupacabra Ability.
    }
}
