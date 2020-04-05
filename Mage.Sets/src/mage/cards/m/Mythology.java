package mage.cards.m;

import mage.abilities.common.BeginningOfYourEndStepTriggeredAbility;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.dynamicvalue.common.StaticValue;
import mage.abilities.effects.common.LookLibraryAndPickControllerEffect;
import mage.abilities.effects.common.PutCardFromHandOntoBattlefieldEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SagaChapter;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.FilterPermanent;
import mage.filter.StaticFilters;
import mage.filter.common.FilterPermanentCard;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Mythology extends CardImpl {
    public Mythology(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{4}{G}{G}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Look at the top four cards of your library. You may reveal a permanent card from among them and put it into your hand. Put the rest on the bottom of your library in a random order.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II,
                new LookLibraryAndPickControllerEffect(
                        StaticValue.get(4), false, StaticValue.get(1), new FilterPermanentCard(),
                        Zone.LIBRARY, false, true, true
                ).setBackInRandomOrder(true));
        //{DISCOVER} — At the beginning of your end step, you may put a permanent card from your hand onto the battlefield.
        discoveryAbility.addDiscoverAbility(this, new BeginningOfYourEndStepTriggeredAbility(new PutCardFromHandOntoBattlefieldEffect(new FilterPermanentCard()), false));
        this.addAbility(discoveryAbility);
    }


    public Mythology(final Mythology card) {
        super(card);
    }

    @Override
    public Mythology copy() {
        return new Mythology(this);
    }
}

