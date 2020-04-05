
package mage.game.turn;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.TriggeredAbility;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SagaAbility;
import mage.cards.Card;
import mage.constants.PhaseStep;
import mage.constants.SubType;
import mage.counters.CounterType;
import mage.filter.FilterPermanent;
import mage.filter.predicate.Predicate;
import mage.filter.predicate.permanent.CounterPredicate;
import mage.game.Game;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.game.stack.StackObject;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class PreCombatMainStep extends Step {

    private static final FilterPermanent filter = new FilterPermanent("Saga");
    private static final FilterPermanent filter2 = new FilterPermanent("Discovery");

    static {
        filter.add(SubType.SAGA.getPredicate());
        filter2.add(SubType.DISCOVERY.getPredicate());
        filter2.add(new UndiscoveredPredicate());
    }

    public PreCombatMainStep() {
        super(PhaseStep.PRECOMBAT_MAIN, true);
        this.stepEvent = EventType.PRECOMBAT_MAIN_STEP;
        this.preStepEvent = EventType.PRECOMBAT_MAIN_STEP_PRE;
        this.postStepEvent = EventType.PRECOMBAT_MAIN_STEP_POST;
    }

    public PreCombatMainStep(final PreCombatMainStep step) {
        super(step);
    }

    @Override
    public void beginStep(Game game, UUID activePlayerId) {
        super.beginStep(game, activePlayerId);
        for (Permanent saga : game.getBattlefield().getAllActivePermanents(filter, activePlayerId, game)) {
            if (saga != null) {
                saga.addCounters(CounterType.LORE.createInstance(), null, game);
            }
        }
        for (Permanent discovery : game.getBattlefield().getAllActivePermanents(filter2, activePlayerId, game)) {
            if (discovery != null) {
                discovery.addCounters(CounterType.PROGRESS.createInstance(), null, game);
            }
        }
    }

    @Override
    public PreCombatMainStep copy() {
        return new PreCombatMainStep(this);
    }

}

class UndiscoveredPredicate implements Predicate<Permanent> {
    @Override
    public boolean apply(Permanent input, Game game) {
        int maxChapter = 0;
        for (Ability discoveryAbility : input.getAbilities()) {
            if (discoveryAbility instanceof DiscoveryAbility) {
                maxChapter = ((DiscoveryAbility) discoveryAbility).getMaxChapter().getNumber();
            }
        }
        return input.getCounters(game).getCount(CounterType.PROGRESS) <= maxChapter;
    }
}
