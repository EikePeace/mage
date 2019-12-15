package mage.cards.o;

import mage.MageInt;
import mage.abilities.common.BeginningOfEndStepTriggeredAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.effects.common.DamagePlayersEffect;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.constants.Zone;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class OrcishHordechief extends CardImpl {
    public OrcishHordechief(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}");
        this.subtype.add(SubType.ORC, SubType.WARRIOR);

        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        this.addAbility(new MenaceAbility());

        // At the beginning of each end step, if a creature died this turn, Orcish Hordechief deals 2 damage to each player.
        this.addAbility(new BeginningOfEndStepTriggeredAbility(Zone.BATTLEFIELD, new DamagePlayersEffect(2, TargetController.ANY),
                TargetController.ANY, MorbidCondition.instance, false));

    }

    public OrcishHordechief(final OrcishHordechief card){
        super(card);
    }

    @Override
    public OrcishHordechief copy(){
        return new OrcishHordechief(this);
    }
}
