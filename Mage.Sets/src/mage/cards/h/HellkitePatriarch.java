package mage.cards.h;

import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ColoredManaCost;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public class HellkitePatriarch extends CardImpl {

    public HellkitePatriarch(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{R}{R}");
        this.subtype.add(SubType.DRAGON);

        this.power = new MageInt(5);
        this.toughness = new MageInt(5);

        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(TrampleAbility.getInstance());
        this.addAbility(HasteAbility.getInstance());
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new BoostSourceEffect(1, 0, Duration.EndOfTurn), new ColoredManaCost(ColoredManaSymbol.R)));
    }

    public HellkitePatriarch(final HellkitePatriarch card){
        super(card);
    }

    @Override
    public HellkitePatriarch copy(){
        return new HellkitePatriarch(this);
    }
}
