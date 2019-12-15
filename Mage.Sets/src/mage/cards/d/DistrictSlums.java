package mage.cards.d;

import mage.Mana;
import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.mana.BasicManaEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.a.AetherPlantation;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class DistrictSlums extends CardImpl {
    public DistrictSlums (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // Aether Plantation enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());

        // When Aether Plantation enters the battlefield, add {C}.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new BasicManaEffect(Mana.ColorlessMana(1))));

        // {T}: Add {B} or {G}.
        this.addAbility(new BlackManaAbility());
        this.addAbility(new GreenManaAbility());
    }

    public DistrictSlums(final DistrictSlums card) {
        super(card);
    }

    @Override
    public DistrictSlums copy (){
        return new DistrictSlums(this);
    }
}
