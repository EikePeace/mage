package mage.cards.f;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepTargetEffect;
import mage.abilities.effects.common.TapTargetEffect;
import mage.abilities.keyword.FlashAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetOpponentsCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class FrostDrake extends CardImpl {
    public FrostDrake(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{U}{U}");
        this.subtype.add(SubType.ELEMENTAL, SubType.DRAKE);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Flash
        this.addAbility(FlashAbility.getInstance());
        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // When Frost Drake enters the battlefield, tap target creature you don't control.
        // That creature doesn't untap during its controller's next untap step.
        Ability ability = new EntersBattlefieldTriggeredAbility(new TapTargetEffect(), false);
        ability.addEffect(new DontUntapInControllersNextUntapStepTargetEffect("That creature"));
        ability.addTarget(new TargetOpponentsCreaturePermanent());
        this.addAbility(ability);
    }

    public FrostDrake(final FrostDrake card){
        super(card);
    }

    @Override
    public FrostDrake copy(){
        return new FrostDrake(this);
    }
}
