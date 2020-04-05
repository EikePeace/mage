package mage.cards.n;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.ApplyCountersEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.counter.AddCountersTargetEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.counters.CounterType;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.Predicates;
import mage.game.permanent.token.GoatToken;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class NaakiShepherd extends CardImpl {

    private static final FilterCreaturePermanent filterAnimal = new FilterCreaturePermanent("Boar, Goat, Horse, Ox, or Sheep");
    static {
        filterAnimal.add(Predicates.or(
                SubType.BOAR.getPredicate(),
                SubType.GOAT.getPredicate(),
                SubType.HORSE.getPredicate(),
                SubType.OX.getPredicate(),
                SubType.SHEEP.getPredicate()
                ));
    }

    public NaakiShepherd(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.FARMER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        //When Naaki Shepherd enters the battlefield, create three 0/1 white Goat creature tokens.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new CreateTokenEffect(new GoatToken(), 3)));
        Ability ability = new SimpleActivatedAbility(new AddCountersTargetEffect(CounterType.P1P1.createInstance(1)), new TapSourceCost());
        ability.addTarget(new TargetCreaturePermanent(filterAnimal));
        this.addAbility(ability);
    }

    public NaakiShepherd(final NaakiShepherd card) {
        super(card);
    }

    @Override
    public NaakiShepherd copy() {
        return new NaakiShepherd(this);
    }
}
