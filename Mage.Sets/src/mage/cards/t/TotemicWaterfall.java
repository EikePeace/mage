package mage.cards.t;

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
public final class TotemicWaterfall extends CardImpl {
    private static final FilterControlledPermanent controlMountain = new FilterControlledPermanent("you control an Island");
    private static final FilterControlledPermanent controlIsland = new FilterControlledPermanent("you control a Forest");

    static {
        controlMountain.add(SubType.MOUNTAIN.getPredicate());
        controlIsland.add(SubType.ISLAND.getPredicate());
    }

    public TotemicWaterfall(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {U}. Activate this ability only if you control a Mountain.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.BlueMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlMountain)));

        // {tap}: Add {R}. Activate this ability only if you control an Island.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.RedMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlIsland)));
    }

    public TotemicWaterfall(final TotemicWaterfall card) { super(card); }

    @Override
    public TotemicWaterfall copy() { return new TotemicWaterfall(this); }
}
