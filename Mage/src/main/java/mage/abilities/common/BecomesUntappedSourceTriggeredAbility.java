package mage.abilities.common;

import mage.constants.Zone;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.game.Game;
import mage.game.events.GameEvent;

/**
 *
 * @author Fenhl
 */
public class BecomesUntappedSourceTriggeredAbility extends TriggeredAbilityImpl {
    public BecomesUntappedSourceTriggeredAbility(Effect effect, boolean isOptional) {
        super(Zone.BATTLEFIELD, effect, isOptional);
    }

    public BecomesUntappedSourceTriggeredAbility(Effect effect) { super(Zone.BATTLEFIELD, effect); }

    public BecomesUntappedSourceTriggeredAbility(final BecomesUntappedSourceTriggeredAbility ability) { super(ability); }

    @Override
    public BecomesUntappedSourceTriggeredAbility copy() { return new BecomesUntappedSourceTriggeredAbility(this); }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.UNTAPPED;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) { return event.getTargetId().equals(sourceId); }

    @Override
    public String getRule() { return "When {this} becomes untapped, " + super.getRule(); }
}
