package mage.cards.p;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
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

public final class PioneerResearcher extends CardImpl {
    public PioneerResearcher (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SCOUT);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);
        
        this.addAbility(new EntersBattlefieldTriggeredAbility(new RechargeEffect()));
    }

    public PioneerResearcher(final PioneerResearcher card){
        super(card);
    }

    @Override
    public PioneerResearcher copy(){
        return new PioneerResearcher(this);
    }
}
