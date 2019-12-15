package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.ConstructToken;
import mage.players.Player;

import java.util.UUID;

/**
 * @author jbfitz
 */

public final class SivKatariRebelTechnician extends CardImpl {
    public SivKatariRebelTechnician(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}{R}");
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ARTIFICER);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(new ProwessAbility());
        this.addAbility(new AttacksTriggeredAbility(new SivKatariRevelTechnicianEffect(), false));
    }

    public SivKatariRebelTechnician(final SivKatariRebelTechnician card) {
        super(card);
    }

    @Override
    public SivKatariRebelTechnician copy(){
        return new SivKatariRebelTechnician(this);
    }
}

class SivKatariRevelTechnicianEffect extends OneShotEffect {
    public SivKatariRevelTechnicianEffect(){
        super(Outcome.PutCreatureInPlay);
        staticText = "create an X/X colorless Construct artifact creature token with prowess, where X is {this}'s power. Exile that token at the end of combat";
    }

    public SivKatariRevelTechnicianEffect(final SivKatariRevelTechnicianEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        ConstructToken constructToken = new ConstructToken();
        Permanent sourceCreature = game.getPermanentOrLKIBattlefield(source.getSourceId());

        if (sourceCreature != null && sourceCreature.isCreature()){
            int sourcePower = sourceCreature.getPower().getValue();
            constructToken.getPower().modifyBaseValue(sourcePower);
            constructToken.getToughness().modifyBaseValue(sourcePower);
            constructToken.addAbility(new ProwessAbility());

            CreateTokenEffect effect = new CreateTokenEffect(constructToken, 1, true, true);
            Player controller = game.getPlayer(source.getControllerId());

            if (controller != null && effect.apply(game, source)){
                effect.exileTokensCreatedAtEndOfCombat(game, source);
                return true;
            }
        }

        return false;
    }

    @Override
    public SivKatariRevelTechnicianEffect copy() {
        return new SivKatariRevelTechnicianEffect(this);
    }
}