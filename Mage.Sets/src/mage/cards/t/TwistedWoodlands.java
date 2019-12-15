package mage.cards.t;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

public final class TwistedWoodlands extends CardImpl {
    public TwistedWoodlands(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When City of Wonders enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {B} or {G}.
        this.addAbility(new BlackManaAbility());
        this.addAbility(new GreenManaAbility());
    }

    public TwistedWoodlands(final TwistedWoodlands card){
        super(card);
    }

    public TwistedWoodlands copy(){
        return new TwistedWoodlands(this);
    }
}
