package mage.cards.d;

import mage.MageInt;
import mage.abilities.common.DealtDamageAndDiedTriggeredAbility;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.counters.CounterType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class DuskbladeChampion extends CardImpl {
    public DuskbladeChampion(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}{B}");
        this.subtype.add(SubType.VAMPIRE, SubType.KNIGHT);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(FirstStrikeAbility.getInstance());
        this.addAbility(LifelinkAbility.getInstance());

        // Whenever a creature dealt damage by Duskblade Champion this turn dies, put a +1/+1 counter on Duskblade Champion.
        this.addAbility(new DealtDamageAndDiedTriggeredAbility(new AddCountersSourceEffect(CounterType.P1P1.createInstance()), false));
    }

    public DuskbladeChampion(final DuskbladeChampion card){
        super(card);
    }

    @Override
    public DuskbladeChampion copy(){
        return new DuskbladeChampion(this);
    }
}
