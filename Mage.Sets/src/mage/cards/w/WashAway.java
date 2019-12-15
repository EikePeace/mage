package mage.cards.w;

import mage.abilities.effects.Effect;
import mage.abilities.effects.common.PutOnLibraryTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class WashAway extends CardImpl {
    public WashAway(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{4}{U}{U}");

        // Put two target creatures on top of their owners' libraries.
        Effect effect = new PutOnLibraryTargetEffect(new PutOnLibraryTargetEffect(true));
        effect.setText("Put up to two target creatures on top of their owners' libraries.");
        this.getSpellAbility().addEffect(effect);
        this.getSpellAbility().addTarget(new TargetCreaturePermanent(0, 2, StaticFilters.FILTER_PERMANENT_CREATURE, false));
    }

    public WashAway(final WashAway card) {
        super(card);
    }

    @Override
    public WashAway copy(){
        return new WashAway(this);
    }
}
