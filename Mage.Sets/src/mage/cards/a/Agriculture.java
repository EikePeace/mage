package mage.cards.a;

import mage.abilities.Ability;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInHandEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SagaChapter;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.target.common.TargetBasicLandCard;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Agriculture extends CardImpl {
    public Agriculture(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{G}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        // I, II — Search your library for a basic land card, reveal it, put it into your hand, then shuffle your library.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new SearchLibraryPutInHandEffect(
                new TargetCardInLibrary(StaticFilters.FILTER_CARD_BASIC_LAND), true));

        //{DISCOVER} — {4}: You gain 2 life.
        Ability ability = new SimpleActivatedAbility(new GainLifeEffect(2), new GenericManaCost(4));
        discoveryAbility.addDiscoverAbility(this, ability);

        this.addAbility(discoveryAbility);
    }


    public Agriculture(final Agriculture card) {
        super(card);
    }

    @Override
    public Agriculture copy() {
        return new Agriculture(this);
    }
}

