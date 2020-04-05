package mage.cards.h;

import mage.MageInt;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.FilterSpell;
import mage.filter.predicate.Predicates;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class HornedSerpent extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a noncreature spell");
    static {
        filter.add(Predicates.not(CardType.CREATURE.getPredicate()));
    }

    public HornedSerpent(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{U}");
        this.subtype.add(SubType.SERPENT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(5);

        this.addAbility(new SpellCastControllerTriggeredAbility(
                new BoostSourceEffect(3, 0, Duration.EndOfTurn),
                filter, false));
    }


    public HornedSerpent(final HornedSerpent card) {
        super(card);
    }

    @Override
    public HornedSerpent copy() {
        return new HornedSerpent(this);
    }
}

