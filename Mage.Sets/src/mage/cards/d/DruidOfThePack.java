package mage.cards.d;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.replacement.CreateTwiceThatManyTokensEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class DruidOfThePack extends CardImpl {
    public DruidOfThePack(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{G}{W}");
        this.subtype.add(SubType.ELF, SubType.DRUID);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // If an effect would create one or more tokens under your control, it creates twice that many of those tokens instead.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new CreateTwiceThatManyTokensEffect()));
    }

    public DruidOfThePack(final DruidOfThePack card){
        super(card);
    }

    @Override
    public DruidOfThePack copy(){
        return new DruidOfThePack(this);
    }
}
