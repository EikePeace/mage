package mage.cards.d;

import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.common.FilterSpellOrPermanent;
import mage.target.common.TargetSpellOrPermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class DivertAggression extends CardImpl {
    private static final FilterSpellOrPermanent filter = new FilterSpellOrPermanent("spell or creature");

    static {
        filter.setPermanentFilter(new FilterCreaturePermanent());
    }

    public DivertAggression(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{W}{U}");

        // Return target spell or creature to its owner's hand
        this.getSpellAbility().addTarget(new TargetSpellOrPermanent(1, 1, filter, false));
        this.getSpellAbility().addEffect(new ReturnToHandTargetEffect());

        // You gain 3 life.
        this.getSpellAbility().addEffect(new GainLifeEffect(3));
    }

    public DivertAggression(final DivertAggression card) {
        super(card);
    }

    @Override
    public DivertAggression copy() {
        return new DivertAggression(this);
    }
}
