package mage.cards.f;

import mage.Mana;
import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.mana.BasicManaEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.abilities.mana.RedManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.d.DistrictSlums;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class FactoryReactor extends CardImpl {
    public FactoryReactor (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // Factory Reactor enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());

        // When Factory Reactor enters the battlefield, add {C}.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new BasicManaEffect(Mana.ColorlessMana(1))));

        // {T}: Add {U} or {R}.
        this.addAbility(new BlueManaAbility());
        this.addAbility(new RedManaAbility());
    }

    public FactoryReactor(final FactoryReactor card) {
        super(card);
    }

    @Override
    public FactoryReactor copy (){
        return new FactoryReactor(this);
    }
}
