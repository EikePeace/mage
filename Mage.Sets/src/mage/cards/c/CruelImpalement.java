package mage.cards.c;

import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class CruelImpalement extends CardImpl {
    public CruelImpalement(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{B}");

        // Target creature gets -4/-4 until end of turn.
        this.getSpellAbility().addEffect(new BoostTargetEffect(-4, -4, Duration.EndOfTurn));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
    }

    public CruelImpalement (final CruelImpalement card){
        super(card);
    }

    @Override
    public CruelImpalement copy(){
        return new CruelImpalement(this);
    }
}
