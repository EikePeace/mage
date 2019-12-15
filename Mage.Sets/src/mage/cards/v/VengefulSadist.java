package mage.cards.v;

import mage.MageInt;
import mage.abilities.TriggeredAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.decorator.ConditionalInterveningIfTriggeredAbility;
import mage.abilities.effects.common.discard.DiscardTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetAnyTarget;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class VengefulSadist extends CardImpl {

    private static final String staticText = "<i>Morbid</i> &mdash; When {this} enters the battlefield, if a creature died this turn, target opponent discards a card.";

    public VengefulSadist (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.ZOMBIE, SubType.WARLOCK);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Morbid - When Vengeful Sadist enters the battlefield, if a creature died this turn, target opponent discards a card.
        TriggeredAbility discardAbility = new EntersBattlefieldTriggeredAbility(new DiscardTargetEffect(1));
        TriggeredAbility morbidAbility = new ConditionalInterveningIfTriggeredAbility(discardAbility, MorbidCondition.instance, staticText);
        morbidAbility.addTarget(new TargetAnyTarget());
        this.addAbility(morbidAbility);
    }

    public VengefulSadist(final VengefulSadist card){
        super(card);
    }

    @Override
    public VengefulSadist copy(){
        return new VengefulSadist(this);
    }
}
