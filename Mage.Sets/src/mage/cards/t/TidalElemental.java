package mage.cards.t;

import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.continuous.SwitchPowerToughnessSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class TidalElemental extends CardImpl {
    public TidalElemental(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");
        this.subtype.add(SubType.ELEMENTAL);

        this.power = new MageInt(1);
        this.toughness = new MageInt(3);

        this.addAbility(new SimpleActivatedAbility(new SwitchPowerToughnessSourceEffect(Duration.EndOfTurn), new ManaCostsImpl("{1}{U}")));
    }

    public TidalElemental(final TidalElemental card){
        super(card);
    }

    public TidalElemental copy(){
        return new TidalElemental(this);
    }
}
