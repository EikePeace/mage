package mage.cards.i;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.CivilizedCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInHandEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.common.FilterPermanentCard;
import mage.filter.predicate.Predicates;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

public final class ImperatorNamuzzar extends CardImpl {

    private static final FilterPermanentCard filter = new FilterPermanentCard("artifact or enchantment");
    private static final FilterCreaturePermanent filter2 = new FilterCreaturePermanent("Lammasu");

    static{
        filter.add(Predicates.or(CardType.ENCHANTMENT.getPredicate(), CardType.ARTIFACT.getPredicate()));
        filter2.add(SubType.LAMMASU.getPredicate());
    }

    public ImperatorNamuzzar(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{W}{U}");
        this.addSuperType(SuperType.LEGENDARY);

        this.subtype.add(SubType.LAMMASU);
        this.power = new MageInt(4);
        this.toughness = new MageInt(5);

        this.addAbility(FlyingAbility.getInstance());

        //When Imperator Namuzzar enters the battlefield, search your library for an artifact or enchantment card, reveal it, put it into your hand, then shuffle your library.
        this.addAbility(new EntersBattlefieldAbility(new SearchLibraryPutInHandEffect(new TargetCardInLibrary(filter))));

        //Civilized - Lammasu you control get +2/+2 as long as you control an artifact, a creature, and an enchantment.
        Ability ability = new SimpleStaticAbility(Zone.BATTLEFIELD, new ConditionalContinuousEffect(
                new BoostControlledEffect(2, 2, Duration.WhileOnBattlefield, filter2), CivilizedCondition.instance,
                "<i>Civilized</i> &mdash; Lammasu you control get +2/+2 as long as you control an artifact, a creature, and an enchantment."));
        ability.setAbilityWord(AbilityWord.CIVILIZED);
        this.addAbility(ability);
    }

    public ImperatorNamuzzar(final ImperatorNamuzzar card) {
        super(card);
    }

    @Override
    public ImperatorNamuzzar copy() {
        return new ImperatorNamuzzar(this);
    }
}
