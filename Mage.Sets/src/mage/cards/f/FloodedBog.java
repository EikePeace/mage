package mage.cards.f;

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
public final class FloodedBog extends CardImpl {
    private static final FilterControlledPermanent controlSwamp = new FilterControlledPermanent("you control a Swamp");
    private static final FilterControlledPermanent controlIsland = new FilterControlledPermanent("you control an Island");

    static {
        controlSwamp.add(SubType.SWAMP.getPredicate());
        controlIsland.add(SubType.ISLAND.getPredicate());
    }

    public FloodedBog(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {U}. Activate this ability only if you control a Swamp.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.BlueMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlSwamp)));

        // {tap}: Add {B}. Activate this ability only if you control an Island.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.BlackMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlIsland)));
    }

    public FloodedBog(final FloodedBog card) { super(card); }

    @Override
    public FloodedBog copy() { return new FloodedBog(this); }
}
