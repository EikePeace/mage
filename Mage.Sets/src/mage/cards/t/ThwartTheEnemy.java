package mage.cards.t;

import mage.abilities.effects.common.PreventAllDamageByAllObjectsEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.filter.FilterObject;
import mage.filter.common.FilterOpponentsCreaturePermanent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class ThwartTheEnemy extends CardImpl {

    private static final FilterObject filter
            = new FilterOpponentsCreaturePermanent("creatures your opponents control");

    public ThwartTheEnemy(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{G}");

        // Prevent all damage that would be dealt this turn by creatures your opponents control.
        this.getSpellAbility().addEffect(new PreventAllDamageByAllObjectsEffect(
                filter, Duration.EndOfTurn, false
        ));
    }

    private ThwartTheEnemy(final ThwartTheEnemy card) {
        super(card);
    }

    @Override
    public ThwartTheEnemy copy() {
        return new ThwartTheEnemy(this);
    }
}
