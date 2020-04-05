package mage.cards.h;

import mage.abilities.Ability;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.combat.CanAttackAsThoughItDidntHaveDefenderAllEffect;
import mage.abilities.keyword.DefenderAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SagaChapter;
import mage.constants.SubType;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterCreatureCard;
import mage.filter.predicate.mageobject.AbilityPredicate;
import mage.game.permanent.token.BeastToken5;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Husbandry extends CardImpl {

    private static final FilterControlledCreaturePermanent filter
            = new FilterControlledCreaturePermanent("creature with defender");
    static {
        filter.add(new AbilityPredicate(DefenderAbility.class));
    }

    public Husbandry(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{G}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        // I, II — Create a 3/3 green Beast creature token with defender.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new CreateTokenEffect(new BeastToken5()));

        //{DISCOVER} — Creatures you control with defender can attack as though they didn't have defender.
        Ability ability = new SimpleStaticAbility(new CanAttackAsThoughItDidntHaveDefenderAllEffect(
                Duration.WhileOnBattlefield, filter));
        discoveryAbility.addDiscoverAbility(this, ability);
        this.addAbility(discoveryAbility);
    }


    public Husbandry(final Husbandry card) {
        super(card);
    }

    @Override
    public Husbandry copy() {
        return new Husbandry(this);
    }
}

