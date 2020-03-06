package mage.cards.f;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class FlamingSarimanok extends CardImpl {
    public FlamingSarimanok(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.ELEMENTAL);
        this.subtype.add(BIRD);

        this.power = new MageInt(2);
        this.power = new MageInt(2);
    }

    public FlamingSarimanok(final FlamingSarimanok card) { super(card); }

    @Override
    public FlamingSarimanok copy() { return new FlamingSarimanok(this); }
}
