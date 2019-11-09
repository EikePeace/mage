package mage.cards.f;

import mage.abilities.effects.common.DestroyAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class FinalVerdict extends CardImpl {
    public FinalVerdict(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{W}{W}");

        this.getSpellAbility().addEffect(new DestroyAllEffect(StaticFilters.FILTER_PERMANENT_CREATURES));
    }

    public FinalVerdict(final FinalVerdict card){
        super(card);
    }

    @Override
    public FinalVerdict copy(){
        return new FinalVerdict(this);
    }
}
