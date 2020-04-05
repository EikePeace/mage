package mage.cards.d;

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
public final class DewdropRainforest extends CardImpl {
    private static final FilterControlledPermanent controlIsland = new FilterControlledPermanent("you control an Island");
    private static final FilterControlledPermanent controlForest = new FilterControlledPermanent("you control a Forest");

    static {
        controlIsland.add(SubType.ISLAND.getPredicate());
        controlForest.add(SubType.FOREST.getPredicate());
    }

    public DewdropRainforest(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {G}. Activate this ability only if you control an Island.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.GreenMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlIsland)));

        // {tap}: Add {U}. Activate this ability only if you control a Forest.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.BlueMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlForest)));
    }

    public DewdropRainforest(final DewdropRainforest card) { super(card); }

    @Override
    public DewdropRainforest copy() { return new DewdropRainforest(this); }
}
