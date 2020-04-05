package mage.abilities.effects.common;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardsImpl;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;

public class LookLibraryMayPutInGraveyardEffect extends OneShotEffect {
    public LookLibraryMayPutInGraveyardEffect() {
        super(Outcome.Benefit);
        this.staticText = "look at the top card of your library. You may put it into your graveyard";
    }

    public LookLibraryMayPutInGraveyardEffect(final LookLibraryMayPutInGraveyardEffect effect) { super(effect); }

    @Override
    public LookLibraryMayPutInGraveyardEffect copy() { return new LookLibraryMayPutInGraveyardEffect(this); }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        MageObject sourceObject = game.getObject(source.getSourceId());
        if (controller != null && controller.getLibrary().hasCards()) {
            Card card = controller.getLibrary().getFromTop(game);
            if (card != null) {
                CardsImpl cards = new CardsImpl();
                cards.add(card);
                controller.lookAtCards(sourceObject.getName(), cards, game);
                if (controller.chooseUse(Outcome.Neutral, "Do you wish to put the card into your graveyard?", source, game)) {
                    return controller.moveCards(card, Zone.GRAVEYARD, source, game);
                }
                return true;
            }
        }
        return false;
    }
}
