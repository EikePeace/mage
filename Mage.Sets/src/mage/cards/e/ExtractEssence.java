package mage.cards.e;

import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.effects.common.RechargeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class ExtractEssence extends CardImpl {
    public ExtractEssence(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{B}{B}");

        // Destroy target creature
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addEffect(new DestroyTargetEffect());
        this.getSpellAbility().addEffect(new RechargeEffect());
    }

    public ExtractEssence(final ExtractEssence card){
        super(card);
    }

    @Override
    public ExtractEssence copy(){
        return new ExtractEssence(this);
    }
}
