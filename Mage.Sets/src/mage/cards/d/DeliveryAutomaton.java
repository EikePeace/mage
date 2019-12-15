package mage.cards.d;

import mage.MageInt;
import mage.abilities.common.DiesTriggeredAbility;
import mage.abilities.effects.common.RechargeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class DeliveryAutomaton extends CardImpl {
    public DeliveryAutomaton (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{1}");
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(new DiesTriggeredAbility(new RechargeEffect()));
    }

    public DeliveryAutomaton(final DeliveryAutomaton card){
        super(card);
    }

    @Override
    public DeliveryAutomaton copy(){
        return new DeliveryAutomaton(this);
    }
}
