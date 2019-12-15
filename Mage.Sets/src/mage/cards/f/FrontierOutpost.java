package mage.cards.f;

import mage.abilities.Ability;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.mana.AnyColorManaAbility;
import mage.abilities.mana.ColorlessManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.u.UnknownShores;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class FrontierOutpost extends CardImpl {
    public FrontierOutpost(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.LAND},"");

        // {T}: Add {C}.
        this.addAbility(new ColorlessManaAbility());
        // {1}, {T}: Add one mana of any color.
        Ability ability = new AnyColorManaAbility(new GenericManaCost(1));
        ability.addCost(new TapSourceCost());
        this.addAbility(ability);
    }

    public FrontierOutpost(final FrontierOutpost card) {
        super(card);
    }

    @Override
    public FrontierOutpost copy() {
        return new FrontierOutpost(this);
    }
}
