package mage.cards.s;

import mage.MageInt;
import mage.abilities.keyword.DoubleStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SavageSwordsman extends CardImpl {
    public SavageSwordsman(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{R}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.BERSERKER);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(DoubleStrikeAbility.getInstance());
    }

    public SavageSwordsman(final SavageSwordsman card){
        super(card);
    }

    @Override
    public SavageSwordsman copy(){
        return new SavageSwordsman(this);
    }
}
