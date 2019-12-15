package mage.cards.m;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.continuous.GainAbilitySourceEffect;
import mage.abilities.keyword.HexproofAbility;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.StaticFilters;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class MistweaverMonk extends CardImpl {
    public MistweaverMonk(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");
        this.subtype.add(SubType.HUMAN, SubType.MONK);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Prowess
        this.addAbility(new ProwessAbility());

        // Whenever you cast a noncreature spell, Mistweaver Monk gains hexproof
        // until end of turn.
        Ability ability = new SpellCastControllerTriggeredAbility(
                new GainAbilitySourceEffect(HexproofAbility.getInstance(), Duration.EndOfTurn),
                StaticFilters.FILTER_SPELL_A_NON_CREATURE,
                false);
        this.addAbility(ability);
    }

    public MistweaverMonk(final MistweaverMonk card){
        super(card);
    }

    @Override
    public MistweaverMonk copy(){
        return new MistweaverMonk(this);
    }
}
