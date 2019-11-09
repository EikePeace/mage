package mage.cards.r;

import mage.MageInt;
import mage.Mana;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.mana.SimpleManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;

import java.util.UUID;

public final class RagefireShaman extends CardImpl {

    public RagefireShaman(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}{G}");
        this.subtype.add(SubType.MINOTAUR);
        this.subtype.add(SubType.SHAMAN);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        this.addAbility(HasteAbility.getInstance());

        // {T}: Add {R}{G}.
        this.addAbility(new SimpleManaAbility(Zone.BATTLEFIELD, new Mana(1, 1, 0, 0, 0, 0, 0 , 0), new TapSourceCost()));
    }

    public RagefireShaman(final RagefireShaman card){
        super(card);
    }

    @Override
    public RagefireShaman copy(){
        return new RagefireShaman(this);
    }

}
