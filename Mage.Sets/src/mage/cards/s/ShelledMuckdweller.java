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
public final class ShelledMuckdweller extends CardImpl {
    public ShelledMuckdweller(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}");
        this.subtype.add(SubType.CRAB);
        this.subtype.add(SubType.BEAST);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    public ShelledMuckdweller(final ShelledMuckdweller card) { super(card); }

    @Override
    public ShelledMuckdweller copy() { return new ShelledMuckdweller(this); }
}
