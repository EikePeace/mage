package mage.cards.p;

import java.util.UUID;
import mage.abilities.common.AsEntersBattlefieldAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.TapSourceUnlessPaysEffect;
import mage.abilities.mana.RedManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author Fenhl
 */
public final class PrayerHall extends CardImpl {
    public PrayerHall(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, null);
        this.subtype.add(SubType.MOUNTAIN);
        this.subtype.add(SubType.PLAINS);

        this.addAbility(new AsEntersBattlefieldAbility(new TapSourceUnlessPaysEffect(new GenericManaCost(1)), "you may pay {1}. If you don't, {this} enters the battlefield tapped"));
        this.addAbility(new RedManaAbility());
        this.addAbility(new WhiteManaAbility());
    }

    public PrayerHall(final PrayerHall card) { super(card); }

    @Override
    public PrayerHall copy() { return new PrayerHall(this); }
}
