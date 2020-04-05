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
public final class SettlementTurtle extends CardImpl {
    public SettlementTurtle(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{W}");
        this.subtype.add(SubType.TURTLE);

        this.power = new MageInt(2);
        this.toughness = new MageInt(8);
    }

    public SettlementTurtle(final SettlementTurtle card) { super(card); }

    @Override
    public SettlementTurtle copy() { return new SettlementTurtle(this); }
}
