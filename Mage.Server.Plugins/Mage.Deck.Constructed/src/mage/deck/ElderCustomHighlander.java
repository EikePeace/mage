package mage.deck;

import mage.cards.Card;
import mage.cards.decks.Constructed;
import mage.cards.decks.Deck;
import mage.filter.FilterMana;
import mage.util.ManaUtil;

import java.util.*;

/**
 * @author Fenhl
 */
public class ElderCustomHighlander extends Constructed {
    public ElderCustomHighlander() {
        super("Elder Custom Highlander");
        setCodes.addAll(CustomEternal.makeLegalSets());
        setCodes.add("DHM");
        setCodes.add("SRC");
        banned.add("Ashkal Pillarstone");
        banned.add("Belit, Tel'tor Emissary");
        banned.add("Clean Slate");
        banned.add("Hatseket, Great Archivist");
        banned.add("Iun, World Reborn");
        banned.add("Rawaya, the Wanderer");
        banned.add("Seize Tomorrow");
        banned.add("Shape Reality");
        banned.add("Sobki, World Severer");
        banned.add("Travelling Stargazer");
        banned.add("Treasure Room of Akhamesses");
    }

    @Override
    public int getDeckMinSize() {
        return 99;
    }

    @Override
    public int getSideboardMinSize() {
        return 1;
    }

    @Override
    public boolean validate(Deck deck) {
        boolean valid = true;
        FilterMana colorIdentity = new FilterMana();

        if (deck.getCards().size() != 100) {
            invalid.put("Deck", "Must contain " + 100 + " cards: has " + (deck.getCards().size() + deck.getSideboard().size()) + " cards");
            valid = false;
        }

        Map<String, Integer> counts = new HashMap<>();
        countCards(counts, deck.getCards());
        countCards(counts, deck.getSideboard());
        valid = checkCounts(1, counts) && valid;

        for (String bannedCard : banned) {
            if (counts.containsKey(bannedCard)) {
                invalid.put(bannedCard, "Banned");
                valid = false;
            }
        }

        if (deck.getSideboard().size() < 1) {
            invalid.put("Deck", "Sideboard must contain the commander");
            valid = false;
        } else if (deck.getSideboard().size() > 11) {
            invalid.put("Deck", "Sideboard may only contain up to 10 cards other than the commander");
            valid = false;
        } else {
            Set<String> commanderNames = new HashSet<>();
            for (Card commander : deck.getSideboard()) {
                if (commander.isCreature() && commander.isLegendary()) {
                    commanderNames.add(commander.getName());
                }
            }
            if (commanderNames.size() < 1) {
                invalid.put("Commander", "None of your sideboard cards can be commanders");
                valid = false;
            } else if (commanderNames.size() > 1) {
                invalid.put("Commander", "More than one of your sideboard cards can be commanders (this is a limitation in XMage, sorry)"); //TODO
                valid = false;
            }
            for (Card commander : deck.getSideboard()) {
                if (commander.isCreature() && commander.isLegendary()) {
                    ManaUtil.collectColorIdentity(colorIdentity, commander.getColorIdentity());
                }
            }
        }
        if (!valid) {
            return false;
        }

        for (Card card : deck.getCards()) {
            if (!ManaUtil.isColorIdentityCompatible(colorIdentity, card.getColorIdentity())) {
                invalid.put(card.getName(), "Invalid color (" + colorIdentity.toString() + ')');
                valid = false;
            }
        }
        for (Card card : deck.getCards()) {
            if (!isSetAllowed(card.getExpansionSetCode())) {
                if (!legalSets(card)) {
                    invalid.put(card.getName(), "Not allowed Set: " + card.getExpansionSetCode());
                    valid = false;
                }
            }
        }
        for (Card card : deck.getSideboard()) {
            if (!ManaUtil.isColorIdentityCompatible(colorIdentity, card.getColorIdentity())) {
                invalid.put(card.getName(), "Invalid color (" + colorIdentity.toString() + ')');
                valid = false;
            }
        }
        for (Card card : deck.getSideboard()) {
            if (!isSetAllowed(card.getExpansionSetCode())) {
                if (!legalSets(card)) {
                    invalid.put(card.getName(), "Not allowed Set: " + card.getExpansionSetCode());
                    valid = false;
                }
            }
        }
        return valid;
    }
}
