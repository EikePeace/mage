package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.keyword.DefenderAbility;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author EikePeace
 */
public final class BeastToken5 extends TokenImpl {


    public BeastToken5() {
        this(null, 0);
    }

    public BeastToken5(String setCode) {
        this(setCode, 0);
    }

    public BeastToken5(String setCode, int tokenType) {
        super("Beast", "3/3 green Beast creature token with Defender");
        setOriginalExpansionSetCode(setCode != null ? setCode : "SOU");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.BEAST);
        power = new MageInt(3);
        toughness = new MageInt(3);
        this.addAbility(DefenderAbility.getInstance());

    }

    @Override
    public void setExpansionSetCodeForImage(String code) {
        super.setExpansionSetCodeForImage(code);
        if (getOriginalExpansionSetCode().equals("M15")) {
            this.setTokenType(2);
        }
        if (getOriginalExpansionSetCode().equals("DD3GVL") || getOriginalExpansionSetCode().equals("C14") || getOriginalExpansionSetCode().equals("DDD") || getOriginalExpansionSetCode().equals("MM3")) {
            this.setTokenType(1);
        }
    }

    public BeastToken5(final BeastToken5 token) {
        super(token);
    }

    @Override
    public BeastToken5 copy() {
        return new BeastToken5(this); //To change body of generated methods, choose Tools | Templates.
    }
}
