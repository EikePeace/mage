package mage.cards.k;

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
 * @author Fenhl
 */
public final class KirsusMongrel extends CardImpl {
    public KirsusMongrel(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{R}");
        this.subtype.add(SubType.DEMON);
        this.subtype.add(SubType.HOUND);

        this.power = new MageInt(4);
        this.toughness = new MageInt(1);

        // First strike
        this.addAbility(FirstStrikeAbility.getInstance());

        // Haste
        this.addAbility(HasteAbility.getInstance());

        // Kirsus Mongrel atacks each combat if able.
        this.addAbility(new AttacksEachCombatStaticAbility());
    }

    public KirsusMongrel(final KirsusMongrel card) { super(card); }

    @Override
    public KirsusMongrel copy() { return new KirsusMongrel(this); }
}
