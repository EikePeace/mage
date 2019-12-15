package mage.cards.r;

import mage.MageInt;
import mage.abilities.common.SimpleEvasionAbility;
import mage.abilities.effects.common.combat.CantBeBlockedByCreaturesSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ComparisonType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.PowerPredicate;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class RabidWargs extends CardImpl {
    private static final FilterCreaturePermanent filter =
            new FilterCreaturePermanent("creatures with power 1 or less");

    static {
        filter.add(new PowerPredicate(ComparisonType.FEWER_THAN, 2));
    }

    public RabidWargs(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{R}");
        this.subtype.add(SubType.WOLF);
        this.power = new MageInt(4);
        this.toughness = new MageInt(1);

        // Rabid Wargs can't be blocked by creatures with power 1 or less.
        this.addAbility(new SimpleEvasionAbility(new CantBeBlockedByCreaturesSourceEffect(
                filter, Duration.WhileOnBattlefield
        )));
    }

    public RabidWargs(final RabidWargs card) {
        super(card);
    }

    @Override
    public RabidWargs copy(){
        return new RabidWargs(this);
    }
}
