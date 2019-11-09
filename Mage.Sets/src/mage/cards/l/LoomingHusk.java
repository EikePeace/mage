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
public final class LoomingHusk extends CardImpl {

    public LoomingHusk(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{B}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.GIANT);

        this.power = new MageInt(4);
        this.toughness = new MageInt(6);

        this.addAbility(new MenaceAbility());
    }

    public LoomingHusk(final LoomingHusk card){
        super(card);
    }

    @Override
    public LoomingHusk copy(){
        return new LoomingHusk(this);
    }

}
