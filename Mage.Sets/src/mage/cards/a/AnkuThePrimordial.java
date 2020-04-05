package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.keyword.IndestructibleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.filter.common.*;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.Target;
import mage.target.common.TargetControlledPermanent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class AnkuThePrimordial extends CardImpl {
    public AnkuThePrimordial(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{B}{R}{G}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.ELEMENTAL);
        this.subtype.add(SubType.GOD);

        this.power = new MageInt(5);
        this.toughness = new MageInt(7);

        // Indestructible
        this.addAbility(IndestructibleAbility.getInstance());

        // Whenever Anku the Primordial attacks, defending player sacrifices an artifact, a creature, an enchantment, and a land.
        this.addAbility(new AttacksTriggeredAbility(new AnkuSacrificeEffect(), false, "", SetTargetPointer.PLAYER));
    }

    public AnkuThePrimordial(final AnkuThePrimordial card) { super(card); }

    @Override
    public AnkuThePrimordial copy() { return new AnkuThePrimordial(this); }
}

class AnkuSacrificeEffect extends OneShotEffect {
    public AnkuSacrificeEffect() {
        super(Outcome.DestroyPermanent);
        staticText = "Defending player sacrifices an artifact, a creature, an enchantment, and a land";
    }

    public AnkuSacrificeEffect(AnkuSacrificeEffect effect) { super(effect); }

    @Override
    public boolean apply(Game game, Ability source) {
        List<UUID> chosen = new ArrayList<>();
        Player defendingPlayer = game.getPlayer(getTargetPointer().getFirst(game, source));
        if (defendingPlayer == null) {
            return false;
        }
        Target target1 = new TargetControlledPermanent(1, 1, StaticFilters.FILTER_CONTROLLED_PERMANENT_ARTIFACT_AN, true);
        Target target2 = new TargetControlledPermanent(1, 1, StaticFilters.FILTER_CONTROLLED_CREATURE_SHORT_TEXT, true);
        Target target3 = new TargetControlledPermanent(1, 1, new FilterControlledEnchantmentPermanent(), true);
        Target target4 = new TargetControlledPermanent(1, 1, StaticFilters.FILTER_CONTROLLED_LAND_SHORT_TEXT, true);

        if (target1.canChoose(defendingPlayer.getId(), game)) {
            while (defendingPlayer.canRespond() && !target1.isChosen() && target1.canChoose(defendingPlayer.getId(), game)) {
                defendingPlayer.chooseTarget(Outcome.Benefit, target1, source, game);
            }
            Permanent artifact = game.getPermanent(target1.getFirstTarget());
            if (artifact != null) {
                chosen.add(artifact.getId());
            }
            target1.clearChosen();
        }

        if (target2.canChoose(defendingPlayer.getId(), game)) {
            while (defendingPlayer.canRespond() && !target2.isChosen() && target2.canChoose(defendingPlayer.getId(), game)) {
                defendingPlayer.chooseTarget(Outcome.Benefit, target2, source, game);
            }
            Permanent creature = game.getPermanent(target2.getFirstTarget());
            if (creature != null) {
                chosen.add(creature.getId());
            }
            target2.clearChosen();
        }

        if (target3.canChoose(defendingPlayer.getId(), game)) {
            while (defendingPlayer.canRespond() && !target3.isChosen() && target3.canChoose(defendingPlayer.getId(), game)) {
                defendingPlayer.chooseTarget(Outcome.Benefit, target3, source, game);
            }
            Permanent enchantment = game.getPermanent(target3.getFirstTarget());
            if (enchantment != null) {
                chosen.add(enchantment.getId());
            }
            target3.clearChosen();
        }

        if (target4.canChoose(defendingPlayer.getId(), game)) {
            while (defendingPlayer.canRespond() && !target4.isChosen() && target4.canChoose(defendingPlayer.getId(), game)) {
                defendingPlayer.chooseTarget(Outcome.Benefit, target4, source, game);
            }
            Permanent land = game.getPermanent(target4.getFirstTarget());
            if (land != null) {
                chosen.add(land.getId());
            }
            target4.clearChosen();
        }

        for (UUID uuid : chosen) {
            Permanent permanent = game.getPermanent(uuid);
            if (permanent != null) {
                permanent.sacrifice(source.getSourceId(), game);
            }
        }
        return true;
    }

    @Override
    public AnkuSacrificeEffect copy() { return new AnkuSacrificeEffect(this); }
}
