package mage.cards.v;

import mage.abilities.Ability;
import mage.abilities.LoyaltyAbility;
import mage.abilities.SpellAbility;
import mage.abilities.common.PlaneswalkerEntersWithLoyaltyCountersAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.effects.common.cost.CostModificationEffectImpl;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.Game;
import mage.game.permanent.token.SoldierToken;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.util.CardUtil;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class VaenWillOfLaw extends CardImpl {
    public VaenWillOfLaw(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.PLANESWALKER}, "{1}{W}{W}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.VAEN);

        this.addAbility(new PlaneswalkerEntersWithLoyaltyCountersAbility(3));

        // +1: Untap up to one target creature you control. It gets +1/+1 and gains first strike until your next turn.
        Effect effect = new UntapTargetEffect();
        effect.setText("Untap up to one target creature you control.");
        Ability ability = new LoyaltyAbility(effect, 1);
        ability.addTarget(new TargetControlledCreaturePermanent(0, 1));
        Effect boostEffect = new BoostTargetEffect(2, 2, Duration.UntilYourNextTurn);
        boostEffect.setText(" ");
        ability.addEffect(boostEffect);
        Effect firstStrikeEffect = new GainAbilityTargetEffect(FirstStrikeAbility.getInstance(), Duration.UntilYourNextTurn);
        firstStrikeEffect.setText("It gets +2/+2 and gains first strike until end of turn.");
        ability.addEffect(firstStrikeEffect);
        this.addAbility(ability);

        // 0: Create a 1/1 white Soldier creature token.
        this.addAbility(new LoyaltyAbility(new CreateTokenEffect(new SoldierToken()), 0));

        // -3: Until your next turn, spells your opponents cast cost {3} more to cast.
        this.addAbility(new LoyaltyAbility(new VaenWillOfLawEffect(), -3));
    }

    public VaenWillOfLaw(final VaenWillOfLaw card){
        super(card);
    }

    public VaenWillOfLaw copy(){
        return new VaenWillOfLaw(this);
    }
}

class VaenWillOfLawEffect extends CostModificationEffectImpl {
    private static final String effectText = "Until your next turn, spells your opponents cast cost {3} more to cast.";

    VaenWillOfLawEffect(){
        super(Duration.UntilYourNextTurn, Outcome.Benefit, CostModificationType.INCREASE_COST);
        staticText = effectText;
    }

    VaenWillOfLawEffect(final VaenWillOfLawEffect effect){
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source, Ability abilityToModify){
        SpellAbility spellAbility = (SpellAbility) abilityToModify;
        CardUtil.adjustCost(spellAbility, -3);
        return true;
    }

    @Override
    public boolean applies(Ability abilityToModify, Ability source, Game game){
        if (abilityToModify instanceof SpellAbility) {
            if (game.getOpponents(source.getControllerId()).contains(abilityToModify.getControllerId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public VaenWillOfLawEffect copy(){
        return new VaenWillOfLawEffect(this);
    }
}
