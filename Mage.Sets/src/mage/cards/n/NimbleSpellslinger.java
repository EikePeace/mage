package mage.cards.n;

import mage.MageInt;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.UntapSourceEffect;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.FilterSpell;
import mage.filter.predicate.Predicates;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class NimbleSpellslinger extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a noncreature spell");
    static {
        filter.add(Predicates.not(CardType.CREATURE.getPredicate()));
    }
    public NimbleSpellslinger(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(new ProwessAbility());

        //Whenever you cast a noncreature spell, untap Nimble Spellslinger.
        this.addAbility(new SpellCastControllerTriggeredAbility(new UntapSourceEffect(), filter, false));
    }


    public NimbleSpellslinger(final NimbleSpellslinger card) {
        super(card);
    }

    @Override
    public NimbleSpellslinger copy() {
        return new NimbleSpellslinger(this);
    }
}

