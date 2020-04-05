package mage.cards.g;

import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.predicate.Predicates;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.TreasureToken;
import mage.players.Player;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class GoldenAge extends CardImpl {


    public GoldenAge(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{U}{U}");

        //At the beginning of your upkeep, create a Treasure token.
        // Then if you control fifteen or more artifacts, creatures, and/or enchantments, you win the game.
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(Zone.BATTLEFIELD, new GoldenAgeEffect(),
                TargetController.YOU, false));
    }


    public GoldenAge(final GoldenAge card) {
        super(card);
    }

    @Override
    public GoldenAge copy() {
        return new GoldenAge(this);
    }
}

class GoldenAgeEffect extends OneShotEffect {

    private static final FilterPermanent filter = new FilterPermanent("");

    static {
        filter.add(Predicates.or(
                CardType.ARTIFACT.getPredicate(),
                CardType.CREATURE.getPredicate(),
                CardType.ENCHANTMENT.getPredicate()));
    }

    public GoldenAgeEffect() {
        super(Outcome.Benefit);
        staticText = "create a Treasure token. Then if you control fifteen or more artifacts, creatures, and/or enchantments, you win the game.";
    }

    public GoldenAgeEffect(final GoldenAgeEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent permanent = game.getPermanent(source.getSourceId());
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            new TreasureToken().putOntoBattlefield(1, game, source.getSourceId(), controller.getId());
            if (game.getBattlefield().getActivePermanents(filter, controller.getId(), game).size() > 14) {
                Player player = game.getPlayer(permanent.getControllerId());
                if (player != null) {
                    player.won(game);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public GoldenAgeEffect copy() {
        return new GoldenAgeEffect(this);
    }
}
