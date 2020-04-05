package mage.cards.w;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class WandersporeTerrapin extends CardImpl {
    public WandersporeTerrapin(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}");
        this.subtype.add(SubType.FUNGUS);
        this.subtype.add(SubType.TURTLE);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public WandersporeTerrapin(final WandersporeTerrapin card) { super(card); }

    @Override
    public WandersporeTerrapin copy() { return new WandersporeTerrapin(this); }
}
