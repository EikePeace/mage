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
public final class HulkDroid extends CardImpl {
    public HulkDroid(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{2}{G}{G}");
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(4);
        this.toughness = new MageInt(4);
    }

    public HulkDroid(final HulkDroid card) { super(card); }

    @Override
    public HulkDroid copy() { return new HulkDroid(this); }
}
