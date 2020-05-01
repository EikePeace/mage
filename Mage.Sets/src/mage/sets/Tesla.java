package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author Fenhl
 */
public final class Tesla extends ExpansionSet {
    private static final Tesla instance = new Tesla();

    public static Tesla getInstance() { return instance; }

    private Tesla() {
        super("Tesla", "TSL", ExpansionSet.buildDate(2017, 4, 21), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //cards.add(new SetCardInfo("Aether Jets", 1, Rarity.COMMON, mage.cards.a.AetherJets.class));
        cards.add(new SetCardInfo("Agent of Individuality", 2, Rarity.RARE, mage.cards.a.AgentOfIndividuality.class));
        //cards.add(new SetCardInfo("Airheaded Lookout", "3a", Rarity.UNCOMMON, mage.cards.a.AirheadedLookout.class));
        //cards.add(new SetCardInfo("Airborne Visionary", "3b", Rarity.UNCOMMON, mage.cards.a.AirborneVisionary.class));
        //cards.add(new SetCardInfo("Apprehend the Ringleader", 4, Rarity.COMMON, mage.cards.a.ApprehendTheRingleader.class));
        //cards.add(new SetCardInfo("Avatar of Authority", 5, Rarity.MYTHIC, mage.cards.a.AvatarOfAuthority.class));
        //cards.add(new SetCardInfo("Border Sentry", 6, Rarity.COMMON, mage.cards.b.BorderSentry.class));
        //cards.add(new SetCardInfo("Caretaker of the City", "7a", Rarity.RARE, mage.cards.c.CaretakerOfTheCity.class));
        //cards.add(new SetCardInfo("Savior of the City", "7b", Rarity.RARE, mage.cards.s.SaviorOfTheCity.class));
        //cards.add(new SetCardInfo("Census Enforcer", 8, Rarity.COMMON, mage.cards.c.CensusEnforcer.class));
        //cards.add(new SetCardInfo("Clockwork Battlecrafter", 9, Rarity.RARE, mage.cards.c.ClockworkBattlecrafter.class));
        //cards.add(new SetCardInfo("Constant Scrutiny", 10, Rarity.RARE, mage.cards.c.ConstantScrutiny.class));
        //cards.add(new SetCardInfo("Consulate Emergency", 11, Rarity.UNCOMMON, mage.cards.c.ConsulateEmergency.class));
        //cards.add(new SetCardInfo("Consulate Faithful", 12, Rarity.COMMON, mage.cards.c.ConsulateFaithful.class));
        cards.add(new SetCardInfo("Courtroom Custodians", 13, Rarity.COMMON, mage.cards.c.CourtroomCustodians.class));
        //cards.add(new SetCardInfo("Crowd Dispersal", 14, Rarity.COMMON, mage.cards.c.CrowdDispersal.class));
        //cards.add(new SetCardInfo("District Patroller", 15, Rarity.COMMON, mage.cards.d.DistrictPatroller.class));
        //cards.add(new SetCardInfo("Enforcer Knight", "16a", Rarity.UNCOMMON, mage.cards.e.EnforcerKnight.class));
        //cards.add(new SetCardInfo("Righteous Defector", "16b", Rarity.UNCOMMON, mage.cards.r.RighteousDefector.class));
        //cards.add(new SetCardInfo("Equality Enforcer", 17, Rarity.UNCOMMON, mage.cards.e.EqualityEnforcer.class));
        //cards.add(new SetCardInfo("Garuda Tactician", 18, Rarity.COMMON, mage.cards.g.GarudaTactician.class));
        //cards.add(new SetCardInfo("Halt Innovation", 19, Rarity.COMMON, mage.cards.h.HaltInnovation.class));
        //cards.add(new SetCardInfo("Heroic Valor", "20a", Rarity.UNCOMMON, mage.cards.h.HeroicValor.class));
        //cards.add(new SetCardInfo("Heroic Memorial", "20b", Rarity.UNCOMMON, mage.cards.h.HeroicMemorial.class));
        //cards.add(new SetCardInfo("House Arrest", 21, Rarity.UNCOMMON, mage.cards.h.HouseArrest.class));
        //cards.add(new SetCardInfo("Hunting Roc", 22, Rarity.COMMON, mage.cards.h.HuntingRoc.class));
        //cards.add(new SetCardInfo("Induction Field", 23, Rarity.COMMON, mage.cards.i.InductionField.class));
        //cards.add(new SetCardInfo("Isolated Citizen", "24a", Rarity.UNCOMMON, mage.cards.i.IsolatedCitizen.class));
        //cards.add(new SetCardInfo("Voice of the Populace", "24b", Rarity.UNCOMMON, mage.cards.v.VoiceOfThePopulace.class));
        //cards.add(new SetCardInfo("Kindly Guard", "25a", Rarity.COMMON, mage.cards.k.KindlyGuard.class));
        //cards.add(new SetCardInfo("Protector of the People", "25b", Rarity.COMMON, mage.cards.p.ProtectorOfThePeople.class));
        //cards.add(new SetCardInfo("Outlands Detachment", 26, Rarity.COMMON, mage.cards.o.OutlandsDetachment.class));
        //cards.add(new SetCardInfo("Perfected Production", 27, Rarity.MYTHIC, mage.cards.p.PerfectedProduction.class));
        //cards.add(new SetCardInfo("Perimeter Controller", 28, Rarity.UNCOMMON, mage.cards.p.PerimeterController.class));
        //cards.add(new SetCardInfo("Punish Transgression", 29, Rarity.UNCOMMON, mage.cards.p.PunishTransgression.class));
        //cards.add(new SetCardInfo("Road to Progress", 30, Rarity.COMMON, mage.cards.r.RoadToProgress.class));
        //cards.add(new SetCardInfo("Skyship Admiral", 31, Rarity.RARE, mage.cards.s.SkyshipAdmiral.class));
        //cards.add(new SetCardInfo("Soldier of Tomorrow", 32, Rarity.UNCOMMON, mage.cards.s.SoldierOfTomorrow.class));
        //cards.add(new SetCardInfo("Sudden Armor", 33, Rarity.COMMON, mage.cards.s.SuddenArmor.class));
        //cards.add(new SetCardInfo("Suljet's Perfection", 34, Rarity.UNCOMMON, mage.cards.s.SuljetsPerfection.class));
        //cards.add(new SetCardInfo("Timid Citizen", "35a", Rarity.COMMON, mage.cards.t.TimidCitizen.class));
        //cards.add(new SetCardInfo("Zealous Militia", "35b", Rarity.COMMON, mage.cards.z.ZealousMilitia.class));
        //cards.add(new SetCardInfo("Transhumanism", 36, Rarity.RARE, mage.cards.t.Transhumanism.class));
        //cards.add(new SetCardInfo("Access Denied", 37, Rarity.COMMON, mage.cards.a.AccessDenied.class));
        //cards.add(new SetCardInfo("Canal Smuggler", 38, Rarity.COMMON, mage.cards.c.CanalSmuggler.class));
        cards.add(new SetCardInfo("Canister Courier", 39, Rarity.COMMON, mage.cards.c.CanisterCourier.class));
        //cards.add(new SetCardInfo("Clockwork Perfection", 40, Rarity.COMMON, mage.cards.c.ClockworkPerfection.class));
        //cards.add(new SetCardInfo("Cloudcrash Skywhale", 41, Rarity.UNCOMMON, mage.cards.c.CloudcrashSkywhale.class));
        //cards.add(new SetCardInfo("Crowd Suppressor", 42, Rarity.RARE, mage.cards.c.CrowdSuppressor.class));
        //cards.add(new SetCardInfo("District Lockdown", 43, Rarity.UNCOMMON, mage.cards.d.DistrictLockdown.class));
        cards.add(new SetCardInfo("Favorable Winds", 44, Rarity.UNCOMMON, mage.cards.f.FavorableWinds.class));
        //cards.add(new SetCardInfo("Fugitive Freelancer", 45, Rarity.COMMON, mage.cards.f.FugitiveFreelancer.class));
        //cards.add(new SetCardInfo("Fugitive Mage", "46a", Rarity.UNCOMMON, mage.cards.f.FugitiveMage.class));
        //cards.add(new SetCardInfo("Fugitive Arcanist", "46b", Rarity.UNCOMMON, mage.cards.f.FugitiveArcanist.class));
        //cards.add(new SetCardInfo("Garuda Vanguard", 47, Rarity.COMMON, mage.cards.g.GarudaVanguard.class));
        //cards.add(new SetCardInfo("Gifted Electrician", "48a", Rarity.UNCOMMON, mage.cards.g.GiftedElectrician.class));
        //cards.add(new SetCardInfo("Static Channeler", "48b", Rarity.UNCOMMON, mage.cards.s.StaticChanneler.class));
        //cards.add(new SetCardInfo("Hastily Enforced Curfew", 49, Rarity.RARE, mage.cards.h.HastilyEnforcedCurfew.class));
        cards.add(new SetCardInfo("Hungry Hippo", 50, Rarity.COMMON, mage.cards.h.HungryHippo.class));
        //cards.add(new SetCardInfo("Ionosphere Hunter", 51, Rarity.COMMON, mage.cards.i.IonosphereHunter.class));
        //cards.add(new SetCardInfo("Jace, Oath Keeper", 52, Rarity.MYTHIC, mage.cards.j.JaceOathKeeper.class));
        //cards.add(new SetCardInfo("Jace's Informant", 53, Rarity.COMMON, mage.cards.j.JacesInformant.class));
        //cards.add(new SetCardInfo("Jump Ahead", 54, Rarity.COMMON, mage.cards.j.JumpAhead.class));
        //cards.add(new SetCardInfo("Lurking Crustacean", 55, Rarity.UNCOMMON, mage.cards.l.LurkingCrustacean.class));
        //cards.add(new SetCardInfo("Magnetic Repulse", 56, Rarity.COMMON, mage.cards.m.MagneticRepulse.class));
        //cards.add(new SetCardInfo("Mechanical Vision", "57a", Rarity.UNCOMMON, mage.cards.m.MechanicalVision.class));
        //cards.add(new SetCardInfo("Observation Machine", "57b", Rarity.UNCOMMON, mage.cards.o.ObservationMachine.class));
        //cards.add(new SetCardInfo("Mindleak Agent", 58, Rarity.COMMON, mage.cards.m.MindleakAgent.class));
        cards.add(new SetCardInfo("Negate", 59, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Neural Serum", 60, Rarity.COMMON, mage.cards.n.NeuralSerum.class));
        //cards.add(new SetCardInfo("Overseer Agent", 61, Rarity.COMMON, mage.cards.o.OverseerAgent.class));
        //cards.add(new SetCardInfo("Plagiarized Results", 62, Rarity.RARE, mage.cards.p.PlagiarizedResults.class));
        //cards.add(new SetCardInfo("Product Recall", 63, Rarity.COMMON, mage.cards.p.ProductRecall.class));
        //cards.add(new SetCardInfo("Production Enhancer", 64, Rarity.RARE, mage.cards.p.ProductionEnhancer.class));
        //cards.add(new SetCardInfo("Reconnaisance Man", 65, Rarity.UNCOMMON, mage.cards.r.ReconnaisanceMan.class));
        //cards.add(new SetCardInfo("Repurpose", 66, Rarity.UNCOMMON, mage.cards.r.Repurpose.class));
        //cards.add(new SetCardInfo("Skyship Prodigies", 67, Rarity.RARE, mage.cards.s.SkyshipProdigies.class));
        //cards.add(new SetCardInfo("Skywhale Cloudlord", 68, Rarity.MYTHIC, mage.cards.s.SkywhaleCloudlord.class));
        //cards.add(new SetCardInfo("Suppressing Agent", 69, Rarity.UNCOMMON, mage.cards.s.SuppressingAgent.class));
        cards.add(new SetCardInfo("Surveillance Mission", 70, Rarity.UNCOMMON, mage.cards.s.SurveillanceMission.class));
        //cards.add(new SetCardInfo("Under the Radar", 71, Rarity.COMMON, mage.cards.u.UnderTheRadar.class));
        //cards.add(new SetCardInfo("Will of the People", 72, Rarity.RARE, mage.cards.w.WillOfThePeople.class));
        //cards.add(new SetCardInfo("Avaricious Asura", 73, Rarity.UNCOMMON, mage.cards.a.AvariciousAsura.class));
        //cards.add(new SetCardInfo("Canister Addict", 74, Rarity.COMMON, mage.cards.c.CanisterAddict.class));
        //cards.add(new SetCardInfo("Consulate Agent", 75, Rarity.UNCOMMON, mage.cards.c.ConsulateAgent.class));
        //cards.add(new SetCardInfo("Consulate Conditioning", 76, Rarity.RARE, mage.cards.c.ConsulateConditioning.class));
        cards.add(new SetCardInfo("Controversial Experiment", 77, Rarity.COMMON, mage.cards.c.ControversialExperiment.class));
        //cards.add(new SetCardInfo("Courtroom Executor", 78, Rarity.RARE, mage.cards.c.CourtroomExecutor.class));
        //cards.add(new SetCardInfo("Crowd Breaker", 79, Rarity.COMMON, mage.cards.c.CrowdBreaker.class));
        cards.add(new SetCardInfo("Extract Essence", 80, Rarity.UNCOMMON, mage.cards.e.ExtractEssence.class));
        //cards.add(new SetCardInfo("Fifth Column", 81, Rarity.UNCOMMON, mage.cards.f.FifthColumn.class));
        //cards.add(new SetCardInfo("Frighten", 82, Rarity.COMMON, mage.cards.f.Frighten.class));
        //cards.add(new SetCardInfo("Gilded Taskmaster", 83, Rarity.RARE, mage.cards.g.GildedTaskmaster.class));
        //cards.add(new SetCardInfo("Gravedebt Demon", 84, Rarity.MYTHIC, mage.cards.g.GravedebtDemon.class));
        //cards.add(new SetCardInfo("Hungry Shade", 85, Rarity.UNCOMMON, mage.cards.h.HungryShade.class));
        //cards.add(new SetCardInfo("Information Extraction", "86a", Rarity.UNCOMMON, mage.cards.i.InformationExtraction.class));
        //cards.add(new SetCardInfo("Reconditioning Regime", "86b", Rarity.UNCOMMON, mage.cards.r.ReconditioningRegime.class));
        //cards.add(new SetCardInfo("Living Autopsy", 87, Rarity.COMMON, mage.cards.l.LivingAutopsy.class));
        cards.add(new SetCardInfo("Make Obsolete", 88, Rarity.UNCOMMON, mage.cards.m.MakeObsolete.class));
        //cards.add(new SetCardInfo("Materialism", 89, Rarity.MYTHIC, mage.cards.m.Materialism.class));
        //cards.add(new SetCardInfo("Mortician's Work", 90, Rarity.COMMON, mage.cards.m.MorticiansWork.class));
        //cards.add(new SetCardInfo("Naga Drowner", 91, Rarity.COMMON, mage.cards.n.NagaDrowner.class));
        //cards.add(new SetCardInfo("Nothing Lost", 92, Rarity.RARE, mage.cards.n.NothingLost.class));
        //cards.add(new SetCardInfo("Outlands Abomination", 93, Rarity.COMMON, mage.cards.o.OutlandsAbomination.class));
        //cards.add(new SetCardInfo("Overworked Prole", 94, Rarity.COMMON, mage.cards.o.OverworkedProle.class));
        //cards.add(new SetCardInfo("Plea Bargain", 95, Rarity.UNCOMMON, mage.cards.p.PleaBargain.class));
        //cards.add(new SetCardInfo("Political Campaigner", 96, Rarity.UNCOMMON, mage.cards.p.PoliticalCampaigner.class));
        //cards.add(new SetCardInfo("Shady Consultant", "97a", Rarity.UNCOMMON, mage.cards.s.ShadyConsultant.class));
        //cards.add(new SetCardInfo("Courtroom Magister", "97b", Rarity.UNCOMMON, mage.cards.c.CourtroomMagister.class));
        //cards.add(new SetCardInfo("Sky Pirate", 98, Rarity.COMMON, mage.cards.s.SkyPirate.class));
        //cards.add(new SetCardInfo("Stamp Out", 99, Rarity.COMMON, mage.cards.s.StampOut.class));
        //cards.add(new SetCardInfo("Subduing Strike", 100, Rarity.COMMON, mage.cards.s.SubduingStrike.class));
        cards.add(new SetCardInfo("Temple Rats", 101, Rarity.COMMON, mage.cards.t.TempleRats.class));
        //cards.add(new SetCardInfo("Tigrala Ravagers", 102, Rarity.COMMON, mage.cards.t.TigralaRavagers.class));
        //cards.add(new SetCardInfo("Tiran, Judge of the Fifth Court", 103, Rarity.RARE, mage.cards.t.TiranJudgeOfTheFifthCourt.class));
        //cards.add(new SetCardInfo("Tyrannic Brutality", 104, Rarity.RARE, mage.cards.t.TyrannicBrutality.class));
        //cards.add(new SetCardInfo("Unnatural Wretch", 105, Rarity.COMMON, mage.cards.u.UnnaturalWretch.class));
        //cards.add(new SetCardInfo("Unstoppable Experiment", 106, Rarity.UNCOMMON, mage.cards.u.UnstoppableExperiment.class));
        //cards.add(new SetCardInfo("Vile Transmogrification", 107, Rarity.COMMON, mage.cards.v.VileTransmogrification.class));
        //cards.add(new SetCardInfo("Zila Officer", 108, Rarity.COMMON, mage.cards.z.ZilaOfficer.class));
        //cards.add(new SetCardInfo("Aerial Mayhem", 109, Rarity.UNCOMMON, mage.cards.a.AerialMayhem.class));
        //cards.add(new SetCardInfo("Alchemic Blaze", "110a", Rarity.UNCOMMON, mage.cards.a.AlchemicBlaze.class));
        //cards.add(new SetCardInfo("Naphfire Launcher", "110b", Rarity.UNCOMMON, mage.cards.n.NaphfireLauncher.class));
        //cards.add(new SetCardInfo("Chainbound Ogre", "111a", Rarity.COMMON, mage.cards.c.ChainboundOgre.class));
        //cards.add(new SetCardInfo("Chainwhip Ogre", "111b", Rarity.COMMON, mage.cards.c.ChainwhipOgre.class));
        //cards.add(new SetCardInfo("Chandra, Heart of the Revolt", 112, Rarity.MYTHIC, mage.cards.c.ChandraHeartOfTheRevolt.class));
        //cards.add(new SetCardInfo("Chandras Catharsis", 113, Rarity.UNCOMMON, mage.cards.c.ChandrasCatharsis.class));
        //cards.add(new SetCardInfo("Chandra's Greater Fury", 114, Rarity.UNCOMMON, mage.cards.c.ChandrasGreaterFury.class));
        //cards.add(new SetCardInfo("Civil Unrest", 115, Rarity.COMMON, mage.cards.c.CivilUnrest.class));
        //cards.add(new SetCardInfo("Combustion Engineer", 116, Rarity.UNCOMMON, mage.cards.c.CombustionEngineer.class));
        //cards.add(new SetCardInfo("Crazy Conspiracy", "117a", Rarity.RARE, mage.cards.c.CrazyConspiracy.class));
        //cards.add(new SetCardInfo("Groundbreaking Discovery", "117b", Rarity.RARE, mage.cards.g.GroundbreakingDiscovery.class));
        //cards.add(new SetCardInfo("Curious Outlaw", "118a", Rarity.COMMON, mage.cards.c.CuriousOutlaw.class));
        //cards.add(new SetCardInfo("War Correspondent", "118b", Rarity.COMMON, mage.cards.w.WarCorrespondent.class));
        //cards.add(new SetCardInfo("Disloyalty", 119, Rarity.COMMON, mage.cards.d.Disloyalty.class));
        //cards.add(new SetCardInfo("Echowisp", 120, Rarity.RARE, mage.cards.e.Echowisp.class));
        //cards.add(new SetCardInfo("Flamewatcher Giant", "121a", Rarity.UNCOMMON, mage.cards.f.FlamewatcherGiant.class));
        //cards.add(new SetCardInfo("Flamebreaker Giant", "121b", Rarity.UNCOMMON, mage.cards.f.FlamebreakerGiant.class));
        cards.add(new SetCardInfo("Freedom Fighter", 122, Rarity.COMMON, mage.cards.f.FreedomFighter.class));
        cards.add(new SetCardInfo("Ghirapur Gearcrafter", 123, Rarity.COMMON, mage.cards.g.GhirapurGearcrafter.class));
        //cards.add(new SetCardInfo("Ghirapur Technician", 124, Rarity.COMMON, mage.cards.g.GhirapurTechnician.class));
        //cards.add(new SetCardInfo("Jintara Cannoneer", 125, Rarity.COMMON, mage.cards.j.JintaraCannoneer.class));
        //cards.add(new SetCardInfo("Meddling Instigator", "126a", Rarity.UNCOMMON, mage.cards.m.MeddlingInstigator.class));
        //cards.add(new SetCardInfo("Riot-Rouser", "126b", Rarity.UNCOMMON, mage.cards.r.RiotRouser.class));
        //cards.add(new SetCardInfo("Munitions Thief", 127, Rarity.COMMON, mage.cards.m.MunitionsThief.class));
        //cards.add(new SetCardInfo("Opportunist Berserker", 128, Rarity.COMMON, mage.cards.o.OpportunistBerserker.class));
        //cards.add(new SetCardInfo("Outlands Hellkite", 129, Rarity.MYTHIC, mage.cards.o.OutlandsHellkite.class));
        //cards.add(new SetCardInfo("Pleasure to Burn", 130, Rarity.COMMON, mage.cards.p.PleasureToBurn.class));
        //cards.add(new SetCardInfo("Propaganda Artist", 131, Rarity.UNCOMMON, mage.cards.p.PropagandaArtist.class));
        //cards.add(new SetCardInfo("Rage Against the System", 132, Rarity.COMMON, mage.cards.r.RageAgainstTheSystem.class));
        //cards.add(new SetCardInfo("Rebel Inventor", 133, Rarity.UNCOMMON, mage.cards.r.RebelInventor.class));
        //cards.add(new SetCardInfo("Revolutionary Herald", "134a", Rarity.RARE, mage.cards.r.RevolutionaryHerald.class));
        //cards.add(new SetCardInfo("Revolutionary Veteran", "134b", Rarity.RARE, mage.cards.r.RevolutionaryVeteran.class));
        //cards.add(new SetCardInfo("Rooftop Thief", 135, Rarity.RARE, mage.cards.r.RooftopThief.class));
        cards.add(new SetCardInfo("Scouring Sands", 136, Rarity.COMMON, mage.cards.s.ScouringSands.class));
        //cards.add(new SetCardInfo("Sieze Supplies", 137, Rarity.COMMON, mage.cards.s.SiezeSupplies.class));
        //cards.add(new SetCardInfo("Siv's Legacy", 138, Rarity.RARE, mage.cards.s.SivsLegacy.class));
        //cards.add(new SetCardInfo("Siv's Messenger", 139, Rarity.UNCOMMON, mage.cards.s.SivsMessenger.class));
        //cards.add(new SetCardInfo("Tigrala Pugilist", 140, Rarity.COMMON, mage.cards.t.TigralaPugilist.class));
        cards.add(new SetCardInfo("Unwilling Recruit", 141, Rarity.UNCOMMON, mage.cards.u.UnwillingRecruit.class));
        //cards.add(new SetCardInfo("Vanara Thrillseeker", 142, Rarity.COMMON, mage.cards.v.VanaraThrillseeker.class));
        //cards.add(new SetCardInfo("Vicious Seengshir", 143, Rarity.COMMON, mage.cards.v.ViciousSeengshir.class));
        //cards.add(new SetCardInfo("Will-Liberator", 144, Rarity.RARE, mage.cards.w.WillLiberator.class));
        //cards.add(new SetCardInfo("Aether Infusion", 145, Rarity.COMMON, mage.cards.a.AetherInfusion.class));
        //cards.add(new SetCardInfo("Aether-Touched Hydra", 146, Rarity.UNCOMMON, mage.cards.a.AetherTouchedHydra.class));
        //cards.add(new SetCardInfo("Aether-Warped Predator", 147, Rarity.COMMON, mage.cards.a.AetherWarpedPredator.class));
        cards.add(new SetCardInfo("Aetherguard Rhino", "148a", Rarity.UNCOMMON, mage.cards.a.AetherguardRhino.class));
        cards.add(new SetCardInfo("Aetherguard Armor", "148b", Rarity.UNCOMMON, mage.cards.a.AetherguardArmor.class));
        //cards.add(new SetCardInfo("Armor Deliverer", 149, Rarity.COMMON, mage.cards.a.ArmorDeliverer.class));
        //cards.add(new SetCardInfo("Augmented Critter", 150, Rarity.RARE, mage.cards.a.AugmentedCritter.class));
        //cards.add(new SetCardInfo("Avatar of the Old Ways", 151, Rarity.MYTHIC, mage.cards.a.AvatarOfTheOldWays.class));
        //cards.add(new SetCardInfo("Better and Stronger", 152, Rarity.COMMON, mage.cards.b.BetterAndStronger.class));
        cards.add(new SetCardInfo("Bio-Research", 153, Rarity.RARE, mage.cards.b.BioResearch.class));
        //cards.add(new SetCardInfo("Consulate Colonists", 154, Rarity.COMMON, mage.cards.c.ConsulateColonists.class));
        //cards.add(new SetCardInfo("Daitya Survivor", 155, Rarity.UNCOMMON, mage.cards.d.DaityaSurvivor.class));
        //cards.add(new SetCardInfo("Endangered Animal", "156a", Rarity.UNCOMMON, mage.cards.e.EndangeredAnimal.class));
        //cards.add(new SetCardInfo("Adapted Animal", "156b", Rarity.UNCOMMON, mage.cards.a.AdaptedAnimal.class));
        //cards.add(new SetCardInfo("Exploit the Outlands", 157, Rarity.UNCOMMON, mage.cards.e.ExploitTheOutlands.class));
        //cards.add(new SetCardInfo("Frenzied Traditionalists", 158, Rarity.UNCOMMON, mage.cards.f.FrenziedTraditionalists.class));
        cards.add(new SetCardInfo("Good as New", 159, Rarity.UNCOMMON, mage.cards.g.GoodAsNew.class));
        //cards.add(new SetCardInfo("Grip of Regression", 160, Rarity.COMMON, mage.cards.g.GripOfRegression.class));
        //cards.add(new SetCardInfo("Guerilla Warfare", 161, Rarity.COMMON, mage.cards.g.GuerillaWarfare.class));
        //cards.add(new SetCardInfo("Jungle Elephant", 162, Rarity.COMMON, mage.cards.j.JungleElephant.class));
        //cards.add(new SetCardInfo("Leyline Disturbance", 163, Rarity.COMMON, mage.cards.l.LeylineDisturbance.class));
        //cards.add(new SetCardInfo("Munitions Maker", 164, Rarity.UNCOMMON, mage.cards.m.MunitionsMaker.class));
        cards.add(new SetCardInfo("Mutated Gaur", 165, Rarity.COMMON, mage.cards.m.MutatedGaur.class));
        //cards.add(new SetCardInfo("Mutated Man", 166, Rarity.COMMON, mage.cards.m.MutatedMan.class));
        //cards.add(new SetCardInfo("Nissa, Planar Pilgrim", 167, Rarity.MYTHIC, mage.cards.n.NissaPlanarPilgrim.class));
        //cards.add(new SetCardInfo("Nurturer of the Old Ways", 168, Rarity.RARE, mage.cards.n.NurturerOfTheOldWays.class));
        //cards.add(new SetCardInfo("Outland Avenger", 169, Rarity.RARE, mage.cards.o.OutlandAvenger.class));
        //cards.add(new SetCardInfo("Outlands Bandit", 170, Rarity.COMMON, mage.cards.o.OutlandsBandit.class));
        cards.add(new SetCardInfo("Pioneer Researcher", 171, Rarity.COMMON, mage.cards.p.PioneerResearcher.class));
        cards.add(new SetCardInfo("Prepare a Hideout", 172, Rarity.COMMON, mage.cards.p.PrepareAHideout.class));
        //cards.add(new SetCardInfo("Primal Resistance", 173, Rarity.UNCOMMON, mage.cards.p.PrimalResistance.class));
        //cards.add(new SetCardInfo("Rhox Savage", 174, Rarity.COMMON, mage.cards.r.RhoxSavage.class));
        //cards.add(new SetCardInfo("Rise Up", 175, Rarity.COMMON, mage.cards.r.RiseUp.class));
        //cards.add(new SetCardInfo("Tigrala Wildfist", 176, Rarity.UNCOMMON, mage.cards.t.TigralaWildfist.class));
        //cards.add(new SetCardInfo("Untamed Hydra", 177, Rarity.RARE, mage.cards.u.UntamedHydra.class));
        //cards.add(new SetCardInfo("Vanara Terror", 178, Rarity.COMMON, mage.cards.v.VanaraTerror.class));
        //cards.add(new SetCardInfo("Wealthy Man", "179a", Rarity.UNCOMMON, mage.cards.w.WealthyMan.class));
        //cards.add(new SetCardInfo("Worldly Man", "179b", Rarity.UNCOMMON, mage.cards.w.WorldlyMan.class));
        //cards.add(new SetCardInfo("Wisdom of the Mighty", 180, Rarity.RARE, mage.cards.w.WisdomOfTheMighty.class));
        //cards.add(new SetCardInfo("Aerial Commander", 181, Rarity.UNCOMMON, mage.cards.a.AerialCommander.class));
        cards.add(new SetCardInfo("Aether Animist", 182, Rarity.RARE, mage.cards.a.AetherAnimist.class));
        //cards.add(new SetCardInfo("Aether Stomper", 183, Rarity.UNCOMMON, mage.cards.a.AetherStomper.class));
        //cards.add(new SetCardInfo("Aggressive Recruiter", 184, Rarity.UNCOMMON, mage.cards.a.AggressiveRecruiter.class));
        //cards.add(new SetCardInfo("Baral, Blade of Retribution", 185, Rarity.MYTHIC, mage.cards.b.BaralBladeOfRetribution.class));
        //cards.add(new SetCardInfo("Captain of Industry", 186, Rarity.UNCOMMON, mage.cards.c.CaptainOfIndustry.class));
        cards.add(new SetCardInfo("Claim of the Wastes", 187, Rarity.RARE, mage.cards.c.ClaimOfTheWastes.class));
        //cards.add(new SetCardInfo("Communal Blessing", 188, Rarity.RARE, mage.cards.c.CommunalBlessing.class));
        //cards.add(new SetCardInfo("Consulate Baron", 189, Rarity.RARE, mage.cards.c.ConsulateBaron.class));
        //cards.add(new SetCardInfo("Corrupt Lieutenant", 190, Rarity.UNCOMMON, mage.cards.c.CorruptLieutenant.class));
        //cards.add(new SetCardInfo("Galvanic Investiture", 191, Rarity.UNCOMMON, mage.cards.g.GalvanicInvestiture.class));
        //cards.add(new SetCardInfo("Garuda Windmaster", 192, Rarity.RARE, mage.cards.g.GarudaWindmaster.class));
        //cards.add(new SetCardInfo("Naga Spymaster", 193, Rarity.UNCOMMON, mage.cards.n.NagaSpymaster.class));
        //cards.add(new SetCardInfo("Outland Apex", 194, Rarity.RARE, mage.cards.o.OutlandApex.class));
        cards.add(new SetCardInfo("Ruthless Collector", 195, Rarity.UNCOMMON, mage.cards.r.RuthlessCollector.class));
        //cards.add(new SetCardInfo("Ruzzio and Aziria", 196, Rarity.RARE, mage.cards.r.RuzzioAndAziria.class));
        cards.add(new SetCardInfo("Siv Katari, Rebel Technician", 197, Rarity.RARE, mage.cards.s.SivKatariRebelTechnician.class));
        //cards.add(new SetCardInfo("Siv's Lieutenant", 198, Rarity.UNCOMMON, mage.cards.s.SivsLieutenant.class));
        cards.add(new SetCardInfo("Suljet, the Cog Mind", 199, Rarity.MYTHIC, mage.cards.s.SuljetTheCogMind.class));
        //cards.add(new SetCardInfo("Undercity Negotiator", 200, Rarity.RARE, mage.cards.u.UndercityNegotiator.class));
        //cards.add(new SetCardInfo("Valiant Effort", 201, Rarity.RARE, mage.cards.v.ValiantEffort.class));
        //cards.add(new SetCardInfo("Wilds Raider", 202, Rarity.UNCOMMON, mage.cards.w.WildsRaider.class));
        //cards.add(new SetCardInfo("Alloy Array", 203, Rarity.RARE, mage.cards.a.AlloyArray.class));
        //cards.add(new SetCardInfo("Anti-Air Turret", 204, Rarity.COMMON, mage.cards.a.AntiAirTurret.class));
        //cards.add(new SetCardInfo("Assault Automaton", 205, Rarity.UNCOMMON, mage.cards.a.AssaultAutomaton.class));
        //cards.add(new SetCardInfo("Battery Golem", 206, Rarity.COMMON, mage.cards.b.BatteryGolem.class));
        //cards.add(new SetCardInfo("Blade of Choices", 207, Rarity.RARE, mage.cards.b.BladeOfChoices.class));
        cards.add(new SetCardInfo("City Sentinel", 208, Rarity.COMMON, mage.cards.c.CitySentinel.class));
        //cards.add(new SetCardInfo("Co-Creation Marvel", 209, Rarity.RARE, mage.cards.c.CoCreationMarvel.class));
        cards.add(new SetCardInfo("Cog Mind Sentry", 210, Rarity.COMMON, mage.cards.c.CogMindSentry.class));
        //cards.add(new SetCardInfo("Comptometer", 211, Rarity.UNCOMMON, mage.cards.c.Comptometer.class));
        //cards.add(new SetCardInfo("Courtroom Guardian", 212, Rarity.UNCOMMON, mage.cards.c.CourtroomGuardian.class));
        //cards.add(new SetCardInfo("Crown of Ideals", 213, Rarity.MYTHIC, mage.cards.c.CrownOfIdeals.class));
        cards.add(new SetCardInfo("Delivery Automaton", 214, Rarity.COMMON, mage.cards.d.DeliveryAutomaton.class));
        //cards.add(new SetCardInfo("Energized Bolas", 215, Rarity.COMMON, mage.cards.e.EnergizedBolas.class));
        cards.add(new SetCardInfo("Explosive Apparatus", 216, Rarity.COMMON, mage.cards.e.ExplosiveApparatus.class));
        //cards.add(new SetCardInfo("Gearcrafted Gardener", 217, Rarity.COMMON, mage.cards.g.GearcraftedGardener.class));
        //cards.add(new SetCardInfo("Jetpack", 218, Rarity.COMMON, mage.cards.j.Jetpack.class));
        //cards.add(new SetCardInfo("Malfunctioning Ravager", 219, Rarity.UNCOMMON, mage.cards.m.MalfunctioningRavager.class));
        cards.add(new SetCardInfo("Mana Drone", 220, Rarity.UNCOMMON, mage.cards.m.ManaDrone.class));
        //cards.add(new SetCardInfo("Matrix Resonator", 221, Rarity.UNCOMMON, mage.cards.m.MatrixResonator.class));
        //cards.add(new SetCardInfo("Mechanical Mutt", 222, Rarity.COMMON, mage.cards.m.MechanicalMutt.class));
        //cards.add(new SetCardInfo("Necrotic Resonator", 223, Rarity.RARE, mage.cards.n.NecroticResonator.class));
        //cards.add(new SetCardInfo("Paradise Gearwing", 224, Rarity.COMMON, mage.cards.p.ParadiseGearwing.class));
        //cards.add(new SetCardInfo("Patrol Vehicle", 225, Rarity.COMMON, mage.cards.p.PatrolVehicle.class));
        //cards.add(new SetCardInfo("Possibility Titan", 226, Rarity.MYTHIC, mage.cards.p.PossibilityTitan.class));
        //cards.add(new SetCardInfo("Power Suit", 227, Rarity.UNCOMMON, mage.cards.p.PowerSuit.class));
        //cards.add(new SetCardInfo("Pressgang Airship", 228, Rarity.UNCOMMON, mage.cards.p.PressgangAirship.class));
        //cards.add(new SetCardInfo("Prosperity Engine", 229, Rarity.MYTHIC, mage.cards.p.ProsperityEngine.class));
        //cards.add(new SetCardInfo("Reinforcing Armor", 230, Rarity.UNCOMMON, mage.cards.r.ReinforcingArmor.class));
        //cards.add(new SetCardInfo("Research Notes", 231, Rarity.COMMON, mage.cards.r.ResearchNotes.class));
        //cards.add(new SetCardInfo("Selefar War-Walker", 232, Rarity.RARE, mage.cards.s.SelefarWarWalker.class));
        //cards.add(new SetCardInfo("Self-Perfecting Construct", 233, Rarity.RARE, mage.cards.s.SelfPerfectingConstruct.class));
        //cards.add(new SetCardInfo("Siege Tank", 234, Rarity.RARE, mage.cards.s.SiegeTank.class));
        //cards.add(new SetCardInfo("Suppression Suit", 235, Rarity.COMMON, mage.cards.s.SuppressionSuit.class));
        //cards.add(new SetCardInfo("Surveillance Airship", 236, Rarity.UNCOMMON, mage.cards.s.SurveillanceAirship.class));
        cards.add(new SetCardInfo("Aether Plantation", 237, Rarity.RARE, mage.cards.a.AetherPlantation.class));
        cards.add(new SetCardInfo("Cinder Barrens", 238, Rarity.UNCOMMON, mage.cards.c.CinderBarrens.class));
        cards.add(new SetCardInfo("Corrupt Courtroom", 239, Rarity.RARE, mage.cards.c.CorruptCourtroom.class));
        cards.add(new SetCardInfo("District Slums", 240, Rarity.RARE, mage.cards.d.DistrictSlums.class));
        cards.add(new SetCardInfo("Factory Reactor", 241, Rarity.RARE, mage.cards.f.FactoryReactor.class));
        cards.add(new SetCardInfo("Frontier Outpost", 242, Rarity.COMMON, mage.cards.f.FrontierOutpost.class));
        cards.add(new SetCardInfo("Meandering River", 243, Rarity.UNCOMMON, mage.cards.m.MeanderingRiver.class));
        //cards.add(new SetCardInfo("Restless District", 244, Rarity.RARE, mage.cards.r.RestlessDistrict.class));
        cards.add(new SetCardInfo("Submerged Boneyard", 245, Rarity.UNCOMMON, mage.cards.s.SubmergedBoneyard.class));
        cards.add(new SetCardInfo("Timber Gorge", 246, Rarity.UNCOMMON, mage.cards.t.TimberGorge.class));
        cards.add(new SetCardInfo("Tranquil Expanse", 247, Rarity.UNCOMMON, mage.cards.t.TranquilExpanse.class));
        cards.add(new SetCardInfo("Utopian District", 248, Rarity.COMMON, mage.cards.u.UtopianDistrict.class));
        cards.add(new SetCardInfo("Weapons Cache", 249, Rarity.RARE, mage.cards.w.WeaponsCache.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
