package mage.abilities.common;

import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.target.targetpointer.FixedTarget;

/**
 *
 * @author RogueAustralian
 */

public class UploadedCardIntoHandTriggeredAbility extends TriggeredAbilityImpl {

    boolean setTargetPointer;

    public UploadedCardIntoHandTriggeredAbility(Effect effect, boolean optional, boolean setTargetPointer) {
        super(Zone.BATTLEFIELD, effect, optional);
        this.setTargetPointer = setTargetPointer;
    }

    public UploadedCardIntoHandTriggeredAbility(final UploadedCardIntoHandTriggeredAbility ability) {
        super(ability);
        this.setTargetPointer = ability.setTargetPointer;
    }

    @Override
    public UploadedCardIntoHandTriggeredAbility copy() {
        return new UploadedCardIntoHandTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.UPLOAD_CARD_INTO_HAND;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (game.getPlayer(this.getControllerId()).hasOpponent(event.getPlayerId(), game)) {
            return true;
        }
        return false;
    }

    @Override
    public String getRule() {
        return new StringBuilder("Whenever you put an uploaded card into your hand, ").append(super.getRule()).toString();
    }
}