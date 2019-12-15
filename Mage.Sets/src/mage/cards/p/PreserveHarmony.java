package mage.cards.p;

import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.game.permanent.token.BeastToken;
import mage.game.permanent.token.KnightToken;
import mage.game.permanent.token.SpiritWhiteToken;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class PreserveHarmony extends CardImpl {
    public PreserveHarmony (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{G}{W}");

        this.getSpellAbility().addEffect(new CreateTokenEffect(new SpiritWhiteToken()));
        this.getSpellAbility().addEffect(new CreateTokenEffect(new KnightToken()));
        this.getSpellAbility().addEffect(new CreateTokenEffect(new BeastToken()));
    }

    public PreserveHarmony (final PreserveHarmony card){
        super(card);
    }

    @Override
    public PreserveHarmony copy(){
        return new PreserveHarmony(this);
    }
}
