package mage.cards.m;

import mage.MageInt;
import mage.abilities.common.LimitedTimesPerTurnActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
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
public final class MosshideBaloth extends CardImpl {
    public MosshideBaloth (UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}");
        this.subtype.add(SubType.BEAST);

        this.power = new MageInt(2);
        this.toughness = new MageInt(4);
        this.addAbility(new LimitedTimesPerTurnActivatedAbility(Zone.BATTLEFIELD, new BoostSourceEffect(4, 2, Duration.EndOfTurn), new ManaCostsImpl("{3}{G}{G}")));
    }

    public MosshideBaloth(final MosshideBaloth card) {
        super(card);
    }

    @Override
    public MosshideBaloth copy(){
        return new MosshideBaloth(this);
}}
