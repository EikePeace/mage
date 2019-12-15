package mage.cards.f;

import mage.abilities.effects.common.DamageTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class Flameblast extends CardImpl {

    public Flameblast(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{R}");

        // Flameblast deals 3 damage to target creature
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addEffect(new DamageTargetEffect(3));
    }

    public Flameblast(final Flameblast card){
        super(card);
    }

    @Override
    public Flameblast copy(){
        return new Flameblast(this);
    }
}
