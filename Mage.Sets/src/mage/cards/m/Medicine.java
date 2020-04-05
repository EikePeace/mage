package mage.cards.m;

import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.abilities.effects.common.counter.AddCountersTargetEffect;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.counters.CounterType;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.permanent.CounterPredicate;
import mage.target.common.TargetControlledCreaturePermanent;

import javax.swing.text.ZoneView;
import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Medicine extends CardImpl {
    private static final FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent("creatures you control with +1/+1 counters on them");

    static {
        filter.add(new CounterPredicate(CounterType.P1P1));
    }
    public Medicine(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{W}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Put a +1/+1 counter on target creature you control.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II,
                new AddCountersTargetEffect(CounterType.P1P1.createInstance(2)),
                new TargetControlledCreaturePermanent());
        //{DISCOVER} — Creatures you control with +1/+1 counters on them have lifelink.
        discoveryAbility.addDiscoverAbility(this, new SimpleStaticAbility(Zone.BATTLEFIELD,
                new GainAbilityAllEffect(LifelinkAbility.getInstance(), Duration.WhileOnBattlefield, filter)));
        this.addAbility(discoveryAbility);
    }


    public Medicine(final Medicine card) {
        super(card);
    }

    @Override
    public Medicine copy() {
        return new Medicine(this);
    }
}

