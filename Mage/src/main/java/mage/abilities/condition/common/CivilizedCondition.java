package mage.abilities.condition.common;

import mage.abilities.Ability;
import mage.abilities.condition.Condition;
import mage.constants.CardType;
import mage.filter.FilterPermanent;
import mage.game.Game;

/**
 * Describes condition when Metacraft mechanic is turned on.
 *
 * @author nantuko
 */
public enum CivilizedCondition implements Condition {
    instance;
    private static final FilterPermanent filter = new FilterPermanent("artifact");
    private static final FilterPermanent filter2 = new FilterPermanent("creature");
    private static final FilterPermanent filter3 = new FilterPermanent("enchantment");

    static {
        filter.add(CardType.ARTIFACT.getPredicate());
        filter2.add(CardType.CREATURE.getPredicate());
        filter3.add(CardType.ENCHANTMENT.getPredicate());
    }


    @Override
    public boolean apply(Game game, Ability source) {
        return ( game.getBattlefield().contains(filter, source.getControllerId(), game, 1)
                &&  game.getBattlefield().contains(filter2, source.getControllerId(), 1, game)
                &&  game.getBattlefield().contains(filter3, source.getControllerId(), 1, game));
    }

    @Override
    public String toString() {
        return "you control an artifact, a creature and an enchantment";
    }

}
