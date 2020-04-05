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
public final class RamariVagabond extends CardImpl {
    public RamariVagabond(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.MERFOLK);
        this.subtype.add(SubType.SCOUT);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public RamariVagabond(final RamariVagabond card) { super(card); }

    @Override
    public RamariVagabond copy() { return new RamariVagabond(this); }
}
