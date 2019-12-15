package mage.cards.g;

import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepSourceEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.c.CityOfWonders;
import mage.constants.CardType;

import java.util.UUID;

public final class GlamorDistrict extends CardImpl {
    public GlamorDistrict(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // When Glamor District enters the battlefield, it doesn't untap during your next untap step.
        Effect doesntUntapEffect = new DontUntapInControllersNextUntapStepSourceEffect();
        doesntUntapEffect.setText("it doesn't untap during your next untap step.");
        this.addAbility(new EntersBattlefieldTriggeredAbility(doesntUntapEffect));

        // {T}: Add {W} or {B}.
        this.addAbility(new WhiteManaAbility());
        this.addAbility(new BlackManaAbility());
    }

    public GlamorDistrict(final GlamorDistrict card){
        super(card);
    }

    public GlamorDistrict copy(){
        return new GlamorDistrict(this);
    }
}
