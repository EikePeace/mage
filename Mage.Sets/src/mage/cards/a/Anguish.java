package mage.cards.a;

import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.common.discard.DiscardCardYouChooseTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.filter.StaticFilters;
import mage.target.TargetPlayer;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class Anguish extends CardImpl {

    public Anguish(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{B}");

        // As an additional cost to cast Anguish, sacrifice a creature.
        this.getSpellAbility().addCost(new SacrificeTargetCost(new TargetControlledPermanent(StaticFilters.FILTER_CONTROLLED_CREATURE_SHORT_TEXT)));

        // Target player reveals their hand. You choose a nonland card from it. That player discards that card.
        this.getSpellAbility().addTarget(new TargetPlayer());
        this.getSpellAbility().addEffect(new DiscardCardYouChooseTargetEffect(StaticFilters.FILTER_CARD_NON_LAND, TargetController.ANY));
    }

    public Anguish(final Anguish card){
        super(card);
    }

    @Override
    public Anguish copy(){
        return new Anguish(this);
    }
}
