package mage.cards.i;

import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.common.EntersBattlefieldOrAttacksSourceTriggeredAbility;
import mage.abilities.condition.common.CardsInControllerGraveCondition;
import mage.abilities.decorator.ConditionalInterveningIfTriggeredAbility;
import mage.abilities.effects.common.LookLibraryMayPutInGraveyardEffect;
import mage.abilities.effects.common.TransformSourceEffect;
import mage.abilities.keyword.TransformAbility;
import mage.constants.TargetController;
import mage.constants.SuperType;
import mage.constants.SubType;
import mage.constants.CardType;
import mage.cards.CardSetInfo;
import mage.cards.CardImpl;
import mage.MageInt;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class InishtuDesertHealer extends CardImpl {
    public InishtuDesertHealer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.ORC);
        this.subtype.add(SubType.CLERIC);

        this.transformable = true;
        this.secondSideCardClazz = mage.cards.i.InishtuHeraldOfTheDead.class;

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        // Whenever Inishtu, Desert Healer enters the battlefield or attacks, look at the top card of your library. You may put it into your graveyard.
        this.addAbility(new EntersBattlefieldOrAttacksSourceTriggeredAbility(new LookLibraryMayPutInGraveyardEffect()));

        // At the beginning of your upkeep, if you have seven or more cards in your graveyard, you may transform Inishtu.
        this.addAbility(new TransformAbility());
        this.addAbility(new ConditionalInterveningIfTriggeredAbility(
                new BeginningOfUpkeepTriggeredAbility(new TransformSourceEffect(true), TargetController.YOU, true),
                new CardsInControllerGraveCondition(7),
                "At the beginning of your upkeep, if you have seven or more cards in your graveyard, you may transform {this}."
        ));
    }

    public InishtuDesertHealer(final InishtuDesertHealer card) { super(card); }

    @Override
    public InishtuDesertHealer copy() { return new InishtuDesertHealer(this); }
}
