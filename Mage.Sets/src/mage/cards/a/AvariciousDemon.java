package mage.cards.a;

import mage.MageInt;
import mage.abilities.common.BeginningOfDrawTriggeredAbility;
import mage.abilities.common.DrawCardControllerTriggeredAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.LoseLifeSourceControllerEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class AvariciousDemon extends CardImpl {
    public AvariciousDemon(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}{B}");
        this.subtype.add(SubType.DEMON);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Whenever you draw a card, you lose 1 life.
        this.addAbility(new DrawCardControllerTriggeredAbility(new LoseLifeSourceControllerEffect(1), false));

        // At the beginning of your draw step, draw an additional card.
        this.addAbility(new BeginningOfDrawTriggeredAbility(new DrawCardSourceControllerEffect(1), TargetController.YOU, false));
    }

    public AvariciousDemon(final AvariciousDemon card){
        super(card);
    }

    public AvariciousDemon copy(){
        return new AvariciousDemon(this);
    }
}
