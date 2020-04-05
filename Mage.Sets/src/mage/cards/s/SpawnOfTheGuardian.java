package mage.cards.s;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class SpawnOfTheGuardian extends CardImpl {
    public SpawnOfTheGuardian(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}");
        this.subtype.add(SubType.BEAST);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    public SpawnOfTheGuardian(final SpawnOfTheGuardian card) { super(card); }

    @Override
    public SpawnOfTheGuardian copy() { return new SpawnOfTheGuardian(this); }
}
