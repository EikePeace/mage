package mage.cards.f;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class FaultlessBloodhunter extends CardImpl {
    public FaultlessBloodhunter(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{B}");
        this.subtype.add(SubType.VAMPIRE);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);
    }

    public FaultlessBloodhunter(final FaultlessBloodhunter card) { super(card); }

    @Override
    public FaultlessBloodhunter copy() { return new FaultlessBloodhunter(this); }
}
