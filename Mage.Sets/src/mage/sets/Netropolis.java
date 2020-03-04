package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Netropolis extends ExpansionSet {

    private static final Netropolis instance = new Netropolis();

    public static Netropolis getInstance() {
        return instance;
    }

    private Netropolis() {
        super("Netropolis", "NET", ExpansionSet.buildDate(2018, 1, 12), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Steel Sabotage", 75, Rarity.UNCOMMON, mage.cards.s.SteelSabotage.class));

        cards.add(new SetCardInfo("Shrieking Affliction", 113, Rarity.UNCOMMON, mage.cards.s.ShriekingAffliction.class));

        cards.add(new SetCardInfo("Demolish", 129, Rarity.COMMON, mage.cards.d.Demolish.class));

        cards.add(new SetCardInfo("Turn to Slag", 158, Rarity.COMMON, mage.cards.t.TurnToSlag.class));

        cards.add(new SetCardInfo("Creeping Corrosion", 165, Rarity.RARE, mage.cards.c.CreepingCorrosion.class));

        cards.add(new SetCardInfo("Natural End", 177, Rarity.COMMON, mage.cards.n.NaturalEnd.class));
        cards.add(new SetCardInfo("Plummet", 178, Rarity.COMMON, mage.cards.p.Plummet.class));

        cards.add(new SetCardInfo("The Network", 232, Rarity.MYTHIC, mage.cards.t.TheNetwork.class));

        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Island", 253, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Swamp", 254, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Mountain", 255, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Forest", 256, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ));
    }
}
