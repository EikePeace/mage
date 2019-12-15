package mage.cards.w;

import mage.Mana;
import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.mana.BasicManaEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.RedManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.f.FactoryReactor;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class WeaponsCache extends CardImpl {
    public WeaponsCache (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // Weapons Cache enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());

        // When Weapons Cache enters the battlefield, add {C}.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new BasicManaEffect(Mana.ColorlessMana(1))));

        // {T}: Add {R} or {W}.
        this.addAbility(new RedManaAbility());
        this.addAbility(new WhiteManaAbility());
    }

    public WeaponsCache(final WeaponsCache card) {
        super(card);
    }

    @Override
    public WeaponsCache copy (){
        return new WeaponsCache(this);
    }
}
