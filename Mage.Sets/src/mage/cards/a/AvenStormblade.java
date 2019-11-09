package mage.cards.a;

import mage.MageInt;
import mage.abilities.keyword.BattleCryAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.b.BattleCry;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class AvenStormblade extends CardImpl {
    public AvenStormblade(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.BIRD);
        this.subtype.add(SubType.SOLDIER);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(new BattleCryAbility());
    }

    public AvenStormblade(final AvenStormblade card){
        super(card);
    }

    @Override
    public AvenStormblade copy() {
        return new AvenStormblade(this);
    }
}
