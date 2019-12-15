package mage.cards.r;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.effects.common.SacrificeAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.StaticFilters;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class RuthlessCollector extends CardImpl {

    public RuthlessCollector (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}{G}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ARTIFICER);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        RechargeEffect rechargeEffect = new RechargeEffect();
        rechargeEffect.setText("recharge. ");

        Ability entersTheBattlefieldAbility = new EntersBattlefieldTriggeredAbility(rechargeEffect);
        SacrificeAllEffect sacrificeAllEffectEffect = new SacrificeAllEffect(1, StaticFilters.FILTER_CONTROLLED_PERMANENT_NON_LAND);
        sacrificeAllEffectEffect.setText("Then, each player sacrifices a nonland permanent. <i>(To recharge, create a colorless Canister artifact token with" +
                "\"{T}, Sacrifice this artifact: Untap target permanent. Activate this ability only during your turn.\"");
        entersTheBattlefieldAbility.addEffect(sacrificeAllEffectEffect);
        this.addAbility(entersTheBattlefieldAbility);
    }

    public RuthlessCollector (final RuthlessCollector card){
        super(card);
    }

    @Override
    public RuthlessCollector copy(){
        return new RuthlessCollector(this);
    }
}
