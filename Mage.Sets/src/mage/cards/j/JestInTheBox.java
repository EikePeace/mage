package mage.cards.j;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.combat.CantBlockTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author Eike Peace
 */

public final class JestInTheBox extends CardImpl {

    public JestInTheBox(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{4}");
        this.subtype.add(SubType.CONSTRUCT, SubType.HORROR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(1);

        EntersBattlefieldTriggeredAbility ability = new EntersBattlefieldTriggeredAbility(
                new CantBlockTargetEffect(Duration.EndOfTurn));
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    public JestInTheBox(final JestInTheBox card) {
        super(card);}

    @Override
    public JestInTheBox copy(){
        return new JestInTheBox(this);}
}
