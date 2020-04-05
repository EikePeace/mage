package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.keyword.DeathtouchAbility;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fenhl
 */
public class ZombieMutantToken extends TokenImpl {
    static final private List<String> tokenImageSets = new ArrayList<>();
    static {
        tokenImageSets.add("VST");
    }

    public ZombieMutantToken() {
        super("Zombie Mutant", "2/2 black Zombie Mutant creature token with deathtouch");
        availableImageSetCodes = tokenImageSets;
        cardType.add(CardType.CREATURE);
        color.setBlack(true);
        subtype.add(SubType.ZOMBIE);
        subtype.add(SubType.MUTANT);

        power = new MageInt(2);
        toughness = new MageInt(2);

        this.addAbility(DeathtouchAbility.getInstance());
    }

    public ZombieMutantToken(final ZombieMutantToken token) { super(token); }

    @Override
    public ZombieMutantToken copy() { return new ZombieMutantToken(this); }
}
