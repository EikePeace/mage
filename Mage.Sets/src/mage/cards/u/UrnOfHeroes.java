package mage.cards.u;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.effects.SearchEffect;
import mage.abilities.mana.ColorlessManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.target.common.TargetCardInLibrary;
import mage.game.Game;
import mage.players.Player;

/**
 *
 * @author RogueAustralian
 */
public final class UrnOfHeroes extends CardImpl {

	public UrnOfHeroes (UUID ownerId, CardSetInfo setInfo) {
		super(ownerId,setInfo,new CardType[]{CardType.ARTIFACT},"{3}");
		this.addSuperType(SuperType.LEGENDARY);
		this.addAbility(new ColorlessManaAbility());
		this.addAbility(new EntersBattlefieldAbility(new SearchLibraryPutInGraveyard()));
	}

	public UrnOfHeroes (final UrnOfHeroes card) {
		super(card);
	}

	@Override
	public UrnOfHeroes copy() {
		return new UrnOfHeroes(this);
	}

}
class SearchLibraryPutInGraveyard extends SearchEffect {

	private static final FilterCard filter = new FilterCard("legendary card");
	static {
		filter.add(SuperType.LEGENDARY.getPredicate());
	}
	public SearchLibraryPutInGraveyard() {
		super(new TargetCardInLibrary(filter), Outcome.Neutral);
		staticText = "Search your library for a legendary card and put that card into your graveyard, then shuffle your library";
	}

	public SearchLibraryPutInGraveyard(final SearchLibraryPutInGraveyard effect) {
		super(effect);
	}

	@Override
	public SearchLibraryPutInGraveyard copy() {
		return new SearchLibraryPutInGraveyard(this);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Player controller = game.getPlayer(source.getControllerId());
		if (controller == null) {
			return false;
		}
		if (controller.searchLibrary(target, source, game)) {
			controller.moveCards(game.getCard(target.getFirstTarget()), Zone.GRAVEYARD, source, game);
		}
		controller.shuffleLibrary(source, game);
		return true;
	}

}