package mage.cards.r;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.AsThoughEffectImpl;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.ExileZone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.players.Library;
import mage.players.Player;
import mage.util.CardUtil;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class ReevEquinoxProphet extends CardImpl {
    public ReevEquinoxProphet(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}{B}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.CLERIC);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // If an opponent would draw a card, that player exiles the top card of their library instead.
        this.addAbility(new SimpleStaticAbility(new ReevReplacementEffect()));

        // Each player may play cards they own exiled with Reev, Equinox Prophet.
        this.addAbility(new SimpleStaticAbility(new ReevPlayEffect()));
    }

    public ReevEquinoxProphet(final ReevEquinoxProphet card) { super(card); }

    @Override
    public ReevEquinoxProphet copy() { return new ReevEquinoxProphet(this); }
}

class ReevReplacementEffect extends ReplacementEffectImpl {
    public ReevReplacementEffect() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit);
        staticText = "If an opponent would draw a card, "
                + "that player exiles the top card of their library instead";
    }

    public ReevReplacementEffect(final ReevReplacementEffect effect) { super(effect); }

    @Override
    public ReevReplacementEffect copy() { return new ReevReplacementEffect(this); }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        Player player = game.getPlayer(event.getPlayerId());
        if (player != null) {
            Library library = player.getLibrary();
            Card card = library.getFromTop(game);
            if (card != null) {
                player.moveCardsToExile(card, source, game, true, CardUtil.getCardExileZoneId(game, source), CardUtil.createObjectRealtedWindowTitle(source, game, null));
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.DRAW_CARD;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        Player you = game.getPlayer(source.getControllerId());
        return you != null && you.hasOpponent(event.getPlayerId(), game);
    }
}

class ReevPlayEffect extends AsThoughEffectImpl {
    public ReevPlayEffect() {
        super(AsThoughEffectType.PLAY_FROM_NOT_OWN_HAND_ZONE, Duration.EndOfGame, Outcome.Benefit);
        staticText = "Each player may play cards they own exiled with {this}";
    }

    public ReevPlayEffect(final ReevPlayEffect effect) { super(effect); }

    @Override
    public boolean apply(Game game, Ability source) { return true; }

    @Override
    public ReevPlayEffect copy() { return new ReevPlayEffect(this); }

    @Override
    public boolean applies(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        if (game.getOwnerId(objectId).equals(affectedControllerId) && game.getState().getZone(objectId) == Zone.EXILED) {
            ExileZone zone = game.getExile().getExileZone(CardUtil.getCardExileZoneId(game, source));
            return zone != null && zone.contains(objectId);
        }
        return false;
    }
}
