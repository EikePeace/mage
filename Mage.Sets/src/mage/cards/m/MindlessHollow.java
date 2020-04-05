package mage.cards.m;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class MindlessHollow extends CardImpl {
    public MindlessHollow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.ZOMBIE);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
    }

    public MindlessHollow(final MindlessHollow card) { super(card); }

    @Override
    public MindlessHollow copy() { return new MindlessHollow(this); }
}
