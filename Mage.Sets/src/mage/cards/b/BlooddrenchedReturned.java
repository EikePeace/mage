package mage.cards.b;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.counters.CounterType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class BlooddrenchedReturned extends CardImpl {
    public BlooddrenchedReturned(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}{R}");
        this.subtype.add(SubType.ZOMBIE, SubType.WARRIOR);

        this.power = new MageInt(3);
        this.toughness = new MageInt(1);

        // First Strike
        this.addAbility(FirstStrikeAbility.getInstance());

        // Morbid - Blooddrenched Returned enters the battlefield with two +1/+1 counters on it if a creature died this turn.
        this.addAbility(new EntersBattlefieldAbility(new ConditionalOneShotEffect(
                new AddCountersSourceEffect(CounterType.P1P1.createInstance(2)), MorbidCondition.instance, "")));
    }

    public BlooddrenchedReturned(final BlooddrenchedReturned card){
        super(card);
    }

    @Override
    public BlooddrenchedReturned copy(){
        return new BlooddrenchedReturned(this);
    }
}
