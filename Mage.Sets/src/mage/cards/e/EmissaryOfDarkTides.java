package mage.cards.e;

import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.keyword.FlashAbility;
import mage.filter.common.FilterSpellOrPermanent;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.permanent.TappedPredicate;
import mage.target.common.TargetSpellOrPermanent;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import mage.constants.SubType;
import mage.constants.CardType;
import mage.cards.CardSetInfo;
import mage.cards.CardImpl;
import mage.MageInt;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class EmissaryOfDarkTides extends CardImpl {
    private static FilterSpellOrPermanent filter = new FilterSpellOrPermanent("noncreature spell or tapped creature");
    static {
        filter.getSpellFilter().add(Predicates.not(CardType.CREATURE.getPredicate()));
        filter.getPermanentFilter().add(CardType.CREATURE.getPredicate());
        filter.getPermanentFilter().add(TappedPredicate.instance);
    }

    public EmissaryOfDarkTides(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}{U}");
        this.subtype.add(SubType.MERFOLK);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Flash
        this.addAbility(FlashAbility.getInstance());

        // When Emissary of Dark Tides enters the battlefield, you may return target noncreature spell or tapped creature to its owner's hand.
        Ability ability = new EntersBattlefieldAbility(new ReturnToHandTargetEffect(), true);
        ability.addTarget(new TargetSpellOrPermanent(1, 1, filter, false));
        this.addAbility(ability);
    }

    public EmissaryOfDarkTides(final EmissaryOfDarkTides card) { super(card); }

    @Override
    public EmissaryOfDarkTides copy() { return new EmissaryOfDarkTides(this); }
}
