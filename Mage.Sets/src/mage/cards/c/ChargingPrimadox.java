package mage.cards.c;

import mage.MageInt;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.GainAbilitySourceEffect;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.IndestructibleAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class ChargingPrimadox extends CardImpl {
    public ChargingPrimadox(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{G}{G}");
        this.subtype.add(SubType.BEAST);

        this.power = new MageInt(7);
        this.toughness = new MageInt(6);

        this.addAbility(TrampleAbility.getInstance());
        this.addAbility(HasteAbility.getInstance());

        Effect effect = new GainAbilitySourceEffect(IndestructibleAbility.getInstance(), Duration.EndOfTurn);
        this.addAbility(new AttacksTriggeredAbility(effect, false));
    }

    public ChargingPrimadox(final ChargingPrimadox card){
        super(card);
    }

    @Override
    public ChargingPrimadox copy(){
        return new ChargingPrimadox(this);
    }
}
