package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.DealsCombatDamageToAPlayerTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.DiscardTargetCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.ReturnToHandSourceEffect;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.common.TargetCardInHand;

import java.util.UUID;

public final class CunningNightblade extends CardImpl {
    public CunningNightblade(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}{B}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ROGUE);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        // Menace
        this.addAbility(new MenaceAbility());

        // Whenever Cunning Nightblade deals combat damage to a player, draw a card.
        this.addAbility(new DealsCombatDamageToAPlayerTriggeredAbility(
                new DrawCardSourceControllerEffect(1), false
        ));

        // {U}{B}, Discard a card: Return Cunning Nightblade to its owner's hand.
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new ReturnToHandSourceEffect(true), new ManaCostsImpl("{U}{B}"));
        ability.addCost(new DiscardTargetCost(new TargetCardInHand()));
        this.addAbility(ability);
    }

    public CunningNightblade(final CunningNightblade card) {
        super(card);
    }

    @Override
    public CunningNightblade copy() {
        return new CunningNightblade(this);
    }
}
