package mage.cards.m;

import mage.MageObjectReference;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.cards.*;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.common.*;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;
import mage.target.common.TargetSpellOrPermanent;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class ManaHeist extends CardImpl {

    private static final FilterSpellOrPermanent filter = new FilterSpellOrPermanent("spell or creature");

    static {
        filter.setSpellFilter(new FilterInstantOrSorcerySpell());
    }

    public ManaHeist(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{U}{U}");

        this.getSpellAbility().addTarget(new TargetSpellOrPermanent(1, 1, filter,false));
        this.getSpellAbility().addEffect(new ReturnToHandTargetEffect());
        this.getSpellAbility().addEffect(new ManaHeistEffect());
    }


    public ManaHeist(final ManaHeist card) {
        super(card);
    }

    @Override
    public ManaHeist copy() {
        return new ManaHeist(this);
    }
}

class ManaHeistEffect extends OneShotEffect {

    public ManaHeistEffect() {
        super(Outcome.PlayForFree);
        this.staticText = "look at that player's hand. You may cast a nonland card in it without paying that card's mana cost";
    }

    public ManaHeistEffect(final mage.cards.m.ManaHeistEffect effect) {
        super(effect);
    }

    @Override
    public mage.cards.m.ManaHeistEffect copy() {
        return new mage.cards.m.ManaHeistEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player opponent = game.getPlayer(getTargetPointer().getFirst(game, source));
        Player controller = game.getPlayer(source.getControllerId());
        if (opponent != null && controller != null) {
            Cards cardsInHand = new CardsImpl();
            cardsInHand.addAll(opponent.getHand());
            if (!cardsInHand.isEmpty()) {
                TargetCard target = new TargetCard(1, Zone.HAND, new FilterInstantOrSorceryCard());
                if (controller.chooseTarget(outcome, cardsInHand, target, source, game)) {
                    Card card = game.getCard(target.getFirstTarget());
                    if (card != null) {
                        controller.cast(card.getSpellAbility(), game, true, new MageObjectReference(source.getSourceObject(game), game));
                    }
                }

            }
            return true;
        }
        return false;
    }
}
