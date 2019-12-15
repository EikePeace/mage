package mage.cards.c;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class CanisterCourier extends CardImpl {
    public CanisterCourier(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ARTIFICER);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(new EntersBattlefieldTriggeredAbility(new RechargeEffect()));
    }

    public CanisterCourier(final CanisterCourier card){
        super(card);
    }

    public CanisterCourier copy(){
        return new CanisterCourier(this);
    }
}
