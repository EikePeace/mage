package mage.cards.e;

import mage.MageInt;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.keyword.IndestructibleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class EkebramChroniclerOfAges extends CardImpl {
    public EkebramChroniclerOfAges(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.GOD);
        this.color.setBlue(true);

        this.nightCard = true;
        this.transformable = true;

        this.power = new MageInt(3);
        this.toughness = new MageInt(5);

        // Indestructible
        this.addAbility(IndestructibleAbility.getInstance());

        // Whenever a creature you control becomes untapped, draw a card.
        this.addAbility(new EkebramTriggeredAbility());
    }

    public EkebramChroniclerOfAges(final EkebramChroniclerOfAges card) { super(card); }

    @Override
    public EkebramChroniclerOfAges copy() { return new EkebramChroniclerOfAges(this); }
}

class EkebramTriggeredAbility extends TriggeredAbilityImpl {
    public EkebramTriggeredAbility() {
        super(Zone.BATTLEFIELD, new DrawCardSourceControllerEffect(1));
    }

    public EkebramTriggeredAbility(final EkebramTriggeredAbility ability) { super(ability); }

    @Override
    public EkebramTriggeredAbility copy() { return new EkebramTriggeredAbility(this); }

    @Override
    public boolean checkEventType(GameEvent event, Game game) { return event.getType() == GameEvent.EventType.UNTAPPED; }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        Permanent permanent = game.getPermanent(event.getTargetId());
        return StaticFilters.FILTER_PERMANENT_CREATURE_CONTROLLED.match(permanent, game);
    }

    @Override
    public String getRule() { return "Whenever a creature you control becomes tapped, draw a card."; }
}
