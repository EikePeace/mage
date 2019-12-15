package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.ExileTargetEffect;
import mage.abilities.keyword.FlashAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetAttackingOrBlockingCreature;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class AngelicVindicator extends CardImpl {

    public AngelicVindicator(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{W}{W}");
        this.subtype.add(SubType.ANGEL);

        this.power = new MageInt(5);
        this.toughness = new MageInt(5);

        // Flash
        this.addAbility(FlashAbility.getInstance());

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // When Angelic Vindicator enters the battlefield,
        // you may exile target attacking or blocking creature.
        Ability ability = new EntersBattlefieldTriggeredAbility(new ExileTargetEffect(), true);
        ability.addTarget(new TargetAttackingOrBlockingCreature());
        this.addAbility(ability);
    }

    public AngelicVindicator(final AngelicVindicator card){
        super(card);
    }

    @Override
    public AngelicVindicator copy(){
        return new AngelicVindicator(this);
    }
}
