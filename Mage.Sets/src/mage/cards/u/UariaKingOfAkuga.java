

package mage.cards.u;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenTargetEffect;
import mage.abilities.effects.common.combat.CantAttackYouUnlessPayManaAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.permanent.token.TreasureToken;
import mage.target.targetpointer.FixedTarget;

/**
 *
 * @author RogueAustralian
 */
public final class UariaKingOfAkuga extends CardImpl {

    public UariaKingOfAkuga (UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{3}{G}{W}");
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.power = new MageInt(2);
        this.toughness = new MageInt(4);
        
        this.addAbility(new EntersBattlefieldTriggeredAbility(new UariaEnterEffect()));

        // Creatures can't attack you unless their controller pays {3} for each creature they control that's attacking you.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new CantAttackYouUnlessPayManaAllEffect(new ManaCostsImpl("{3}"))));
    }

    public UariaKingOfAkuga (final UariaKingOfAkuga card) {
        super(card);
    }

    @Override
    public UariaKingOfAkuga copy() {
        return new UariaKingOfAkuga(this);
    }
}

class UariaEnterEffect extends OneShotEffect {

    UariaEnterEffect() {
        super(Outcome.Benefit);
        staticText = "each player creates three Treasure tokens";
    }

    private UariaEnterEffect(final UariaEnterEffect effect) {
        super(effect);
    }

    @Override
    public UariaEnterEffect copy() {
        return new UariaEnterEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        game.getState().getPlayersInRange(source.getControllerId(), game).stream().forEach(playerId -> {
            Effect effect = new CreateTokenTargetEffect(new TreasureToken(), 3);
            effect.setTargetPointer(new FixedTarget(playerId, game));
            effect.apply(game, source);
        });
        return true;
    }
}

