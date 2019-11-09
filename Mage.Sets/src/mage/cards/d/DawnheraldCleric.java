package mage.cards.d;

import mage.MageInt;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class DawnheraldCleric extends CardImpl {
    public DawnheraldCleric(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.CLERIC);

        this.power = new MageInt(2);
        this.toughness = new MageInt(4);

        this.addAbility(LifelinkAbility.getInstance());
    }

    public DawnheraldCleric(final DawnheraldCleric card){
        super(card);
    }

    @Override
    public DawnheraldCleric copy(){
        return new DawnheraldCleric(this);
    }
}
