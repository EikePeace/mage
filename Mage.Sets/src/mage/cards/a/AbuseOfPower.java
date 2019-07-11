package mage.cards.a;

import mage.abilities.condition.common.SuperiorityCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.IndestructibleAbility;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.AbilityWord;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class AbuseOfPower extends CardImpl{

    public AbuseOfPower(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{B}");
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addEffect(new BoostTargetEffect(3,0));
        this.getSpellAbility().addEffect(new ConditionalContinuousEffect(new GainAbilityTargetEffect(IndestructibleAbility.getInstance(), Duration.EndOfTurn), SuperiorityCondition.instance,
                "That creature also gains indestructible until end of turn if you have more life than an opponent."));
        this.getSpellAbility().setAbilityWord(AbilityWord.SUPERIORITY);
    }

    public AbuseOfPower(final AbuseOfPower card) {
        super(card);
    }

    @Override
    public AbuseOfPower copy() {
        return new AbuseOfPower(this);
    }
}
