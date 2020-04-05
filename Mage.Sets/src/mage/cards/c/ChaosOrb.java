package mage.cards.c;

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
import mage.filter.predicate.Predicates;
import mage.filter.predicate.permanent.TokenPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class ChaosOrb extends CardImpl {
    public ChaosOrb(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{2}");

        // {1}, {T}, Sacrifice Chaos Orb: For each nontoken permanent, flip a coin. Then destroy all permanents whose coin came up tails.
        Ability ability = new SimpleActivatedAbility(new ChaosOrbEffect(), new GenericManaCost(1));
        ability.addCost(new TapSourceCost());
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);
    }

    public ChaosOrb(final ChaosOrb card) { super(card); }

    @Override
    public ChaosOrb copy() { return  new ChaosOrb(this); }
}

class ChaosOrbEffect extends OneShotEffect {
    private static FilterPermanent filter = new FilterPermanent("nontoken permanent");
    static {
        filter.add(Predicates.not(TokenPredicate.instance));
    }

    public ChaosOrbEffect() {
        super(Outcome.DestroyPermanent);
        this.staticText = "for each nontoken permanent, flip a coin. Then destroy all permanents whose coin came up tails";
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player you = game.getPlayer(source.getControllerId());
        if (you == null) { return false; }
        for (Permanent permanent : game.getBattlefield().getAllActivePermanents(filter, game)) {
            if (you.flipCoin(source, game, false)) {
                permanent.destroy(source.getSourceId(), game, false);
            }
        }
        return true;
    }

    public ChaosOrbEffect(final ChaosOrbEffect effect) { super(effect); }

    public ChaosOrbEffect copy() { return new ChaosOrbEffect(this); }
}
