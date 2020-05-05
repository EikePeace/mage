package mage.cards.j;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfCombatTriggeredAbility;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.BecomesCreatureTargetEffect;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.TargetController;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.common.FilterInstantOrSorceryCard;
import mage.game.Game;
import mage.game.permanent.token.TokenImpl;
import mage.players.Player;
import mage.target.TargetPermanent;
import mage.target.common.TargetLandPermanent;

/**
 *
 * @author RogueAustralian
 */
public final class JobiahWorldShepherd extends CardImpl {

    public JobiahWorldShepherd(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"");
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.GOD);

        this.color.setGreen(true);
        
        // this card is the second face of double-faced card Jobiah, Devoted Farmer
        this.nightCard = true;

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        /*
         * At the beginning of combat on your turn, you may untap target land you control and have that land become an X/X green Beast 
         * creature with trample and haste until end of turn, where X is the number of differently named lands you control.
         */
        
        //unique land count
      
        BeginningOfCombatTriggeredAbility combat = new BeginningOfCombatTriggeredAbility(new JobiahWorldSheperdEffect(), TargetController.YOU, true);
        combat.addTarget(new TargetPermanent(StaticFilters.FILTER_CONTROLLED_PERMANENT_LAND));
        this.addAbility(combat);
    }

    public JobiahWorldShepherd(final JobiahWorldShepherd card) {
        super(card);
    }

    @Override
    public JobiahWorldShepherd copy() {
        return new JobiahWorldShepherd(this);
    }
    
    
}

class JobiahWorldSheperdEffect extends OneShotEffect {

    private static final FilterCard filter = new FilterInstantOrSorceryCard();

    public JobiahWorldSheperdEffect() {
        super(Outcome.Benefit);
        this.staticText = "you may untap target land you control and have that land become an X/X green Beast creature with trample and haste until end of turn, where X is the number of differently named lands you control.";
    }

    public JobiahWorldSheperdEffect(final JobiahWorldSheperdEffect effect) {
        super(effect);
    }

    @Override
    public JobiahWorldSheperdEffect copy() {
        return new JobiahWorldSheperdEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
    	Player player = game.getPlayer(source.getControllerId());
        if (player == null) {
            return false;
        }
        int landCount = (int) game
                .getBattlefield()
                .getAllActivePermanents(StaticFilters.FILTER_LAND, source.getControllerId(), game)
                .stream()
                .map(permanent -> permanent.getName())
                .filter(s -> s.length() > 0)
                .distinct()
                .count();
        ContinuousEffect effect = new BecomesCreatureTargetEffect(new BeastModeToken(landCount), false, true, Duration.EndOfTurn);
        game.getPermanent(source.getTargets().getFirstTarget()).untap(game);
        game.addEffect(effect, source);
        return true;
    }
    
    private static class BeastModeToken extends TokenImpl {

    	BeastModeToken(int xVal) {
            super("", "X/X green Beast creature with trample and haste until end of turn, where X is the number of differently named lands you control.");
            cardType.add(CardType.CREATURE);
            color.setGreen(true);
            subtype.add(SubType.BEAST);
            power = new MageInt(xVal);
            toughness = new MageInt(xVal);
            this.addAbility(HasteAbility.getInstance());
            this.addAbility(TrampleAbility.getInstance());
        }

        public BeastModeToken(final BeastModeToken token) {
            super(token);
        }

        public BeastModeToken copy() {
            return new BeastModeToken(this);
        }
    }
}