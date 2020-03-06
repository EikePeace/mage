package mage.cards.a;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class AethanisStrider extends CardImpl {
    public AethanisStrider(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{4}{C}{C}");
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(7);
        this.toughness = new MageInt(7);
    }

    public AethanisStrider(final AethanisStrider card) { super(card); }

    @Override
    public AethanisStrider copy() { return new AethanisStrider(this); }
}
