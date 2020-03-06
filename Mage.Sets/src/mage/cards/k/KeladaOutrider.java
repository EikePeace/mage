package mage.cards.k;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class KeladaOutrider extends CardImpl {
    public KeladaOutrider(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}");
        this.subtype.add(SubType.CENTAUR);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public KeladaOutrider(final KeladaOutrider card) { super(card); }

    @Override
    public KeladaOutrider copy() { return new KeladaOutrider(this); }
}
