package mage.cards.r;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class RoguePrototype extends CardImpl {
    public RoguePrototype(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.CONSTRUCT);
        this.subtype.add(SubType.ROGUE);

        this.power = new MageInt(3);
        this.toughness = new MageInt(1);
    }

    public RoguePrototype(final RoguePrototype card) { super(card); }

    @Override
    public RoguePrototype copy() { return new RoguePrototype(this); }
}
