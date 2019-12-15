package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.RechargeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.predicate.mageobject.NamePredicate;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.CanisterToken;
import mage.players.Player;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class AetherAnimist extends CardImpl {
    public AetherAnimist(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}{U}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ARTIFICER);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // When Aether Animist enters the battlefield, recharge twice.
        Effect effect = new RechargeEffect();
        effect.setText("recharge twice. <i>(Create two colorless Canister artifact tokens with \"{T}, Sacrifice this artifact. Untap target permanent. Activate this ability only during your turn.\")</i>");
        Ability etbRechargeAbility = new EntersBattlefieldTriggeredAbility(effect);
        Effect textlessRechage = new RechargeEffect();
        textlessRechage.setText(null);
        etbRechargeAbility.addEffect(textlessRechage);
        this.addAbility(etbRechargeAbility);

        // Canisters you control are creatures with base power and toughness 2/2.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new AetherAnimistStaticEffect()));
    }

    public AetherAnimist(final AetherAnimist card){
        super(card);
    }

    @Override
    public AetherAnimist copy() {
        return new AetherAnimist(this);
    }
}

class AetherAnimistStaticEffect extends ContinuousEffectImpl {
    private static final FilterPermanent filter = new FilterPermanent("Canister creatures you control");

    static {
        filter.add(new NamePredicate("Canister"));
        filter.add(new ControllerPredicate(TargetController.YOU));
    }

    public AetherAnimistStaticEffect() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit);
        staticText = "Canisters you control are artifact creatures with base power and toughness 2/2.";
    }

    public AetherAnimistStaticEffect(final AetherAnimistStaticEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Layer layer, SubLayer subLayer, Ability source, Game game) {
        Player player = game.getPlayer(source.getControllerId());
        if (player != null){
            for (Permanent permanent : game.getState().getBattlefield().getActivePermanents(filter, source.getControllerId(), source.getSourceId(), game)){
                switch (layer) {
                    case TypeChangingEffects_4:
                        permanent.addCardType(CardType.CREATURE);
                        break;
                    case PTChangingEffects_7:
                        if (subLayer == SubLayer.SetPT_7b){
                            permanent.getPower().setValue(2);
                            permanent.getToughness().setValue(2);
                        }
                        break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean apply(Game game, Ability source){
        return false;
    }

    @Override
    public boolean hasLayer(Layer layer){
        return layer == Layer.TypeChangingEffects_4 ||
                layer == Layer.PTChangingEffects_7;
    }


    @Override
    public AetherAnimistStaticEffect copy(){
        return new AetherAnimistStaticEffect(this);
    }
}
