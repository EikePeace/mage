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
public class UploadPermanentEffect extends OneShotEffect {


	public UploadPermanentEffect(String text) {
		super(Outcome.Benefit);
		staticText = text;
	}

	public UploadPermanentEffect(final UploadPermanentEffect effect) {
		super(effect);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Permanent targetPermanent = game.getPermanent(getTargetPointer().getFirst(game, source));
            if (targetPermanent != null) {
            	
                if (controller.moveCards(targetPermanent, Zone.EXILED, source, game)) {
                    Card card = game.getCard(targetPermanent.getId());
                    if (card != null) {
                    	ActivateAsSorceryActivatedAbility putIntoHand = new ActivateAsSorceryActivatedAbility(Zone.EXILED, new MoveToHandEffect(), new ManaCostsImpl("{2}"));
                    	card.addAbility(putIntoHand);
                    }
                }
            }
            return true;
        }
        return false;
    }

	@Override
	public UploadPermanentEffect copy() {
		return new UploadPermanentEffect(this);
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
        return true;
    }
}
