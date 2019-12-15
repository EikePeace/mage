package mage.cards.g;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.decorator.ConditionalInterveningIfTriggeredAbility;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetAnyTarget;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class GoblinPyromaniac extends CardImpl {
    private static final String staticText = "<i>Morbid</i> &mdash; When {this} enters the battlefield, if a creature died this turn, {this} deals 1 damage to any target.";

    public GoblinPyromaniac (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.GOBLIN, SubType.SHAMAN);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Morbid - When Goblin Pyromaniac enters the battlefield, if a creature died this turn, Goblin Pyromaniac deals 1 damage to any target.
        TriggeredAbility damageAbility = new EntersBattlefieldTriggeredAbility(new DamageTargetEffect(1));
        TriggeredAbility morbidAbility = new ConditionalInterveningIfTriggeredAbility(damageAbility, MorbidCondition.instance, staticText);
        morbidAbility.addTarget(new TargetAnyTarget());
        this.addAbility(morbidAbility);
    }

    public GoblinPyromaniac(final GoblinPyromaniac card){
        super(card);
    }

    @Override
    public GoblinPyromaniac copy(){
        return new GoblinPyromaniac(this);
    }
}
