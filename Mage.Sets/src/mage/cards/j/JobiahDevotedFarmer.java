package mage.cards.j;

import java.util.UUID;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.TransformSourceEffect;
import mage.abilities.keyword.TransformAbility;
import mage.cards.*;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.common.FilterInstantOrSorceryCard;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetCardInLibrary;
import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;

/**
 * @author Alvin
 */
public final class JobiahDevotedFarmer extends CardImpl {

	public JobiahDevotedFarmer(UUID ownerId, CardSetInfo setInfo) {
		super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{G}");
		this.supertype.add(SuperType.LEGENDARY);
		this.subtype.add(SubType.GOAT);
		this.subtype.add(SubType.FARMER);

		this.power = new MageInt(2);
		this.toughness = new MageInt(2);

		this.transformable = true;
		this.secondSideCardClazz = mage.cards.j.JobiahWorldShepherd.class;

		//When Jobiah, Devoted Farmer enters the battlefield, search your library for a land card, put it onto the battlefield tapped, then shuffle your library.
		this.addAbility(new EntersBattlefieldTriggeredAbility(new SearchLibraryPutInPlayEffect(new TargetCardInLibrary(StaticFilters.FILTER_CARD_LAND_A), true), true));


		//At the beginning of your upkeep, if you control five or more lands with different names, you may transform Jobiah.
		this.addAbility(new TransformAbility());
		this.addAbility(new BeginningOfUpkeepTriggeredAbility(new JobiahDevotedFarmerEffect(), TargetController.YOU, true));
	}

	public JobiahDevotedFarmer(final JobiahDevotedFarmer card) {
		super(card);
	}

	@Override
	public JobiahDevotedFarmer copy() {
		return new JobiahDevotedFarmer(this);
	}
}

class JobiahDevotedFarmerEffect extends OneShotEffect {

	private static final FilterCard filter = new FilterInstantOrSorceryCard();

	public JobiahDevotedFarmerEffect() {
		super(Outcome.Benefit);
		this.staticText = "if you control five or more lands with different names, you may transform Jobiah.";
	}

	public JobiahDevotedFarmerEffect(final JobiahDevotedFarmerEffect effect) {
		super(effect);
	}

	@Override
	public JobiahDevotedFarmerEffect copy() {
		return new JobiahDevotedFarmerEffect(this);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Player player = game.getPlayer(source.getControllerId());
		if (player == null) {
			return false;
		}
		
		int ctr = (int) game.getBattlefield()
				.getAllActivePermanents(StaticFilters.FILTER_LAND, source.getControllerId(), game)
				.stream().map(permanent -> permanent.getName()).filter(s -> s.length() > 0).distinct().count();
		if (ctr >= 5) {
			 return new TransformSourceEffect(true, true).apply(game, source);
		}
		return false;

	}
}