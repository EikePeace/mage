package mage.cards.n;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.DiesCreatureTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.ReturnFromGraveyardToBattlefieldTargetEffect;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.permanent.AnotherPredicate;
import mage.game.permanent.token.SpiritWhiteToken;
import mage.target.common.TargetCardInYourGraveyard;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public class NialaGuideOfLostSouls extends CardImpl {
    private static final FilterControlledCreaturePermanent filterNonspiritCreature = new FilterControlledCreaturePermanent("another non-Spirit creature you control");
    private static final FilterControlledPermanent filterSpirit = new FilterControlledPermanent("Spirits");
    static {
        filterNonspiritCreature.add(Predicates.not(SubType.SPIRIT.getPredicate()));
        filterNonspiritCreature.add(TargetController.YOU.getControllerPredicate());
        filterNonspiritCreature.add(AnotherPredicate.instance);
        filterSpirit.add(SubType.SPIRIT.getPredicate());
        filterSpirit.add(TargetController.YOU.getControllerPredicate());
    }

    public NialaGuideOfLostSouls(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{W}{W}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.CLERIC);

        this.power = new MageInt(2);
        this.toughness = new MageInt(5);

        this.addAbility(LifelinkAbility.getInstance());

        // Whenever another non-Spirit creature you control dies, create a 1/1 white Spirit creature token with flying
        this.addAbility(new DiesCreatureTriggeredAbility(new CreateTokenEffect(new SpiritWhiteToken("CC18"), 1), false, filterNonspiritCreature));

        // {2}{W}, T, Sacrifice three Spirits: Return target creature card from your graveyard to the battlefield.
        Ability resurrectAbility = new SimpleActivatedAbility(
                Zone.BATTLEFIELD,
                new ReturnFromGraveyardToBattlefieldTargetEffect(),
                new TapSourceCost());
        resurrectAbility.addCost(new ManaCostsImpl("{2}{W}"));
        resurrectAbility.addCost(new SacrificeTargetCost(new TargetControlledPermanent(3, 3, filterSpirit, true)));
        resurrectAbility.addTarget(new TargetCardInYourGraveyard(StaticFilters.FILTER_CARD_CREATURE_YOUR_GRAVEYARD));
        this.addAbility(resurrectAbility);
    }

    public NialaGuideOfLostSouls(final NialaGuideOfLostSouls card){
        super(card);
    }

    @Override
    public NialaGuideOfLostSouls copy(){
        return new NialaGuideOfLostSouls(this);
    }
}
