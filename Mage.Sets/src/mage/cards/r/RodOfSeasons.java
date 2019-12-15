package mage.cards.r;

import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.DiscardCardCost;
import mage.abilities.costs.common.PayLifeCost;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.continuous.PlayAdditionalLandsControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterControlledLandPermanent;
import mage.game.permanent.token.BeastToken;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

public final class RodOfSeasons extends CardImpl {
    public RodOfSeasons(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{4}");

        // {2}, {T}, Pay 2 life: You may play an additional land this turn.
        Ability ability1 = new SimpleActivatedAbility(Zone.BATTLEFIELD, new PlayAdditionalLandsControllerEffect(1, Duration.EndOfTurn), new ManaCostsImpl("{2}"));
        ability1.addCost(new TapSourceCost());
        ability1.addCost(new PayLifeCost(2));
        this.addAbility(ability1);

        // {2}, {T}, Sacrifice a land: Draw two cards.
        Ability ability2 = new SimpleActivatedAbility(Zone.BATTLEFIELD, new DrawCardSourceControllerEffect(2), new ManaCostsImpl("{2}"));
        ability2.addCost(new TapSourceCost());
        ability2.addCost(new SacrificeTargetCost(new TargetControlledPermanent(new FilterControlledLandPermanent("land"))));
        this.addAbility(ability2);

        // {2}, {T}, Discard a card: Create a 3/3 green Beast creature token.
        Ability ability3 = new SimpleActivatedAbility(Zone.BATTLEFIELD, new CreateTokenEffect(new BeastToken()), new ManaCostsImpl("{2}"));
        ability3.addCost(new TapSourceCost());
        ability3.addCost(new DiscardCardCost());
        this.addAbility(ability3);

        // {2}, {T}, Sacrifice a creature: You gain 6 life.
        Ability ability4 = new SimpleActivatedAbility(Zone.BATTLEFIELD, new GainLifeEffect(6), new ManaCostsImpl("{2}"));
        ability4.addCost(new TapSourceCost());
        ability4.addCost(new SacrificeTargetCost(new TargetControlledPermanent(new FilterControlledCreaturePermanent("creature"))));
        this.addAbility(ability4);
    }

    public RodOfSeasons(final RodOfSeasons card){
        super(card);
    }

    @Override
    public RodOfSeasons copy(){
        return new RodOfSeasons(this);
    }
}
