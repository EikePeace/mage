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
public final class OminousCaldera extends CardImpl {
    private static final FilterControlledPermanent controlMountain = new FilterControlledPermanent("you control a Mountain");
    private static final FilterControlledPermanent controlSwamp = new FilterControlledPermanent("you control a Swamp");

    static {
        controlMountain.add(SubType.MOUNTAIN.getPredicate());
        controlSwamp.add(SubType.SWAMP.getPredicate());
    }

    public OminousCaldera(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {B}. Activate this ability only if you control a Mountain.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.BlackMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlMountain)));

        // {tap}: Add {R}. Activate this ability only if you control a Swamp.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.RedMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlSwamp)));
    }

    public OminousCaldera(final OminousCaldera card) { super(card); }

    @Override
    public OminousCaldera copy() { return new OminousCaldera(this); }
}
