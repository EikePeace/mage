package mage.cards.w;

import mage.abilities.effects.common.DamageAllEffect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class WakeOfFlames extends CardImpl {
    public WakeOfFlames(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{R}{R}");

        this.getSpellAbility().addEffect(new DamageAllEffect(2, new FilterCreaturePermanent()));
        this.getSpellAbility().addEffect(new ScryEffect(1));
    }

    public WakeOfFlames(final WakeOfFlames card){
        super(card);
    }

    @Override
    public WakeOfFlames copy(){
        return new WakeOfFlames(this);
    }
}
