package mage.cards.d;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.Condition;
import mage.abilities.condition.common.CardsInControllerGraveCondition;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.combat.CantAttackUnlessConditionSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.StaticFilters;

import java.util.UUID;

public final class DeepwaterSerpent extends CardImpl {
    public DeepwaterSerpent(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}{U}");
        this.subtype.add(SubType.SERPENT);

        this.power = new MageInt(5);
        this.toughness = new MageInt(5);

        // Deepwater Serprent can't attack unless you have two or more instant and/or sorcery cards in your graveyard.
        Condition condition = new CardsInControllerGraveCondition(2, StaticFilters.FILTER_CARD_INSTANT_AND_SORCERY);
        Effect effect = new CantAttackUnlessConditionSourceEffect(condition);
        effect.setText("{this} can't attack unless there are two or more instant and/or sorcery cards in your graveyard.");
        this.addAbility(new SimpleStaticAbility(effect));
    }

    public DeepwaterSerpent (final DeepwaterSerpent card){
        super(card);
    }

    @Override
    public DeepwaterSerpent copy(){
        return new DeepwaterSerpent(this);
    }
}
