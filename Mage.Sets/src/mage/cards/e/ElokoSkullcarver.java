package mage.cards.e;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class ElokoSkullcarver extends CardImpl {
    public ElokoSkullcarver(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.GOBLIN);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
    }

    public ElokoSkullcarver(final ElokoSkullcarver card) { super(card); }

    @Override
    public ElokoSkullcarver copy() { return new ElokoSkullcarver(this); }
}
