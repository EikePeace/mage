package mage.cards.y;

import mage.abilities.Mode;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.FightTargetsEffect;
import mage.abilities.effects.common.counter.AddCountersTargetEffect;
import mage.abilities.keyword.FlashbackAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.constants.TimingRule;
import mage.counters.CounterType;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterCreaturePermanent;
import mage.target.TargetPermanent;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class YemmasMandate extends CardImpl {
    private static final FilterPermanent filter = new FilterCreaturePermanent("creature you don't control");

    static {
        filter.add(TargetController.NOT_YOU.getControllerPredicate());
    }

    public YemmasMandate(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{G}");

        // Choose one —
        this.getSpellAbility().getModes().setMinModes(1);
        this.getSpellAbility().getModes().setMaxModes(1);

        // • Put three +1/+1 counters on target creature.
        this.getSpellAbility().addEffect(new AddCountersTargetEffect(CounterType.P1P1.createInstance(3)));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());

        // • Target creature you control fights target creature you don't control.
        Mode mode = new Mode();
        mode.addEffect(new FightTargetsEffect());
        mode.addTarget(new TargetControlledCreaturePermanent());
        mode.addTarget(new TargetPermanent(filter));
        this.getSpellAbility().getModes().addMode(mode);

        // Flashback {4}{G}
        this.addAbility(new FlashbackAbility(new ManaCostsImpl("{4}{G}"), TimingRule.SORCERY));
    }

    public YemmasMandate(final YemmasMandate card) { super(card); }

    @Override
    public YemmasMandate copy() { return new YemmasMandate(this); }
}
