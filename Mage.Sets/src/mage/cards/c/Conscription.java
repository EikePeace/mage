package mage.cards.c;

import mage.abilities.Ability;
import mage.abilities.common.BeginningOfCombatTriggeredAbility;
import mage.abilities.common.DiscoveryAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.abilities.effects.common.continuous.BoostAllEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.permanent.token.SoldierVigilanceToken;
import mage.game.permanent.token.SoldierVigilanceToken2;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Conscription extends CardImpl {
    public Conscription(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{W}");
        this.subtype.add(SubType.DISCOVERY);

        // <i>(As this Discovery enters and after your draw step, add a progress counter. Stop after you've discovered.)</i>
        DiscoveryAbility discoveryAbility = new DiscoveryAbility(this, SagaChapter.CHAPTER_II);

        //I, II — Create a 1/1 white Soldier creature token with vigilance.
        discoveryAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, SagaChapter.CHAPTER_II, new CreateTokenEffect(new SoldierVigilanceToken2()));
        //{DISCOVER} — At the beginning of combat on your turn, you may pay {2}{W}. If you do, creatures you control get +1/+1 until end of turn.
        Ability ability = new BeginningOfCombatTriggeredAbility(
                new DoIfCostPaid(
                        new BoostControlledEffect(1, 1, Duration.EndOfTurn, new FilterCreaturePermanent()),
                        new ManaCostsImpl("{2}{W}")),
                TargetController.YOU, false);
        discoveryAbility.addDiscoverAbility(this, ability);
        this.addAbility(discoveryAbility);
    }


    public Conscription(final Conscription card) {
        super(card);
    }

    @Override
    public Conscription copy() {
        return new Conscription(this);
    }
}

