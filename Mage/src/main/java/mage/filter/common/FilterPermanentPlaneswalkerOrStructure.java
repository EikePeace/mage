package mage.filter.common;

import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.FilterPermanent;
import mage.filter.predicate.Predicates;

/**
 * @author Fenhl
 */
public class FilterPermanentPlaneswalkerOrStructure extends FilterPermanent {
    public FilterPermanentPlaneswalkerOrStructure() {
        this("planeswalker or Structure");
    }

    public FilterPermanentPlaneswalkerOrStructure(String name) {
        super(name);
        this.add(Predicates.or(CardType.PLANESWALKER.getPredicate(), SubType.STRUCTURE.getPredicate()));
    }

    public FilterPermanentPlaneswalkerOrStructure(final FilterPermanentPlaneswalkerOrStructure filter) { super(filter); }

    @Override
    public FilterPermanentPlaneswalkerOrStructure copy() { return new FilterPermanentPlaneswalkerOrStructure(this); }
}
