package mage.cards.b;

import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.game.permanent.token.ZombieToken;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class BeckonTheHorde extends CardImpl {
    public BeckonTheHorde (UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{B}");

        Effect effect = new ConditionalOneShotEffect(
                new CreateTokenEffect(new ZombieToken(), 3),
                new CreateTokenEffect(new ZombieToken(), 2),
                MorbidCondition.instance,
                "Create two 2/2 black Zombie creature tokens. <br/><br/><i>Morbid</i> &mdash; Create three 2/2 black Zombie creature tokens instead if a creature died this turn.");
        this.getSpellAbility().addEffect(effect);
    }

    public BeckonTheHorde(final BeckonTheHorde card) {
        super(card);
    }

    @Override
    public BeckonTheHorde copy() {
        return new BeckonTheHorde(this);
    }
}
