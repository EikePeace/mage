package mage.cards.t;

import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.effects.common.continuous.GainAbilitySourceEffect;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class TwilightPaladin extends CardImpl {

    public TwilightPaladin (UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}{B}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.KNIGHT);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Lifelink
        this.addAbility(LifelinkAbility.getInstance());

        // {W}{B}: Twilight Paladin gains first strike until end of turn.
        this.addAbility(new SimpleActivatedAbility(
                Zone.BATTLEFIELD, new GainAbilitySourceEffect(FirstStrikeAbility.getInstance(), Duration.EndOfTurn), new ManaCostsImpl("{W}{B}")));

        // {1}{W}{B}: Twilight Paladin gets +2/+2 until end of turn.
        this.addAbility(new SimpleActivatedAbility(
                Zone.BATTLEFIELD, new BoostSourceEffect(2, 2, Duration.EndOfTurn), new ManaCostsImpl("{1}{W}{B}")));
    }

    public TwilightPaladin(final TwilightPaladin card){
        super(card);
    }

    @Override
    public TwilightPaladin copy() {
        return new TwilightPaladin(this);
    }
}
