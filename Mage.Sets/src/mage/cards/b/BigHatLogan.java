package mage.cards.b;

import mage.MageInt;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.costs.Cost;
import mage.abilities.costs.common.ExileFromGraveCost;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.CardsImpl;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.filter.common.FilterInstantOrSorceryCard;
import mage.filter.predicate.mageobject.ConvertedManaCostPredicate;
import mage.game.Game;
import mage.players.Player;
import mage.target.common.TargetCardInLibrary;
import mage.target.common.TargetCardInYourGraveyard;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class BigHatLogan extends CardImpl {
    public BigHatLogan(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        Ability ability = new EntersBattlefieldTriggeredAbility(new DoIfCostPaid(
                new BigHatLoganEffect(),
                new ExileFromGraveCost(new TargetCardInYourGraveyard(StaticFilters.FILTER_CARD_INSTANT_OR_SORCERY))
        ));
        ability.addTarget(new TargetCardInYourGraveyard(StaticFilters.FILTER_CARD_INSTANT_OR_SORCERY));
    }

    public BigHatLogan(final BigHatLogan card) { super(card); }

    @Override
    public BigHatLogan copy() { return new BigHatLogan(this); }
}

class BigHatLoganEffect extends OneShotEffect {
    BigHatLoganEffect() {
        super(Outcome.Benefit);
        staticText = "Search your library for an instant or sorcery card with converted mana cost equal to 1 " +
                "plus the exiled card's converted mana cost, reveal it, put it " +
                "into your hand, then shuffle your library";
    }

    private BigHatLoganEffect(final BigHatLoganEffect effect) { super(effect); }

    @Override
    public boolean apply(Game game, Ability source) {
        MageObject sourceObject = source.getSourceObject(game);
        Card exiledCard = null;
        for (Cost cost : source.getCosts()) {
            if (cost instanceof ExileFromGraveCost) {
                ExileFromGraveCost exileCost = (ExileFromGraveCost) cost;
                if (!exileCost.getExiledCards().isEmpty()) {
                    exiledCard = exileCost.getExiledCards().get(0);
                }
                break;
            }
        }
        Player controller = game.getPlayer(source.getControllerId());
        if (exiledCard == null || controller == null) {
            return false;
        }
        int newConvertedCost = exiledCard.getConvertedManaCost() + 1;
        FilterInstantOrSorceryCard filter = new FilterInstantOrSorceryCard("instant or sorcery card with converted mana cost " + newConvertedCost);
        filter.add(new ConvertedManaCostPredicate(ComparisonType.EQUAL_TO, newConvertedCost));
        TargetCardInLibrary target = new TargetCardInLibrary(filter);
        if (controller.searchLibrary(target, source, game)) {
            Card card = controller.getLibrary().getCard(target.getFirstTarget(), game);
            controller.revealCards(sourceObject.getIdName(), new CardsImpl(card), game);
            controller.moveCards(card, Zone.HAND, source, game);
        }
        controller.shuffleLibrary(source, game);
        return true;
    }

    @Override
    public BigHatLoganEffect copy() { return new BigHatLoganEffect(this); }
}
