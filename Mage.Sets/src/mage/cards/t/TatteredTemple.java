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
public final class TatteredTemple extends CardImpl {
    private static final FilterControlledPermanent controlSwamp = new FilterControlledPermanent("you control a Swamp");
    private static final FilterControlledPermanent controlPlains = new FilterControlledPermanent("you control a Plains");

    static {
        controlSwamp.add(SubType.SWAMP.getPredicate());
        controlPlains.add(SubType.PLAINS.getPredicate());
    }

    public TatteredTemple(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {tap}: Add {W}. Activate this ability only if you control a Swamp.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.WhiteMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlSwamp)));

        // {tap}: Add {B}. Activate this ability only if you control a Plains.
        this.addAbility(new ActivateIfConditionManaAbility(
                Zone.BATTLEFIELD,
                new BasicManaEffect(Mana.BlackMana(1)),
                new TapSourceCost(),
                new PermanentsOnTheBattlefieldCondition(controlPlains)));
    }

    public TatteredTemple(final TatteredTemple card) { super(card); }

    @Override
    public TatteredTemple copy() { return new TatteredTemple(this); }
}
