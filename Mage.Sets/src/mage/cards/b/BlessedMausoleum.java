package mage.cards.b;

import java.util.UUID;
import mage.abilities.common.AsEntersBattlefieldAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.TapSourceUnlessPaysEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author Fenhl
 */
public final class BlessedMausoleum extends CardImpl {
    public BlessedMausoleum(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, null);
        this.subtype.add(SubType.PLAINS);
        this.subtype.add(SubType.SWAMP);

        this.addAbility(new AsEntersBattlefieldAbility(new TapSourceUnlessPaysEffect(new GenericManaCost(1)), "you may pay {1}. If you don't, {this} enters the battlefield tapped"));
        this.addAbility(new WhiteManaAbility());
        this.addAbility(new BlackManaAbility());
    }

    public BlessedMausoleum(final BlessedMausoleum card) { super(card); }

    @Override
    public BlessedMausoleum copy() { return new BlessedMausoleum(this); }
}
