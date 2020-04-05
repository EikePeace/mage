package mage.cards.o;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class OffDutyOfficer extends CardImpl {
    public OffDutyOfficer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}");
        this.subtype.add(SubType.ORC);
        this.subtype.add(SubType.SOLDIER);

        this.power = new MageInt(4);
        this.toughness = new MageInt(2);
    }

    public OffDutyOfficer(final OffDutyOfficer card) { super(card); }

    @Override
    public OffDutyOfficer copy() { return new OffDutyOfficer(this); }
}
