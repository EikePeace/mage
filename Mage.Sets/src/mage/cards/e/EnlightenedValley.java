package mage.cards.e;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.GreenManaAbility;
import mage.abilities.mana.RedManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

public final class EnlightenedValley extends CardImpl {
    public EnlightenedValley(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When City of Wonders enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {W} or {U}.
        this.addAbility(new RedManaAbility());
        this.addAbility(new GreenManaAbility());
    }

    public EnlightenedValley(final EnlightenedValley card){
        super(card);
    }

    public EnlightenedValley copy(){
        return new EnlightenedValley(this);
    }
}
