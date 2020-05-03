package mage.abilities.effects.keyword;

import mage.abilities.Ability;
import mage.abilities.common.ActivateAsSorceryActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

/**
 *
 * @author RogueAustralian
 */
public class UploadEffect extends OneShotEffect {


	public UploadEffect(String text) {
		super(Outcome.Benefit);
		staticText = text;
	}

	public UploadEffect(final UploadEffect effect) {
		super(effect);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Player controller = game.getPlayer(source.getControllerId());
		if (controller != null) {
			Card card = game.getCard(getTargetPointer().getFirst(game, source));
			boolean moved = false;
			if (card.isPermanent()) {
				Permanent perm = game.getPermanent(getTargetPointer().getFirst(game, source));
				moved = controller.moveCards(perm, Zone.EXILED, source, game);
			} else {
				if (card != null) {
					moved = controller.moveCards(card, Zone.EXILED, source, game);
				}
				return true;
			}
			if (card != null) {
				if (card != null) {
					ActivateAsSorceryActivatedAbility putIntoHand = new ActivateAsSorceryActivatedAbility(Zone.EXILED, new MoveToHandEffect(), new ManaCostsImpl("{2}"));
					card.addAbility(putIntoHand);
				}
			}
		}
		return true;
	}

	@Override
	public UploadEffect copy() {
		return new UploadEffect(this);
	}

}

class MoveToHandEffect extends OneShotEffect {

	public MoveToHandEffect() {
		super(Outcome.Benefit);
		this.staticText = "put this card into your hand";
	}

	public MoveToHandEffect(final MoveToHandEffect effect) {
		super(effect);
	}

	@Override
	public MoveToHandEffect copy() {
		return new MoveToHandEffect(this);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Card c = game.getCard(source.getSourceId());
		//Player controller = game.getPlayer(source.getControllerId());
		c.moveToZone(Zone.HAND, source.getId(), game, false);
		c.getAbilities().remove(c.getAbilities().size() - 1); 
		//in theory, the upload ability should've been the last one added because there are no other effects that add activated abilities in exile
		//would like to find a cleaner way to do this
		return true;
	}
}
