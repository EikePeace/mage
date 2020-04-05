package mage.cards.p;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class PeacekeeperDroid extends CardImpl {
    public PeacekeeperDroid(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public PeacekeeperDroid(final PeacekeeperDroid card) { super(card); }

    @Override
    public PeacekeeperDroid copy() { return new PeacekeeperDroid(this); }
}
