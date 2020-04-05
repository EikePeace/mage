package mage.cards.l;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class LumasKindred extends CardImpl {
    public LumasKindred(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.NOMAD);

        this.power = new MageInt(2);
        this.toughness = new MageInt(4);
    }

    public LumasKindred(final LumasKindred card) { super(card); }

    @Override
    public LumasKindred copy() { return new LumasKindred(this); }
}
