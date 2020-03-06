package mage.cards.i;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class ImprisonedHollow extends CardImpl {
    public ImprisonedHollow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.SOLDIER);

        this.power = new MageInt(0);
        this.toughness = new MageInt(4);
    }

    public ImprisonedHollow(final ImprisonedHollow card) { super(card); }

    @Override
    public ImprisonedHollow copy() { return new ImprisonedHollow(this); }
}
