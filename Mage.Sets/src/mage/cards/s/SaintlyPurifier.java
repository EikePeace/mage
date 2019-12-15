package mage.cards.s;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.ExileGraveyardAllPlayersEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SaintlyPurifier extends CardImpl {
    public SaintlyPurifier(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");
        this.subtype.add(SubType.HUMAN, SubType.CLERIC);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // When Saintly Purifier enters the battlefield, exile all cards from all graveyards.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new ExileGraveyardAllPlayersEffect()));
    }

    public SaintlyPurifier(final SaintlyPurifier card){
        super(card);
    }

    @Override
    public SaintlyPurifier copy(){
        return new SaintlyPurifier(this);
    }
}
