package mage.abilities.effects.common.combat;

import mage.abilities.Ability;
import mage.abilities.condition.Condition;
import mage.abilities.effects.RestrictionEffect;
import mage.constants.Duration;
import mage.game.Game;
import mage.game.permanent.Permanent;


/**
 *
 * @author jbfitz
 */
public class CantAttackUnlessConditionSourceEffect extends RestrictionEffect {
    private final Condition condition;

    public CantAttackUnlessConditionSourceEffect(Condition condition) {
        super(Duration.WhileOnBattlefield);
        this.condition = condition;
        staticText = "{this} can't attack unless " + condition.toString();
    }

    public CantAttackUnlessConditionSourceEffect(final CantAttackUnlessConditionSourceEffect effect){
        super(effect);
        this.condition = effect.condition;
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        return permanent.getId().equals(source.getSourceId()) && !condition.apply(game, source);
    }

    @Override
    public boolean canAttack(Game game, boolean canUseChooseDialogs) {
        return false;
    }

    @Override
    public CantAttackUnlessConditionSourceEffect copy(){
        return new CantAttackUnlessConditionSourceEffect(this);
    }

}
