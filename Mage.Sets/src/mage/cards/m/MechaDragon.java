
package mage.cards.m;

import java.util.UUID;
import mage.MageInt;
import mage.Mana;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.mana.ColoredManaCost;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.effects.common.continuous.GainAbilitySourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.mana.SimpleManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterControlledPermanent;
import mage.target.common.TargetControlledPermanent;

/**
 *
 * @author RogueAustralian
 */
public final class MechaDragon extends CardImpl {

	private static final FilterControlledPermanent filter = new FilterControlledPermanent("an artifact");

    static {
        filter.add(CardType.ARTIFACT.getPredicate());
    }
	
    public MechaDragon(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ARTIFACT, CardType.CREATURE},"{3}{R}{R}");
        this.subtype.add(SubType.DRAGON);
        this.subtype.add(SubType.CONSTRUCT);

        this.power = new MageInt(5);
        this.toughness = new MageInt(4);
        this.addAbility(FlyingAbility.getInstance());
        GainAbilitySourceEffect haste = new GainAbilitySourceEffect(HasteAbility.getInstance());
        haste.setDuration(Duration.EndOfTurn);
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new BoostSourceEffect(1, 0, Duration.EndOfTurn), new ColoredManaCost(ColoredManaSymbol.R)));
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, haste, new ColoredManaCost(ColoredManaSymbol.R)));
        this.addAbility(new SimpleManaAbility(Zone.BATTLEFIELD, Mana.RedMana(1), new SacrificeTargetCost(new TargetControlledPermanent(filter))));
    }

    public MechaDragon(final MechaDragon card) {
        super(card);
    }

    @Override
    public MechaDragon copy() {
        return new MechaDragon(this);
    }
}
