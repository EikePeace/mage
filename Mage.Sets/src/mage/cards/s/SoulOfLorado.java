package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.Cost;
import mage.abilities.costs.common.ExileSourceFromGraveCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamageTargetControllerEffect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.keyword.HasteAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SoulOfLorado extends CardImpl {
    public SoulOfLorado (UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{B}{R}");
        this.subtype.add(SubType.AVATAR);

        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Haste
        this.addAbility(HasteAbility.getInstance());

        // {5}{B}{R}: Destroy target creature. Soul of Lorado deals 3 damage to that creature's controller.
        Ability ability = new SimpleActivatedAbility(new DestroyTargetEffect(), new ManaCostsImpl("{5}{B}{R}"));
        ability.addTarget(new TargetCreaturePermanent());
        Effect effect = new DamageTargetControllerEffect(3);
        effect.setText("{this} deals 3 damage to that creature's controller.");
        ability.addEffect(effect);
        this.addAbility(ability);

        // {5}{B}{R}, Exile Soul of Lorado from your graveyard: Soul of Lorado deals 3 damage to that creature's controller.
        ability = new SimpleActivatedAbility(Zone.GRAVEYARD, new DestroyTargetEffect(), new ManaCostsImpl("{5}{B}{R}"));
        ability.addTarget(new TargetCreaturePermanent());
        ability.addEffect(effect);
        Cost cost = new ExileSourceFromGraveCost();
        cost.setText("Exile {this} from your graveyard");
        ability.addCost(cost);
        this.addAbility(ability);
    }

    public SoulOfLorado(final SoulOfLorado card){
        super(card);
    }

    @Override
    public SoulOfLorado copy(){
        return new SoulOfLorado(this);
    }

}
