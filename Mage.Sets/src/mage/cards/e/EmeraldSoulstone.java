package mage.cards.e;

import mage.ObjectColor;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.mana.GreenManaAbility;
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
public final class EmeraldSoulstone extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a green spell");

    static {
        filter.add(new ColorPredicate(ObjectColor.GREEN));
    }

    public EmeraldSoulstone (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{3}");

        // Whenever you cast a green spell, you gain 1 life.
        this.addAbility(new SpellCastControllerTriggeredAbility(new GainLifeEffect(1), filter, false));

        // {T}: Add {G}.
        this.addAbility(new GreenManaAbility());
    }

    public EmeraldSoulstone(final EmeraldSoulstone card){
        super(card);
    }

    @Override
    public EmeraldSoulstone copy(){
        return new EmeraldSoulstone(this);
    }

}
