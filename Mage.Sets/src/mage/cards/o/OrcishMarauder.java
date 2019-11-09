package mage.cards.o;

import mage.MageInt;
import mage.abilities.keyword.BattleCryAbility;
import mage.abilities.keyword.HasteAbility;
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
public final class OrcishMarauder extends CardImpl {
    public OrcishMarauder(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}");
        this.subtype.add(SubType.ORC);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(2);
        this.power = new MageInt(2);

        this.addAbility(HasteAbility.getInstance());
        this.addAbility(new BattleCryAbility());
    }

    public OrcishMarauder(final OrcishMarauder card){
        super(card);
    }

    @Override
    public OrcishMarauder copy(){
        return new OrcishMarauder(this);
    }
}
