package mage.cards.a;

import mage.Mana;
import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.mana.BasicManaEffect;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class AetherPlantation extends CardImpl {
    public AetherPlantation (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // Aether Plantation enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());

        // When Aether Plantation enters the battlefield, add {C}.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new BasicManaEffect(Mana.ColorlessMana(1))));

        // {T}: Add {G} or {U}.
        this.addAbility(new GreenManaAbility());
        this.addAbility(new BlueManaAbility());
    }

    public AetherPlantation(final AetherPlantation card) {
        super(card);
    }

    @Override
    public AetherPlantation copy (){
        return new AetherPlantation(this);
    }
}
