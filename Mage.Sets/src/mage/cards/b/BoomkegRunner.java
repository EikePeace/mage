package mage.cards.b;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.TargetPlayer;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class BoomkegRunner extends CardImpl {
    public BoomkegRunner (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}");
        this.subtype.add(SubType.GOBLIN, SubType.WARRIOR);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // {R}, Sacrifice Boomkeg Runner: Boomkeg Runner deals 2 damage to target player.
        Ability ability = new SimpleActivatedAbility(new DamageTargetEffect(2), new ManaCostsImpl("{R}"));
        ability.addTarget(new TargetPlayer());
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);
    }

    private BoomkegRunner (final BoomkegRunner card){
        super(card);
    }

    @Override
    public BoomkegRunner copy(){
        return new BoomkegRunner(this);
    }
}
