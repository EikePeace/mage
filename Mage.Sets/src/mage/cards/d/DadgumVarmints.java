package mage.cards.d;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAllTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.LoseLifeTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterLandPermanent;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class DadgumVarmints extends CardImpl {

    private static final FilterLandPermanent filter = new FilterLandPermanent("a land");

    static {
        filter.add(TargetController.OPPONENT.getControllerPredicate());
    }

    public DadgumVarmints(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.SQUIRREL);
        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        Effect effect = new LoseLifeTargetEffect(1);
        effect.setText("that player loses 1 life");
        Ability ability = new EntersBattlefieldAllTriggeredAbility(Zone.BATTLEFIELD, effect, filter, false, SetTargetPointer.PLAYER, "");
        this.addAbility(ability);
            }

    public DadgumVarmints(final DadgumVarmints card) {
        super(card);
    }

    @Override
    public DadgumVarmints copy() {
        return new DadgumVarmints(this);
    }
}
