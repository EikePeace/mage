package mage.cards.m;

import mage.abilities.Ability;
import mage.abilities.Mode;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.common.delayed.OnLeaveReturnExiledToBattlefieldAbility;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.ExileUntilSourceLeavesEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.filter.common.FilterNonlandPermanent;
import mage.game.permanent.token.TokenImpl;
import mage.target.TargetPermanent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public class MasterOfMarbleRow extends CardImpl {
    public MasterOfMarbleRow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{W}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ARTIFICER);

        // When Master of Marble Row enters the battlefield, choose one —
        // • Create a colorless Monument artifact token with “Creatures you control get +1/+1.”
        Ability ability = new EntersBattlefieldTriggeredAbility(new CreateTokenEffect(new MonumentToken()));

        // • Create a white Cloister enchantment token with “When this enchantment enters the battlefield, exile target nonland permanent an opponent controls until this enchantment leaves the battlefield.”
        Mode mode = new Mode();
        mode.addEffect(new CreateTokenEffect(new CloisterToken()));
        ability.addMode(mode);
        this.addAbility(ability);
    }

    public MasterOfMarbleRow(final MasterOfMarbleRow card) {
        super(card);
    }

    @Override
    public MasterOfMarbleRow copy() {
        return new MasterOfMarbleRow(this);
    }
}

class MonumentToken extends TokenImpl {
    private static final List<String> tokenImageSets = new ArrayList<>();

    static {
        tokenImageSets.add("SOU");
    }

    MonumentToken() {
        super("Monument", "colorless Monument artifact token with \"Creatures you control get +1/+1.\"");
        availableImageSetCodes = tokenImageSets;
        cardType.add(CardType.ARTIFACT);
        subtype.add(SubType.MONUMENT);

        // Creatures you control get +1/+1.
        this.addAbility(new SimpleStaticAbility(
                new BoostControlledEffect(1, 1, Duration.WhileOnBattlefield)
        ));
    }

    MonumentToken(final MonumentToken token) {
        super(token);
    }

    @Override
    public MonumentToken copy() {
        return new MonumentToken(this);
    }
}

class CloisterToken extends TokenImpl {
    private static final List<String> tokenImageSets = new ArrayList<>();
    private static final FilterNonlandPermanent filter = new FilterNonlandPermanent();

    static {
        tokenImageSets.add("SOU");
        filter.add(TargetController.OPPONENT.getControllerPredicate());
    }

    CloisterToken() {
        super("Cloister", "white Cloister enchantment token with \"When this enchantment enters the battlefield, exile target nonland permanent an opponent controls until this enchantment leaves the battlefield.\"");
        availableImageSetCodes = tokenImageSets;
        color.setWhite(true);
        cardType.add(CardType.ENCHANTMENT);
        subtype.add(SubType.CLOISTER);

        // When this enchantment enters the battlefield, exile target nonland permanent an opponent controls until this enchantment leaves the battlefield.
        Ability ability = new EntersBattlefieldTriggeredAbility(new ExileUntilSourceLeavesEffect(filter.getMessage()));
        ability.addTarget(new TargetPermanent(filter));
        ability.addEffect(new CreateDelayedTriggeredAbilityEffect(new OnLeaveReturnExiledToBattlefieldAbility()));
        this.addAbility(ability);
    }

    CloisterToken(final CloisterToken token) {
        super(token);
    }

    @Override
    public CloisterToken copy() {
        return new CloisterToken(this);
    }
}
