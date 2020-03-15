package mage.cards.f;

import mage.MageObjectReference;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.filter.FilterPermanent;
import mage.filter.StaticFilters;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.permanent.TokenPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class FallingStar extends CardImpl {
    public FallingStar(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{R}");

        // For each creature on the battlefield, flip a coin. Falling Star deals 3 damage to each creature whose coin came up tails. Tap all creatures dealt damage by Falling Star.
        this.spellAbility.addEffect(new FallingStarEffect());
    }

    public FallingStar(final FallingStar card) { super(card); }

    @Override
    public FallingStar copy() { return  new FallingStar(this); }
}

class FallingStarEffect extends OneShotEffect {
    public FallingStarEffect() {
        super(Outcome.DestroyPermanent);
        this.staticText = "for each creature on the battlefield, flip a coin. {this} deals 3 damage to each creature whose coin came up tails. Tap all creatures dealt damage by {this}";
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player you = game.getPlayer(source.getControllerId());
        if (you == null) { return false; }
        for (Permanent permanent : game.getBattlefield().getAllActivePermanents(StaticFilters.FILTER_PERMANENT_CREATURE, game)) {
            if (you.flipCoin(source, game, false)) {
                permanent.damage(3, source.getSourceId(), game);
            }
        }
        for (Permanent permanent : game.getBattlefield().getAllActivePermanents(StaticFilters.FILTER_PERMANENT_CREATURE, game)) {
            boolean damageDealt = false;
            for (MageObjectReference mor : permanent.getDealtDamageByThisTurn()) {
                if (mor.refersTo(source.getSourceId(), game)) {
                    damageDealt = true;
                    break;
                }
            }
            if (damageDealt) { permanent.tap(game); }
        }
        return true;
    }

    public FallingStarEffect(final FallingStarEffect effect) { super(effect); }

    public FallingStarEffect copy() { return new FallingStarEffect(this); }
}
