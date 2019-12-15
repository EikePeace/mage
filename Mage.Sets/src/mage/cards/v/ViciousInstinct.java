package mage.cards.v;

import mage.abilities.effects.Effect;
import mage.abilities.effects.common.FightTargetsEffect;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class ViciousInstinct extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creature you don't control");

    static {
        filter.add(new ControllerPredicate(TargetController.NOT_YOU));
    }

    public ViciousInstinct(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{4}{G}{G}");

        this.getSpellAbility().addEffect(new BoostTargetEffect(2, 2));
        this.getSpellAbility().addTarget(new TargetControlledCreaturePermanent());
        Effect untapEffect = new UntapTargetEffect();
        untapEffect.setText("Untap it.");
        this.getSpellAbility().addEffect(untapEffect);
        Effect fightEffect = new FightTargetsEffect();
        fightEffect.setText("It fights target creature you don't control");
        this.getSpellAbility().addEffect(fightEffect);
        this.getSpellAbility().addTarget(new TargetCreaturePermanent(filter));
    }

    public ViciousInstinct(final ViciousInstinct card){
        super(card);
    }

    @Override
    public ViciousInstinct copy(){
        return new ViciousInstinct(this);
    }
}
