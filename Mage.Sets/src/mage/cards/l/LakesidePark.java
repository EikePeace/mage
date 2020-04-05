package mage.cards.l;

import java.util.UUID;
import mage.abilities.common.AsEntersBattlefieldAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.TapSourceUnlessPaysEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author Fenhl
 */
public final class LakesidePark extends CardImpl {
    public LakesidePark(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, null);
        this.subtype.add(SubType.PLAINS);
        this.subtype.add(SubType.ISLAND);

        this.addAbility(new AsEntersBattlefieldAbility(new TapSourceUnlessPaysEffect(new GenericManaCost(1)), "you may pay {1}. If you don't, {this} enters the battlefield tapped"));
        this.addAbility(new WhiteManaAbility());
        this.addAbility(new BlueManaAbility());
    }

    public LakesidePark(final LakesidePark card) { super(card); }

    @Override
    public LakesidePark copy() { return new LakesidePark(this); }
}
