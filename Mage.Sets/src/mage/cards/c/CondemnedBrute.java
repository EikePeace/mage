package mage.cards.c;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class CondemnedBrute extends CardImpl {
    public CondemnedBrute(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{B}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.MINOTAUR);

        this.power = new MageInt(3);
        this.toughness = new MageInt(4);
    }

    public CondemnedBrute(final CondemnedBrute card){
        super(card);
    }

    public CondemnedBrute copy() {
        return new CondemnedBrute(this);
    }
}
