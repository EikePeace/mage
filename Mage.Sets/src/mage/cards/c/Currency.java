package mage.cards.c;

import mage.abilities.Ability;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SagaChapter;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.game.permanent.token.TreasureToken;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class Currency extends CardImpl {
    public Currency(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{R}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        // I, II — Create a Treasure token.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new CreateTokenEffect(new TreasureToken()));

        // {DISCOVER} — {2}, Sacrifice an artifact: Draw a card.
        Ability ability = new SimpleActivatedAbility(new DrawCardSourceControllerEffect(1), new GenericManaCost(2));
        ability.addCost(new SacrificeTargetCost(new TargetControlledPermanent(StaticFilters.FILTER_CONTROLLED_PERMANENT_ARTIFACT_AN)));
        discoveryAbility.addDiscoverAbility(this, ability);
        this.addAbility(discoveryAbility);
    }

    public Currency(final Currency card) { super(card); }

    @Override
    public Currency copy() { return new Currency(this); }
}
