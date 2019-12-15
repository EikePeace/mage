package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Set;

/**
 *
 * @author Fenhl
 */
public final class Tesla extends ExpansionSet {

    private static final Tesla instance = new Tesla();

    public static Tesla getInstance() {
        return instance;
    }

    private Tesla() {
        super("Tesla", "TSL", ExpansionSet.buildDate(2017, 4, 21), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Aether Animist", 182, Rarity.RARE, mage.cards.a.AetherAnimist.class));
        cards.add(new SetCardInfo("Aether Plantation", 237, Rarity.RARE, mage.cards.a.AetherPlantation.class));
        cards.add(new SetCardInfo("Aetherguard Armor", "148b", Rarity.UNCOMMON, mage.cards.a.AetherguardArmor.class));
        cards.add(new SetCardInfo("Aetherguard Rhino", "148a", Rarity.UNCOMMON, mage.cards.a.AetherguardRhino.class));
        cards.add(new SetCardInfo("Bio-Research", 153, Rarity.RARE, mage.cards.b.BioResearch.class));
        cards.add(new SetCardInfo("Canister Courier", 39, Rarity.COMMON, mage.cards.c.CanisterCourier.class));
        cards.add(new SetCardInfo("Cinder Barrens", 238, Rarity.UNCOMMON, mage.cards.c.CinderBarrens.class));
        cards.add(new SetCardInfo("City Sentinel", 208, Rarity.COMMON, mage.cards.c.CitySentinel.class));
        cards.add(new SetCardInfo("Claim of the Wastes", 187, Rarity.RARE, mage.cards.c.ClaimOfTheWastes.class));
        cards.add(new SetCardInfo("Cog Mind Sentry", 210, Rarity.COMMON, mage.cards.c.CogMindSentry.class));
        cards.add(new SetCardInfo("Controversial Experiment", 77, Rarity.COMMON, mage.cards.c.ControversialExperiment.class));
        cards.add(new SetCardInfo("Corrupt Courtroom", 239, Rarity.RARE, mage.cards.c.CorruptCourtroom.class));
        cards.add(new SetCardInfo("Courtroom Custodians", 13, Rarity.COMMON, mage.cards.c.CourtroomCustodians.class));
        cards.add(new SetCardInfo("Delivery Automaton", 214, Rarity.COMMON, mage.cards.d.DeliveryAutomaton.class));
        cards.add(new SetCardInfo("District Slums", 240, Rarity.RARE, mage.cards.d.DistrictSlums.class));
        cards.add(new SetCardInfo("Explosive Apparatus", 216, Rarity.COMMON, mage.cards.e.ExplosiveApparatus.class));
        cards.add(new SetCardInfo("Extract Essence", 80, Rarity.UNCOMMON, mage.cards.e.ExtractEssence.class));
        cards.add(new SetCardInfo("Factory Reactor", 241, Rarity.RARE, mage.cards.f.FactoryReactor.class));
        cards.add(new SetCardInfo("Favorable Winds", 44, Rarity.UNCOMMON, mage.cards.f.FavorableWinds.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
        cards.add(new SetCardInfo("Freedom Fighter", 122, Rarity.COMMON, mage.cards.f.FreedomFighter.class));
        cards.add(new SetCardInfo("Frontier Outpost", 242, Rarity.COMMON, mage.cards.f.FrontierOutpost.class));
        cards.add(new SetCardInfo("Ghirapur Gearcrafter", 123, Rarity.COMMON, mage.cards.g.GhirapurGearcrafter.class));
        cards.add(new SetCardInfo("Good as New", 159, Rarity.UNCOMMON, mage.cards.g.GoodAsNew.class));
        cards.add(new SetCardInfo("Hungry Hippo", 50, Rarity.COMMON, mage.cards.h.HungryHippo.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Make Obsolete", 88, Rarity.UNCOMMON, mage.cards.m.MakeObsolete.class));
        cards.add(new SetCardInfo("Mana Drone", 220, Rarity.UNCOMMON, mage.cards.m.ManaDrone.class));
        cards.add(new SetCardInfo("Meandering River", 243, Rarity.UNCOMMON, mage.cards.m.MeanderingRiver.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Mutated Gaur", 165, Rarity.COMMON, mage.cards.m.MutatedGaur.class));
        cards.add(new SetCardInfo("Negate", 59, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Neural Serum", 60, Rarity.COMMON, mage.cards.n.NeuralSerum.class));
        cards.add(new SetCardInfo("Pioneer Researcher", 171, Rarity.COMMON, mage.cards.p.PioneerResearcher.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Prepare a Hideout", 172, Rarity.COMMON, mage.cards.p.PrepareAHideout.class));
        cards.add(new SetCardInfo("Ruthless Collector", 195, Rarity.UNCOMMON, mage.cards.r.RuthlessCollector.class));
        cards.add(new SetCardInfo("Scouring Sands", 136, Rarity.COMMON, mage.cards.s.ScouringSands.class));
        cards.add(new SetCardInfo("Siv Katari, Rebel Technician", 197, Rarity.RARE, mage.cards.s.SivKatariRebelTechnician.class));
        cards.add(new SetCardInfo("Submerged Boneyard", 245, Rarity.UNCOMMON, mage.cards.s.SubmergedBoneyard.class));
        cards.add(new SetCardInfo("Suljet, the Cog Mind", 199, Rarity.MYTHIC, mage.cards.s.SuljetTheCogMind.class));
        cards.add(new SetCardInfo("Surveillance Mission", 70, Rarity.UNCOMMON, mage.cards.s.SurveillanceMission.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Temple Rats", 101, Rarity.COMMON, mage.cards.t.TempleRats.class));
        cards.add(new SetCardInfo("Timber Gorge", 246, Rarity.UNCOMMON, mage.cards.t.TimberGorge.class));
        cards.add(new SetCardInfo("Tranquil Expanse", 247, Rarity.UNCOMMON, mage.cards.t.TranquilExpanse.class));
        cards.add(new SetCardInfo("Unwilling Recruit", 141, Rarity.UNCOMMON, mage.cards.u.UnwillingRecruit.class));
        cards.add(new SetCardInfo("Utopian District", 248, Rarity.COMMON, mage.cards.u.UtopianDistrict.class));
        cards.add(new SetCardInfo("Weapons Cache", 249, Rarity.RARE, mage.cards.w.WeaponsCache.class));
    }
}
