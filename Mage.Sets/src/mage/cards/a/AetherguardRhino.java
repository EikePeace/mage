
package mage.cards.a;

import java.util.UUID;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.DiesTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.keyword.HexproofAbility;
import mage.abilities.keyword.TransformAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;

/**
 * @author Fenhl
 */
public final class AetherguardRhino extends CardImpl {
    public AetherguardRhino(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{G}");
        this.subtype.add(SubType.RHINO);
        this.power = new MageInt(3);
        this.toughness = new MageInt(4);

        this.transformable = true;
        this.secondSideCardClazz = mage.cards.a.AetherguardArmor.class;

        // Hexproof
        this.addAbility(HexproofAbility.getInstance());

        // When Aetherguard Rhino dies, return it to the battlefield transformed under your control.
        this.addAbility(new TransformAbility());
        this.addAbility(new DiesTriggeredAbility(new AetherguardRhinoReturnTransformedEffect()));
    }

    public AetherguardRhino(final AetherguardRhino card) {
        super(card);
    }

    @Override
    public AetherguardRhino copy() {
        return new AetherguardRhino(this);
    }
}

class AetherguardRhinoReturnTransformedEffect extends OneShotEffect {
    public AetherguardRhinoReturnTransformedEffect() {
        super(Outcome.PutCardInPlay);
        this.staticText = "Return {this} to the battlefield transformed under your control";
    }

    public AetherguardRhinoReturnTransformedEffect(final AetherguardRhinoReturnTransformedEffect effect) {
        super(effect);
    }

    @Override
    public AetherguardRhinoReturnTransformedEffect copy() {
        return new AetherguardRhinoReturnTransformedEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            if (game.getState().getZone(source.getSourceId()) == Zone.GRAVEYARD) {
                game.getState().setValue(TransformAbility.VALUE_KEY_ENTER_TRANSFORMED + source.getSourceId(), Boolean.TRUE);
                Card card = game.getCard(source.getSourceId());
                if (card != null) {
                    controller.moveCards(card, Zone.BATTLEFIELD, source, game);
                }
            }
            return true;
        }
        return false;
    }
}
