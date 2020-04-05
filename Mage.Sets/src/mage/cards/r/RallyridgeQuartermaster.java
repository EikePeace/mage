package mage.cards.r;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ExileTargetEffect;
import mage.abilities.effects.common.ReturnToBattlefieldUnderOwnerControlTargetEffect;
import mage.abilities.keyword.FlashAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.predicate.Predicates;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class RallyridgeQuartermaster extends CardImpl {

    private static final FilterPermanent filter = new FilterPermanent("Equipment or Aura you control");

    static {
        filter.add(TargetController.YOU.getControllerPredicate());
        filter.add(Predicates.or(SubType.EQUIPMENT.getPredicate(), SubType.AURA.getPredicate()));
    }

    public RallyridgeQuartermaster(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[]{CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ARTIFICER);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
        this.addAbility(FlashAbility.getInstance());

        Ability rallyridgeQuartermasterAbility1 = new EntersBattlefieldTriggeredAbility(new ExileTargetEffect());
        rallyridgeQuartermasterAbility1.addTarget(new TargetPermanent(filter));
        rallyridgeQuartermasterAbility1.addEffect(new ReturnToBattlefieldUnderOwnerControlTargetEffect());


        Ability rallyridgeQuartermasterAbility2 = new RallyridgeQAbility(rallyridgeQuartermasterAbility1.getFirstTarget());
        this.addAbility(rallyridgeQuartermasterAbility1);
        this.addAbility(rallyridgeQuartermasterAbility2);
    }

    public RallyridgeQuartermaster(final RallyridgeQuartermaster card) {
        super(card);
    }

    @Override
    public RallyridgeQuartermaster copy() {
        return new RallyridgeQuartermaster(this);
    }
}


class RallyridgeQEffect extends OneShotEffect {
    public RallyridgeQEffect() {
        super(Outcome.Benefit);
    }

    public RallyridgeQEffect(final RallyridgeQEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent enchantment = game.getPermanent(source.getFirstTarget());
        if(enchantment != null) {
            source.addTarget(new TargetCreaturePermanent());
            Permanent creature = game.getPermanent(source.getTargets().get(2).getFirstTarget());
            if(creature != null) {
                enchantment.attachTo(creature.getId(), game);
                return true;
            }
        }
        return false;
    }

    @Override
    public Effect copy() {
        return new RallyridgeQEffect(this);

    }

}

class RallyridgeQAbility extends TriggeredAbilityImpl {
    private UUID card = null;

    public RallyridgeQAbility(UUID card) {
        super(Zone.BATTLEFIELD, new RallyridgeQEffect());
        this.card = card;
    }

    public RallyridgeQAbility(final RallyridgeQAbility ability) {
        super(ability);
        this.card = ability.card;
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ENTERS_THE_BATTLEFIELD;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        return event.getTargetId().equals(card);
    }

    @Override
    public TriggeredAbility copy() {
        return new RallyridgeQAbility(this);
    }

}
