package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.keyword.TrampleAbility;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fenhl
 */
public class CrocodileToken extends TokenImpl {
    static final private List<String> tokenImageSets = new ArrayList<>();
    static {
        tokenImageSets.add("EAU");
    }

    public CrocodileToken() {
        super("Crocodile", "3/2 green Crocodile creature token with trample");
        availableImageSetCodes = tokenImageSets;
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.CROCODILE);

        power = new MageInt(3);
        toughness = new MageInt(2);

        this.addAbility(TrampleAbility.getInstance());
    }

    public CrocodileToken(final CrocodileToken token) { super(token); }

    @Override
    public CrocodileToken copy() { return new CrocodileToken(this); }
}
