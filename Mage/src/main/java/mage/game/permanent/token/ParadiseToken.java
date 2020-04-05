package mage.game.permanent.token;

import mage.abilities.keyword.HexproofAbility;
import mage.abilities.mana.AnyColorManaAbility;
import mage.constants.CardType;
import mage.constants.SuperType;

/**
 *
 * @author Fenhl
 */
public final class ParadiseToken extends TokenImpl {
    public ParadiseToken() {
        super("Paradise", "legendary land token with hexproof and “{T}: Add one mana of any color.”");
        this.addSuperType(SuperType.LEGENDARY);
        cardType.add(CardType.LAND);

        // Hexproof
        this.addAbility(HexproofAbility.getInstance());

        // {T}: Add one mana of any color.
        this.addAbility(new AnyColorManaAbility());
    }

    public ParadiseToken(final ParadiseToken token) { super(token); }

    @Override
    public ParadiseToken copy() { return new ParadiseToken(this); }
}
