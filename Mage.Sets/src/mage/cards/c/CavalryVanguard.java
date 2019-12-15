package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class CavalryVanguard extends CardImpl {
    public CavalryVanguard(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{W}");
        this.subtype.add(SubType.HUMAN, SubType.KNIGHT);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        Ability ability = new EntersBattlefieldTriggeredAbility(new UntapTargetEffect());
        ability.addTarget(new TargetControlledCreaturePermanent());
        this.addAbility(ability);
    }

    public CavalryVanguard (final CavalryVanguard card){
        super(card);
    }

    @Override
    public CavalryVanguard copy(){
        return new CavalryVanguard(this);
    }
}
