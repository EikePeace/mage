package mage.cards.c;

import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepTargetEffect;
import mage.abilities.effects.common.TapTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetNonBasicLandPermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class CalamitousRuin extends CardImpl {

    public CalamitousRuin(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{R}");

        // Tap target land. It doesn't untap during its controller's next untap step.
        this.getSpellAbility().addTarget(new TargetNonBasicLandPermanent());
        this.getSpellAbility().addEffect(new TapTargetEffect());
        this.getSpellAbility().addEffect(new DontUntapInControllersNextUntapStepTargetEffect("It"));

        // If that land is nonbasic, Calamitous Ruin deals 3 damage to its controller.
        this.getSpellAbility().addEffect(new CalamitousRuinEffect());
    }

    public CalamitousRuin(final CalamitousRuin card) {
        super(card);
    }

    @Override
    public CalamitousRuin copy(){
        return new CalamitousRuin(this);
    }
}

class CalamitousRuinEffect extends OneShotEffect{
    public CalamitousRuinEffect(){
        super(Outcome.Damage);
        this.staticText = "If that land is nonbasic, {this} deals 3 damage to the land's controller";
    }

    public CalamitousRuinEffect(final CalamitousRuinEffect effect){
        super(effect);
    }

    @Override
    public CalamitousRuinEffect copy(){
        return new CalamitousRuinEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source){
        Permanent permanent = game.getPermanent(source.getFirstTarget());
        if (permanent != null && !permanent.isBasic()){
            Player player = game.getPlayer(permanent.getControllerId());
            if (player != null){
                player.damage(3, source.getSourceId(), game, false, true);
                return true;
            }
        }
        return false;
    }
}