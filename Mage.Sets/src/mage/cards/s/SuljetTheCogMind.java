package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.common.EntersBattlefieldControlledTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.counters.CounterType;
import mage.filter.common.FilterArtifactPermanent;
import mage.filter.common.FilterControlledArtifactPermanent;
import mage.filter.predicate.permanent.AnotherPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

import java.util.UUID;

public final class SuljetTheCogMind extends CardImpl {

    private static final FilterArtifactPermanent filter = new FilterArtifactPermanent();
    static {
        filter.add(AnotherPredicate.instance);
    }

    public SuljetTheCogMind(UUID ownerId, CardSetInfo SetInfo){
        super(ownerId, SetInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{5}{W}{U}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.ARTIFICER);
        this.power = new MageInt(5);
        this.toughness = new MageInt(7);

        this.addAbility(new BeginningOfUpkeepTriggeredAbility(Zone.BATTLEFIELD, new SuljetScryEffect(), TargetController.YOU, false));
        this.addAbility(new EntersBattlefieldControlledTriggeredAbility(new SuljetTheCogMindEffect(), filter));


    }

    public SuljetTheCogMind(final SuljetTheCogMind card) {
        super(card);
    }

    @Override
    public SuljetTheCogMind copy() {
        return new SuljetTheCogMind(this);
    }

}

class SuljetTheCogMindEffect extends OneShotEffect {

    public SuljetTheCogMindEffect() {
        super(Outcome.Benefit);
        staticText = "put a research counter on Suljet, the Cog Mind. Then if Suljet has ten or more research counters on it, you win the game";
    }

    public SuljetTheCogMindEffect(final SuljetTheCogMindEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent permanent = game.getPermanent(source.getSourceId());
        if (permanent != null) {
            permanent.addCounters(CounterType.RESEARCH.createInstance(), source, game);
            if (permanent.getCounters(game).getCount(CounterType.RESEARCH) > 9) {
                Player player = game.getPlayer(permanent.getControllerId());
                if (player != null) {
                    player.won(game);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public SuljetTheCogMindEffect copy() {
        return new SuljetTheCogMindEffect(this);
    }
}

class SuljetScryEffect extends OneShotEffect {

    public SuljetScryEffect() {
        super(Outcome.Benefit);
        this.staticText = "Scry X, where X is the number of artifactgs you control.";
    }

    public SuljetScryEffect(final SuljetScryEffect effect) {
        super(effect);
    }

    @Override
    public SuljetScryEffect copy() {
        return new SuljetScryEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            int numberOfArtifacts = game.getBattlefield().getActivePermanents(new FilterControlledArtifactPermanent(), source.getControllerId(), game).size();
            if (numberOfArtifacts > 0) {
                controller.scry(numberOfArtifacts, source, game);
            }
            return true;
        }
        return false;
    }
}

