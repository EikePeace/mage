
package mage.cards.a;

import java.util.UUID;

import mage.abilities.effects.keyword.UploadLibraryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

/**
 *
 * @author LevelX2
 */
public final class AncestralResearch extends CardImpl {

    public AncestralResearch(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{U}");


        //Upload the top three cards of your library
        this.getSpellAbility().addEffect(new UploadLibraryEffect(3));
    }

    public AncestralResearch(final AncestralResearch card) {
        super(card);
    }

    @Override
    public AncestralResearch copy() {
        return new AncestralResearch(this);
    }
}