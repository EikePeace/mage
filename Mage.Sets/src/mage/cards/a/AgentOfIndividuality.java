package mage.cards.a;

import mage.MageInt;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.LoyaltyAbility;
import mage.abilities.common.PlaneswalkerEntersWithLoyaltyCountersAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.ContinuousRuleModifyingEffectImpl;
import mage.abilities.effects.common.ExileGraveyardAllPlayersEffect;
import mage.abilities.effects.common.PutLibraryIntoGraveTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.players.Player;
import mage.target.TargetPlayer;

import java.util.UUID;

/**
 * @author RogueAustralian
 */
public final class AgentOfIndividuality extends CardImpl {

    public AgentOfIndividuality(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");

        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SCOUT);
        
        this.power = new MageInt(3);
        this.toughness = new MageInt(1);

        //Tokens can't be created
        this.addAbility(new SimpleStaticAbility(new AgentOfIndividualityEffect()));
    }

    private AgentOfIndividuality(final AgentOfIndividuality card) {
        super(card);
    }

    @Override
    public AgentOfIndividuality copy() {
        return new AgentOfIndividuality(this);
    }
}

class AgentOfIndividualityEffect extends ContinuousRuleModifyingEffectImpl {

    AgentOfIndividualityEffect() {
        super(Duration.WhileOnBattlefield, Outcome.Neutral, true, false);
        staticText = "Tokens can't be created";
    }

    private AgentOfIndividualityEffect(final AgentOfIndividualityEffect effect) {
        super(effect);
    }

    @Override
    public AgentOfIndividualityEffect copy() {
        return new AgentOfIndividualityEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public String getInfoMessage(Ability source, GameEvent event, Game game) {
        return "Tokens can't be created - " +  (game.getObject(source.getSourceId()).getLogName()) + " is on the battlefield";
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return GameEvent.EventType.CREATE_TOKEN == event.getType();
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        Player controller = game.getPlayer(source.getControllerId());
        return true;
    }
}