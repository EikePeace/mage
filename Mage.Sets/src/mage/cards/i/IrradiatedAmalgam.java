package mage.cards.i;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.mana.ColorlessManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.game.permanent.token.ZombieMutantToken;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class IrradiatedAmalgam extends CardImpl {
    public IrradiatedAmalgam(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{B}{G}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.MUTANT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // {T}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {6}, {T}, Sacrifice Irradiated Amalgam: Create two tapped 2/2 black Zombie Mutant creature tokens with deathtouch.
        Ability ability = new SimpleActivatedAbility(new CreateTokenEffect(new ZombieMutantToken(), 2, true, false), new ManaCostsImpl("{6}"));
        ability.addCost(new TapSourceCost());
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);
    }

    public IrradiatedAmalgam(final IrradiatedAmalgam card) { super(card); }

    @Override
    public IrradiatedAmalgam copy() { return new IrradiatedAmalgam(this); }
}
