package mage.cards.t;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.condition.common.ControlsParadiseCondition;
import mage.abilities.decorator.ConditionalInterveningIfTriggeredAbility;
import mage.abilities.dynamicvalue.common.SourcePermanentPowerCount;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.keyword.ReachAbility;
import mage.abilities.keyword.VoyageAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetOpponent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class TuaRahiAvenger extends CardImpl {
    public TuaRahiAvenger(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{R}");
        this.subtype.add(SubType.ELEMENTAL);

        this.power = new MageInt(4);
        this.toughness = new MageInt(5);

        // Reach
        this.addAbility(ReachAbility.getInstance());

        // Voyage
        this.addAbility(new VoyageAbility());

        // Whenever Tua Rahi Avenger attacks, if you control Paradise, it deals damage equal to its power to target opponent.
        Ability ability = new ConditionalInterveningIfTriggeredAbility(
                new AttacksTriggeredAbility(new DamageTargetEffect(new SourcePermanentPowerCount()), false),
                ControlsParadiseCondition.instance,
                "Whenever {this} attacks, if you control Paradise, it deals damage equal to its power to target opponent."
        );
        ability.addTarget(new TargetOpponent());
        this.addAbility(ability);
    }

    public TuaRahiAvenger(final TuaRahiAvenger card) { super(card); }

    @Override
    public TuaRahiAvenger copy() { return new TuaRahiAvenger(this); }
}
