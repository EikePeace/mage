package mage.cards.n;

import mage.abilities.effects.common.DontUntapInControllersNextUntapStepTargetEffect;
import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.effects.common.TapTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class NeuralSerum extends CardImpl {
    public NeuralSerum (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{U}");

        // Tap target creature. It doesn't untap during its controller's next untap step.
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addEffect(new TapTargetEffect());
        this.getSpellAbility().addEffect(new DontUntapInControllersNextUntapStepTargetEffect("It"));

        // Recharge
        this.getSpellAbility().addEffect(new RechargeEffect());
    }

    public NeuralSerum(final NeuralSerum card){
        super(card);
    }

    @Override
    public NeuralSerum copy(){
        return new NeuralSerum(this);
    }
}
