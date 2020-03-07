package mage.cards.w;

import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.cost.SpellsCostReductionControllerEffect;
import mage.constants.SubType;
import mage.constants.SagaChapter;
import mage.constants.CardType;
import mage.cards.CardSetInfo;
import mage.cards.CardImpl;
import mage.abilities.common.DiscoveryAbility;
import mage.constants.Zone;
import mage.filter.StaticFilters;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class Writing extends CardImpl {
    public Writing(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{U}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        // I, II — Draw a card.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new DrawCardSourceControllerEffect(1));

        // {DISCOVER} — Noncreature spells you cast cost {1} less to cast.
        discoveryAbility.addDiscoverAbility(this, new SimpleStaticAbility(Zone.BATTLEFIELD, new SpellsCostReductionControllerEffect(StaticFilters.FILTER_CARDS_NON_CREATURE, 1)));
        this.addAbility(discoveryAbility);
    }

    public Writing(final Writing card) { super(card); }

    @Override
    public Writing copy() { return new Writing(this); }
}
