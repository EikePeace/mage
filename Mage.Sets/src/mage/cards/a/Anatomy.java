package mage.cards.a;

import mage.abilities.Ability;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.LoseLifeOpponentsEffect;
import mage.abilities.effects.common.ReturnFromGraveyardToHandTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SagaChapter;
import mage.constants.SubType;
import mage.filter.common.FilterCreatureCard;
import mage.target.common.TargetCardInYourGraveyard;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Anatomy extends CardImpl {
    public Anatomy(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{B}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        // I, II — Return target creature card from your graveyard to your hand.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new ReturnFromGraveyardToHandTargetEffect(), new TargetCardInYourGraveyard(new FilterCreatureCard()));

        //{DISCOVER} — {2}{B}, Sacrifice a creature: Each opponent loses 2 life and you gain 2 life.
        Ability ability = new SimpleActivatedAbility(new LoseLifeOpponentsEffect(2), new ManaCostsImpl("{2}{B}"));
        ability.addEffect(new GainLifeEffect(2));
        ability.addCost(new SacrificeTargetCost(new TargetControlledCreaturePermanent()));
        discoveryAbility.addDiscoverAbility(this, ability);

        this.addAbility(discoveryAbility);
    }


    public Anatomy(final Anatomy card) {
        super(card);
    }

    @Override
    public Anatomy copy() {
        return new Anatomy(this);
    }
}

