package mage.cards.g;

import mage.MageInt;
import mage.abilities.common.AttacksEachCombatStaticAbility;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.abilities.keyword.HasteAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class GoblinRagemonger extends CardImpl {
    public GoblinRagemonger(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.GOBLIN, SubType.BERSERKER);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // First strike
        this.addAbility(FirstStrikeAbility.getInstance());

        // Haste
        this.addAbility(HasteAbility.getInstance());

        // Goblin Ragemonger attacks each combat if able.
        this.addAbility(new AttacksEachCombatStaticAbility());
    }

    public GoblinRagemonger(final GoblinRagemonger card){
        super(card);
    }

    @Override
    public GoblinRagemonger copy(){
        return new GoblinRagemonger(this);
    }
}
