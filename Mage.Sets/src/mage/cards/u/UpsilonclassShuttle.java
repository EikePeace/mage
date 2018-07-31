package mage.cards.u;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.SpaceflightAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

public final class UpsilonclassShuttle extends CardImpl {

    public UpsilonclassShuttle(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{5}");
        this.subtype.add(SubType.STARSHIP);
        this.power = new MageInt(2);
        this.power = new MageInt(3);


        //Spaceflight
        this.addAbility(SpaceflightAbility.getInstance());
        //Whenever Upsilon-class Shuttle attacks, target creature you control gains Spaceflight until end of turn.
        Ability ability = (new AttacksTriggeredAbility(new GainAbilityTargetEffect(SpaceflightAbility.getInstance(), Duration.EndOfTurn), false));
        ability.addTarget(new TargetControlledCreaturePermanent(1));
    }

    public UpsilonclassShuttle(final UpsilonclassShuttle card) {
        super(card);
    }

    @Override
    public UpsilonclassShuttle copy() {
        return new UpsilonclassShuttle(this);
    }
}
