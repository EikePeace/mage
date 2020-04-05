package mage.cards.o;

import java.util.UUID;
import mage.Mana;
import mage.abilities.condition.common.PermanentsOnTheBattlefieldCondition;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.mana.BasicManaEffect;
import mage.abilities.mana.ActivateIfConditionManaAbility;
import mage.abilities.mana.ColorlessManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.common.FilterControlledPermanent;

/**
 *
 * @author Fenhl
 */
public final class OvergrownRuins extends CardImpl {
    private static final FilterControlledPermanent controlForest = new FilterControlledPermanent("you control a Forest");
    private static final FilterControlledPermanent controlSwamp = new FilterControlledPermanent("you control a Swamp");

    static {
        controlForest.add(SubType.FOREST.getPredicate());
        controlSwamp.add(SubType.SWAMP.getPredicate());
    }

    public OvergrownRuins(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {B}. Activate this ability only if you control an Forest.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.BlackMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlForest)));

        // {tap}: Add {G}. Activate this ability only if you control a Swamp.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.GreenMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlSwamp)));
    }

    public OvergrownRuins(final OvergrownRuins card) { super(card); }

    @Override
    public OvergrownRuins copy() { return new OvergrownRuins(this); }
}
