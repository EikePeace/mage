package mage.target.common;

import mage.filter.common.FilterPlayerPlaneswalkerOrStructure;

/**
 * @author Fenhl
 */
public class TargetPlayerPlaneswalkerOrStructure extends TargetPermanentOrPlayer {
    public TargetPlayerPlaneswalkerOrStructure() {
        this(1, 1, new FilterPlayerPlaneswalkerOrStructure(), false);
    }

    public TargetPlayerPlaneswalkerOrStructure(int numTargets) {
        this(numTargets, numTargets, new FilterPlayerPlaneswalkerOrStructure(), false);
    }

    public TargetPlayerPlaneswalkerOrStructure(FilterPlayerPlaneswalkerOrStructure filter) {
        this(1, 1, filter, false);
    }

    public TargetPlayerPlaneswalkerOrStructure(int minNumTargets, int maxNumTargets, FilterPlayerPlaneswalkerOrStructure filter, boolean notTarget) {
        super(minNumTargets, maxNumTargets, filter, notTarget);
    }

    public TargetPlayerPlaneswalkerOrStructure(final TargetPlayerPlaneswalkerOrStructure target) { super(target); }

    @Override
    public TargetPlayerPlaneswalkerOrStructure copy() { return new TargetPlayerPlaneswalkerOrStructure(this); }
}
