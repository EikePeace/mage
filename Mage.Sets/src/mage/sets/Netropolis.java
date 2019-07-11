package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author eikepeace
 */
public final class Netropolis extends ExpansionSet {

    private static final Netropolis instance = new Netropolis();

    public static Netropolis getInstance() {
        return instance;
    }

    private Netropolis(){
        super("Netropolis", "NET", ExpansionSet.buildDate(2019, 6, 18), SetType.CUSTOM_SET);
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //Black
        cards.add(new SetCardInfo("Abuse of Power","83", Rarity.COMMON, mage.cards.a.AbuseOfPower.class));

    }
}
