package mage.cards.a;

import mage.MageInt;
import mage.abilities.common.DealsCombatDamageToAPlayerTriggeredAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.dynamicvalue.common.StaticValue;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.LookLibraryAndPickControllerEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.FilterCard;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class AuspicialSphinx extends CardImpl {

    public AuspicialSphinx(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}{U}");
        this.subtype.add(SubType.SPHINX);

        this.power = new MageInt(3);
        this.toughness = new MageInt(5);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // When Auspicial Sphinx enters the battlefield or deals combat damage to a player,
        // look at the top three cards of your library. Put one of them into your hand and
        // the rest on the bottom of your library in any order.
        Effect effect = new LookLibraryAndPickControllerEffect(new StaticValue(3), false, new StaticValue(1), new FilterCard(), Zone.LIBRARY, false, false);

        this.addAbility(new EntersBattlefieldTriggeredAbility(effect, false));

        this.addAbility(new DealsCombatDamageToAPlayerTriggeredAbility(new LookLibraryAndPickControllerEffect
                (new StaticValue(3), false, new StaticValue(1), new FilterCard(), Zone.LIBRARY, false, false), false));
    }


    public AuspicialSphinx(final AuspicialSphinx card){
        super(card);
    }

    @Override
    public AuspicialSphinx copy(){
        return new AuspicialSphinx(this);
    }
}
