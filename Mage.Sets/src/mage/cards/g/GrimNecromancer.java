package mage.cards.g;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.ExileTargetEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.game.permanent.token.ZombieToken;
import mage.target.common.TargetCardInGraveyard;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class GrimNecromancer extends CardImpl {

    public GrimNecromancer(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{B}{B}");
        this.subtype.add(SubType.HUMAN, SubType.WARLOCK);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // {1]{B}, {T}, Sacrifice a creature: You gain 2 life.
        Ability sacrificeAbility = new SimpleActivatedAbility(new GainLifeEffect(2), new ManaCostsImpl("{1}{B}"));
        sacrificeAbility.addCost(new TapSourceCost());
        sacrificeAbility.addCost(new SacrificeTargetCost(new TargetControlledCreaturePermanent()));
        this.addAbility(sacrificeAbility);

        // {1}{B}, {T}: Exile target creature card from a graveyard. Create a 2/2 black Zombie creature token.1
        Ability zombieAbility = new SimpleActivatedAbility(new ExileTargetEffect(), new ManaCostsImpl("{1}{B}"));
        zombieAbility.addTarget(new TargetCardInGraveyard(StaticFilters.FILTER_CARD_CREATURE));
        zombieAbility.addCost(new TapSourceCost());
        zombieAbility.addEffect(new CreateTokenEffect(new ZombieToken()));
        this.addAbility(zombieAbility);
    }

    public GrimNecromancer(final GrimNecromancer card){
        super(card);
    }

    @Override
    public GrimNecromancer copy(){
        return new GrimNecromancer(this);
    }
}
