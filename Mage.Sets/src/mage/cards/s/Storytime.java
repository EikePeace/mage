package mage.cards.s;

import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAllTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInHandEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.filter.common.FilterCreatureCard;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

public final class Storytime extends CardImpl {

    public Storytime(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{W/G}");

        this.addAbility(new EntersBattlefieldAllTriggeredAbility(
                new GainLifeEffect(1), StaticFilters.FILTER_PERMANENT_CREATURE_CONTROLLED));

        Ability ability = new SimpleActivatedAbility(new SearchLibraryPutInHandEffect(
                new TargetCardInLibrary(new FilterCreatureCard()), true),
                new ManaCostsImpl("{1}{G}{W}"));
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);

    }

    public Storytime(final Storytime card){
        super(card);
    }

    @Override
    public Storytime copy(){
        return new Storytime(this);
    }
}
