package mage.cards.m;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.LimitedTimesPerTurnActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.MyTurnCondition;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.continuous.PlayTheTopCardEffect;
import mage.abilities.effects.common.continuous.PlayWithTheTopCardRevealedEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.filter.common.FilterNonlandCard;
import mage.game.Game;
import mage.players.Player;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class MotherOwlsHerald extends CardImpl {
    public MotherOwlsHerald(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "");
        this.subtype.add(SubType.BIRD);

        //Flying
        this.addAbility(FlyingAbility.getInstance());

        //Players play with the top card of their libraries revealed.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new PlayWithTheTopCardRevealedEffect(true)));

        //Once during each of your turns, you may cast the top card of any player’s library if it’s a nonland card.
        this.addAbility(new LimitedTimesPerTurnActivatedAbility(Zone.BATTLEFIELD, new MotherOwlsHeraldEffect(),  new GenericManaCost(0), 1, MyTurnCondition.instance));
        this.power = new MageInt(3);
        this.toughness = new MageInt(4);
    }


    public MotherOwlsHerald(final MotherOwlsHerald card) {
        super(card);
    }

    @Override
    public MotherOwlsHerald copy() {
        return new MotherOwlsHerald(this);
    }
}


class MotherOwlsHeraldEffect extends PlayTheTopCardEffect{

    private static final FilterCard filter = new FilterNonlandCard("Not a land");


    @Override
    public boolean applies(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        Card cardOnTop = game.getCard(objectId);
        if (cardOnTop != null
                && (!cardOnTop.getManaCost().isEmpty() || cardOnTop.isLand())
                && filter.match(cardOnTop, game)) {
            Player player = game.getPlayer(cardOnTop.getOwnerId());
            if (player != null && cardOnTop.equals(player.getLibrary().getFromTop(game))) {
                return true;
            }
        }
        return false;
    }
}
