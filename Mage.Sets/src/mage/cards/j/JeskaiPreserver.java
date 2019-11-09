package mage.cards.j;

import mage.MageInt;
import mage.abilities.keyword.FlyingAbility;
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
public final class JeskaiPreserver extends CardImpl {
    public JeskaiPreserver(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}");
        this.subtype.add(SubType.BIRD);
        this.subtype.add(SubType.MONK);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(new ProwessAbility());
    }

    public JeskaiPreserver(final JeskaiPreserver card){
        super(card);
    }

    @Override
    public JeskaiPreserver copy() {
        return new JeskaiPreserver(this);
    }
}
