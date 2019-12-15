package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.DiesTriggeredAbility;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SunfeatherSwallow extends CardImpl {

    public SunfeatherSwallow(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}");
        this.subtype.add(SubType.BIRD);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(FlyingAbility.getInstance());

        // When Sunfeather Swallow dies, you gain 3 life.
        this.addAbility(new DiesTriggeredAbility(new GainLifeEffect(3)));
    }

    public SunfeatherSwallow(final SunfeatherSwallow card){
        super(card);
    }

    @Override
    public SunfeatherSwallow copy(){
        return new SunfeatherSwallow(this);
    }
}
