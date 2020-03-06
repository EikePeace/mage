package mage.cards.d;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class DesertCutthroat extends CardImpl {
    public DesertCutthroat(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ROGUE);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
    }

    public DesertCutthroat(final DesertCutthroat card) { super(card); }

    @Override
    public DesertCutthroat copy() { return new DesertCutthroat(this); }
}
