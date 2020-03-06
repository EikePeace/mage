package mage.cards.b;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class BattlescarredPredator extends CardImpl {
    public BattlescarredPredator(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}");
        this.subtype.add(SubType.CAT);

        this.power = new MageInt(4);
        this.toughness = new MageInt(2);
    }

    public BattlescarredPredator(final BattlescarredPredator card) { super(card); }

    @Override
    public BattlescarredPredator copy() { return new BattlescarredPredator(this); }
}
