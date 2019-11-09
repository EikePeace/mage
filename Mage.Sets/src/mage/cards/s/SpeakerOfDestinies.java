package mage.cards.s;

import mage.MageInt;
import mage.abilities.mana.GreenManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class SpeakerOfDestinies extends CardImpl {

    public SpeakerOfDestinies(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.DRUID);

        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        // {T}: Add {G}.
        this.addAbility(new GreenManaAbility());
    }

    public SpeakerOfDestinies(final SpeakerOfDestinies card){
        super(card);
    }

    @Override
    public SpeakerOfDestinies copy(){
        return new SpeakerOfDestinies(this);
    }

}
