package mage.cards.d;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.RedManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

public final class DesertedFairgrounds extends CardImpl {

    public DesertedFairgrounds(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When Deserted Fairgrounds enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {B} or {R}.
        this.addAbility(new BlackManaAbility());
        this.addAbility(new RedManaAbility());
    }

    public DesertedFairgrounds(final DesertedFairgrounds card){
        super(card);
    }

    public DesertedFairgrounds copy(){
        return new DesertedFairgrounds(this);
    }
}
