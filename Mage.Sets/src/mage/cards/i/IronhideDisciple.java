package mage.cards.i;

import mage.MageInt;
import mage.abilities.keyword.ProwessAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public class IronhideDisciple extends CardImpl {
    public IronhideDisciple(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}{R}");
        this.subtype.add(SubType.MINOTAUR);
        this.subtype.add(SubType.MONK);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        this.addAbility(TrampleAbility.getInstance());
        this.addAbility(new ProwessAbility());
    }

    public IronhideDisciple(final IronhideDisciple card){
        super(card);
    }

    @Override
    public IronhideDisciple copy(){
        return new IronhideDisciple(this);
    }
}
