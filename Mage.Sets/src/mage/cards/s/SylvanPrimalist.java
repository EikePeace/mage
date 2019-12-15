package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.game.permanent.token.BeastToken;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SylvanPrimalist extends CardImpl {

    public SylvanPrimalist(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{G}");
        this.subtype.add(SubType.ELF, SubType.SCOUT);

        this.power = new MageInt(0);
        this.toughness = new MageInt(1);

        // {2}{G}, Sacrifice Sylvan Primalist: Create a 3/3 green Beast creature token.
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new CreateTokenEffect(new BeastToken()), new ManaCostsImpl("{2}{G}"));
        ability.addCost(new SacrificeSourceCost());
        this.addAbility(ability);
    }

    public SylvanPrimalist(final SylvanPrimalist card){
        super(card);
    }

    @Override
    public SylvanPrimalist copy(){
        return new SylvanPrimalist(this);
    }
}
