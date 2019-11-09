package mage.cards.s;

import mage.MageInt;
import mage.abilities.keyword.DeathtouchAbility;
import mage.abilities.keyword.FlashAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class StalkingSpider extends CardImpl {

    public StalkingSpider(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}{G}");
        this.subtype.add(SubType.SPIDER);

        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        this.addAbility(FlashAbility.getInstance());
        this.addAbility(DeathtouchAbility.getInstance());
    }

    public StalkingSpider(final StalkingSpider card){
        super(card);
    }

    @Override
    public StalkingSpider copy(){
        return new StalkingSpider(this);
    }

}
