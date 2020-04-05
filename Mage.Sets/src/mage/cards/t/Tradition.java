package mage.cards.t;

import mage.abilities.Ability;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.AsThoughEffectImpl;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.abilities.effects.Effects;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.PutTopCardOfLibraryIntoGraveControllerEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreatureCard;
import mage.filter.common.FilterNonlandPermanent;
import mage.filter.common.FilterPermanentCard;
import mage.filter.predicate.Predicates;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.stack.Spell;
import mage.players.Player;
import mage.target.targetpointer.FixedTarget;
import mage.watchers.Watcher;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Tradition extends CardImpl {
    public Tradition(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{B}{B}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Put the top two cards of your library into your graveyard. You gain 2 life.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new Effects(new PutTopCardOfLibraryIntoGraveControllerEffect(2), new GainLifeEffect(2)));
        //{DISCOVER} — During each of your turns, you may cast a nonland permanent card from your graveyard.
        Ability ability = new SimpleStaticAbility(Zone.BATTLEFIELD, new TraditionContinuousEffect());
        ability.addWatcher(new TraditionWatcher());
        discoveryAbility.addDiscoverAbility(this, ability);
        this.addAbility(discoveryAbility);
    }


    public Tradition(final Tradition card) {
        super(card);
    }

    @Override
    public Tradition copy() {
        return new Tradition(this);
    }
}

class TraditionContinuousEffect extends ContinuousEffectImpl {

    private static final FilterPermanentCard filter = new FilterPermanentCard("nonland permanent card");

    static {
        filter.add(Predicates.not(CardType.LAND.getPredicate()));
    }

    TraditionContinuousEffect() {
        super(Duration.WhileOnBattlefield, Layer.PlayerEffects, SubLayer.NA, Outcome.Benefit);
        staticText = "During each of your turns, you may cast a nonland permanent card from your graveyard";
    }

    TraditionContinuousEffect(final TraditionContinuousEffect effect) {
        super(effect);
    }

    @Override
    public TraditionContinuousEffect copy() {
        return new TraditionContinuousEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player != null) {
            if (!game.isActivePlayer(player.getId())) {
                return false;
            }
            for (Card card : player.getGraveyard().getCards(filter, game)) {
                ContinuousEffect effect = new TraditionCastFromGraveyardEffect();
                effect.setTargetPointer(new FixedTarget(card.getId()));
                game.addEffect(effect, source);
            }
            return true;
        }
        return false;
    }
}

class TraditionCastFromGraveyardEffect extends AsThoughEffectImpl {

    TraditionCastFromGraveyardEffect() {
        super(AsThoughEffectType.PLAY_FROM_NOT_OWN_HAND_ZONE, Duration.EndOfTurn, Outcome.Benefit);
        staticText = "You may cast a nonland permanent card from your graveyard";
    }

    TraditionCastFromGraveyardEffect(final TraditionCastFromGraveyardEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public TraditionCastFromGraveyardEffect copy() {
        return new TraditionCastFromGraveyardEffect(this);
    }

    @Override
    public boolean applies(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        if (objectId.equals(getTargetPointer().getFirst(game, source))) {
            if (affectedControllerId.equals(source.getControllerId())) {
                TraditionWatcher watcher = game.getState().getWatcher(TraditionWatcher.class, source.getSourceId());
                return watcher != null && !watcher.isAbilityUsed();
            }
        }
        return false;
    }
}

class TraditionWatcher extends Watcher {

    private boolean abilityUsed = false;

    TraditionWatcher() {
        super(WatcherScope.CARD);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == GameEvent.EventType.SPELL_CAST && event.getZone() == Zone.GRAVEYARD) {
            Spell spell = (Spell) game.getObject(event.getTargetId());
            if (spell != null && spell.isPermanent() &&  !spell.isLand()) {
                abilityUsed = true;
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        abilityUsed = false;
    }

    public boolean isAbilityUsed() {
        return abilityUsed;
    }
}

