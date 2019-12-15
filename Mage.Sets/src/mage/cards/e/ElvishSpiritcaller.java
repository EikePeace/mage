package mage.cards.e;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.Mode;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.ReturnFromGraveyardToHandTargetEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetCardInYourGraveyard;
import mage.target.common.TargetNonlandPermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class ElvishSpiritcaller extends CardImpl {

    public ElvishSpiritcaller(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}{U}");
        this.subtype.add(SubType.ELF);
        this.subtype.add(SubType.DRUID);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // When Elvish Spiritcaller enters the battlefield, choose one -
        // * Return target nonland permanent to its owner's hand.
        Ability ability = new EntersBattlefieldTriggeredAbility(new ReturnToHandTargetEffect());
        ability.addTarget(new TargetNonlandPermanent());

        // * Return target card from your graveyard to your hand.
        Mode mode = new Mode();
        mode.addEffect(new ReturnFromGraveyardToHandTargetEffect());
        mode.addTarget(new TargetCardInYourGraveyard());
        ability.addMode(mode);

        this.addAbility(ability);
    }

    public ElvishSpiritcaller(final ElvishSpiritcaller card) {
        super(card);
    }

    @Override
    public ElvishSpiritcaller copy() {
        return new ElvishSpiritcaller(this);
    }
}
