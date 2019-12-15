package mage.cards.c;

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
public final class ColossalWurm extends CardImpl {
    public ColossalWurm(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{G}{G}");
        this.subtype.add(SubType.WURM);

        this.power = new MageInt(6);
        this.toughness = new MageInt(5);

        this.addAbility(TrampleAbility.getInstance());
    }

    public ColossalWurm(final ColossalWurm card){
        super(card);
    }

    @Override
    public ColossalWurm copy(){
        return new ColossalWurm(this);
    }
}
