package mage.cards.s;

import mage.abilities.effects.common.GainLifeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SereneMeditation extends CardImpl {
    public SereneMeditation(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{W}");
        this.getSpellAbility().addEffect(new GainLifeEffect(7));
    }

    public SereneMeditation(final SereneMeditation card) {
        super(card);
    }

    @Override
    public SereneMeditation copy(){
        return new SereneMeditation(this);
    }
}
