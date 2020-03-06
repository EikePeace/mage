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
public final class SahaiNomad extends CardImpl {
    public SahaiNomad(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");
        this.subtype.add(SubType.BEAST);
        this.subtype.add(SubType.SCOUT);

        this.power = new MageInt(1);
        this.toughness = new MageInt(4);
    }

    public SahaiNomad(final SahaiNomad card) { super(card); }

    @Override
    public SahaiNomad copy() { return new SahaiNomad(this); }
}
