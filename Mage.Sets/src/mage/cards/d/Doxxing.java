package mage.cards.d;
import java.util.UUID;

import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.DrawCardOpponentTriggeredAbility;
import mage.abilities.common.UploadedCardIntoHandTriggeredAbility;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.target.common.TargetAnyTarget;

/**
 *
 * @author RogueAustralian
 */
public final class Doxxing extends CardImpl {

    public Doxxing(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{3}{R}");

        // Whenever you put an uploaded card into your hand, Doxxing deals 2 damage to any target
        this.addAbility(new DoxxingAbility());
    }

    public Doxxing(final Doxxing card) {
        super(card);
    }

    @Override
    public Doxxing copy() {
        return new Doxxing(this);
    }
}

class DoxxingAbility extends TriggeredAbilityImpl {

    private static final String abilityText = "Whenever you put an uploaded card into your hand, {this} deals 2 damage to any target";

    DoxxingAbility() {
        super(Zone.BATTLEFIELD, new DamageTargetEffect(2), false);
        TargetAnyTarget target = new TargetAnyTarget();
        this.addTarget(target);
    }

    DoxxingAbility(DoxxingAbility ability) {
        super(ability);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == EventType.UPLOAD_CARD_INTO_HAND;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        return true;
    }

    @Override
    public DoxxingAbility copy() {
        return new DoxxingAbility(this);
    }

    @Override
    public String getRule() {
        return abilityText;
    }
}