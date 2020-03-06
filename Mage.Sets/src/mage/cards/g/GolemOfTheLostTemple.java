package mage.cards.g;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class GolemOfTheLostTemple extends CardImpl {
    public GolemOfTheLostTemple(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{3}");
        this.subtype.add(SubType.GOLEM);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public GolemOfTheLostTemple(final GolemOfTheLostTemple card) { super(card); }

    @Override
    public GolemOfTheLostTemple copy() { return new GolemOfTheLostTemple(this); }
}
