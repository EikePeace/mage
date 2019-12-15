package mage.cards.i;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.target.TargetPlayer;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class InnerflameMaster extends CardImpl {
    public InnerflameMaster(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}{R}");
        this.subtype.add(SubType.HUMAN, SubType.MONK);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Prowess
        this.addAbility(new ProwessAbility());

        // Whenever you cast a noncreature spell, Innerflame Master deals 1 damage to target player.
        Ability ability = new SpellCastControllerTriggeredAbility(
                new DamageTargetEffect(1),
                StaticFilters.FILTER_SPELL_A_NON_CREATURE, false);
        ability.addTarget(new TargetPlayer());
        this.addAbility(ability);
    }

    public InnerflameMaster(final InnerflameMaster card) {
        super(card);
    }

    @Override
    public InnerflameMaster copy(){
        return new InnerflameMaster(this);
    }
}
