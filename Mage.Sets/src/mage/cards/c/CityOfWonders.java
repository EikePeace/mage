package mage.cards.c;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepTargetEffect;
import mage.abilities.effects.common.DontUntapInControllersUntapStepSourceEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

public final class CityOfWonders extends CardImpl {

    public CityOfWonders(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When City of Wonders enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {W} or {U}.
        this.addAbility(new WhiteManaAbility());
        this.addAbility(new BlueManaAbility());
    }

    public CityOfWonders(final CityOfWonders card){
        super(card);
    }

    public CityOfWonders copy(){
        return new CityOfWonders(this);
    }
}
