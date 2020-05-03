
package mage.cards.s;

import java.util.UUID;
import mage.abilities.effects.keyword.UploadEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.TargetPermanent;

/**
 *
 * @author RogueAustralian
 */
public final class SwordsToBits extends CardImpl {

    public SwordsToBits(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{W}");

        TargetPermanent card = new TargetPermanent();
        this.getSpellAbility().addTarget(card);
        this.getSpellAbility().addEffect(new UploadEffect("upload target permanent"));

    }

    public SwordsToBits(final SwordsToBits card) {
        super(card);
    }

    @Override
    public SwordsToBits copy() {
        return new SwordsToBits(this);
    }
}
