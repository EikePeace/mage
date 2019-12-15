package mage.cards.a;

import mage.abilities.dynamicvalue.common.CardsInControllerGraveyardCount;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterInstantOrSorceryCard;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class ArcaneDischarge extends CardImpl {

    public ArcaneDischarge(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{1}{U}{R}");

        // Arcane Discharge deals damage to target creature equal to the number
        // of instants and sorcery cards in your graveyard
        Effect effect = new DamageTargetEffect(new CardsInControllerGraveyardCount(new FilterInstantOrSorceryCard("instant and sorcery cards")));
        effect.setText("{this} deals damage to target creature equal to the number of instant and sorcery cards in your graveyard. ");
        this.getSpellAbility().addEffect(effect);
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());

        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(1));

        // Draw a card.
    }

    public ArcaneDischarge(final ArcaneDischarge card){
        super(card);
    }

    @Override
    public ArcaneDischarge copy(){
        return new ArcaneDischarge(this);
    }
}
