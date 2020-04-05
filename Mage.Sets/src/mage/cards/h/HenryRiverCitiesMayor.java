package mage.cards.h;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.SpellAbility;
import mage.abilities.common.CantBeCounteredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.cost.CostModificationEffectImpl;
import mage.abilities.keyword.VigilanceAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.Game;
import mage.util.CardUtil;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class HenryRiverCitiesMayor extends CardImpl {
    public HenryRiverCitiesMayor(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}{W}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ADVISOR);

        this.power = new MageInt(4);
        this.toughness = new MageInt(3);

        // This spell can't be countered.
        this.addAbility(new CantBeCounteredAbility());

        // Vigilance
        this.addAbility(VigilanceAbility.getInstance());

        // Noncreature spells cost {1} more to cast.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new HenryRiverCitiesMayorCostReductionEffect()));
    }

    public HenryRiverCitiesMayor(final HenryRiverCitiesMayor card) { super(card); }

    @Override
    public HenryRiverCitiesMayor copy() { return new HenryRiverCitiesMayor(this); }
}

class HenryRiverCitiesMayorCostReductionEffect extends CostModificationEffectImpl {
    HenryRiverCitiesMayorCostReductionEffect() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit, CostModificationType.INCREASE_COST);
        staticText = "Noncreature spells cost {1} more to cast";
    }

    HenryRiverCitiesMayorCostReductionEffect(HenryRiverCitiesMayorCostReductionEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source, Ability abilityToModify) {
        CardUtil.increaseCost(abilityToModify, 1);
        return true;
    }

    @Override
    public boolean applies(Ability abilityToModify, Ability source, Game game) {
        if (abilityToModify instanceof SpellAbility) {
            Card card = game.getCard(abilityToModify.getSourceId());
            if (card != null && !card.isCreature()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public HenryRiverCitiesMayorCostReductionEffect copy() {
        return new HenryRiverCitiesMayorCostReductionEffect(this);
    }
}
