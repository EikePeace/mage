
package mage.filter.common;

import mage.filter.FilterImpl;
import mage.filter.FilterPlayer;
import mage.filter.predicate.Predicate;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.other.PlayerIdPredicate;
import mage.filter.predicate.permanent.ControllerIdPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class FilterPlaneswalkerStructureOrPlayer extends FilterImpl<Object> {
    protected final FilterPermanentPlaneswalkerOrStructure planeswalkerOrStructureFilter;
    protected final FilterPlayer playerFilter;

    public FilterPlaneswalkerStructureOrPlayer(Set<UUID> defenders) {
        super("player, planeswalker, or Structure");

        List<Predicate<Permanent>> permanentPredicates = new ArrayList<>();
        for (UUID defenderId : defenders) {
            permanentPredicates.add(new ControllerIdPredicate(defenderId));
        }
        planeswalkerOrStructureFilter = new FilterPermanentPlaneswalkerOrStructure();
        planeswalkerOrStructureFilter.add(Predicates.or(permanentPredicates));

        List<Predicate<Player>> playerPredicates = new ArrayList<>();
        for (UUID defenderId : defenders) {
            playerPredicates.add(new PlayerIdPredicate(defenderId));
        }
        playerFilter = new FilterPlayer();
        playerFilter.add(Predicates.or(playerPredicates));
    }

    public FilterPlaneswalkerStructureOrPlayer(final FilterPlaneswalkerStructureOrPlayer filter) {
        super(filter);
        this.planeswalkerOrStructureFilter = filter.planeswalkerOrStructureFilter.copy();
        this.playerFilter = filter.playerFilter.copy();
    }

    public FilterPermanentPlaneswalkerOrStructure getFilterPermanent() { return this.planeswalkerOrStructureFilter; }

    public FilterPlayer getFilterPlayer() { return this.playerFilter; }

    @Override
    public boolean checkObjectClass(Object object) { return true; }

    @Override
    public boolean match(Object o, Game game) {
        if (o instanceof Player) {
            return playerFilter.match((Player) o, game);
        } else if (o instanceof Permanent) {
            return planeswalkerOrStructureFilter.match((Permanent) o, game);
        }
        return false;
    }

    @Override
    public FilterPlaneswalkerStructureOrPlayer copy() { return new FilterPlaneswalkerStructureOrPlayer(this); }
}
