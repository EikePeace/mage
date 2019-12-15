package mage.cards.e;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.c.CityOfWonders;
import mage.constants.CardType;

import java.util.UUID;

public final class EtherealGardens extends CardImpl {
    public EtherealGardens(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When ~ enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {G} or {W}.
        this.addAbility(new GreenManaAbility());
        this.addAbility(new WhiteManaAbility());

    }

    public EtherealGardens(final EtherealGardens card){
        super(card);
    }

    public EtherealGardens copy(){
        return new EtherealGardens(this);
    }
}
