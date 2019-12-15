package mage.cards.f;

import mage.abilities.Ability;
import mage.abilities.costs.Cost;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenCopyTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class FinalFlame extends CardImpl {
    public FinalFlame(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{R}");

        // As an additional cost to cast this spell, sacrifice a creature.
        this.getSpellAbility().addCost(new SacrificeTargetCost(new TargetControlledCreaturePermanent(StaticFilters.FILTER_CONTROLLED_CREATURE_SHORT_TEXT)));
        this.getSpellAbility().addEffect(new FinalFlameEffect());
        // Create two
    }

    public FinalFlame(final FinalFlame card){
        super(card);
    }

    @Override
    public FinalFlame copy(){
        return new FinalFlame(this);
    }
}

class FinalFlameEffect extends OneShotEffect {

    public FinalFlameEffect(){
        super(Outcome.PutCreatureInPlay);
        staticText = "Create two tokens that are copies of the sacrificed creature. They gain haste until end of turn. Exile them at the beginning of the next end step.";
    }

    public FinalFlameEffect(final FinalFlameEffect effect){
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());

        if (controller == null){
            return false;
        }

        Permanent permanent = null;

        for (Cost cost : source.getCosts()){
            if (cost instanceof SacrificeTargetCost && !((SacrificeTargetCost) cost).getPermanents().isEmpty()) {
                permanent = ((SacrificeTargetCost) cost).getPermanents().get(0);
                break;
            }
        }

        if (permanent != null){
            CreateTokenCopyTargetEffect effect = new CreateTokenCopyTargetEffect(source.getControllerId(), null, true, 2);
            effect.setTargetPointer(new FixedTarget(permanent.getId(), game));
            if(effect.apply(game, source)){
                effect.exileTokensCreatedAtNextEndStep(game, source);
            }
            return true;
        }

        return true;
    }

    @Override
    public FinalFlameEffect copy(){
        return new FinalFlameEffect(this);
    }

}
