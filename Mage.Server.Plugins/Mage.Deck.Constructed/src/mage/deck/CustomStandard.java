package mage.deck;

import mage.cards.decks.Constructed;

import java.util.*;

/**
 * @author Fenhl
 */
public class CustomStandard extends Constructed {
    public CustomStandard() {
        super("Custom Standard");
        setCodes.addAll(makeLegalSets());
        banned.add("Zoulev Rites");
    }

    static List<String> makeLegalSets() { // separate method so it can be used by CustomBrawl
        List<String> codes = new ArrayList<>();
        codes.add("RAK");
        codes.add("EAU");
        codes.add("SOU");
        codes.add("NET");
        codes.add("VST");
        return codes;
    }
}
