package mage.cards.m;

import mage.abilities.Ability;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.Effects;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityControlledEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SagaChapter;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Metallurgy extends CardImpl {
    public Metallurgy(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{R}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Target creature you control gets +2/+0 and gains menace until end of turn.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new Effects(
                new BoostTargetEffect(2,0, Duration.EndOfTurn),
                new GainAbilityTargetEffect(new MenaceAbility(), Duration.EndOfTurn)),
                new TargetControlledCreaturePermanent());

        //{DISCOVER} — Attacking creatures you control get +2/+0 and have menace.
        Ability ability = new SimpleStaticAbility(new BoostControlledEffect(2, 0, Duration.WhileOnBattlefield, StaticFilters.FILTER_ATTACKING_CREATURES));
        ability.addEffect(new GainAbilityControlledEffect(new MenaceAbility(), Duration.WhileOnBattlefield, StaticFilters.FILTER_ATTACKING_CREATURES));
        discoveryAbility.addDiscoverAbility(this, ability);
        this.addAbility(discoveryAbility);
    }


    public Metallurgy(final Metallurgy card) {
        super(card);
    }

    @Override
    public Metallurgy copy() {
        return new Metallurgy(this);
    }
}

