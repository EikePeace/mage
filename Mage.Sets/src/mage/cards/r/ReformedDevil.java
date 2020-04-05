package mage.cards.r;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class ReformedDevil extends CardImpl {
    public ReformedDevil(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{R}");
        this.subtype.add(SubType.DEVIL);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);
    }

    public ReformedDevil(final ReformedDevil card) { super(card); }

    @Override
    public ReformedDevil copy() { return new ReformedDevil(this); }
}
