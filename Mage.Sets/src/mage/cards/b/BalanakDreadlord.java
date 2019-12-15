package mage.cards.b;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfEndStepTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamagePlayersEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.LoseLifeOpponentsEffect;
import mage.abilities.effects.common.SacrificeOpponentsEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.predicate.permanent.AnotherPredicate;
import mage.target.common.TargetControlledPermanent;
import mage.target.common.TargetOpponent;

import java.util.UUID;

public final class BalanakDreadlord extends CardImpl {
    private static final FilterControlledPermanent filter =
            new FilterControlledCreaturePermanent("another creature");

    static {
        filter.add(AnotherPredicate.instance);
    }

    public BalanakDreadlord(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{B}{B}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.DEMON);

        this.power = new MageInt(5);
        this.toughness = new MageInt(5);

        this.addAbility(FlyingAbility.getInstance());

        Effect sacrificeEffect = new SacrificeOpponentsEffect(new FilterControlledCreaturePermanent("a creature"));
        Ability activatedAbility = new SimpleActivatedAbility(sacrificeEffect, new ManaCostsImpl("{3}{B}{B}"));
        activatedAbility.addCost(new SacrificeTargetCost(new TargetControlledPermanent(filter)));
        this.addAbility(activatedAbility);

        Ability endStepAbility = new BeginningOfEndStepTriggeredAbility(Zone.BATTLEFIELD,
                new LoseLifeOpponentsEffect(3), TargetController.ANY,
                MorbidCondition.instance, false);
        endStepAbility.addEffect(new GainLifeEffect(3).setText("and you gain 3 life"));
        this.addAbility(endStepAbility);
    }

    public BalanakDreadlord(final BalanakDreadlord card){
        super(card);
    }

    public BalanakDreadlord copy(){
        return new BalanakDreadlord(this);
    }
}
