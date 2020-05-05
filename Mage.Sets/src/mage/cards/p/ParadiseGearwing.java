package mage.cards.p;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.mana.AnyColorManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author RogueAustralian
 */
public final class ParadiseGearwing extends CardImpl {

    public ParadiseGearwing(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ARTIFACT, CardType.CREATURE},"{3}");
        this.subtype.add(SubType.BIRD);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(new AnyColorManaAbility());
    }

    public ParadiseGearwing(final ParadiseGearwing card) {
        super(card);
    }

    @Override
    public ParadiseGearwing copy() {
        return new ParadiseGearwing(this);
    }

}