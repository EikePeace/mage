package mage.cards.t;

import mage.abilities.Ability;
import mage.abilities.common.BeginningOfYourEndStepTriggeredAbility;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.Effects;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.LoseLifeOpponentsEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SagaChapter;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Tyranny extends CardImpl {
    public Tyranny(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{B}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Each opponent loses 2 life and you gain 2 life.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new Effects(
                new LoseLifeOpponentsEffect(2),
                new GainLifeEffect(2)));
        //{DISCOVER} — At the beginning of your end step, you draw a card and you lose 2 life.
        Ability ability = new BeginningOfYourEndStepTriggeredAbility(new DrawCardSourceControllerEffect(1), false);
        ability.addEffect(new GainLifeEffect(2));
        discoveryAbility.addDiscoverAbility(this, ability);
        this.addAbility(discoveryAbility);
    }


    public Tyranny(final Tyranny card) {
        super(card);
    }

    @Override
    public Tyranny copy() {
        return new Tyranny(this);
    }
}

