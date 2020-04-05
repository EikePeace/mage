package mage.filter.common;

import mage.filter.FilterPlayer;
import mage.filter.StaticFilters;

/**
 * @author Fenhl
 */
public class FilterPlayerPlaneswalkerOrStructure extends FilterPermanentOrPlayer {
    public FilterPlayerPlaneswalkerOrStructure() { this("player or planeswalker"); }

    public FilterPlayerPlaneswalkerOrStructure(String name) {
        super(name, StaticFilters.FILTER_PERMANENT_PLANESWALKER_OR_STRUCTURE, new FilterPlayer());
    }

    public FilterPlayerPlaneswalkerOrStructure(final FilterPlayerPlaneswalkerOrStructure filter) { super(filter); }

    @Override
    public FilterPlayerPlaneswalkerOrStructure copy() { return new FilterPlayerPlaneswalkerOrStructure(this); }
}
