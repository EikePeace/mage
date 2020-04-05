package mage.cards.c;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class CovetedStallion extends CardImpl {
    public CovetedStallion(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");
        this.subtype.add(SubType.BIRD);
        this.subtype.add(SubType.HORSE);

        this.power = new MageInt(1);
        this.toughness = new MageInt(4);
    }

    public CovetedStallion(final CovetedStallion card) { super(card); }

    @Override
    public CovetedStallion copy() { return new CovetedStallion(this); }
}
