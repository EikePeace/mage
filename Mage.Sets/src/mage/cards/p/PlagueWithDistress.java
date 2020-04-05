package mage.cards.p;

import mage.abilities.Ability;
import mage.abilities.SpellAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.SacrificeEffect;
import mage.abilities.effects.common.cost.CostModificationEffectImpl;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.permanent.TappedPredicate;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetPlayer;
import mage.util.CardUtil;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class PlagueWithDistress extends CardImpl {
    public PlagueWithDistress(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{7}{B}");

        // Trance — This spell costs {1} less to cast for each tapped creature you control.
        Ability ability = new SimpleStaticAbility(Zone.ALL, new TranceCostModificationEffect());
        ability.setAbilityWord(AbilityWord.TRANCE);
        this.addAbility(ability);

        // Target player sacrifices two creatures.
        this.getSpellAbility().addEffect(new SacrificeEffect(StaticFilters.FILTER_PERMANENT_CREATURES, 2, "Target player"));
        this.getSpellAbility().addTarget(new TargetPlayer());
    }

    public PlagueWithDistress(final PlagueWithDistress card) { super(card); }

    @Override
    public PlagueWithDistress copy() { return new PlagueWithDistress(this); }
}

class TranceCostModificationEffect extends CostModificationEffectImpl {
    private static final FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent();
    static {
        filter.add(TappedPredicate.instance);
    }

    TranceCostModificationEffect() {
        super(Duration.WhileOnStack, Outcome.Benefit, CostModificationType.REDUCE_COST);
        staticText = "{this} costs {1} less to cast for each tapped creature you control";
    }

    private TranceCostModificationEffect(TranceCostModificationEffect effect) { super(effect); }

    @Override
    public boolean apply(Game game, Ability source, Ability abilityToModify) {
        int reductionAmount = game.getBattlefield().countAll(filter, source.getControllerId(), game);
        CardUtil.reduceCost(abilityToModify, reductionAmount);
        return true;
    }

    @Override
    public boolean applies(Ability abilityToModify, Ability source, Game game) {
        if ((abilityToModify instanceof SpellAbility) && abilityToModify.getSourceId().equals(source.getSourceId())) {
            return game.getCard(abilityToModify.getSourceId()) != null;
        }
        return false;
    }

    @Override
    public TranceCostModificationEffect copy() { return new TranceCostModificationEffect(this); }
}
