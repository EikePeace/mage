package mage.cards.n;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class Nugolem extends CardImpl {
    public Nugolem(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{3}{U}");
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(3);
        this.toughness = new MageInt(4);
    }

    public Nugolem(final Nugolem card) { super(card); }

    @Override
    public Nugolem copy() { return new Nugolem(this); }
}
