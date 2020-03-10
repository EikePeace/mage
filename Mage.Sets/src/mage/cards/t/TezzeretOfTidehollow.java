package mage.cards.t;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.Gender;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapTargetCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.ExileAndReturnTransformedSourceEffect;
import mage.abilities.effects.common.LookLibraryMayPutInGraveyardEffect;
import mage.abilities.keyword.TransformAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.filter.common.FilterControlledArtifactPermanent;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.permanent.TappedPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeEvent;
import mage.target.common.TargetControlledPermanent;

import java.util.Set;
import java.util.UUID;

/**
 * @author Fenhl
 */
public final class TezzeretOfTidehollow extends CardImpl {
    private static FilterControlledArtifactPermanent filter = new FilterControlledArtifactPermanent("an untapped artifact you control");
    static {
        filter.add(Predicates.not(TappedPredicate.instance));
    }

    public TezzeretOfTidehollow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{2}{U}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);

        this.transformable = true;
        this.secondSideCardClazz = mage.cards.t.TezzeretTheOpportunist.class;

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        // {U}, Tap an untapped artifact you control: Look at the top card of your library. You may put it into your graveyard.
        Ability ability = new SimpleActivatedAbility(new LookLibraryMayPutInGraveyardEffect(), new ManaCostsImpl("{U}"));
        ability.addCost(new TapTargetCost(new TargetControlledPermanent(1, 1, filter, true)));
        this.addAbility(ability);

        // Whenever another artifact card is put into your graveyard from anywhere, exile Tezzeret, then return him to the battlefield transformed under his owner's control.
        this.addAbility(new TransformAbility());
        this.addAbility(new TezzeretTransformTriggeredAbility());
    }

    public TezzeretOfTidehollow(final TezzeretOfTidehollow card) { super(card); }

    @Override
    public TezzeretOfTidehollow copy() { return new TezzeretOfTidehollow(this); }
}

class TezzeretTransformTriggeredAbility extends TriggeredAbilityImpl {
    public TezzeretTransformTriggeredAbility() {
        super(Zone.BATTLEFIELD, new ExileAndReturnTransformedSourceEffect(Gender.MALE), false);
    }

    public TezzeretTransformTriggeredAbility(final TezzeretTransformTriggeredAbility ability) { super(ability); }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ZONE_CHANGE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        ZoneChangeEvent zEvent = (ZoneChangeEvent) event;
        if (zEvent != null && Zone.GRAVEYARD == zEvent.getToZone()) {
            Card card = game.getCard(zEvent.getTargetId());
            if (card != null) {
                UUID cardOwnerId = card.getOwnerId();
                Set<CardType> cardType = card.getCardType();
                if (cardOwnerId != null
                        && card.isOwnedBy(getControllerId())
                        && cardType != null
                        && card.isArtifact()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public TezzeretTransformTriggeredAbility copy() { return new TezzeretTransformTriggeredAbility(this); }

    @Override
    public String getRule() {
        return "Whenever another artifact card is put into your graveyard from anywhere, exile Tezzeret, then return him to the battlefield transformed under his owner's control.";
    }
}
