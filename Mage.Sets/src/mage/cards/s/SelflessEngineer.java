package mage.cards.s;

import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.abilities.keyword.IndestructibleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.StaticFilters;
import mage.filter.common.FilterControlledCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class SelflessEngineer extends CardImpl {
    public SelflessEngineer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{3}");
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Sacrifice Selfless Engineer: Creatures and artifacts you control gain indestructible until end of turn.
        this.addAbility(new SimpleActivatedAbility(
                new GainAbilityAllEffect(IndestructibleAbility.getInstance(), Duration.EndOfTurn, StaticFilters.FILTER_CONTROLLED_PERMANENT_ARTIFACT_OR_CREATURE),
                new SacrificeSourceCost()
        ));
    }

    public SelflessEngineer(final SelflessEngineer card) { super(card); }

    @Override
    public SelflessEngineer copy() { return new SelflessEngineer(this); }
}
