package mage.cards.c;


import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.PutTopCardOfLibraryIntoGraveTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.FilterSpell;
import mage.filter.predicate.Predicates;
import mage.target.TargetPlayer;

import java.util.UUID;

/**
 *
 *
 * @author Eike Peace
 */
public final class ClaimJumper extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("a noncreature spell");
    static {
        filter.add(Predicates.not(CardType.CREATURE.getPredicate()));
    }
    public ClaimJumper(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{U}");
        this.subtype.add(SubType.HUMAN, SubType.SCOUT);
        this.power = new MageInt(0);
        this.toughness = new MageInt(3);

        Ability ability = (new SpellCastControllerTriggeredAbility(new PutTopCardOfLibraryIntoGraveTargetEffect(3), filter, false));
        ability.addTarget(new TargetPlayer());
        this.addAbility(ability);
    }

    public ClaimJumper(final ClaimJumper card) {
        super(card);
    }

    @Override
    public ClaimJumper copy() {
        return new ClaimJumper(this);
    }
}
