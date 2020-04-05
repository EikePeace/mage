package mage.abilities.condition.common;

import mage.abilities.Ability;
import mage.abilities.condition.Condition;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.predicate.mageobject.NamePredicate;
import mage.game.Game;

/**
 *
 * @author Fenhl
 */
public enum ControlsParadiseCondition implements Condition {
    instance;
    private static final FilterControlledPermanent filter = new FilterControlledPermanent("a permanent named Paradise");
    static {
        filter.add(new NamePredicate("Paradise"));
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return game.getBattlefield().contains(filter, source.getControllerId(), game, 1);
    }

    @Override
    public String toString() { return "you control Paradise"; }
}
