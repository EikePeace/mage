package mage.cards.s;

import mage.abilities.costs.common.PayVariableLifeCost;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.GetXValue;
import mage.abilities.dynamicvalue.common.SignInversionDynamicValue;
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
public final class SiphonEssence extends CardImpl {
    public SiphonEssence(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{B}{B}");

        // As an additional cost to cast Siphon Essence, pay X life.
        this.getSpellAbility().addCost(new PayVariableLifeCost(true));

        // Target creature gets -X/-X until end of turn.
        DynamicValue xValue = new SignInversionDynamicValue(GetXValue.instance);
        this.getSpellAbility().addEffect(new BoostTargetEffect(xValue, xValue, Duration.EndOfTurn));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
    }

    public SiphonEssence(final SiphonEssence card){
        super(card);
    }

    @Override
    public SiphonEssence copy(){
        return new SiphonEssence(this);
    }
}
