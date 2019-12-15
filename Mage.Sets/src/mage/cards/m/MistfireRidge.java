package mage.cards.m;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.RedManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

public final class MistfireRidge extends CardImpl {
    public MistfireRidge(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When Mistfire Ridge enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {U} or {R}.
        this.addAbility(new BlueManaAbility());
        this.addAbility(new RedManaAbility());
    }

    public MistfireRidge(final MistfireRidge card){
        super(card);
    }

    public MistfireRidge copy(){
        return new MistfireRidge(this);
    }

}
