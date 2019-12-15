package mage.cards.g;

import mage.abilities.effects.common.ExileSourceEffect;
import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.effects.common.ReturnFromGraveyardToHandTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterPermanentCard;
import mage.target.common.TargetCardInYourGraveyard;

import java.util.UUID;

public final class GoodAsNew extends CardImpl {

    private static FilterPermanentCard filter = new FilterPermanentCard();

    public GoodAsNew(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{G}");
        this.getSpellAbility().addTarget(new TargetCardInYourGraveyard(filter));
        this.getSpellAbility().addEffect(new ReturnFromGraveyardToHandTargetEffect());
        this.getSpellAbility().addEffect(new RechargeEffect());
        this.getSpellAbility().addEffect(new ExileSourceEffect());
    }

    public GoodAsNew(final GoodAsNew card) {
        super(card);
    }

    @Override
    public GoodAsNew copy() {
        return new GoodAsNew(this);
    }

}
