package mage.cards.w;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.ReturnToHandFromBattlefieldAllEffect;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.AnotherPredicate;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class WavecrashLeviathan extends CardImpl {
    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("other creatures");

    static {
        filter.add(AnotherPredicate.instance);
    }

    public WavecrashLeviathan(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{5}{U}{U}{U}");
        this.subtype.add(SubType.LEVIATHAN);

        this.power = new MageInt(8);
        this.toughness = new MageInt(8);

        this.addAbility(TrampleAbility.getInstance());
        this.addAbility(new EntersBattlefieldTriggeredAbility(new ReturnToHandFromBattlefieldAllEffect(filter), false));
    }

    public WavecrashLeviathan(final WavecrashLeviathan card){
        super(card);
    }

    @Override
    public WavecrashLeviathan copy(){
        return new WavecrashLeviathan(this);
    }
}
