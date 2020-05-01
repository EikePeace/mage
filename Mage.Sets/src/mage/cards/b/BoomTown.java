package mage.cards.b;

import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.PayLifeCost;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.costs.mana.ManaCostImpl;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 * @author RogueAustralian
 */
public final class BoomTown extends CardImpl {

    public BoomTown(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {T}, Pay 1 life: Add {W} or {B}.
        Ability ability = new WhiteManaAbility();
        ability.addCost(new PayLifeCost(1));
        this.addAbility(ability);
        ability = new BlackManaAbility();
        ability.addCost(new PayLifeCost(1));
        this.addAbility(ability);

        // {1}{W}{B}, {T}, Sacrifice Boom Town: Draw a card.
        ability = new SimpleActivatedAbility(
                new DrawCardSourceControllerEffect(1), new ManaCostsImpl("{1}{W}{B}")
        );
        ability.addCost(new TapSourceCost());
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);
    }

    private BoomTown(final BoomTown card) {
        super(card);
    }

    @Override
    public BoomTown copy() {
        return new BoomTown(this);
    }
}
