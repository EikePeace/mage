package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author Fenhl
 */
public final class ScripturesOfUrshad extends ExpansionSet {
    private static final ScripturesOfUrshad instance = new ScripturesOfUrshad();

    public static ScripturesOfUrshad getInstance() { return instance; }

    private ScripturesOfUrshad() {
        super("Scriptures of Urshad", "SOU", ExpansionSet.buildDate(2019, 5, 29), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //cards.add(new SetCardInfo("Aridland Camaar", 1, Rarity.COMMON, mage.cards.a.AridlandCamaar.class));
        //cards.add(new SetCardInfo("Aspect of Darutu", 2, Rarity.RARE, mage.cards.a.AspectOfDarutu.class));
        //cards.add(new SetCardInfo("Calming Dromoryx", 3, Rarity.RARE, mage.cards.c.CalmingDromoryx.class));
        //cards.add(new SetCardInfo("Conscription", 4, Rarity.UNCOMMON, mage.cards.c.Conscription.class));
        //cards.add(new SetCardInfo("Court Sponsor", 5, Rarity.UNCOMMON, mage.cards.c.CourtSponsor.class));
        //cards.add(new SetCardInfo("Cycle of Creation", 6, Rarity.MYTHIC, mage.cards.c.CycleOfCreation.class));
        cards.add(new SetCardInfo("Divine Verdict", 7, Rarity.COMMON, mage.cards.d.DivineVerdict.class));
        //cards.add(new SetCardInfo("Epic of Hannaru", 8, Rarity.RARE, mage.cards.e.EpicOfHannaru.class));
        //cards.add(new SetCardInfo("Founding Hero", 9, Rarity.RARE, mage.cards.f.FoundingHero.class));
        //cards.add(new SetCardInfo("Gilded Blade", 10, Rarity.COMMON, mage.cards.g.GildedBlade.class));
        //cards.add(new SetCardInfo("Godchosen Valor", 11, Rarity.COMMON, mage.cards.g.GodchosenValor.class));
        //cards.add(new SetCardInfo("Halls of Worship", 12, Rarity.UNCOMMON, mage.cards.h.HallsOfWorship.class));
        //cards.add(new SetCardInfo("Hannaru's Courage", 13, Rarity.COMMON, mage.cards.h.HannarusCourage.class));
        //cards.add(new SetCardInfo("Hannaru's Spear", 14, Rarity.RARE, mage.cards.h.HannarusSpear.class));
        //cards.add(new SetCardInfo("Hard-Working Oxen", 15, Rarity.COMMON, mage.cards.h.HardWorkingOxen.class));
        //cards.add(new SetCardInfo("Harshapal Banner", 16, Rarity.COMMON, mage.cards.h.HarshapalBanner.class));
        //cards.add(new SetCardInfo("Hirsute Champion", 17, Rarity.UNCOMMON, mage.cards.h.HirsuteChampion.class));
        //cards.add(new SetCardInfo("Immortalize", 18, Rarity.UNCOMMON, mage.cards.i.Immortalize.class));
        //cards.add(new SetCardInfo("Imperial Claim", 19, Rarity.RARE, mage.cards.i.ImperialClaim.class));
        //cards.add(new SetCardInfo("Imperial Defenses", 20, Rarity.RARE, mage.cards.i.ImperialDefenses.class));
        cards.add(new SetCardInfo("Inspired Charge", 21, Rarity.COMMON, mage.cards.i.InspiredCharge.class));
        //cards.add(new SetCardInfo("Legacy Warmask", 22, Rarity.UNCOMMON, mage.cards.l.LegacyWarmask.class));
        //cards.add(new SetCardInfo("Lisseria's Outfitter", 23, Rarity.COMMON, mage.cards.l.LisseriasOutfitter.class));
        //cards.add(new SetCardInfo("Long Journey", 24, Rarity.COMMON, mage.cards.l.LongJourney.class));
        //cards.add(new SetCardInfo("Marble Row Healer", 25, Rarity.COMMON, mage.cards.m.MarbleRowHealer.class));
        cards.add(new SetCardInfo("Master of Marble Row", 26, Rarity.MYTHIC, mage.cards.m.MasterOfMarbleRow.class));
        //cards.add(new SetCardInfo("Medicine", 27, Rarity.UNCOMMON, mage.cards.m.Medicine.class));
        //cards.add(new SetCardInfo("Queen Hannaru", "28a", Rarity.MYTHIC, mage.cards.q.QueenHannaru.class));
        //cards.add(new SetCardInfo("Hannaru the Conqueror", "28b", Rarity.MYTHIC, mage.cards.h.HannaruTheConqueror.class));
        //cards.add(new SetCardInfo("Rabudan Chiseler", 29, Rarity.COMMON, mage.cards.r.RabudanChiseler.class));
        //cards.add(new SetCardInfo("Ruler of Cities", 30, Rarity.RARE, mage.cards.r.RulerOfCities.class));
        //cards.add(new SetCardInfo("Sannurian Storyteller", 31, Rarity.COMMON, mage.cards.s.SannurianStoryteller.class));
        //cards.add(new SetCardInfo("Scion of Sannuria", 32, Rarity.COMMON, mage.cards.s.ScionOfSannuria.class));
        //cards.add(new SetCardInfo("Serve the Empire", 33, Rarity.UNCOMMON, mage.cards.s.ServeTheEmpire.class));
        //cards.add(new SetCardInfo("Shepherd's Companion", 34, Rarity.COMMON, mage.cards.s.ShepherdsCompanion.class));
        //cards.add(new SetCardInfo("Sire of Empires", 35, Rarity.RARE, mage.cards.s.SireOfEmpires.class));
        //cards.add(new SetCardInfo("Soaring Roc", 36, Rarity.COMMON, mage.cards.s.SoaringRoc.class));
        cards.add(new SetCardInfo("Solemn Offering", 37, Rarity.COMMON, mage.cards.s.SolemnOffering.class));
        //cards.add(new SetCardInfo("Spirit of the Harvest", 38, Rarity.UNCOMMON, mage.cards.s.SpiritOfTheHarvest.class));
        //cards.add(new SetCardInfo("Sustaining Crops", 39, Rarity.COMMON, mage.cards.s.SustainingCrops.class));
        //cards.add(new SetCardInfo("Theocracy", 40, Rarity.RARE, mage.cards.t.Theocracy.class));
        //cards.add(new SetCardInfo("Tithe Official", 41, Rarity.UNCOMMON, mage.cards.t.TitheOfficial.class));
        //cards.add(new SetCardInfo("Warden of Harshapal Tower", 42, Rarity.UNCOMMON, mage.cards.w.WardenOfHarshapalTower.class));
        //cards.add(new SetCardInfo("Water into Wine", 43, Rarity.UNCOMMON, mage.cards.w.WaterIntoWine.class));
        //cards.add(new SetCardInfo("Aven Merchant", 44, Rarity.UNCOMMON, mage.cards.a.AvenMerchant.class));
        //cards.add(new SetCardInfo("Aven Supervisor", 45, Rarity.COMMON, mage.cards.a.AvenSupervisor.class));
        //cards.add(new SetCardInfo("Azutahn Hydromancer", 46, Rarity.COMMON, mage.cards.a.AzutahnHydromancer.class));
        //cards.add(new SetCardInfo("Azutah's Abundance", 47, Rarity.UNCOMMON, mage.cards.a.AzutahsAbundance.class));
        //cards.add(new SetCardInfo("Cartography", 48, Rarity.RARE, mage.cards.c.Cartography.class));
        //cards.add(new SetCardInfo("Consult the Scriptures", 49, Rarity.COMMON, mage.cards.c.ConsultTheScriptures.class));
        //cards.add(new SetCardInfo("Dehydrate", 50, Rarity.COMMON, mage.cards.d.Dehydrate.class));
        //cards.add(new SetCardInfo("Delugic Surger", 51, Rarity.COMMON, mage.cards.d.DelugicSurger.class));
        //cards.add(new SetCardInfo("Edifice Overseer", 52, Rarity.UNCOMMON, mage.cards.e.EdificeOverseer.class));
        cards.add(new SetCardInfo("Ekebram the Scholar", "53a", Rarity.MYTHIC, mage.cards.e.EkebramTheScholar.class));
        cards.add(new SetCardInfo("Ekebram, Chronicler of Ages", "53b", Rarity.MYTHIC, mage.cards.e.EkebramChroniclerOfAges.class));
        //cards.add(new SetCardInfo("Ekebram's Scholar", 54, Rarity.COMMON, mage.cards.e.EkebramsScholar.class));
        cards.add(new SetCardInfo("Emissary of Dark Tides", 55, Rarity.RARE, mage.cards.e.EmissaryOfDarkTides.class));
        //cards.add(new SetCardInfo("Epic of Ekebram", 56, Rarity.RARE, mage.cards.e.EpicOfEkebram.class));
        //cards.add(new SetCardInfo("Gilded Authority", 57, Rarity.UNCOMMON, mage.cards.g.GildedAuthority.class));
        //cards.add(new SetCardInfo("Glimpse of Fate", 58, Rarity.UNCOMMON, mage.cards.g.GlimpseOfFate.class));
        cards.add(new SetCardInfo("Golden Age", 59, Rarity.RARE, mage.cards.g.GoldenAge.class));
        //cards.add(new SetCardInfo("Hauling Hippopotamus", 60, Rarity.COMMON, mage.cards.h.HaulingHippopotamus.class));
        //cards.add(new SetCardInfo("Hefty Tablet", 61, Rarity.UNCOMMON, mage.cards.h.HeftyTablet.class));
        //cards.add(new SetCardInfo("Imperial Achievement", 62, Rarity.UNCOMMON, mage.cards.i.ImperialAchievement.class));
        //cards.add(new SetCardInfo("Imperial Prosperity", 63, Rarity.COMMON, mage.cards.i.ImperialProsperity.class));
        //cards.add(new SetCardInfo("Invoke the Ankuliths", 64, Rarity.RARE, mage.cards.i.InvokeTheAnkuliths.class));
        //cards.add(new SetCardInfo("Irrigation Channels", 65, Rarity.COMMON, mage.cards.i.IrrigationChannels.class));
        //cards.add(new SetCardInfo("Lammasu Roost", 66, Rarity.COMMON, mage.cards.l.LammasuRoost.class));
        //cards.add(new SetCardInfo("Look to the Future", 67, Rarity.MYTHIC, mage.cards.l.LookToTheFuture.class));
        //cards.add(new SetCardInfo("Namuzzar's Disciple", 68, Rarity.RARE, mage.cards.n.NamuzzarsDisciple.class));
        //cards.add(new SetCardInfo("Namuzzar's Iterator", 69, Rarity.COMMON, mage.cards.n.NamuzzarsIterator.class));
        //cards.add(new SetCardInfo("Obviate", 70, Rarity.COMMON, mage.cards.o.Obviate.class));
        //cards.add(new SetCardInfo("Opulent Ankulim", 71, Rarity.UNCOMMON, mage.cards.o.OpulentAnkulim.class));
        //cards.add(new SetCardInfo("Parted Waters", 72, Rarity.UNCOMMON, mage.cards.p.PartedWaters.class));
        //cards.add(new SetCardInfo("Primordial Manifestation", 73, Rarity.RARE, mage.cards.p.PrimordialManifestation.class));
        //cards.add(new SetCardInfo("Rhudai Overseer", 74, Rarity.UNCOMMON, mage.cards.r.RhudaiOverseer.class));
        //cards.add(new SetCardInfo("Rod of Marble Row", 75, Rarity.COMMON, mage.cards.r.RodOfMarbleRow.class));
        //cards.add(new SetCardInfo("Secrets of Creation", 76, Rarity.COMMON, mage.cards.s.SecretsOfCreation.class));
        //cards.add(new SetCardInfo("Seeker Amalgam", 77, Rarity.UNCOMMON, mage.cards.s.SeekerAmalgam.class));
        cards.add(new SetCardInfo("Spell Pierce", 78, Rarity.COMMON, mage.cards.s.SpellPierce.class));
        cards.add(new SetCardInfo("Splinter of Anku", 79, Rarity.COMMON, mage.cards.s.SplinterOfAnku.class));
        //cards.add(new SetCardInfo("Turn to Salt", 80, Rarity.COMMON, mage.cards.t.TurnToSalt.class));
        //cards.add(new SetCardInfo("Wealthy Merchants", 81, Rarity.COMMON, mage.cards.w.WealthyMerchants.class));
        cards.add(new SetCardInfo("Writing", 82, Rarity.UNCOMMON, mage.cards.w.Writing.class));
        //cards.add(new SetCardInfo("Adorned Naga", 83, Rarity.COMMON, mage.cards.a.AdornedNaga.class));
        //cards.add(new SetCardInfo("Anatomy", 84, Rarity.UNCOMMON, mage.cards.a.Anatomy.class));
        //cards.add(new SetCardInfo("Ashen Persecutor", 85, Rarity.RARE, mage.cards.a.AshenPersecutor.class));
        //cards.add(new SetCardInfo("Behead", 86, Rarity.COMMON, mage.cards.b.Behead.class));
        //cards.add(new SetCardInfo("Bloodstained Ziggurat", 87, Rarity.COMMON, mage.cards.b.BloodstainedZiggurat.class));
        //cards.add(new SetCardInfo("Bone Mesa Marauder", 88, Rarity.COMMON, mage.cards.b.BoneMesaMarauder.class));
        //cards.add(new SetCardInfo("Chittering Swarm", 89, Rarity.COMMON, mage.cards.c.ChitteringSwarm.class));
        //cards.add(new SetCardInfo("Churning Sandwurms", 90, Rarity.UNCOMMON, mage.cards.c.ChurningSandwurms.class));
        //cards.add(new SetCardInfo("Corpse Herder", 91, Rarity.UNCOMMON, mage.cards.c.CorpseHerder.class));
        //cards.add(new SetCardInfo("Crooked Merchant", 92, Rarity.COMMON, mage.cards.c.CrookedMerchant.class));
        //cards.add(new SetCardInfo("Death Pits Trophy", 93, Rarity.COMMON, mage.cards.d.DeathPitsTrophy.class));
        //cards.add(new SetCardInfo("Despoiler of Civilization", 94, Rarity.UNCOMMON, mage.cards.d.DespoilerOfCivilization.class));
        //cards.add(new SetCardInfo("Eli Windsors, Lone Gun", 95, Rarity.MYTHIC, mage.cards.e.EliWindsorsLoneGun.class));
        //cards.add(new SetCardInfo("Eli's Defiance", 96, Rarity.RARE, mage.cards.e.ElisDefiance.class));
        //cards.add(new SetCardInfo("Endak City Slavedriver", 97, Rarity.COMMON, mage.cards.e.EndakCitySlavedriver.class));
        //cards.add(new SetCardInfo("Endak Death Pits", 98, Rarity.UNCOMMON, mage.cards.e.EndakDeathPits.class));
        //cards.add(new SetCardInfo("Epic of Inishtu", 99, Rarity.RARE, mage.cards.e.EpicOfInishtu.class));
        cards.add(new SetCardInfo("Funerary Servant", 100, Rarity.COMMON, mage.cards.f.FuneraryServant.class));
        //cards.add(new SetCardInfo("Harbinger of Locusts", 101, Rarity.RARE, mage.cards.h.HarbingerOfLocusts.class));
        //cards.add(new SetCardInfo("Hilaback Outriders", 102, Rarity.COMMON, mage.cards.h.HilabackOutriders.class));
        //cards.add(new SetCardInfo("Imperial Brutality", 103, Rarity.UNCOMMON, mage.cards.i.ImperialBrutality.class));
        //cards.add(new SetCardInfo("Imperial Confidant", 104, Rarity.RARE, mage.cards.i.ImperialConfidant.class));
        cards.add(new SetCardInfo("Inishtu, Desert Healer", "105a", Rarity.MYTHIC, mage.cards.i.InishtuDesertHealer.class));
        cards.add(new SetCardInfo("Inishtu, Herald of the Dead", "105b", Rarity.MYTHIC, mage.cards.i.InishtuHeraldOfTheDead.class));
        //cards.add(new SetCardInfo("Into the Lion's Den", 106, Rarity.COMMON, mage.cards.i.IntoTheLionsDen.class));
        //cards.add(new SetCardInfo("Life's Worth", 107, Rarity.UNCOMMON, mage.cards.l.LifesWorth.class));
        //cards.add(new SetCardInfo("Merchant of Flesh", 108, Rarity.UNCOMMON, mage.cards.m.MerchantOfFlesh.class));
        //cards.add(new SetCardInfo("Nameless Throng", 109, Rarity.UNCOMMON, mage.cards.n.NamelessThrong.class));
        //cards.add(new SetCardInfo("Paid in Blood", 110, Rarity.COMMON, mage.cards.p.PaidInBlood.class));
        //cards.add(new SetCardInfo("Pound by Pound", 111, Rarity.COMMON, mage.cards.p.PoundByPound.class));
        //cards.add(new SetCardInfo("Rottenfruit Coiler", 112, Rarity.COMMON, mage.cards.r.RottenfruitCoiler.class));
        //cards.add(new SetCardInfo("Ruthless Advancement", 113, Rarity.COMMON, mage.cards.r.RuthlessAdvancement.class));
        //cards.add(new SetCardInfo("Scorpid Sniper", 114, Rarity.COMMON, mage.cards.s.ScorpidSniper.class));
        //cards.add(new SetCardInfo("Selezzar, Tyrant of Endak", 115, Rarity.RARE, mage.cards.s.SelezzarTyrantOfEndak.class));
        //cards.add(new SetCardInfo("Solemn Judgment", 116, Rarity.RARE, mage.cards.s.SolemnJudgment.class));
        //cards.add(new SetCardInfo("Sorrowful Memories", 117, Rarity.COMMON, mage.cards.s.SorrowfulMemories.class));
        //cards.add(new SetCardInfo("Stingbrood Warlord", 118, Rarity.UNCOMMON, mage.cards.s.StingbroodWarlord.class));
        //cards.add(new SetCardInfo("Subjugator of Empires", 119, Rarity.MYTHIC, mage.cards.s.SubjugatorOfEmpires.class));
        //cards.add(new SetCardInfo("Suffocating Sands", 120, Rarity.COMMON, mage.cards.s.SuffocatingSands.class));
        //cards.add(new SetCardInfo("Tradition", 121, Rarity.RARE, mage.cards.t.Tradition.class));
        //cards.add(new SetCardInfo("Tyranny", 122, Rarity.UNCOMMON, mage.cards.t.Tyranny.class));
        //cards.add(new SetCardInfo("Under the Gun", 123, Rarity.RARE, mage.cards.u.UnderTheGun.class));
        //cards.add(new SetCardInfo("Wretched Lammasu", 124, Rarity.UNCOMMON, mage.cards.w.WretchedLammasu.class));
        cards.add(new SetCardInfo("Act of Treason", 125, Rarity.COMMON, mage.cards.a.ActOfTreason.class));
        //cards.add(new SetCardInfo("Ankulim Spawning", 126, Rarity.COMMON, mage.cards.a.AnkulimSpawning.class));
        //cards.add(new SetCardInfo("Ankulithic Armaments", 127, Rarity.UNCOMMON, mage.cards.a.AnkulithicArmaments.class));
        cards.add(new SetCardInfo("Battlescarred Predator", 128, Rarity.COMMON, mage.cards.b.BattlescarredPredator.class));
        //cards.add(new SetCardInfo("Blazing Offerings", 129, Rarity.UNCOMMON, mage.cards.b.BlazingOfferings.class));
        //cards.add(new SetCardInfo("Bloodsoaked Blades", 130, Rarity.COMMON, mage.cards.b.BloodsoakedBlades.class));
        //cards.add(new SetCardInfo("Borsuppa Outrider", 131, Rarity.COMMON, mage.cards.b.BorsuppaOutrider.class));
        //cards.add(new SetCardInfo("Borsuppa Scavenger", 132, Rarity.COMMON, mage.cards.b.BorsuppaScavenger.class));
        //cards.add(new SetCardInfo("Burning Sulfur", 133, Rarity.UNCOMMON, mage.cards.b.BurningSulfur.class));
        //cards.add(new SetCardInfo("Choking Dunes", 134, Rarity.RARE, mage.cards.c.ChokingDunes.class));
        cards.add(new SetCardInfo("Currency", 135, Rarity.RARE, mage.cards.c.Currency.class));
        //cards.add(new SetCardInfo("Devoted Nomad", 136, Rarity.COMMON, mage.cards.d.DevotedNomad.class));
        //cards.add(new SetCardInfo("Dryscale Dissidents", 137, Rarity.UNCOMMON, mage.cards.d.DryscaleDissidents.class));
        //cards.add(new SetCardInfo("Embers of Prophecy", 138, Rarity.UNCOMMON, mage.cards.e.EmbersOfProphecy.class));
        //cards.add(new SetCardInfo("Emerabi and Sunnula", "139a", Rarity.MYTHIC, mage.cards.e.EmerabiAndSunnula.class));
        //cards.add(new SetCardInfo("The Divine Lovers", "139b", Rarity.MYTHIC, mage.cards.t.TheDivineLovers.class));
        //cards.add(new SetCardInfo("Endak Savagery", 140, Rarity.COMMON, mage.cards.e.EndakSavagery.class));
        //cards.add(new SetCardInfo("Epic of the Lovers", 141, Rarity.RARE, mage.cards.e.EpicOfTheLovers.class));
        //cards.add(new SetCardInfo("Fall in Line", 142, Rarity.UNCOMMON, mage.cards.f.FallInLine.class));
        //cards.add(new SetCardInfo("Herald of Ankulim", 143, Rarity.UNCOMMON, mage.cards.h.HeraldOfAnkulim.class));
        //cards.add(new SetCardInfo("Kanaan Wardriver", 144, Rarity.UNCOMMON, mage.cards.k.KanaanWardriver.class));
        //cards.add(new SetCardInfo("Marauding Goliath", 145, Rarity.COMMON, mage.cards.m.MaraudingGoliath.class));
        //cards.add(new SetCardInfo("Marrow Cruncher", 146, Rarity.RARE, mage.cards.m.MarrowCruncher.class));
        //cards.add(new SetCardInfo("Metallurgy", 147, Rarity.UNCOMMON, mage.cards.m.Metallurgy.class));
        //cards.add(new SetCardInfo("Monstrous Hila", 148, Rarity.UNCOMMON, mage.cards.m.MonstrousHila.class));
        //cards.add(new SetCardInfo("Piercing Blow", 149, Rarity.COMMON, mage.cards.p.PiercingBlow.class));
        //cards.add(new SetCardInfo("Primordial Progenitor", 150, Rarity.COMMON, mage.cards.p.PrimordialProgenitor.class));
        //cards.add(new SetCardInfo("Sandburst", 151, Rarity.COMMON, mage.cards.s.Sandburst.class));
        //cards.add(new SetCardInfo("Sarrutu Flamebinder", 152, Rarity.RARE, mage.cards.s.SarrutuFlamebinder.class));
        //cards.add(new SetCardInfo("Scavenging Hilakites", 153, Rarity.RARE, mage.cards.s.ScavengingHilakites.class));
        //cards.add(new SetCardInfo("Shala Na, Urshadi Apostate", 154, Rarity.MYTHIC, mage.cards.s.ShalaNaUrshadiApostate.class));
        cards.add(new SetCardInfo("Shatter", 155, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shock", 156, Rarity.COMMON, mage.cards.s.Shock.class));
        //cards.add(new SetCardInfo("Slaughtered Steps Taskmaster", 157, Rarity.COMMON, mage.cards.s.SlaughteredStepsTaskmaster.class));
        //cards.add(new SetCardInfo("Strongarm", 158, Rarity.UNCOMMON, mage.cards.s.Strongarm.class));
        //cards.add(new SetCardInfo("Sunnula's Firebird", 159, Rarity.RARE, mage.cards.s.SunnulasFirebird.class));
        cards.add(new SetCardInfo("Sure Strike", 160, Rarity.COMMON, mage.cards.s.SureStrike.class));
        //cards.add(new SetCardInfo("Torrent of Ankuliths", 161, Rarity.COMMON, mage.cards.t.TorrentOfAnkuliths.class));
        //cards.add(new SetCardInfo("Unbound Annihilus", 162, Rarity.RARE, mage.cards.u.UnboundAnnihilus.class));
        //cards.add(new SetCardInfo("Urud Stingswoop", 163, Rarity.UNCOMMON, mage.cards.u.UrudStingswoop.class));
        //cards.add(new SetCardInfo("Urudi Warlord", 164, Rarity.COMMON, mage.cards.u.UrudiWarlord.class));
        //cards.add(new SetCardInfo("Agriculture", 165, Rarity.UNCOMMON, mage.cards.a.Agriculture.class));
        //cards.add(new SetCardInfo("Borsuppa Drover", 166, Rarity.UNCOMMON, mage.cards.b.BorsuppaDrover.class));
        //cards.add(new SetCardInfo("Caprin Outlander", 167, Rarity.COMMON, mage.cards.c.CaprinOutlander.class));
        //cards.add(new SetCardInfo("Collapse the Pillars", 168, Rarity.COMMON, mage.cards.c.CollapseThePillars.class));
        //cards.add(new SetCardInfo("Cradle of Civilization", 169, Rarity.COMMON, mage.cards.c.CradleOfCivilization.class));
        //cards.add(new SetCardInfo("Crushclaw Pulverizer", 170, Rarity.UNCOMMON, mage.cards.c.CrushclawPulverizer.class));
        //cards.add(new SetCardInfo("Day of Rest", 171, Rarity.COMMON, mage.cards.d.DayOfRest.class));
        //cards.add(new SetCardInfo("Dune Tromper", 172, Rarity.COMMON, mage.cards.d.DuneTromper.class));
        //cards.add(new SetCardInfo("Eli's Grit", 173, Rarity.UNCOMMON, mage.cards.e.ElisGrit.class));
        //cards.add(new SetCardInfo("Epic of Jobiah", 174, Rarity.RARE, mage.cards.e.EpicOfJobiah.class));
        cards.add(new SetCardInfo("Grapple with the Past", 175, Rarity.COMMON, mage.cards.g.GrappleWithThePast.class));
        cards.add(new SetCardInfo("Harrow", 176, Rarity.UNCOMMON, mage.cards.h.Harrow.class));
        //cards.add(new SetCardInfo("Heartland's Protection", 177, Rarity.UNCOMMON, mage.cards.h.HeartlandsProtection.class));
        //cards.add(new SetCardInfo("Hila Emergence", 178, Rarity.RARE, mage.cards.h.HilaEmergence.class));
        //cards.add(new SetCardInfo("Humble Shepherd", 179, Rarity.UNCOMMON, mage.cards.h.HumbleShepherd.class));
        //cards.add(new SetCardInfo("Husbandry", 180, Rarity.RARE, mage.cards.h.Husbandry.class));
        //cards.add(new SetCardInfo("Jobiah, Devoted Farmer", "181a", Rarity.MYTHIC, mage.cards.j.JobiahDevotedFarmer.class));
        //cards.add(new SetCardInfo("Jobiah the World-Shepherd", "181b", Rarity.MYTHIC, mage.cards.j.JobiahTheWorldShepherd.class));
        //cards.add(new SetCardInfo("Lush Delta", 182, Rarity.UNCOMMON, mage.cards.l.LushDelta.class));
        //cards.add(new SetCardInfo("Mangrove Fisher", 183, Rarity.COMMON, mage.cards.m.MangroveFisher.class));
        //cards.add(new SetCardInfo("Multiculturalism", 184, Rarity.RARE, mage.cards.m.Multiculturalism.class));
        //cards.add(new SetCardInfo("Mythology", 185, Rarity.MYTHIC, mage.cards.m.Mythology.class));
        //cards.add(new SetCardInfo("Naga Cultivator", 186, Rarity.COMMON, mage.cards.n.NagaCultivator.class));
        //cards.add(new SetCardInfo("Oasis Claimer", 187, Rarity.RARE, mage.cards.o.OasisClaimer.class));
        cards.add(new SetCardInfo("Pierce the Sky", 188, Rarity.COMMON, mage.cards.p.PierceTheSky.class));
        //cards.add(new SetCardInfo("Rhudai Fieldtiller", 189, Rarity.RARE, mage.cards.r.RhudaiFieldtiller.class));
        //cards.add(new SetCardInfo("Rhudai Pathfinder", 190, Rarity.COMMON, mage.cards.r.RhudaiPathfinder.class));
        //cards.add(new SetCardInfo("Rhudai Swathcutter", 191, Rarity.UNCOMMON, mage.cards.r.RhudaiSwathcutter.class));
        //cards.add(new SetCardInfo("Sacrificial Bull", 192, Rarity.RARE, mage.cards.s.SacrificialBull.class));
        //cards.add(new SetCardInfo("Savage Takedown", 193, Rarity.COMMON, mage.cards.s.SavageTakedown.class));
        //cards.add(new SetCardInfo("Skittering Solifuge", 194, Rarity.COMMON, mage.cards.s.SkitteringSolifuge.class));
        cards.add(new SetCardInfo("Spawn of the Guardian", 195, Rarity.COMMON, mage.cards.s.SpawnOfTheGuardian.class));
        //cards.add(new SetCardInfo("Stingbrood Scavenger", 196, Rarity.COMMON, mage.cards.s.StingbroodScavenger.class));
        //cards.add(new SetCardInfo("Test of Strength", 197, Rarity.COMMON, mage.cards.t.TestOfStrength.class));
        //cards.add(new SetCardInfo("Tiller's Adze", 198, Rarity.COMMON, mage.cards.t.TillersAdze.class));
        //cards.add(new SetCardInfo("Towering Hydraffe", 199, Rarity.RARE, mage.cards.t.ToweringHydraffe.class));
        //cards.add(new SetCardInfo("Trace the Oasis", 200, Rarity.UNCOMMON, mage.cards.t.TraceTheOasis.class));
        //cards.add(new SetCardInfo("Trenchcutter Beetle", 201, Rarity.COMMON, mage.cards.t.TrenchcutterBeetle.class));
        //cards.add(new SetCardInfo("Trusty Camaar", 202, Rarity.COMMON, mage.cards.t.TrustyCamaar.class));
        //cards.add(new SetCardInfo("Wandering Warden", 203, Rarity.UNCOMMON, mage.cards.w.WanderingWarden.class));
        //cards.add(new SetCardInfo("World Tender", 204, Rarity.UNCOMMON, mage.cards.w.WorldTender.class));
        cards.add(new SetCardInfo("Anku the Primordial", 205, Rarity.MYTHIC, mage.cards.a.AnkuThePrimordial.class));
        //cards.add(new SetCardInfo("Bordermakers", 206, Rarity.RARE, mage.cards.b.Bordermakers.class));
        //cards.add(new SetCardInfo("Bounty of the Gardens", 207, Rarity.UNCOMMON, mage.cards.b.BountyOfTheGardens.class));
        //cards.add(new SetCardInfo("Death Pits Hawker", 208, Rarity.UNCOMMON, mage.cards.d.DeathPitsHawker.class));
        //cards.add(new SetCardInfo("Dehmi, Origin Seeker", 209, Rarity.MYTHIC, mage.cards.d.DehmiOriginSeeker.class));
        //cards.add(new SetCardInfo("Dominate the Desert", 210, Rarity.UNCOMMON, mage.cards.d.DominateTheDesert.class));
        //cards.add(new SetCardInfo("Emerabi's Disciple", 211, Rarity.UNCOMMON, mage.cards.e.EmerabisDisciple.class));
        //cards.add(new SetCardInfo("Emerging Ankulim", 212, Rarity.RARE, mage.cards.e.EmergingAnkulim.class));
        //cards.add(new SetCardInfo("Epic of Anku", 213, Rarity.RARE, mage.cards.e.EpicOfAnku.class));
        cards.add(new SetCardInfo("Imperator Namuzzar", 214, Rarity.RARE, mage.cards.i.ImperatorNamuzzar.class));
        //cards.add(new SetCardInfo("Keeper of Codices", 215, Rarity.UNCOMMON, mage.cards.k.KeeperOfCodices.class));
        //cards.add(new SetCardInfo("Lhosei of the Ghost Peak", 216, Rarity.MYTHIC, mage.cards.l.LhoseiOfTheGhostPeak.class));
        //cards.add(new SetCardInfo("Lisseria, General of Kanaa", 217, Rarity.RARE, mage.cards.l.LisseriaGeneralOfKanaa.class));
        //cards.add(new SetCardInfo("Oppress the Weak", 218, Rarity.UNCOMMON, mage.cards.o.OppressTheWeak.class));
        //cards.add(new SetCardInfo("Palace Enforcer", 219, Rarity.UNCOMMON, mage.cards.p.PalaceEnforcer.class));
        //cards.add(new SetCardInfo("Protect the Farm", 220, Rarity.UNCOMMON, mage.cards.p.ProtectTheFarm.class));
        //cards.add(new SetCardInfo("Sarrutu Worldbinder", 221, Rarity.UNCOMMON, mage.cards.s.SarrutuWorldbinder.class));
        //cards.add(new SetCardInfo("Shemesh, Nomad Chieftain", 222, Rarity.RARE, mage.cards.s.ShemeshNomadChieftain.class));
        //cards.add(new SetCardInfo("Stolen Innovations", 223, Rarity.RARE, mage.cards.s.StolenInnovations.class));
        //cards.add(new SetCardInfo("Sumun, Azutah's Heart", 224, Rarity.RARE, mage.cards.s.SumunAzutahsHeart.class));
        cards.add(new SetCardInfo("Sunblessed Orator", 225, Rarity.UNCOMMON, mage.cards.s.SunblessedOrator.class));
        //cards.add(new SetCardInfo("Ankulith Shard", 226, Rarity.COMMON, mage.cards.a.AnkulithShard.class));
        //cards.add(new SetCardInfo("Breaker of Cities", 227, Rarity.RARE, mage.cards.b.BreakerOfCities.class));
        //cards.add(new SetCardInfo("Dehmi's Servitor", 228, Rarity.COMMON, mage.cards.d.DehmisServitor.class));
        //cards.add(new SetCardInfo("Divine Chariot", 229, Rarity.COMMON, mage.cards.d.DivineChariot.class));
        //cards.add(new SetCardInfo("Donkey Jawbone", 230, Rarity.UNCOMMON, mage.cards.d.DonkeyJawbone.class));
        //cards.add(new SetCardInfo("Edge of the Empires", 231, Rarity.COMMON, mage.cards.e.EdgeOfTheEmpires.class));
        //cards.add(new SetCardInfo("Ekebram's Archive", 232, Rarity.RARE, mage.cards.e.EkebramsArchive.class));
        //cards.add(new SetCardInfo("Funerary Barge", 233, Rarity.UNCOMMON, mage.cards.f.FuneraryBarge.class));
        //cards.add(new SetCardInfo("Gilded Idol", 234, Rarity.COMMON, mage.cards.g.GildedIdol.class));
        cards.add(new SetCardInfo("Manalith", 235, Rarity.COMMON, mage.cards.m.Manalith.class));
        cards.add(new SetCardInfo("Nibinem's Hand", 236, Rarity.COMMON, mage.cards.n.NibinemsHand.class));
        //cards.add(new SetCardInfo("Sannurian Sentinel", 237, Rarity.COMMON, mage.cards.s.SannurianSentinel.class));
        //cards.add(new SetCardInfo("Scavenger's Wagon", 238, Rarity.RARE, mage.cards.s.ScavengersWagon.class));
        //cards.add(new SetCardInfo("Serpent Staff", 239, Rarity.RARE, mage.cards.s.SerpentStaff.class));
        //cards.add(new SetCardInfo("Sling of the Meek", 240, Rarity.UNCOMMON, mage.cards.s.SlingOfTheMeek.class));
        cards.add(new SetCardInfo("Splinter of Creation", 241, Rarity.RARE, mage.cards.s.SplinterOfCreation.class));
        //cards.add(new SetCardInfo("Stonecut Lammasu", 242, Rarity.UNCOMMON, mage.cards.s.StonecutLammasu.class));
        //cards.add(new SetCardInfo("Tempered Ankulim", 243, Rarity.RARE, mage.cards.t.TemperedAnkulim.class));
        //cards.add(new SetCardInfo("Urn of Heroes", 244, Rarity.RARE, mage.cards.u.UrnOfHeroes.class));
        //cards.add(new SetCardInfo("Voyager's Ark", 245, Rarity.MYTHIC, mage.cards.v.VoyagersArk.class));
        //cards.add(new SetCardInfo("Center of Culture", 246, Rarity.RARE, mage.cards.c.CenterOfCulture.class));
        //cards.add(new SetCardInfo("Crescent of Possibilites", 247, Rarity.COMMON, mage.cards.c.CrescentOfPossibilites.class));
        //cards.add(new SetCardInfo("Deserted Trail", 248, Rarity.UNCOMMON, mage.cards.d.DesertedTrail.class));
        cards.add(new SetCardInfo("Evolving Wilds", 249, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        //cards.add(new SetCardInfo("Flourishing Waterways", 250, Rarity.UNCOMMON, mage.cards.f.FlourishingWaterways.class));
        //cards.add(new SetCardInfo("Horizon of Origins", 251, Rarity.UNCOMMON, mage.cards.h.HorizonOfOrigins.class));
        //cards.add(new SetCardInfo("Imperial Barracks", 252, Rarity.UNCOMMON, mage.cards.i.ImperialBarracks.class));
        //cards.add(new SetCardInfo("Legacy Foundations", 253, Rarity.UNCOMMON, mage.cards.l.LegacyFoundations.class));
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
