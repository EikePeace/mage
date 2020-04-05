package mage.cards.m;

import java.util.UUID;
import mage.abilities.common.AsEntersBattlefieldAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.TapSourceUnlessPaysEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author Fenhl
 */
public final class MushroomLagoon extends CardImpl {
    public MushroomLagoon(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, null);
        this.subtype.add(SubType.FOREST);
        this.subtype.add(SubType.ISLAND);

        this.addAbility(new AsEntersBattlefieldAbility(new TapSourceUnlessPaysEffect(new GenericManaCost(1)), "you may pay {1}. If you don't, {this} enters the battlefield tapped"));
        this.addAbility(new GreenManaAbility());
        this.addAbility(new BlueManaAbility());
    }

    public MushroomLagoon(final MushroomLagoon card) { super(card); }

    @Override
    public MushroomLagoon copy() { return new MushroomLagoon(this); }
}
