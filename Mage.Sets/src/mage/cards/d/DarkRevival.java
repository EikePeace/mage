package mage.cards.d;

import mage.abilities.effects.common.ReturnFromGraveyardToBattlefieldTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterPermanentCard;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.target.common.TargetCardInGraveyard;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class DarkRevival extends CardImpl {

    static FilterPermanentCard filter = new FilterPermanentCard();

    static {
        filter.add(Predicates.or(
                new CardTypePredicate(CardType.CREATURE),
                new CardTypePredicate(CardType.PLANESWALKER)));
        filter.setMessage("target creature or planeswalker card");
    }

    public DarkRevival(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{B}{B}");

        // Return target creature or planeswalker card from your graveyard to the battlefield.
        this.getSpellAbility().addEffect(new ReturnFromGraveyardToBattlefieldTargetEffect());
        this.getSpellAbility().addTarget(new TargetCardInGraveyard(filter));
    }

    public DarkRevival(final DarkRevival card){
        super(card);
    }

    public DarkRevival copy(){
        return new DarkRevival(this);
    }
}
