package mage.cards.c;


import mage.MageInt;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.continuous.GainAbilityControlledEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.FilterSpell;
import mage.filter.StaticFilters;
import mage.filter.predicate.Predicates;

import java.util.UUID;

/**
 *
 *
 * @author Eike Peace
 */
public final class CycloneRider extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a noncreature spell");
    static {
        filter.add(Predicates.not(CardType.CREATURE.getPredicate()));
    }
    public CycloneRider(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}{U}");
        this.subtype.add(SubType.HUMAN, SubType.WIZARD);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        this.addAbility(new ProwessAbility());

        this.addAbility(new SpellCastControllerTriggeredAbility(
                new GainAbilityControlledEffect(FlyingAbility.getInstance(), Duration.EndOfTurn, StaticFilters.FILTER_PERMANENT_CREATURE, false),
                filter, false));
    }

    public CycloneRider(final CycloneRider card) {
        super(card);
    }

    @Override
    public CycloneRider copy() {
        return new CycloneRider(this);
    }
}
