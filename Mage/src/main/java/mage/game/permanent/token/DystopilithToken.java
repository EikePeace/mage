package mage.game.permanent.token;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.MageInt;
import mage.abilities.keyword.DefenderAbility;

/**
 *
 * @author spjspj
 */
public final class DystopilithToken extends TokenImpl {

    public DystopilithToken() {
        this("CNS");
    }

    public DystopilithToken(String setCode) {
        super("Construct", "2/2 colorless Construct artifact creature token");
        this.setOriginalExpansionSetCode(setCode);
        cardType.add(CardType.ARTIFACT);
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.CONSTRUCT);
        power = new MageInt(2);
        toughness = new MageInt(2);
    }

    public DystopilithToken(final DystopilithToken token) {
        super(token);
    }

    public DystopilithToken copy() {
        return new DystopilithToken(this);
    }
}
