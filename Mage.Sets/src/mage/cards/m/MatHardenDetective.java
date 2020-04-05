package mage.cards.m;

import mage.abilities.Ability;
import mage.abilities.common.DiesCreatureTriggeredAbility;
import mage.abilities.condition.CompoundCondition;
import mage.abilities.condition.common.CardsInControllerGraveCondition;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.decorator.ConditionalActivatedAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.LookLibraryMayPutInGraveyardEffect;
import mage.constants.Zone;
import mage.filter.StaticFilters;
import mage.constants.SuperType;
import mage.constants.SubType;
import mage.constants.CardType;
import mage.cards.CardSetInfo;
import mage.cards.CardImpl;
import mage.MageInt;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class MatHardenDetective extends CardImpl {
    public MatHardenDetective(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SCOUT);

        this.power = new MageInt(1);
        this.toughness = new MageInt(3);

        // Whenever a creature dies, look at the top card of your library. You may put it into your graveyard.
        this.addAbility(new DiesCreatureTriggeredAbility(new LookLibraryMayPutInGraveyardEffect(), false));

        // {U}, {T}: Draw a card. Activate this ability only if there is a creature card, an artifact card, and a land card in your graveyard.
        Ability ability = new ConditionalActivatedAbility(Zone.BATTLEFIELD, new DrawCardSourceControllerEffect(1), new ManaCostsImpl("{U}"), new CompoundCondition(
                new CardsInControllerGraveCondition(1, StaticFilters.FILTER_CARD_CREATURE_A),
                new CardsInControllerGraveCondition(1, StaticFilters.FILTER_CARD_ARTIFACT_AN),
                new CardsInControllerGraveCondition(1, StaticFilters.FILTER_CARD_LAND_A)
        ));
        ability.addCost(new TapSourceCost());
        this.addAbility(ability);
    }

    public MatHardenDetective(final MatHardenDetective card) { super(card); }

    @Override
    public MatHardenDetective copy() { return new MatHardenDetective(this); }
}
