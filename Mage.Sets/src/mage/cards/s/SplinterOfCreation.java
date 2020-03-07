package mage.cards.s;

import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.ruleModifying.PlayLandsFromGraveyardEffect;
import mage.constants.SubType;
import mage.constants.CardType;
import mage.cards.CardSetInfo;
import mage.cards.CardImpl;
import mage.MageInt;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class SplinterOfCreation extends CardImpl {
    public SplinterOfCreation(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{2}");
        this.subtype.add(SubType.ELEMENTAL);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // You may play land cards from your graveyard.
        this.addAbility(new SimpleStaticAbility(new PlayLandsFromGraveyardEffect()));
    }

    public SplinterOfCreation(final SplinterOfCreation card) { super(card); }

    @Override
    public SplinterOfCreation copy() { return new SplinterOfCreation(this); }
}
