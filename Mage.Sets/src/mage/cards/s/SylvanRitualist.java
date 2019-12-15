package mage.cards.s;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.continuous.GainAbilityControlledEffect;
import mage.abilities.mana.AnyColorManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.StaticFilters;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SylvanRitualist extends CardImpl {
    public SylvanRitualist(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}");
        this.subtype.add(SubType.ELF, SubType.DRUID);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Creatures you control have "{T}: Add one mana of any color."
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new GainAbilityControlledEffect(
                new AnyColorManaAbility(), Duration.WhileOnBattlefield, StaticFilters.FILTER_PERMANENT_CREATURES, false)));
    }

    public SylvanRitualist(final SylvanRitualist card){
        super(card);
    }

    @Override
    public SylvanRitualist copy(){
        return new SylvanRitualist(this);
    }
}
