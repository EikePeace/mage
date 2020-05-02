package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DestroyAllEffect;
import mage.abilities.effects.common.continuous.GainControlTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.common.FilterEnchantmentPermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

/**
 * 
 * @author RogueAustralian
 *
 */
public final class SheriffJosiahWoods extends CardImpl {

	public SheriffJosiahWoods(UUID ownerId, CardSetInfo cardSetInfo) {
		super(ownerId, cardSetInfo, new CardType[]{CardType.CREATURE}, "{4}{W}{U}");
		this.subtype.add(SubType.HUMAN);
		this.subtype.add(SubType.SOLDIER);
		this.supertype.add(SuperType.LEGENDARY);
		this.power = new MageInt(4);
		this.toughness = new MageInt(4);

		Ability SheriffJosiahWoodsAbility = new EntersBattlefieldTriggeredAbility(new SheriffEffect());
		SheriffJosiahWoodsAbility.addEffect(new DestroyAllEffect(new FilterEnchantmentPermanent("enchantments")).setText(""));
		this.addAbility(SheriffJosiahWoodsAbility);
	}

	public SheriffJosiahWoods(final SheriffJosiahWoods card) {
		super(card);
	}

	@Override
	public SheriffJosiahWoods copy() {
		return new SheriffJosiahWoods(this);
	}
}

class SheriffEffect extends OneShotEffect {
	public static FilterControlledPermanent filter = new FilterControlledPermanent("gain control of all creatures enchanted by Auras you control, then destroy all enchantments");

	public SheriffEffect() {
		super(Outcome.GainControl);
		this.staticText = "gain control of all creatures enchanted by Auras you control, then destroy all enchantments";
	}

	public SheriffEffect(final SheriffEffect effect) {
		super(effect);
	}

	@Override
	public SheriffEffect copy() {
		return new SheriffEffect(this);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Player controller = game.getPlayer(source.getControllerId());
		if (controller != null) {
			filter.add(SubType.AURA.getPredicate());
			for (Permanent auraEnchantment : game.getBattlefield().getActivePermanents(filter, source.getControllerId(), source.getSourceId(), game)) {
				if (auraEnchantment.getAttachedTo() != null) {
					Permanent attachedToCreature = game.getPermanent(auraEnchantment.getAttachedTo());
					if (attachedToCreature != null && attachedToCreature.isCreature()) {
						ContinuousEffect effect = new GainControlTargetEffect(Duration.Custom, true);
						effect.setTargetPointer(new FixedTarget(attachedToCreature, game));
						game.addEffect(effect, source);
					}
				}
			}
			return true;
		}
		return false;
	}
}