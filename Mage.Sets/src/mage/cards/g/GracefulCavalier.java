package mage.cards.g;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.MayTapOrUntapTargetEffect;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @jbfitz
 */
public final class GracefulCavalier extends CardImpl {

    public GracefulCavalier(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}{W}");
        this.subtype.add(SubType.HUMAN, SubType.KNIGHT);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(FirstStrikeAbility.getInstance());

        // Whenever Graceful Cavalier attacks, you may tap or untap target creature.
        Effect effect = new MayTapOrUntapTargetEffect();
        effect.setText("you may tap or untap target creature");
        Ability ability = new AttacksTriggeredAbility(effect, false);
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    public GracefulCavalier(final GracefulCavalier card){
        super(card);
    }

    @Override
    public GracefulCavalier copy(){
        return new GracefulCavalier(this);
    }
}
