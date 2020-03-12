package mage.cards.c;

import mage.MageObjectReference;
import mage.abilities.Ability;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.common.EntersBattlefieldAllTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterCard;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledLandPermanent;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.CardIdPredicate;
import mage.filter.predicate.mageobject.NamePredicate;
import mage.filter.predicate.other.OwnerIdPredicate;
import mage.filter.predicate.permanent.ControllerIdPredicate;
import mage.game.Game;
import mage.game.events.EntersTheBattlefieldEvent;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;
import mage.players.Player;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Cartography extends CardImpl {

    public Cartography(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{U}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Scry 2.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new ScryEffect(2));

        //{DISCOVER} — Whenever a land enters the battlefield under your control, if it doesn't have the same name as another land you control, draw a card.
        discoveryAbility.addDiscoverAbility(this, new CartographyTriggeredAbility());
        this.addAbility(discoveryAbility);
    }


    public Cartography(final Cartography card) {
        super(card);
    }

    @Override
    public Cartography copy() {
        return new Cartography(this);
    }
}

class CartographyTriggeredAbility extends EntersBattlefieldAllTriggeredAbility {

    public static final FilterPermanent filterControlledLand = new FilterControlledLandPermanent();


    CartographyTriggeredAbility() {
        super(new CartographyEffect(null), filterControlledLand);
    }

    private CartographyTriggeredAbility(final CartographyTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public CartographyTriggeredAbility copy() {
        return new CartographyTriggeredAbility(this);
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        Permanent permanent = ((EntersTheBattlefieldEvent) event).getTarget();
        if (!filter.match(permanent, sourceId, controllerId, game)) {
            return false;
        }

        if (checkCondition(permanent, controllerId, game)) {
            this.getEffects().clear();
            this.addEffect(new CartographyEffect(new MageObjectReference(permanent, game)));
            return true;
        }
        return false;
    }

    @Override
    public String getRule() {
        return "Whenever a land enters the battlefield under your control, " +
                "if that land does not have the same name as another land you control," +
                " draw a card.";
    }

    // This is needed as checkInterveningIfClause can't access trigger event information
    static boolean checkCondition(Permanent permanent, UUID controllerId, Game game) {
        Player player = game.getPlayer(controllerId);
        if (player == null) {
            return false;
        }
        if (!permanent.getName().isEmpty()) {
            FilterCard filterCard = new FilterCard();
            filterCard.add(new NamePredicate(permanent.getName()));
            filterCard.add(new OwnerIdPredicate(controllerId));
        }
        FilterPermanent filterPermanent = new FilterControlledLandPermanent();
        filterPermanent.add(new NamePredicate(permanent.getName()));
        filterPermanent.add(Predicates.not(new CardIdPredicate(permanent.getId())));
        if (!game.getBattlefield().getActivePermanents(filterPermanent, controllerId, game).isEmpty()) {
            return false;
        }
        return true;
    }
}

class CartographyEffect extends OneShotEffect {

    private final MageObjectReference mor;

    CartographyEffect(MageObjectReference mor) {
        super(Outcome.Benefit);
        this.mor = mor;
    }

    private CartographyEffect(final CartographyEffect effect) {
        super(effect);
        this.mor = effect.mor;
    }

    @Override
    public CartographyEffect copy() {
        return new CartographyEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player == null) {
            return false;
        }
        if (CartographyTriggeredAbility.checkCondition(
                mor.getPermanentOrLKIBattlefield(game), source.getControllerId(), game)
        ) {
            player.drawCards(1, game);
            return true;
        }
        return false;
    }
}
