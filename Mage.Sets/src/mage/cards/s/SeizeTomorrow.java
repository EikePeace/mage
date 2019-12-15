package mage.cards.s;

import mage.abilities.effects.common.ExileSpellEffect;
import mage.abilities.effects.common.turn.AddExtraTurnControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SeizeTomorrow extends CardImpl {
    public SeizeTomorrow(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{U}{U}");

        // Take an extra turn after this one.
        this.getSpellAbility().addEffect(new AddExtraTurnControllerEffect());

        // Exile Seize Tomorrow
        this.getSpellAbility().addEffect(ExileSpellEffect.getInstance());
    }

    public SeizeTomorrow(SeizeTomorrow card){
        super(card);
    }

    public SeizeTomorrow copy(){
        return new SeizeTomorrow(this);
    }
}
