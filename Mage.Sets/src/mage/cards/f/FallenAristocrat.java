package mage.cards.f;

import mage.MageInt;
import mage.abilities.common.DiesTriggeredAbility;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.game.permanent.token.ZombieToken;

import java.util.UUID;

/**\
 *
 * @author jbfitz
 */
public final class FallenAristocrat extends CardImpl {

    public FallenAristocrat(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.HUMAN, SubType.NOBLE);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // When Fallen Aristocrat dies, create a 2/2 black Zombie creature token.
        this.addAbility(new DiesTriggeredAbility(new CreateTokenEffect(new ZombieToken())));
    }

    public FallenAristocrat (final FallenAristocrat card){
        super(card);
    }

    @Override
    public FallenAristocrat copy(){
        return new FallenAristocrat(this);
    }
}
