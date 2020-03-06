package mage.cards.g;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class GoresandWardriver extends CardImpl {
    public GoresandWardriver(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.BERSERKER);

        this.power = new MageInt(4);
        this.toughness = new MageInt(2);
    }

    public GoresandWardriver(final GoresandWardriver card) { super(card); }

    @Override
    public GoresandWardriver copy() { return new GoresandWardriver(this); }
}
