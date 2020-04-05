package mage.cards.s;

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
public final class SavageWildlands extends CardImpl {
    private static final FilterControlledPermanent controlForest = new FilterControlledPermanent("you control a Forest");
    private static final FilterControlledPermanent controlMountain = new FilterControlledPermanent("you control a Mountain");

    static {
        controlForest.add(SubType.FOREST.getPredicate());
        controlMountain.add(SubType.MOUNTAIN.getPredicate());
    }

    public SavageWildlands(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {R}. Activate this ability only if you control a Forest.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.RedMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlForest)));

        // {tap}: Add {G}. Activate this ability only if you control a Mountain.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.GreenMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlMountain)));
    }

    public SavageWildlands(final SavageWildlands card) { super(card); }

    @Override
    public SavageWildlands copy() { return new SavageWildlands(this); }
}
