package mage.cards.u;

import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.dynamicvalue.IntPlusDynamicValue;
import mage.abilities.dynamicvalue.MultipliedValue;
import mage.abilities.dynamicvalue.common.CardsInControllerHandCount;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.SkipDrawStepEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class UnprecedentedGenius extends CardImpl {
    public UnprecedentedGenius(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{4}{U}{U}{U}");

        // Skip your draw step.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new SkipDrawStepEffect()));

        // At the beginning of each upkeep, if you have fewer than seven cards in hand, draw cards equal to the difference.
        this.addAbility(new UnprecedentedGeniusTriggeredAbility());
    }

    public UnprecedentedGenius(final UnprecedentedGenius card) { super(card); }

    @Override
    public UnprecedentedGenius copy() { return new UnprecedentedGenius(this); }
}

class UnprecedentedGeniusTriggeredAbility extends BeginningOfUpkeepTriggeredAbility {

    UnprecedentedGeniusTriggeredAbility() {
        super(new DrawCardSourceControllerEffect(new IntPlusDynamicValue(7, new MultipliedValue(CardsInControllerHandCount.instance, -1))), TargetController.ANY, false);
    }

    UnprecedentedGeniusTriggeredAbility(final UnprecedentedGeniusTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public UnprecedentedGeniusTriggeredAbility copy() {
        return new UnprecedentedGeniusTriggeredAbility(this);
    }

    @Override
    public boolean checkInterveningIfClause(Game game) {
        Player player = game.getPlayer(this.getControllerId());
        if (player != null) {
            return player.getHand().size() < 7;
        }
        return false;
    }

    @Override
    public String getRule() {
        return "At the beginning of each upkeep, if you have fewer than seven cards in hand, draw cards equal to the difference";
    }
}
