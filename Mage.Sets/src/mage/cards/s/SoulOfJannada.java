package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.Cost;
import mage.abilities.costs.common.ExileSourceFromGraveCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.counter.AddCountersTargetEffect;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SoulOfJannada extends CardImpl {

    public SoulOfJannada(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{G}{W}");
        this.subtype.add(SubType.AVATAR);

        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Lifelink
        this.addAbility(LifelinkAbility.getInstance());

        // {3}{G}{W}: Put three +1/+1 counters on target creature. Untap that creature.
        Effect countersEffect = new AddCountersTargetEffect(CounterType.P1P1.createInstance(3));
        Effect untapEffect = new UntapTargetEffect();
        untapEffect.setText("Untap that creature.");

        Ability battlefieldAbility = new SimpleActivatedAbility(countersEffect, new ManaCostsImpl("{3}{G}{W}"));
        battlefieldAbility.addTarget(new TargetCreaturePermanent());
        battlefieldAbility.addEffect(untapEffect);
        this.addAbility(battlefieldAbility);

        // {3}{G}{W}: Put three +1/+1 counters on target creature. Untap that creature.
        Ability graveyardAbility = new SimpleActivatedAbility(Zone.GRAVEYARD, countersEffect, new ManaCostsImpl("{3}{G}{W}"));
        graveyardAbility.addTarget(new TargetCreaturePermanent());
        graveyardAbility.addEffect(untapEffect);
        Cost cost = new ExileSourceFromGraveCost();
        cost.setText("Exile {this} from your graveyard");
        graveyardAbility.addCost(cost);
        this.addAbility(graveyardAbility);
    }

    public SoulOfJannada(final SoulOfJannada card){
        super(card);
    }

    @Override
    public SoulOfJannada copy() {
        return new SoulOfJannada(this);
    }
}
