package mage.cards.s;

import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.delayed.OnLeaveReturnExiledToBattlefieldAbility;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.ExileUntilSourceLeavesEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.filter.common.FilterNonlandPermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.target.TargetPermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SealOfJudgment extends CardImpl {

    private static final FilterNonlandPermanent filter = new FilterNonlandPermanent();

    static {
        filter.add(new ControllerPredicate(TargetController.OPPONENT));
    }

    public SealOfJudgment(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{W}");

        // When Seal of Judgment enters the Battlefield, exile target nonland permanent an opponent controls
        // until Seal of Judgment leaves the battlefield.
        Ability ability = new EntersBattlefieldTriggeredAbility(new ExileUntilSourceLeavesEffect(filter.getMessage()));
        ability.addTarget(new TargetPermanent(filter));
        ability.addEffect(new CreateDelayedTriggeredAbilityEffect(new OnLeaveReturnExiledToBattlefieldAbility()));
        this.addAbility(ability);

        // When Seal of Judgment enters the battlefield, you gain 3 life.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new GainLifeEffect(3)));
    }

    public SealOfJudgment(final SealOfJudgment card){
        super(card);
    }

    @Override
    public SealOfJudgment copy(){
        return new SealOfJudgment(this);
    }
}
