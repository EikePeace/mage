package mage.cards.m;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ComparisonType;
import mage.constants.SubType;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.PowerPredicate;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class MarshcroakerDrake extends CardImpl {
    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creature with power 2 or less");
    static {
        filter.add(new PowerPredicate(ComparisonType.FEWER_THAN, 3));
    }

    public MarshcroakerDrake(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{U}{U}");
        this.subtype.add(SubType.FROG);
        this.subtype.add(SubType.DRAKE);

        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // When Marshcroaker Drake enters the battlefield, you may return target creature with power 2 or less to its owner's hand.
        Ability ability = new EntersBattlefieldTriggeredAbility(new ReturnToHandTargetEffect(), true);
        ability.addTarget(new TargetCreaturePermanent(filter));
        this.addAbility(ability);
    }

    public MarshcroakerDrake(final MarshcroakerDrake card) { super(card); }

    @Override
    public MarshcroakerDrake copy() { return new MarshcroakerDrake(this); }
}
