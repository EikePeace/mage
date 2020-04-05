package mage.abilities.keyword;

import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.condition.InvertCondition;
import mage.abilities.condition.common.ControlsParadiseCondition;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.game.permanent.token.ParadiseToken;

/**
 *
 * @author Fenhl
 */
public class VoyageAbility extends SimpleActivatedAbility {
    public VoyageAbility() {
        super(
                new ConditionalOneShotEffect(new CreateTokenEffect(new ParadiseToken()), new InvertCondition(ControlsParadiseCondition.instance)),
                new ManaCostsImpl("{W}{U}{B}{R}{G}")
        );
    }

    public VoyageAbility(final VoyageAbility ability) { super(ability); }

    @Override
    public String getRule() {
        return "Voyage <i>({W}{U}{B}{R}{G}: If you don't control Paradise, create Paradise, a legendary land token with hexproof and “{T}: Add one mana of any color.”)</i>";
    }

    @Override
    public VoyageAbility copy() { return new VoyageAbility(this); }
}
