
package mage.cards.d;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.condition.Condition;
import mage.abilities.costs.common.PayEnergyCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.counter.GetEnergyCountersControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterArtifactOrEnchantmentPermanent;
import mage.filter.common.FilterArtifactPermanent;
import mage.filter.common.FilterControlledArtifactPermanent;
import mage.filter.common.FilterInstantOrSorcerySpell;
import mage.game.permanent.token.DystopilithToken;
import mage.game.permanent.token.KarnConstructToken;
import mage.game.permanent.token.TokenImpl;
import mage.target.common.TargetAnyTarget;

/**
 *
 * @author RogueAustralian
 */
public final class Dystopilith extends CardImpl {
	private static final FilterPermanent filter = new FilterControlledArtifactPermanent();

	static {
//		filter.add(TargetController.YOU.getControllerPredicate());
	}
	private static final DynamicValue xValue = new PermanentsOnBattlefieldCount(filter);

	public Dystopilith(UUID ownerId, CardSetInfo setInfo) {
		super(ownerId,setInfo,new CardType[]{CardType.ARTIFACT},"{7}");


		//{T}: Create a 2/2 colorless construct token for each artifact you control
		Ability ability = new ConditionalActivatedAbility(Zone.BATTLEFIELD, new CreateTokenEffect(new DystopilithToken(), xValue), new TapSourceCost(), DystopilithCondition.instance);
		this.addAbility(ability);
	}

	public Dystopilith(final Dystopilith card) {
		super(card);
	}

	@Override
	public Dystopilith copy() {
		return new Dystopilith(this);
	}
}

enum DystopilithCondition implements Condition {
    instance;

    @Override
    public boolean apply(Game game, Ability source) {
        if (game.isActivePlayer(source.getControllerId())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "during your turn";
    }
}
