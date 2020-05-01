package mage.cards.i;

import mage.MageInt;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.abilities.effects.RestrictionEffect;
import mage.abilities.effects.common.ReturnToHandChosenControlledPermanentEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.IndestructibleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.n.NyxbloomAncientReplacementEffect;
import mage.constants.*;
import mage.counters.CounterType;
import mage.filter.common.FilterControlledPermanent;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ManaEvent;
import mage.game.permanent.Permanent;
import mage.players.Player;

import java.util.UUID;

/**
 * @author RogueAustralian
 */
public final class IterinisGodOfWaters extends CardImpl {

    public IterinisGodOfWaters(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT, CardType.CREATURE}, "{3}{U}{U}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.GOD);
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Indestructible
        this.addAbility(IndestructibleAbility.getInstance());

        // Iterinis, God of Waters can't attack or block unless she has a +1/+1 counter on her.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new IterinisRestrictionEffect()));

        this.addAbility(new SimpleStaticAbility(new IterinisReplacementEffect()));

    }

    public IterinisGodOfWaters(final IterinisGodOfWaters card) {
        super(card);
    }

    @Override
    public IterinisGodOfWaters copy() {
        return new IterinisGodOfWaters(this);
    }
}

class IterinisRestrictionEffect extends RestrictionEffect {

    public IterinisRestrictionEffect() {
        super(Duration.WhileOnBattlefield);
        staticText = "{this} can't attack or block unless it has a +1/+1 counter on it";
    }

    public IterinisRestrictionEffect(final IterinisRestrictionEffect effect) {
        super(effect);
    }

    @Override
    public IterinisRestrictionEffect copy() {
        return new IterinisRestrictionEffect(this);
    }

    @Override
    public boolean canAttack(Game game, boolean canUseChooseDialogs) {
        return false;
    }

    @Override
    public boolean canBlock(Permanent attacker, Permanent blocker, Ability source, Game game, boolean canUseChooseDialogs) {
        return false;
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        if (permanent.getId().equals(source.getSourceId())) {
        	return permanent.getCounters(game).getCount(CounterType.P1P1) < 1;
        }  // do not apply to other creatures.
        return false;
    }
}

class KefnetTheMindfulEffect extends OneShotEffect {

    KefnetTheMindfulEffect() {
        super(Outcome.Benefit);
        staticText = "Draw a card, then you may return a land you control to its owner's hand";
    }

    KefnetTheMindfulEffect(final KefnetTheMindfulEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        FilterControlledPermanent filterControlledLand = new FilterControlledPermanent("land you control");
        filterControlledLand.add(CardType.LAND.getPredicate());
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            controller.drawCards(1, game);
            if (controller.chooseUse(Outcome.AIDontUseIt, "Do you want to return a land you control to its owner's hand?", null, "Yes", "No", source, game)) {
                Effect effect = new ReturnToHandChosenControlledPermanentEffect(filterControlledLand);
                effect.apply(game, source);
            }
            return true;
        }
        return false;
    }

    @Override
    public KefnetTheMindfulEffect copy() {
        return new KefnetTheMindfulEffect(this);
    }
}
class IterinisReplacementEffect extends ReplacementEffectImpl {

    IterinisReplacementEffect() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit);
        staticText = "If a land you control would produce {U}, it produces {U}{U} instead.";
    }

    private IterinisReplacementEffect(IterinisReplacementEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        Mana mana = ((ManaEvent) event).getMana();
        if (mana.getBlue() == 1) {
            mana.set(ManaType.BLUE, 2);
        }
        return false;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.TAPPED_FOR_MANA;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        return event.getPlayerId().equals(source.getControllerId())
                && game.getPermanentOrLKIBattlefield(event.getSourceId()) != null
                && game.getPermanentOrLKIBattlefield(event.getSourceId()).isLand();
    }

    @Override
    public IterinisReplacementEffect copy() {
        return new IterinisReplacementEffect(this);
    }
}

