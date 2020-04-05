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
public final class SplendidOasis extends CardImpl {
    private static final FilterControlledPermanent controlPlains = new FilterControlledPermanent("you control a Plains");
    private static final FilterControlledPermanent controlForest = new FilterControlledPermanent("you control a Forest");

    static {
        controlPlains.add(SubType.PLAINS.getPredicate());
        controlForest.add(SubType.FOREST.getPredicate());
    }

    public SplendidOasis(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {G}. Activate this ability only if you control a Plains.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.GreenMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlPlains)));

        // {tap}: Add {W}. Activate this ability only if you control a Forest.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.WhiteMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlForest)));
    }

    public SplendidOasis(final SplendidOasis card) { super(card); }

    @Override
    public SplendidOasis copy() { return new SplendidOasis(this); }
}
