package mage.cards.r;
import java.util.UUID;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeXTargetCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.dynamicvalue.common.GetXValue;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.abilities.effects.mana.AddManaOfAnyColorEffect;
import mage.abilities.mana.ColorlessManaAbility;
import mage.abilities.mana.DynamicManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.game.permanent.token.LotusPetalToken;

/**
 *
 * @author RogueAustralian
 *
 */
public final class RoyalDomain extends CardImpl {


    public RoyalDomain(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.LAND},"");

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());

        // {2}, {tap}: Add 3 mana of any color
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new AddManaOfAnyColorEffect(3), new TapSourceCost()));
        
        // {3}, {tap}: Create a lotus petal token
        Ability lotusAbility = new SimpleActivatedAbility(Zone.BATTLEFIELD, new CreateTokenEffect(new LotusPetalToken()), new ManaCostsImpl("{3}"));
        lotusAbility.addCost(new TapSourceCost());
        this.addAbility(lotusAbility);

    }

    public RoyalDomain(final RoyalDomain card) {
        super(card);
    }

    @Override
    public RoyalDomain copy() {
        return new RoyalDomain(this);
    }
}