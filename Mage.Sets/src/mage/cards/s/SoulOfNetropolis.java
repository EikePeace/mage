package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.Cost;
import mage.abilities.costs.common.ExileSourceFromGraveCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.PutLibraryIntoGraveTargetEffect;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.TargetPlayer;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class SoulOfNetropolis extends CardImpl {
    public SoulOfNetropolis (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{U}{B}");
        this.subtype.add(SubType.AVATAR);

        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Menace
        this.addAbility(new MenaceAbility());

        // {3}{U}{B}: Target player puts the top ten cards of their library into their graveyard.
        Ability ability = new SimpleActivatedAbility(new PutLibraryIntoGraveTargetEffect(10), new ManaCostsImpl("{3}{U}{B}"));
        ability.addTarget(new TargetPlayer());
        this.addAbility(ability);

        // {3}{U}{B}, Exile Soul of Netropolis from your graveyard: Target player puts the top ten
        // cards of their library into their graveyard.
        ability = new SimpleActivatedAbility(Zone.GRAVEYARD, new PutLibraryIntoGraveTargetEffect(10), new ManaCostsImpl("{3}{U}{B}"));
        ability.addTarget(new TargetPlayer());
        Cost cost = new ExileSourceFromGraveCost();
        cost.setText("Exile {this} from your graveyard");
        ability.addCost(cost);
        this.addAbility(ability);
    }

    public SoulOfNetropolis (final SoulOfNetropolis card){
        super(card);
    }

    @Override
    public SoulOfNetropolis copy(){
        return new SoulOfNetropolis(this);
    }
}
