package mage.abilities.effects.keyword;

import mage.abilities.Ability;
import mage.abilities.common.ActivateAsSorceryActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;
import mage.util.CardUtil;

/**
 *
 * @author RogueAustralian
 */
public class UploadLibraryEffect extends OneShotEffect {

	protected int qty = 0;

	public UploadLibraryEffect(int numCards) {
		super(Outcome.DrawCard);
		staticText = "Upload the top " + CardUtil.numberToText(numCards) + " card" + (numCards > 1 ? "s" : "") + " of your library";
		this.qty = numCards;
	}

	public UploadLibraryEffect(final UploadLibraryEffect effect) {
		super(effect);
		this.qty = effect.qty;
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Player targetPlayer = game.getPlayer(getTargetPointer().getFirst(game, source));
		if (targetPlayer == null) {
			targetPlayer = game.getPlayer(source.getControllerId());
		}
		if (targetPlayer != null) {
			for(Card card : targetPlayer.getLibrary().getTopCards(game, qty)) {
				System.out.println(card.getName());
				ActivateAsSorceryActivatedAbility putIntoHand = new ActivateAsSorceryActivatedAbility(Zone.EXILED, new UploadMoveToHandEffect(), new ManaCostsImpl("{2}"));
				card.addAbility(putIntoHand);
			}
			Cards cards = new CardsImpl();
            cards.addAll(targetPlayer.getLibrary().getTopCards(game, qty));
            System.out.println(cards.toString());
            return targetPlayer.moveCards(cards, Zone.EXILED, source, game);
		}
		return false;			
	}

	@Override
	public UploadLibraryEffect copy() {
		return new UploadLibraryEffect(this);
	}

}
