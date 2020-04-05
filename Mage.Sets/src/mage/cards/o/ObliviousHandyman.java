package mage.cards.o;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class ObliviousHandyman extends CardImpl {
    public ObliviousHandyman(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.CITIZEN);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public ObliviousHandyman(final ObliviousHandyman card) { super(card); }

    @Override
    public ObliviousHandyman copy() { return new ObliviousHandyman(this); }
}
