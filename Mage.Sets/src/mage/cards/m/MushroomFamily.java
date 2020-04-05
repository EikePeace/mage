package mage.cards.m;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.target.common.TargetLandPermanent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class MushroomFamily extends CardImpl {
    public MushroomFamily(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}{G}");
        this.subtype.add(SubType.FUNGUS);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // {T}: Untap up to two target lands.
        Ability ability = new SimpleActivatedAbility(new UntapTargetEffect(), new TapSourceCost());
        ability.addTarget(new TargetLandPermanent(0, 2, StaticFilters.FILTER_LANDS, false));
        this.addAbility(ability);
    }

    public MushroomFamily(final MushroomFamily card) { super(card); }

    @Override
    public MushroomFamily copy() { return new MushroomFamily(this); }
}
