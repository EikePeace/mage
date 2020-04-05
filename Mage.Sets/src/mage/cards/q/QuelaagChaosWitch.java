package mage.cards.q;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.DiesTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterCreatureOrPlaneswalkerPermanent;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.target.TargetPermanent;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

public final class QuelaagChaosWitch extends CardImpl {

    private static final FilterPermanent filter
            = new FilterCreatureOrPlaneswalkerPermanent("creature or planeswalker an opponent controls");

    static {
        filter.add(TargetController.OPPONENT.getControllerPredicate());
    }

    public QuelaagChaosWitch(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE},"{1}{R}{R}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.SPIDER, SubType.DEMON);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        this.addAbility(new QuelaagAttackAbility());
        Ability ability = new DiesTriggeredAbility(new DamageTargetEffect(2));
        ability.addTarget(new TargetPermanent(filter));
        this.addAbility(ability);
    }

    private QuelaagChaosWitch(final QuelaagChaosWitch card) {
        super(card);
    }

    @Override
    public QuelaagChaosWitch copy() {
        return new QuelaagChaosWitch(this);
    }
}

class QuelaagAttackAbility extends TriggeredAbilityImpl {

    QuelaagAttackAbility() {
        super(Zone.BATTLEFIELD, null);
    }

    private QuelaagAttackAbility(final QuelaagAttackAbility ability) {
        super(ability);
    }

    @Override
    public QuelaagAttackAbility copy() {
        return new QuelaagAttackAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ATTACKER_DECLARED;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (this.getSourceId().equals(event.getSourceId())) {
            this.getEffects().clear();
            Effect effect = new DamageTargetEffect(1);
            effect.setTargetPointer(new FixedTarget(game.getCombat().getDefenderId(event.getSourceId()), game));
            this.addEffect(effect);
            return true;
        }
        return false;
    }

    @Override
    public String getRule() {
        return "Whenever {this} attacks, it deals 1 damage to the player or permanent it's attacking.";
    }
}
