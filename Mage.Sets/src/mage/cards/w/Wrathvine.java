package mage.cards.w;

import mage.MageInt;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.HexproofAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class Wrathvine extends CardImpl {

    public Wrathvine(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}{G}");
        this.subtype.add(SubType.ELEMENTAL);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        this.addAbility(HasteAbility.getInstance());
        this.addAbility(HexproofAbility.getInstance());
    }

    public Wrathvine(final Wrathvine card){
        super(card);
    }

    @Override
    public Wrathvine copy(){
        return new Wrathvine(this);
    }

}
