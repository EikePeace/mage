package mage.cards.t;

import mage.MageInt;
import mage.abilities.keyword.BattleCryAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.VigilanceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.v.Vigilance;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class TriumphantBattleseraph extends CardImpl {
    public TriumphantBattleseraph(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{R}{W}");
        this.subtype.add(SubType.ANGEL);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(VigilanceAbility.getInstance());
        this.addAbility(HasteAbility.getInstance());
        this.addAbility(new BattleCryAbility());
    }

    public TriumphantBattleseraph(final TriumphantBattleseraph card){
        super(card);
    }

    @Override
    public TriumphantBattleseraph copy(){
        return new TriumphantBattleseraph(this);
    }
}
