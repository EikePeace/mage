package mage.cards.j;

import mage.MageInt;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public class JeskaiWanderer extends CardImpl {
    public JeskaiWanderer(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.MONK);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        this.addAbility(new ProwessAbility());
    }

    public JeskaiWanderer(final JeskaiWanderer card){
        super(card);
    }

    @Override
    public JeskaiWanderer copy(){
        return new JeskaiWanderer(this);
    }
}
