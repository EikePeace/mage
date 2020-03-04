package mage.cards.e;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.continuous.PlayAdditionalLandsControllerEffect;
import mage.abilities.effects.common.ruleModifying.PlayLandsFromGraveyardEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class ExpeditionCorps extends CardImpl {
    public ExpeditionCorps(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{G}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SCOUT);

        this.power = new MageInt(3);
        this.toughness = new MageInt(1);

        // You may play land cards from your graveyard.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new PlayLandsFromGraveyardEffect()));

        // You may play an additional land on each of your turns.
        this.addAbility(new SimpleStaticAbility(new PlayAdditionalLandsControllerEffect(1, Duration.WhileOnBattlefield)));
    }

    public ExpeditionCorps(final ExpeditionCorps card) { super(card); }

    @Override
    public ExpeditionCorps copy() { return new ExpeditionCorps(this); }
}
