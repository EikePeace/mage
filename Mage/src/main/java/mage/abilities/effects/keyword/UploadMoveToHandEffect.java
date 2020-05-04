package mage.abilities.effects.keyword;

import mage.abilities.Ability;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;

public class UploadMoveToHandEffect extends OneShotEffect {

	public UploadMoveToHandEffect() {
		super(Outcome.Benefit);
		this.staticText = "put this card into your hand";
	}

	public UploadMoveToHandEffect(final UploadMoveToHandEffect effect) {
		super(effect);
	}

	@Override
	public UploadMoveToHandEffect copy() {
		return new UploadMoveToHandEffect(this);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Card c = game.getCard(source.getSourceId());
		if (c.moveToZone(Zone.HAND, source.getId(), game, false)) {
			c.getAbilities().remove(c.getAbilities().size() - 1); 
			GameEvent event = new GameEvent(GameEvent.EventType.UPLOAD_CARD_INTO_HAND, source.getControllerId(), source.getId(), source.getControllerId(), 1, true);
			game.fireEvent(event);
			//in theory, the upload ability should've been the last one added because there are no other effects that add activated abilities in exile
			//TODO: would like to find a cleaner way to do this
			return true;
		} else {
			return false;
		}
	}
}
