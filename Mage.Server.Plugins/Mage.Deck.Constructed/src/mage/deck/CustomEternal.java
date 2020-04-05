package mage.deck;

import mage.cards.decks.Constructed;

import java.util.*;

/**
 * @author Fenhl
 */
public class CustomEternal extends Constructed {
    public CustomEternal() {
        super("Custom Eternal");
        setCodes.addAll(makeLegalSets());
        banned.add("Dreamheart Mox");
        banned.add("Reev, Equinox Prophet");
        banned.add("Treasure Room of Akhamesses");
    }

    static List<String> makeLegalSets() {
        List<String> codes = new ArrayList<>();
        codes.add("AYR");
        codes.add("DMS");
        codes.add("ANK");
        codes.add("LDO");
        codes.add("TSL");
        codes.add("VLN");
        codes.add("JAN");
        codes.add("HLW");
        codes.add("CC18");
        codes.add("RAK");
        codes.add("EAU");
        codes.add("SOU");
        codes.add("NET");
        codes.add("VST");
        return codes;
    }
}
