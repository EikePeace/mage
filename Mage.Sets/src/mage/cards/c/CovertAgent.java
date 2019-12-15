package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.DealsCombatDamageToAPlayerTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DrawDiscardControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class CovertAgent extends CardImpl {
    public CovertAgent (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.HUMAN, SubType.ROGUE);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        Effect effect = new DrawDiscardControllerEffect(1, 1);
        effect.setText("you may draw a card. If you do, discard a card");
        Ability ability = new DealsCombatDamageToAPlayerTriggeredAbility(effect, true);
        this.addAbility(ability);
    }

    public CovertAgent(final CovertAgent card){
        super(card);
    }

    @Override
    public CovertAgent copy(){
        return new CovertAgent(this);
    }
}
