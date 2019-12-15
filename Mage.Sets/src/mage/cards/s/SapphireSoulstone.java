package mage.cards.s;

import mage.ObjectColor;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.mana.BlueManaAbility;
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
public final class SapphireSoulstone extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a blue spell");

    static {
        filter.add(new ColorPredicate(ObjectColor.BLUE));
    }

    public SapphireSoulstone (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{3}");

        // Whenever you cast a blue spell, you gain 1 life.
        this.addAbility(new SpellCastControllerTriggeredAbility(new GainLifeEffect(1), filter, false));

        // {T}: Add {G}.
        this.addAbility(new BlueManaAbility());
    }

    public SapphireSoulstone(final SapphireSoulstone card){
        super(card);
    }

    @Override
    public SapphireSoulstone copy(){
        return new SapphireSoulstone(this);
    }

}
