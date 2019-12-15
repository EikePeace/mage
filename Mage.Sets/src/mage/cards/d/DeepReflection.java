package mage.cards.d;

import mage.abilities.effects.common.DrawDiscardControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class DeepReflection extends CardImpl {
    public DeepReflection(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{3}{U}{U}");

        this.getSpellAbility().addEffect(new DrawDiscardControllerEffect(4, 2));
    }


    public DeepReflection(final DeepReflection card){
        super(card);
    }

    @Override
    public DeepReflection copy(){
        return new DeepReflection(this);
    }
}
