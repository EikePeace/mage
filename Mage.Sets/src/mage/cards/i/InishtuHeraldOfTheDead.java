package mage.cards.i;

import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.ExileFromGraveCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.LoseLifeOpponentsEffect;
import mage.abilities.keyword.IndestructibleAbility;
import mage.filter.StaticFilters;
import mage.target.common.TargetCardInYourGraveyard;
import mage.constants.SuperType;
import mage.constants.SubType;
import mage.constants.CardType;
import mage.cards.CardSetInfo;
import mage.cards.CardImpl;
import mage.MageInt;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class InishtuHeraldOfTheDead extends CardImpl {
    public InishtuHeraldOfTheDead(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.GOD);

        this.nightCard = true;
        this.transformable = true;

        this.power = new MageInt(4);
        this.toughness = new MageInt(5);

        // Indestructible
        this.addAbility(IndestructibleAbility.getInstance());

        // {2}{B}, Exile two cards from your graveyard: Each opponent loses 2 life and you gain 2 life.
        Ability ability = new SimpleActivatedAbility(new LoseLifeOpponentsEffect(2), new ManaCostsImpl("{2}{B}"));
        ability.addCost(new ExileFromGraveCost(new TargetCardInYourGraveyard(2, 2, StaticFilters.FILTER_CARD, true)));
        ability.addEffect(new GainLifeEffect(2));
        this.addAbility(ability);
    }

    public InishtuHeraldOfTheDead(final InishtuHeraldOfTheDead card) { super(card); }

    @Override
    public InishtuHeraldOfTheDead copy() { return new InishtuHeraldOfTheDead(this); }
}
