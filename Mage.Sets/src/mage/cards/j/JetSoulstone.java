package mage.cards.j;

import mage.ObjectColor;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.mana.BlackManaAbility;
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
public final class JetSoulstone extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a black spell");

    static {
        filter.add(new ColorPredicate(ObjectColor.BLACK));
    }

    public JetSoulstone (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{3}");

        // Whenever you cast a black spell, you gain 1 life.
        this.addAbility(new SpellCastControllerTriggeredAbility(new GainLifeEffect(1), filter, false));

        // {T}: Add {B}.
        this.addAbility(new BlackManaAbility());
    }

    public JetSoulstone(final JetSoulstone card){
        super(card);
    }

    @Override
    public JetSoulstone copy(){
        return new JetSoulstone(this);
    }

}
