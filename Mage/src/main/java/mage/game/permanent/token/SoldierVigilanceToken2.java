package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.keyword.VigilanceAbility;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author EikePeace
 */
public final class SoldierVigilanceToken2 extends TokenImpl {

    public SoldierVigilanceToken2() {
        super("Soldier", "1/1 white Soldier creature token with vigilance");

        cardType.add(CardType.CREATURE);
        color.setWhite(true);
        subtype.add(SubType.SOLDIER);
        power = new MageInt(1);
        toughness = new MageInt(1);
        addAbility(VigilanceAbility.getInstance());

        setOriginalExpansionSetCode("WAR");
    }

    private SoldierVigilanceToken2(final SoldierVigilanceToken2 token) {
        super(token);
    }

    @Override
    public SoldierVigilanceToken2 copy() {
        return new SoldierVigilanceToken2(this);
    }
}
