package mage.cards.s;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class SplinterOfAnku extends CardImpl {
    public SplinterOfAnku(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.ELEMENTAL);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public SplinterOfAnku(final SplinterOfAnku card) { super(card); }

    @Override
    public SplinterOfAnku copy() { return new SplinterOfAnku(this); }
}
