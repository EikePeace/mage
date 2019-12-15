package mage.cards.c;

import mage.Mana;
import mage.abilities.common.AsEntersBattlefieldAbility;
import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.costs.common.PayLifeCost;
import mage.abilities.effects.common.TapSourceUnlessPaysEffect;
import mage.abilities.effects.mana.BasicManaEffect;
import mage.abilities.mana.BlackManaAbility;
import mage.abilities.mana.BlueManaAbility;
import mage.abilities.mana.GreenManaAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class CorruptCourtroom extends CardImpl {
    public CorruptCourtroom(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // Aether Plantation enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());

        // When Aether Plantation enters the battlefield, add {C}.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new BasicManaEffect(Mana.ColorlessMana(1))));

        // {T}: Add {W} or {B}.
        this.addAbility(new WhiteManaAbility());
        this.addAbility(new BlackManaAbility());
    }

    public CorruptCourtroom(final CorruptCourtroom card){
        super(card);
    }

    @Override
    public CorruptCourtroom copy(){
        return new CorruptCourtroom(this);
    }
}
