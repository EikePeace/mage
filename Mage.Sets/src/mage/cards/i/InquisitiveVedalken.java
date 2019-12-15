package mage.cards.i;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class InquisitiveVedalken extends CardImpl {
    public InquisitiveVedalken (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.VEDALKEN, SubType.WIZARD);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        // When Inquisitive Vedalken enters the battlefield, scry 2.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new ScryEffect(2)));
    }

    public InquisitiveVedalken(final InquisitiveVedalken card) {
        super(card);
    }

    @Override
    public InquisitiveVedalken copy(){
        return new InquisitiveVedalken(this);
    }
}
