package mage.cards.p;

import mage.ObjectColor;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.FilterSpell;
import mage.filter.predicate.mageobject.ColorPredicate;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class PearlSoulstone extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a white spell");

    static {
        filter.add(new ColorPredicate(ObjectColor.WHITE));
    }

    public PearlSoulstone (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{3}");

        // Whenever you cast a white spell, you gain 1 life.
        this.addAbility(new SpellCastControllerTriggeredAbility(new GainLifeEffect(1), filter, false));

        // {T}: Add {W}.
        this.addAbility(new WhiteManaAbility());
    }

    public PearlSoulstone(final PearlSoulstone card){
        super(card);
    }

    @Override
    public PearlSoulstone copy(){
        return new PearlSoulstone(this);
    }

}
