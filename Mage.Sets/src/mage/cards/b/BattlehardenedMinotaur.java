package mage.cards.b;

import mage.MageInt;
import mage.abilities.keyword.BattleCryAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class BattlehardenedMinotaur extends CardImpl {
    public BattlehardenedMinotaur(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}{R}");
        this.subtype.add(SubType.MINOTAUR);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);

        this.addAbility(new BattleCryAbility());
    }

    public BattlehardenedMinotaur(final BattlehardenedMinotaur card){
        super(card);
    }

    @Override
    public BattlehardenedMinotaur copy() {
        return new BattlehardenedMinotaur(this);
    }
}
