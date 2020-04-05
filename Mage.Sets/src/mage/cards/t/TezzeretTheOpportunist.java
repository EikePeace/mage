package mage.cards.t;

import mage.abilities.Ability;
import mage.abilities.LoyaltyAbility;
import mage.abilities.common.PlaneswalkerEntersWithLoyaltyCountersAbility;
import mage.abilities.costs.common.DiscardCardCost;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.ReturnFromGraveyardToHandTargetEffect;
import mage.abilities.effects.common.continuous.AddCardTypeTargetEffect;
import mage.abilities.effects.common.continuous.SetPowerToughnessTargetEffect;
import mage.abilities.effects.common.discard.DiscardControllerEffect;
import mage.cards.*;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.players.Player;
import mage.target.Target;
import mage.target.common.TargetCardInHand;
import mage.target.common.TargetCardInYourGraveyard;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class TezzeretTheOpportunist extends CardImpl {
    public TezzeretTheOpportunist(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.PLANESWALKER}, "");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.TEZZERET);
        this.color.setBlue(true);

        this.nightCard = true;
        this.transformable = true;

        this.addAbility(new PlaneswalkerEntersWithLoyaltyCountersAbility(5));

        // [+1]: Return up to one target artifact card from your graveyard to your hand.
        Ability ability = new LoyaltyAbility(new ReturnFromGraveyardToHandTargetEffect(), 1);
        ability.addTarget(new TargetCardInYourGraveyard(0, 1, StaticFilters.FILTER_CARD_ARTIFACT));
        this.addAbility(ability);

        // [-3]: Draw three cards, then discard two cards unless you discard an artifact card.
        ability = new LoyaltyAbility(new DrawCardSourceControllerEffect(3), -3);
        ability.addEffect(new DoIfCostPaid(
                null,
                new DiscardControllerEffect(2),
                new DiscardCardCost(StaticFilters.FILTER_CARD_ARTIFACT_AN)
        ));
        this.addAbility(ability);

        // [-9]: Put any number of artifact cards from your hand onto the battlefield. They're 5/5 artifact creatures.
        this.addAbility(new LoyaltyAbility(new TezzeretTheOpportunistEffect(), -9));
    }

    public TezzeretTheOpportunist(final TezzeretTheOpportunist card) { super(card); }

    @Override
    public TezzeretTheOpportunist copy() { return new TezzeretTheOpportunist(this); }
}

class TezzeretTheOpportunistEffect extends OneShotEffect {
    public TezzeretTheOpportunistEffect() {
        super(Outcome.PutCreatureInPlay);
        this.staticText = "put any number of artifact cards from your hand onto the battlefield. They're 5/5 artifact creatures";
    }

    public TezzeretTheOpportunistEffect(final TezzeretTheOpportunistEffect effect) { super(effect); }

    @Override
    public TezzeretTheOpportunistEffect copy() { return new TezzeretTheOpportunistEffect(this); }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player == null) {
            return false;
        }
        Target target = new TargetCardInHand(0, Integer.MAX_VALUE, StaticFilters.FILTER_CARD_ARTIFACT);
        if (!player.choose(outcome, target, source.getSourceId(), game)) {
            return false;
        }
        Cards cardsToMove = new CardsImpl();

        for (UUID cardId : target.getTargets()) {
            Card card = game.getCard(cardId);
            if (card == null) {
                continue;
            }
            cardsToMove.add(card);
            ContinuousEffect effectCardType = new AddCardTypeTargetEffect(Duration.WhileOnBattlefield, CardType.ARTIFACT, CardType.CREATURE);
            effectCardType.setTargetPointer(new FixedTarget(
                    card.getId(),
                    card.getZoneChangeCounter(game) + 1
            ));
            game.addEffect(effectCardType, source);

            ContinuousEffect effectPowerToughness = new SetPowerToughnessTargetEffect(5, 5, Duration.WhileOnBattlefield);
            effectPowerToughness.setTargetPointer(new FixedTarget(
                    card.getId(),
                    card.getZoneChangeCounter(game) + 1
            ));
            game.addEffect(effectPowerToughness, source);
        }

        return player.moveCards(cardsToMove.getCards(game), Zone.BATTLEFIELD, source, game);
    }
}
