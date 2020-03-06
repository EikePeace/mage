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
public final class CrazedButcher extends CardImpl {
    public CrazedButcher(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{R}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);
    }

    public CrazedButcher(final CrazedButcher card) { super(card); }

    @Override
    public CrazedButcher copy() { return new CrazedButcher(this); }
}
