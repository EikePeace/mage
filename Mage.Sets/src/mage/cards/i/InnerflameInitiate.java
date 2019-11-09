package mage.cards.i;

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
public final class InnerflameInitiate extends CardImpl {
    public InnerflameInitiate(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.MONK);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(new ProwessAbility());
    }

    public InnerflameInitiate(final InnerflameInitiate card){
        super(card);
    }

    @Override
    public InnerflameInitiate copy(){
        return new InnerflameInitiate(this);
    }
}
