package mage.cards.t;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class ToahangasTusker extends CardImpl {
    public ToahangasTusker(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{G}");
        this.subtype.add(SubType.ELEMENTAL);
        this.subtype.add(SubType.BOAR);

        this.power = new MageInt(6);
        this.toughness = new MageInt(6);
    }

    public ToahangasTusker(final ToahangasTusker card) { super(card); }

    @Override
    public ToahangasTusker copy() { return new ToahangasTusker(this); }
}
