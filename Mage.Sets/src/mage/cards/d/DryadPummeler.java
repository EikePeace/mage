package mage.cards.d;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldControlledTriggeredAbility;
import mage.abilities.effects.common.continuous.GainAbilitySourceEffect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.counters.CounterType;
import mage.filter.FilterPermanent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class DryadPummeler extends CardImpl {
    private static final FilterPermanent filter = new FilterPermanent("a Forest");
    static {
        filter.add(SubType.FOREST.getPredicate());
    }

    public DryadPummeler(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{G}");
        this.subtype.add(SubType.DRYAD);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);

        // Whenever a Forest enters the battlefield under your control, put a +1/+1 counter on Dryad Pummeler. It gains trample until end of turn.
        Ability ability = new EntersBattlefieldControlledTriggeredAbility(new AddCountersSourceEffect(CounterType.P1P1.createInstance()), filter);
        ability.addEffect(new GainAbilitySourceEffect(TrampleAbility.getInstance(), Duration.EndOfTurn));
        this.addAbility(ability);
    }

    public DryadPummeler(final DryadPummeler card) { super(card); }

    @Override
    public DryadPummeler copy() { return new DryadPummeler(this); }
}
