package mage.cards.k;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.LoyaltyAbility;
import mage.abilities.common.PlaneswalkerEntersWithLoyaltyCountersAbility;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamagePlayersEffect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.continuous.BecomesCreatureTargetEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterCard;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.common.FilterLandPermanent;
import mage.filter.predicate.mageobject.SubtypePredicate;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.permanent.token.TokenImpl;
import mage.target.common.TargetCardInLibrary;
import mage.target.common.TargetControlledPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class KothFuryOfKuldotha extends CardImpl {
    static final FilterControlledPermanent filter = new FilterControlledPermanent(SubType.MOUNTAIN, "Mountain");
    static final FilterLandPermanent filterCount = new FilterLandPermanent("Mountain you control");
    static final FilterCard landCardFilter = new FilterCard("Mountain cards");

    static {
        filterCount.add(new SubtypePredicate(SubType.MOUNTAIN));
        filterCount.add(new ControllerPredicate(TargetController.YOU));
        landCardFilter.add(new SubtypePredicate(SubType.MOUNTAIN));
    }

    public KothFuryOfKuldotha(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.PLANESWALKER}, "{4}{R}{R}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.KOTH);

        this.addAbility(new PlaneswalkerEntersWithLoyaltyCountersAbility(6));

        // +1: Untap target mountain you control. It becomes a 4/4 red Elemental creature with haste. It's still a land.
        Effect untapEffect = new UntapTargetEffect();
        untapEffect.setText("Untap target Mountain you control");
        Ability ability = new LoyaltyAbility(untapEffect, 1);
        Effect effect = new BecomesCreatureTargetEffect(new KothFuryOfKuldothaToken(), false, true, Duration.EndOfGame);
        effect.setText("It becomes a 4/4 red Elemental creature with haste. It's still a land. <i>(This effect lasts indefinitely.)</i>");
        ability.addEffect(effect);
        ability.addTarget(new TargetControlledPermanent(filter));
        this.addAbility(ability);

        // -2: Koth, Fury of Kuldotha deals damage to target creature equal to the number of Mountains you control.
        effect = new DamageTargetEffect(new PermanentsOnBattlefieldCount(filterCount));
        effect.setText("{this} deals damage to target creature equal to the number of mountains you control.");
        ability = new LoyaltyAbility(effect, -3);
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);

        // -9: Search your library for any number of Mountain cards, put them onto the battlefield, then shuffle your library.
        // Koth deals damage to each opponent equal to the number of Mountains you control.
        ability = new LoyaltyAbility(new SearchLibraryPutInPlayEffect(new TargetCardInLibrary(
                0, Integer.MAX_VALUE, landCardFilter
        ), false), -9);
        effect = new DamagePlayersEffect(Outcome.Damage, new PermanentsOnBattlefieldCount(filterCount), TargetController.OPPONENT);
        effect.setText("{this} deals damage to each opponent equal to the number of Mountains you control.");
        ability.addEffect(effect);
        this.addAbility(ability);
    }

    public KothFuryOfKuldotha(final KothFuryOfKuldotha card){
        super(card);

    }

    @Override
    public KothFuryOfKuldotha copy(){
        return new KothFuryOfKuldotha(this);
    }
}

class KothFuryOfKuldothaToken extends TokenImpl {
    public KothFuryOfKuldothaToken(){
        super("Elemental", "4/4 red Elemental");
        this.cardType.add(CardType.CREATURE);
        this.subtype.add(SubType.ELEMENTAL);

        this.color.setRed(true);
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);
    }

    public KothFuryOfKuldothaToken(final KothFuryOfKuldothaToken token){
        super(token);
    }

    public KothFuryOfKuldothaToken copy(){
        return new KothFuryOfKuldothaToken(this);
    }
}