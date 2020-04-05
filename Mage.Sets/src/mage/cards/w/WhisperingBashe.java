package mage.cards.w;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.SpellAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.cost.CostModificationEffectImpl;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.permanent.TappedPredicate;
import mage.game.Game;
import mage.util.CardUtil;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class WhisperingBashe extends CardImpl {
    public WhisperingBashe(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{7}{G}");
        this.subtype.add(SubType.SNAKE);

        this.power = new MageInt(6);
        this.toughness = new MageInt(7);

        // Trance — This spell costs {1} less to cast for each tapped creature you control.
        Ability ability = new SimpleStaticAbility(Zone.ALL, new TranceCostModificationEffect());
        ability.setAbilityWord(AbilityWord.TRANCE);
        this.addAbility(ability);
    }

    public WhisperingBashe(final WhisperingBashe card) { super(card); }

    @Override
    public WhisperingBashe copy() { return new WhisperingBashe(this); }
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
