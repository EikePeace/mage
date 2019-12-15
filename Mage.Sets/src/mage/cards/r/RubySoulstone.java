package mage.cards.r;

import mage.ObjectColor;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.mana.RedManaAbility;
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
public final class RubySoulstone extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a red spell");

    static {
        filter.add(new ColorPredicate(ObjectColor.RED));
    }

    public RubySoulstone (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{3}");

        // Whenever you cast a green spell, you gain 1 life.
        this.addAbility(new SpellCastControllerTriggeredAbility(new GainLifeEffect(1), filter, false));

        // {T}: Add {G}.
        this.addAbility(new RedManaAbility());
    }

    public RubySoulstone(final RubySoulstone card){
        super(card);
    }

    @Override
    public RubySoulstone copy(){
        return new RubySoulstone(this);
    }

}

