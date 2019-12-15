package mage.cards.c;

import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.effects.common.SacrificeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.target.TargetPlayer;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class ControversialExperiment extends CardImpl {
    public ControversialExperiment(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{B}");

        this.getSpellAbility().addEffect(new SacrificeEffect(StaticFilters.FILTER_PERMANENT_CREATURE, 1, "Target player"));
        this.getSpellAbility().addTarget(new TargetPlayer());
        this.getSpellAbility().addEffect(new RechargeEffect());
    }

    public ControversialExperiment(final ControversialExperiment card){
        super(card);
    }

    @Override
    public ControversialExperiment copy(){
        return new ControversialExperiment(this);
    }
}
