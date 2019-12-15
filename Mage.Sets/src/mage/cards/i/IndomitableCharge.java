package mage.cards.i;

import mage.abilities.effects.Effect;
import mage.abilities.effects.common.combat.MustBeBlockedByAtLeastOneTargetEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class IndomitableCharge extends CardImpl {
    public IndomitableCharge(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{G}{G}");

        // Target creature you control must be blocked this turn if able.
        this.getSpellAbility().addEffect(new MustBeBlockedByAtLeastOneTargetEffect(Duration.EndOfTurn));
        this.getSpellAbility().addTarget(new TargetControlledCreaturePermanent());

        // Creatures you control get +2/+2 until end of turn.
        this.getSpellAbility().addEffect(new BoostControlledEffect(2, 2, Duration.EndOfTurn));
    }

    public IndomitableCharge(final IndomitableCharge card){
        super(card);
    }

    @Override
    public IndomitableCharge copy(){
        return new IndomitableCharge(this);
    }
}
