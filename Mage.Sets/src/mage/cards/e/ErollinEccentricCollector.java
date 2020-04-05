package mage.cards.e;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.GainAbilityControlledEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.mana.AnyColorManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.CrocodileToken;
import mage.game.permanent.token.Token;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class ErollinEccentricCollector extends CardImpl {
    public ErollinEccentricCollector(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}{G}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.FROG);
        this.subtype.add(SubType.ADVISOR);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Artifacts you control have “{T}: Add one mana of any color.”
        this.addAbility(new SimpleStaticAbility(new GainAbilityControlledEffect(new AnyColorManaAbility(), Duration.WhileOnBattlefield, StaticFilters.FILTER_CONTROLLED_PERMANENT_ARTIFACT)));

        // {2}{R}{G}: Create a 3/2 green Crocodile creature token with trample. It gains haste until end of turn.
        this.addAbility(new SimpleActivatedAbility(new ErollinTokenEffect(), new ManaCostsImpl("{2}{R}{G}")));
    }

    public ErollinEccentricCollector(final ErollinEccentricCollector card) { super(card); }

    @Override
    public ErollinEccentricCollector copy() { return new ErollinEccentricCollector(this); }
}

class ErollinTokenEffect extends OneShotEffect {
    public ErollinTokenEffect() {
        super(Outcome.PutCreatureInPlay);
        this.staticText = "create a 3/2 green Crocodile creature token with trample. It gains haste until end of turn";
    }

    public ErollinTokenEffect(final ErollinTokenEffect effect) { super(effect); }

    @Override
    public ErollinTokenEffect copy() { return new ErollinTokenEffect(this); }

    @Override
    public boolean apply(Game game, Ability source) {
        Token token = new CrocodileToken();
        if (token.putOntoBattlefield(1, game, source.getSourceId(), source.getControllerId())) {
            Permanent tokenPermanent = game.getPermanent(token.getLastAddedToken());
            if (tokenPermanent != null) {
                ContinuousEffect effect = new GainAbilityTargetEffect(HasteAbility.getInstance(), Duration.EndOfTurn);
                effect.setTargetPointer(new FixedTarget(tokenPermanent.getId()));
                game.addEffect(effect, source);
            }
            return true;
        }
        return false;
    }
}
