package mage.cards.h;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class HorizonEater extends CardImpl {
    public HorizonEater(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}{G}{G}");
        this.subtype.add(SubType.WURM);

        this.power = new MageInt(6);
        this.toughness = new MageInt(5);
    }

    public HorizonEater(final HorizonEater card) { super(card); }

    @Override
    public HorizonEater copy() { return new HorizonEater(this); }
}
