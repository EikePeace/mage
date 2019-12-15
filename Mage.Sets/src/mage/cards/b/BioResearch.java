package mage.cards.b;

import com.sun.org.apache.regexp.internal.RE;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInHandOrOnBattlefieldEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.common.FilterCreatureCard;
import mage.filter.predicate.mageobject.NamePredicate;
import mage.target.common.TargetCardInLibrary;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class BioResearch extends CardImpl {

    private static final FilterControlledPermanent canisterFilter = new FilterControlledPermanent(" Canisters");

    static {
        canisterFilter.add(new NamePredicate("Canister"));
    }

    public BioResearch (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{G}");

        // At the beginning of your upkeep, recharge
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(Zone.BATTLEFIELD, new RechargeEffect(), TargetController.YOU, false));

        // Sacrifice six canisters: Search your library for a creature card,
        // put it onto the battlefield, then shuffle your library
        Ability tutorAbility = new SimpleActivatedAbility(
                Zone.BATTLEFIELD,
                new SearchLibraryPutInPlayEffect(new TargetCardInLibrary(new FilterCreatureCard())),
                new SacrificeTargetCost(new TargetControlledPermanent(6, canisterFilter)));
        this.addAbility(tutorAbility);
    }

    public BioResearch(final BioResearch card){
        super(card);
    }

    @Override
    public BioResearch copy(){
        return new BioResearch(this);
    }
}
