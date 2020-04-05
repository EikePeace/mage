package mage.cards.b;

import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.OneShotEffect;
import mage.cards.*;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;

import java.util.Set;
import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class BlurredHorizons extends CardImpl {
    public BlurredHorizons(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {T}, Sacrifice Blurred Horizons: Choose a basic land card you own from outside the game and put it onto the battlefield.
        Ability ability = new SimpleActivatedAbility(new WishToBattlefieldEffect(), new TapSourceCost());
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);
    }

    public BlurredHorizons(final BlurredHorizons card) { super(card); }

    @Override
    public BlurredHorizons copy() { return new BlurredHorizons(this); }
}

class WishToBattlefieldEffect extends OneShotEffect {
    private static final FilterCard filter = StaticFilters.FILTER_CARD_BASIC_LAND;

    public WishToBattlefieldEffect() {
        super(Outcome.PutLandInPlay);
        staticText = "You may choose a basic land card you own from outside the game and put it onto the battlefield";
    }

    public WishToBattlefieldEffect(final WishToBattlefieldEffect effect) { super(effect); }

    @Override
    public WishToBattlefieldEffect copy() { return new WishToBattlefieldEffect(this); }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Cards cards = controller.getSideboard();
            if (cards.isEmpty()) {
                game.informPlayer(controller, "You have no cards outside the game.");
                return true;
            }

            Set<Card> filtered = cards.getCards(filter, game);
            Cards filteredCards = new CardsImpl();
            for (Card card : filtered) {
                filteredCards.add(card.getId());
            }
            if (filteredCards.isEmpty()) {
                game.informPlayer(controller, "You don't have " + filter.getMessage() + " outside the game.");
                return true;
            }

            TargetCard target = new TargetCard(Zone.ALL, filter);
            target.setNotTarget(true);
            if (controller.choose(Outcome.Benefit, filteredCards, target, game)) {
                Card card = controller.getSideboard().get(target.getFirstTarget(), game);
                if (card != null) {
                    card.moveToZone(Zone.BATTLEFIELD, source.getSourceId(), game, false);
                }
            }
        }
        return true;
    }
}
