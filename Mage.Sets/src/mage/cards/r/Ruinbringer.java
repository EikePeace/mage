package mage.cards.r;

import mage.MageInt;
import mage.Mana;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.mana.ManaCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.mana.SimpleManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class Ruinbringer extends CardImpl {
    public Ruinbringer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SHAMAN);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // {R}, Sacrifice Ruinbringer: Add {R}{R}{R}.
        SimpleManaAbility ability = new SimpleManaAbility(Zone.BATTLEFIELD, Mana.RedMana(3), new ManaCostsImpl("{R}"));
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);
    }

    public Ruinbringer(final Ruinbringer card){
        super(card);
    }

    @Override
    public Ruinbringer copy(){
        return new Ruinbringer(this);
    }
}
