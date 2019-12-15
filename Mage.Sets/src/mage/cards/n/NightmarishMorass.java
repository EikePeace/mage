package mage.cards.n;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.BlueManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

public final class NightmarishMorass extends CardImpl {
    public NightmarishMorass(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When ~ enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {U} or {B}.
        this.addAbility(new BlueManaAbility());
        this.addAbility(new BlackManaAbility());
    }

    public NightmarishMorass(final NightmarishMorass card){
        super(card);
    }

    public NightmarishMorass copy(){
        return new NightmarishMorass(this);
    }
}
