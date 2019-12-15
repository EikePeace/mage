package mage.cards.c;

import mage.MageInt;
import mage.abilities.common.BeginningOfEndStepTriggeredAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.SacrificeSourceUnlessConditionEffect;
import mage.abilities.keyword.HasteAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class ConsumingHorde extends CardImpl {

    public ConsumingHorde (UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}{R}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        this.addAbility(HasteAbility.getInstance());

        // Morbid - At the beginning of your end step, sacrifice Consuming Horde unless a creature died this turn.
        Effect effect = new SacrificeSourceUnlessConditionEffect(MorbidCondition.instance);
        effect.setText("sacrifice {this} unless a creature died this turn.");
        this.addAbility(new BeginningOfEndStepTriggeredAbility(effect, TargetController.YOU, false));
    }

    public ConsumingHorde(final ConsumingHorde card){
        super (card);
    }

    @Override
    public ConsumingHorde copy(){
        return new ConsumingHorde(this);
    }

}
