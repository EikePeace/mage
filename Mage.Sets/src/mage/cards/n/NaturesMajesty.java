package mage.cards.n;

import mage.ObjectColor;
import mage.abilities.effects.common.search.SearchLibraryPutInHandEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.FilterCard;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.filter.predicate.mageobject.ColorPredicate;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class NaturesMajesty extends CardImpl {
    private static final FilterCard filter = new FilterCard("green creature card");
    static {
        filter.add(new ColorPredicate(ObjectColor.GREEN));
        filter.add(new CardTypePredicate(CardType.CREATURE));
    }

    public NaturesMajesty(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{G}");

        // Search your library for a green creature card, reveal it, put it into your hand, then shuffle your library.
        this.getSpellAbility().addEffect(new SearchLibraryPutInHandEffect(new TargetCardInLibrary(1, 1, filter), true));
    }

    public NaturesMajesty(final NaturesMajesty card){
        super(card);
    }

    @Override
    public NaturesMajesty copy(){
        return new NaturesMajesty(this);
    }
}


