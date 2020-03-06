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
public final class HakuHakuStrangler extends CardImpl {
    public HakuHakuStrangler(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{B}");
        this.subtype.add(SubType.SNAKE);

        this.power = new MageInt(5);
        this.toughness = new MageInt(3);
    }

    public HakuHakuStrangler(final HakuHakuStrangler card) { super(card); }

    @Override
    public HakuHakuStrangler copy() { return new HakuHakuStrangler(this); }
}
