package mage.cards.e;

import mage.MageInt;
import mage.Mana;
import mage.abilities.Abilities;
import mage.abilities.Ability;
import mage.abilities.ActivatedAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ManaEffect;
import mage.abilities.keyword.AdaptAbility;
import mage.abilities.mana.ActivatedManaAbilityImpl;
import mage.abilities.mana.SimpleManaAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.choices.Choice;
import mage.choices.ChoiceColor;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.common.FilterLandCard;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.NamePredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetCardInLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author RogueAustralian
 */
public final class Echoshells extends CardImpl {

    public Echoshells(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{4}");

        // {T}: Add one mana of any type that a land you control could produce
        this.addAbility(new SimpleManaAbility(Zone.BATTLEFIELD, new AnyColorLandsProduceManaEffect(), new TapSourceCost()));
        
        // {3}, {T}: Search your library for a land card that doesn't have the same name as a land you control, put it onto the battlefield, then shuffle your library.
        SimpleActivatedAbility echo = new SimpleActivatedAbility(new EchoshellsEffect(), new TapSourceCost());
        echo.addCost(new ManaCostsImpl("{3}"));
        this.addAbility(echo);
        
    }

    private Echoshells(final Echoshells card) {
        super(card);
    }

    @Override
    public Echoshells copy() {
        return new Echoshells(this);
    }
}

class AnyColorLandsProduceManaEffect extends ManaEffect {

    private boolean inManaTypeCalculation = false;

    AnyColorLandsProduceManaEffect() {
        super();
        staticText = "Add one mana of any type that a land you control could produce.";
    }

    private AnyColorLandsProduceManaEffect(final AnyColorLandsProduceManaEffect effect) {
        super(effect);
    }

    @Override
    public List<Mana> getNetMana(Game game, Ability source) {
        int manaAmount = 1;
        List<Mana> netManas = new ArrayList<>();
        Mana types = getManaTypes(game, source);
        if (types.getRed() > 0) {
            netManas.add(Mana.RedMana(manaAmount));
        }
        if (types.getGreen() > 0) {
            netManas.add(Mana.GreenMana(manaAmount));
        }
        if (types.getBlue() > 0) {
            netManas.add(Mana.BlueMana(manaAmount));
        }
        if (types.getWhite() > 0) {
            netManas.add(Mana.WhiteMana(manaAmount));
        }
        if (types.getBlack() > 0) {
            netManas.add(Mana.BlackMana(manaAmount));
        }
        if (types.getColorless() > 0) {
            netManas.add(Mana.ColorlessMana(manaAmount));
        }
        if (types.getAny() > 0) {
            netManas.add(Mana.AnyMana(manaAmount));
        }
        return netManas;
    }

    @Override
    public Mana produceMana(Game game, Ability source) {
        Mana mana = new Mana();
        if (game == null) {
            return mana;
        }
        int manaAmount = 1;
        Mana types = getManaTypes(game, source);
        Choice choice = new ChoiceColor(true);
        choice.getChoices().clear();
        choice.setMessage("Pick a mana color");
        if (types.getBlack() > 0) {
            choice.getChoices().add("Black");
        }
        if (types.getRed() > 0) {
            choice.getChoices().add("Red");
        }
        if (types.getBlue() > 0) {
            choice.getChoices().add("Blue");
        }
        if (types.getGreen() > 0) {
            choice.getChoices().add("Green");
        }
        if (types.getWhite() > 0) {
            choice.getChoices().add("White");
        }
        if (types.getColorless() > 0) {
            choice.getChoices().add("Colorless");
        }
        if (types.getAny() > 0) {
            choice.getChoices().add("Black");
            choice.getChoices().add("Red");
            choice.getChoices().add("Blue");
            choice.getChoices().add("Green");
            choice.getChoices().add("White");
            choice.getChoices().add("Colorless");
        }
        if (!choice.getChoices().isEmpty()) {
            Player player = game.getPlayer(source.getControllerId());
            if (choice.getChoices().size() == 1) {
                choice.setChoice(choice.getChoices().iterator().next());
            } else if (player == null || !player.choose(outcome, choice, game)) {
                return mana;
            }
            if (choice.getChoice() != null) {
                switch (choice.getChoice()) {
                    case "Black":
                        mana.setBlack(manaAmount);
                        break;
                    case "Blue":
                        mana.setBlue(manaAmount);
                        break;
                    case "Red":
                        mana.setRed(manaAmount);
                        break;
                    case "Green":
                        mana.setGreen(manaAmount);
                        break;
                    case "White":
                        mana.setWhite(manaAmount);
                        break;
                    case "Colorless":
                        mana.setColorless(manaAmount);
                        break;
                }
            }
        }
        return mana;
    }

    @Override
    public AnyColorLandsProduceManaEffect copy() {
        return new AnyColorLandsProduceManaEffect(this);
    }

    private Mana getManaTypes(Game game, Ability source) {
        Mana types = new Mana();
        if (game == null || game.getPhase() == null) {
            return types;
        }
        if (inManaTypeCalculation) {
            return types;
        }
        inManaTypeCalculation = true;
        List<Permanent> lands = game.getBattlefield().getActivePermanents(StaticFilters.FILTER_CONTROLLED_PERMANENT_LAND, source.getControllerId(), source.getSourceId(), game);
        for (Permanent land : lands) {
            Abilities<ActivatedManaAbilityImpl> mana = land.getAbilities().getActivatedManaAbilities(Zone.BATTLEFIELD);
            for (ActivatedManaAbilityImpl ability : mana) {
                if (!ability.equals(source) && ability.definesMana(game)) {
                    for (Mana netMana : ability.getNetMana(game)) {
                        types.add(netMana);
                    }
                }
            }
        }
        inManaTypeCalculation = false;
        return types;
    }
}
class EchoshellsEffect extends OneShotEffect {

    public EchoshellsEffect() {
        super(Outcome.PutLandInPlay);
        staticText = "Search your library for a land card that doesn't have the same name as a land you control, put it onto the battlefield, then shuffle your library.";
    }

    public EchoshellsEffect(final EchoshellsEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Player player = game.getPlayer(source.getControllerId());
            if (player != null) {
                FilterCard filter = new FilterLandCard("land card that doesn't have the same name as a land you control");
                // get the names of lands you control
                for (Permanent land : game.getBattlefield().getAllActivePermanents(StaticFilters.FILTER_LAND, source.getControllerId(), game)) {
                    if (land != null) {
                        filter.add(Predicates.not(new NamePredicate(land.getName())));
                    }
                }
                TargetCardInLibrary targetCard = new TargetCardInLibrary(filter);
                if (player.searchLibrary(targetCard, source, game)) {
                    Card card = game.getCard(targetCard.getFirstTarget());
                    if (card != null) {
                        card.putOntoBattlefield(game, Zone.LIBRARY, source.getId(), player.getId());
                    }
                }
                player.shuffleLibrary(source, game);
            }
            return true;
        }
        return false;
    }

    @Override
    public EchoshellsEffect copy() {
        return new EchoshellsEffect(this);
    }

}
