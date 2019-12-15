package mage.cards.p;

import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterBasicLandCard;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

public final class PrepareAHideout extends CardImpl {

    public PrepareAHideout(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{G}");
        this.getSpellAbility().addEffect(new SearchLibraryPutInPlayEffect(
                new TargetCardInLibrary(new FilterBasicLandCard()),
                true));
        this.getSpellAbility().addEffect(new RechargeEffect());
    }

    public PrepareAHideout(final PrepareAHideout card) {
        super(card);
    }

    @Override
    public PrepareAHideout copy() {
        return new PrepareAHideout(this);
    }

}
