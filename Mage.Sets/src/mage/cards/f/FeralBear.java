package mage.cards.f;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
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
public final class FeralBear extends CardImpl {

    public FeralBear(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}");
        this.subtype.add(SubType.BEAR);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Morbid -
        this.addAbility(new EntersBattlefieldAbility(new ConditionalOneShotEffect(
                new AddCountersSourceEffect(CounterType.P1P1.createInstance(1)), MorbidCondition.instance, "")));
    }

    public FeralBear(final FeralBear card){
        super(card);
    }

    @Override
    public FeralBear copy(){
        return new FeralBear(this);
    }
}
