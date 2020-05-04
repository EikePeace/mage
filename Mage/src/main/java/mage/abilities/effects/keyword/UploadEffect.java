package mage.abilities.effects.keyword;

import java.util.UUID;

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
			for(UUID ptr : this.getTargetPointer().getTargets(game, source)) {
				Card card = game.getCard(ptr);
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
						ActivateAsSorceryActivatedAbility putIntoHand = new ActivateAsSorceryActivatedAbility(Zone.EXILED, new UploadMoveToHandEffect(), new ManaCostsImpl("{2}"));
						card.addAbility(putIntoHand);
					}
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

