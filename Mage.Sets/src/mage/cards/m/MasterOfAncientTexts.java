package mage.cards.m;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.DrawDiscardControllerEffect;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.StaticFilters;

import java.util.UUID;

public final class MasterOfAncientTexts extends CardImpl {

    public MasterOfAncientTexts(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");
        this.subtype.add(SubType.HUMAN, SubType.MONK);

        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        this.addAbility(new ProwessAbility());

        // Whenever you cast a noncreature spell, you may draw a card, if you do, discard a card.
        Ability ability = new SpellCastControllerTriggeredAbility(
                new DrawDiscardControllerEffect(),
                StaticFilters.FILTER_SPELL_A_NON_CREATURE, true);
        this.addAbility(ability);
    }

    public MasterOfAncientTexts(final MasterOfAncientTexts card){
        super(card);
    }

    @Override
    public MasterOfAncientTexts copy(){
        return new MasterOfAncientTexts(this);
    }
}
