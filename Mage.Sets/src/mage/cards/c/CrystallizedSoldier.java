package mage.cards.c;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class CrystallizedSoldier extends CardImpl {
    public CrystallizedSoldier(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.SOLDIER);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public CrystallizedSoldier(final CrystallizedSoldier card) { super(card); }

    @Override
    public CrystallizedSoldier copy() { return new CrystallizedSoldier(this); }
}
