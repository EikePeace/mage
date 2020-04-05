package mage.cards.f;

import mage.abilities.Mode;
import mage.abilities.effects.common.DamageAllEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.filter.common.FilterCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class FleetingOptions extends CardImpl {
    public FleetingOptions(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{R}");

        // Choose one —
        // • Creatures you control get +2/+0 until end of turn.
        this.getSpellAbility().addEffect(new BoostControlledEffect(2, 0, Duration.EndOfTurn));

        // • Fleeting Options deals 2 damage to each creature.
        Mode mode = new Mode(new DamageAllEffect(2, new FilterCreaturePermanent()));
        this.getSpellAbility().addMode(mode);
    }

    public FleetingOptions(final FleetingOptions card) { super(card); }

    @Override
    public FleetingOptions copy() { return new FleetingOptions(this); }
}
