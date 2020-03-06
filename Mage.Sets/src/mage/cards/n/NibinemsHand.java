package mage.cards.n;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class NibinemsHand extends CardImpl {
    public NibinemsHand(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{3}");
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public NibinemsHand(final NibinemsHand card) { super(card); }

    @Override
    public NibinemsHand copy() { return new NibinemsHand(this); }
}
