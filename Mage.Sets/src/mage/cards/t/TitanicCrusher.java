package mage.cards.t;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.common.FightTargetSourceEffect;
import mage.abilities.effects.common.continuous.SetPowerToughnessSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class TitanicCrusher extends CardImpl {
    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creature you don't control");

    static {
        filter.add(new ControllerPredicate(TargetController.NOT_YOU));
    }

    public TitanicCrusher(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{R}{G}");

        this.subtype.add(SubType.GIANT);
        this.power = new MageInt(0);
        this.toughness = new MageInt(0);

        DynamicValue controlledLands = new PermanentsOnBattlefieldCount(StaticFilters.FILTER_CONTROLLED_PERMANENT_LANDS);

        // Titanic Crusher's power and toughness are each equal to the number of lands you control.
        this.addAbility(new SimpleStaticAbility(Zone.ALL, new SetPowerToughnessSourceEffect(controlledLands, Duration.EndOfGame)));

        // When Titanic Crusher enters the battlefield, it fights target creature you don't control.
        Ability ability = new EntersBattlefieldTriggeredAbility(
                new FightTargetSourceEffect().setText("it fights target creature you don't control"));
        ability.addTarget(new TargetCreaturePermanent(filter));
        this.addAbility(ability);
    }

    public TitanicCrusher(final TitanicCrusher card){
        super(card);
    }

    public TitanicCrusher copy(){
        return new TitanicCrusher(this);
    }
}
