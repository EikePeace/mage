package mage.cards.l;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

public final class LushVale extends CardImpl {
    public LushVale(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When Lush Vale enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {G} or {U}.
        this.addAbility(new GreenManaAbility());
        this.addAbility(new BlueManaAbility());
    }

    public LushVale(final LushVale card){
        super(card);
    }

    public LushVale copy(){
        return new LushVale(this);
    }

}
