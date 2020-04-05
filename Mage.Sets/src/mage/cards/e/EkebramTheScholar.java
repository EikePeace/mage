package mage.cards.e;

import mage.MageInt;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.BecomesUntappedSourceTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.TransformSourceEffect;
import mage.abilities.keyword.TransformAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.watchers.common.CardsAmountDrawnThisTurnWatcher;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class EkebramTheScholar extends CardImpl {
    public EkebramTheScholar(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "2}{U}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);

        this.transformable = true;
        this.secondSideCardClazz = mage.cards.e.EkebramChroniclerOfAges.class;

        this.power = new MageInt(2);
        this.toughness = new MageInt(4);

        // Whenever Ekebram the Scholar becomes untapped, draw a card.
        this.addAbility(new BecomesUntappedSourceTriggeredAbility(new DrawCardSourceControllerEffect(1)));

        // Whenever you draw your third card each turn, you may transform Ekebram.
        this.addAbility(new TransformAbility());
        this.addAbility(new DrawThirdCardTriggeredAbility(new TransformSourceEffect(true), true));
    }

    public EkebramTheScholar(final EkebramTheScholar card) { super(card); }

    @Override
    public EkebramTheScholar copy() { return new EkebramTheScholar(this); }
}

class DrawThirdCardTriggeredAbility extends TriggeredAbilityImpl {
    private boolean triggeredOnce = false;

    public DrawThirdCardTriggeredAbility(Effect effect, boolean optional) {
        super(Zone.ALL, effect, optional);
        this.addWatcher(new CardsAmountDrawnThisTurnWatcher());
    }

    private DrawThirdCardTriggeredAbility(final DrawThirdCardTriggeredAbility ability) {
        super(ability);
        this.triggeredOnce = ability.triggeredOnce;
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.DREW_CARD
                || event.getType() == GameEvent.EventType.END_PHASE_POST;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (event.getType() == GameEvent.EventType.END_PHASE_POST) {
            triggeredOnce = false;
            return false;
        }
        if (event.getType() != GameEvent.EventType.DREW_CARD
                || !event.getPlayerId().equals(controllerId)
                || game.getPermanent(sourceId) == null) {
            return false;
        }
        if (triggeredOnce) {
            return false;
        }
        CardsAmountDrawnThisTurnWatcher watcher = game.getState().getWatcher(CardsAmountDrawnThisTurnWatcher.class);
        if (watcher == null) {
            return false;
        }
        if (watcher.getAmountCardsDrawn(controllerId) > 2) {
            triggeredOnce = true;
            return true;
        }
        return false;
    }

    @Override
    public String getRule() { return "Whenever you draw your third card each turn, " + super.getRule(); }

    @Override
    public DrawThirdCardTriggeredAbility copy() { return new DrawThirdCardTriggeredAbility(this); }
}
