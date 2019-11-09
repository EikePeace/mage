package mage.cards.m;

import mage.MageInt;
import mage.abilities.keyword.DeathtouchAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public class MarshSnake extends CardImpl {
    public MarshSnake(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{B}");
        this.subtype.add(SubType.SNAKE);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(DeathtouchAbility.getInstance());
    }

    public MarshSnake(final MarshSnake card){
        super(card);
    }

    @Override
    public MarshSnake copy(){
        return new MarshSnake(this);
    }
}
