package mage.cards.u;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.keyword.ScryEffect;
import mage.abilities.mana.ColorlessManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class UtopianDistrict extends CardImpl {
    public UtopianDistrict(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When Utopian District enters the battlefield, scry 1.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new ScryEffect(1)));

        // {T}: Add {C} to you mana pool.
        this.addAbility(new ColorlessManaAbility());
    }

    public UtopianDistrict(final UtopianDistrict card) {
        super(card);
    }

    @Override
    public UtopianDistrict copy() {
        return new UtopianDistrict(this);
    }
}
