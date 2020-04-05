package mage.cards.t;

import mage.abilities.Ability;
import mage.abilities.common.BeginningOfCombatTriggeredAbility;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.dynamicvalue.common.StaticValue;
import mage.abilities.effects.common.LookLibraryAndPickControllerEffect;
import mage.abilities.effects.common.TapTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterCard;
import mage.filter.common.FilterCreatureCard;
import mage.filter.common.FilterOpponentsCreaturePermanent;
import mage.filter.predicate.mageobject.ConvertedManaCostPredicate;
import mage.target.common.TargetCreaturePermanent;
import mage.target.common.TargetOpponentsCreaturePermanent;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Theocracy extends CardImpl {

    private static final FilterCreatureCard filter = new FilterCreatureCard("a creature card with converted mana cost 2 or less");

    static {
        filter.add(new ConvertedManaCostPredicate(ComparisonType.FEWER_THAN, 3));
    }
    public Theocracy(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{W}{W}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Look at the top five cards of your library. Put up to one creature card with converted mana cost 2 or less from among them onto the battlefield.
        // Put the rest on the bottom of your library in a random order.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II,
                new LookLibraryAndPickControllerEffect(5, 1, filter, false, true,Zone.BATTLEFIELD, false ).setBackInRandomOrder(true));
        //{DISCOVER} — At the beginning of combat on your turn, tap target creature an opponent controls.
        Ability ability = new BeginningOfCombatTriggeredAbility(new TapTargetEffect(), TargetController.YOU, false);
        ability.addTarget(new TargetOpponentsCreaturePermanent());
        discoveryAbility.addDiscoverAbility(this, ability);
        this.addAbility(discoveryAbility);
    }
    public Theocracy(final Theocracy card) {
        super(card);
    }

    @Override
    public Theocracy copy() {
        return new Theocracy(this);
    }
}

