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

        cards.add(new SetCardInfo("Angelic Regulator", 1, Rarity.RARE, mage.cards.a.AngelicRegulator.class));
        cards.add(new SetCardInfo("Arrest", 2, Rarity.UNCOMMON, mage.cards.a.Arrest.class));
        cards.add(new SetCardInfo("Back in the Saddle", 3, Rarity.UNCOMMON, mage.cards.b.BackInTheSaddle.class));
        cards.add(new SetCardInfo("Cattle Drive", 4, Rarity.COMMON, mage.cards.c.CattleDrive.class));
        cards.add(new SetCardInfo("Circle the Wagons", 5, Rarity.COMMON, mage.cards.c.CircleTheWagons.class));
        cards.add(new SetCardInfo("Drag Behind", 6, Rarity.RARE, mage.cards.d.DragBehind.class));
        cards.add(new SetCardInfo("Empty Night", 7, Rarity.RARE, mage.cards.e.EmptyNight.class));
        cards.add(new SetCardInfo("Farajo, Peacemaker", 8, Rarity.MYTHIC, mage.cards.f.FarajoPeacemaker.class));
        cards.add(new SetCardInfo("Farajo's Blessing", 9, Rarity.UNCOMMON, mage.cards.f.FarajosBlessing.class));
        cards.add(new SetCardInfo("Farajo's Shield", 10, Rarity.COMMON, mage.cards.f.FarajosShield.class));
        cards.add(new SetCardInfo("Featherswine", 11, Rarity.COMMON, mage.cards.f.FeatherSwine.class));
        cards.add(new SetCardInfo("Firstfeather Elders", 12, Rarity.COMMON, mage.cards.f.FirstfeatherElders.class));
        cards.add(new SetCardInfo("Fort Redemption Ranger", 13, Rarity.MYTHIC, mage.cards.f.FortRedemptionRanger.class));
        cards.add(new SetCardInfo("Goat Herder", 14, Rarity.COMMON, mage.cards.g.GoatHerder.class));
        cards.add(new SetCardInfo("Grit", 15, Rarity.UNCOMMON, mage.cards.g.Grit.class));
        cards.add(new SetCardInfo("Guardian of the Dead", 16, Rarity.UNCOMMON, mage.cards.g.GuardianOfTheDead.class));
        cards.add(new SetCardInfo("Guthram Deputy", 17, Rarity.UNCOMMON, mage.cards.g.GuthramDeputy.class));
        cards.add(new SetCardInfo("High Noon", 18, Rarity.RARE, mage.cards.h.HighNoon.class));
        cards.add(new SetCardInfo("Hogtie", 19, Rarity.COMMON, mage.cards.h.Hogtie.class));
        cards.add(new SetCardInfo("Into the Sunset", 20, Rarity.COMMON, mage.cards.i.IntoTheSunset.class));
        cards.add(new SetCardInfo("Kill Shot", 21, Rarity.COMMON, mage.cards.k.KillShot.class));
        cards.add(new SetCardInfo("Manifestation of Destiny", 22, Rarity.RARE, mage.cards.m.ManifestationOfDestiny.class));
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
        cards.add(new SetCardInfo("Aerial Shootout", 39, Rarity.COMMON, mage.cards.a.AerialShootout.class));
        cards.add(new SetCardInfo("Aven Dealer", 40, Rarity.COMMON, mage.cards.a.AvenDealer.class));
        cards.add(new SetCardInfo("Aven Deputy", 41, Rarity.UNCOMMON, mage.cards.a.AvenDeputy.class));
        cards.add(new SetCardInfo("Bulletproof Barrier", 42, Rarity.UNCOMMON, mage.cards.b.BulletproofBarrier.class)); //TODO Fix Sacrifice Ability
        cards.add(new SetCardInfo("Call Your Bluff", 43, Rarity.COMMON, mage.cards.c.CallYourBluff.class));
        cards.add(new SetCardInfo("Career Criminal", 44, Rarity.UNCOMMON, mage.cards.c.CareerCriminal.class));
        cards.add(new SetCardInfo("Carnival Illusionist", 45, Rarity.RARE, mage.cards.c.CarnivalIllusionist.class));
        cards.add(new SetCardInfo("Claim Jumper", 46, Rarity.UNCOMMON, mage.cards.c.ClaimJumper.class));
        cards.add(new SetCardInfo("Conjure Frost", 47, Rarity.COMMON, mage.cards.c.ConjureFrost.class));
        cards.add(new SetCardInfo("Cyclone Rider", 48, Rarity.UNCOMMON, mage.cards.c.CycloneRider.class));
        cards.add(new SetCardInfo("Dowsing Prospector", 49, Rarity.COMMON, mage.cards.d.DowsingProspector.class));
        cards.add(new SetCardInfo("Drive Off", 50, Rarity.COMMON, mage.cards.d.DriveOff.class));
        cards.add(new SetCardInfo("Expel", 51, Rarity.UNCOMMON, mage.cards.e.Expel.class));
        cards.add(new SetCardInfo("Firstfeather Stormwing", 52, Rarity.COMMON, mage.cards.f.FirstfeatherStormwing.class));
        cards.add(new SetCardInfo("Foretell", 53, Rarity.COMMON, mage.cards.f.Foretell.class));
        //cards.add(new SetCardInfo("Gaile Hannidy", 54, Rarity.MYTHIC, mage.cards.g.GaileHannidy.class));
        cards.add(new SetCardInfo("Giant Catfish", 55, Rarity.COMMON, mage.cards.g.GiantCatfish.class));
        cards.add(new SetCardInfo("Gone Fishin'", 56, Rarity.COMMON, mage.cards.g.GoneFishin.class));
        cards.add(new SetCardInfo("Hasty Retreat", 57, Rarity.UNCOMMON, mage.cards.h.HastyRetreat.class));
        cards.add(new SetCardInfo("Horned Serpent", 58, Rarity.COMMON, mage.cards.h.HornedSerpent.class));
        cards.add(new SetCardInfo("Hyastee Sigil", 59, Rarity.COMMON, mage.cards.h.HyasteeSigil.class));
        //cards.add(new SetCardInfo("Hyastee Sphinx", 60, Rarity.RARE, mage.cards.h.HyasteeSphinx.class));
        cards.add(new SetCardInfo("Lost in the Mist", 61, Rarity.COMMON, mage.cards.l.LostInTheMist.class));
        cards.add(new SetCardInfo("Mana Heist", 62, Rarity.RARE, mage.cards.m.ManaHeist.class));
        cards.add(new SetCardInfo("Manastorm Twister", 63, Rarity.UNCOMMON, mage.cards.m.ManastormTwister.class));
        cards.add(new SetCardInfo("Mother Owl's Herald", 64, Rarity.MYTHIC, mage.cards.m.MotherOwlsHerald.class));
        //cards.add(new SetCardInfo("Nimble Spellslinger", 65, Rarity.COMMON, mage.cards.n.NimbleSpellslinger.class));
        //cards.add(new SetCardInfo("Pan the River", 66, Rarity.UNCOMMON, mage.cards.p.PanTheRiver.class));
        cards.add(new SetCardInfo("Shellback Deputy", 67, Rarity.COMMON, mage.cards.s.ShellbackDeputy.class));

        cards.add(new SetCardInfo("Bad Blood", 77, Rarity.COMMON, mage.cards.b.BadBlood.class));
        cards.add(new SetCardInfo("Blightwing Wildshaper", 78, Rarity.COMMON, mage.cards.b.BlightwingWildshaper.class));
        //cards.add(new SetCardInfo("Bloodshot Coachthief", 79, Rarity.RARE, mage.cards.b.BloodshotCoachthief.class));
        //cards.add(new SetCardInfo("Bloodshot Enforcer", 80, Rarity.COMMON, mage.cards.b.BloodshotEnforcer.class));
        cards.add(new SetCardInfo("Chupacabra", 81, Rarity.COMMON, mage.cards.c.Chupacabra.class));
        cards.add(new SetCardInfo("Coat with Venom", 82, Rarity.COMMON, mage.cards.c.CoatWithVenom.class));
        cards.add(new SetCardInfo("Dadgum Vermints", 83, Rarity.COMMON, mage.cards.d.DadgumVermints.class));

        cards.add(new SetCardInfo("Tar Snare", 105, Rarity.COMMON, mage.cards.t.TarSnare.class));

        cards.add(new SetCardInfo("Gamble", 123, Rarity.MYTHIC, mage.cards.g.Gamble.class));
        //cards.add(new SetCardInfo("Goblin Express", 124, Rarity.RARE, mage.cards.g.GoblinExpress.class));
        cards.add(new SetCardInfo("Goblin Roughrider", 125, Rarity.COMMON, mage.cards.g.GoblinRoughrider.class));
        cards.add(new SetCardInfo("Goblin Sharpshooter", 126, Rarity.RARE, mage.cards.g.GoblinSharpshooter.class));
        //cards.add(new SetCardInfo("Greenskin Gambler", 127, Rarity.UNCOMMON, mage.cards.g.GreenskinGambler.class));
        //cards.add(new SetCardInfo("Greenskin Geologist", 128, Rarity.COMMON, mage.cards.g.GreenskinGeologist.class));
        //cards.add(new SetCardInfo("Guns Blazing", 129, Rarity.COMMON, mage.cards.g.GunsBlazing.class));
        cards.add(new SetCardInfo("Hoarding Dragon", 130, Rarity.RARE, mage.cards.h.HoardingDragon.class));

        cards.add(new SetCardInfo("Wrangle", 151, Rarity.COMMON, mage.cards.w.Wrangle.class));
        //cards.add(new SetCardInfo("Campfire", 152, Rarity.COMMON, mage.cards.c.Campfire.class));
        //cards.add(new SetCardInfo("Centaur Desperado", 153, Rarity.UNCOMMON, mage.cards.c.CentaurDesperado.class));
        //cards.add(new SetCardInfo("Centaur Fieldhand", 154, Rarity.COMMON, mage.cards.c.CentaurFieldhand.class));
        cards.add(new SetCardInfo("Cultivate", 155, Rarity.COMMON, mage.cards.c.Cultivate.class));

        cards.add(new SetCardInfo("Expedition Corps", 160, Rarity.MYTHIC, mage.cards.e.ExpeditionCorps.class));
        //cards.add(new SetCardInfo("Final Showdown", 161, Rarity.RARE, mage.cards.f.FinalShowdown.class));
        //cards.add(new SetCardInfo("Home on the Range", 162, Rarity.UNCOMMON, mage.cards.h.HomeOnTheRange.class));
        //cards.add(new SetCardInfo("Hyastee Courser", 163, Rarity.COMMON, mage.cards.h.HyasteeCourser.class));
        cards.add(new SetCardInfo("Ironhoof Ox", 164, Rarity.COMMON, mage.cards.i.IronhoofOx.class));
        cards.add(new SetCardInfo("Joint Assault", 165, Rarity.COMMON, mage.cards.j.JointAssault.class));

        cards.add(new SetCardInfo("Naturalize", 174, Rarity.COMMON, mage.cards.n.Naturalize.class));

        cards.add(new SetCardInfo("Settle", 180, Rarity.UNCOMMON, mage.cards.s.Settle.class));

        cards.add(new SetCardInfo("Selfless Engineer", 225, Rarity.RARE, mage.cards.s.SelflessEngineer.class));

        cards.add(new SetCardInfo("Trading Post", 237, Rarity.RARE, mage.cards.t.TradingPost.class));

        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 253, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 254, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 255, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 256, Rarity.LAND, mage.cards.basiclands.Forest.class));

        //TODO Fix Rallyridge Quartermaster (look at Gift of Immortality) & High Noon.
        //TODO Bloodshot Coachthief, Dead Mans Hand, Deal at the Crossroads, Death Cheater,
        //TODO Fix Chupacabra Ability.
    }
}
