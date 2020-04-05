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
public final class BlightedBarbarian extends CardImpl {
    public BlightedBarbarian(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.BARBARIAN);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    public BlightedBarbarian(final BlightedBarbarian card) { super(card); }

    @Override
    public BlightedBarbarian copy() { return new BlightedBarbarian(this); }
}
