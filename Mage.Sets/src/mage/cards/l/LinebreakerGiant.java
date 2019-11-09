package mage.cards.l;

import mage.MageInt;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class LinebreakerGiant extends CardImpl {
    public LinebreakerGiant(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{R}{R}");
        this.subtype.add(SubType.GIANT);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        this.addAbility(new MenaceAbility());
    }

    public LinebreakerGiant(final LinebreakerGiant card){
        super(card);
    }

    @Override
    public LinebreakerGiant copy(){
        return new LinebreakerGiant(this);
    }
}
