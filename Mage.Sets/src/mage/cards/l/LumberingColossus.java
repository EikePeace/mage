package mage.cards.l;

import mage.MageInt;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class LumberingColossus extends CardImpl {
    public LumberingColossus(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{7}");
        this.subtype.add(SubType.GOLEM);

        this.power = new MageInt(8);
        this.toughness = new MageInt(5);

        this.addAbility(TrampleAbility.getInstance());
    }

    public LumberingColossus(final LumberingColossus card){
        super(card);
    }

    @Override
    public LumberingColossus copy(){
        return new LumberingColossus(this);
    }
}
