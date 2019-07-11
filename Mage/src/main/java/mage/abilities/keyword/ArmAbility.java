package mage.abilities.keyword;

import mage.abilities.Ability;
import mage.abilities.StaticAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.GermToken;
import mage.game.permanent.token.WeaponToken;
import mage.players.Player;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

import javax.xml.transform.Source;
import java.util.UUID;

public class ArmAbility extends StaticAbility {

    public ArmAbility(Game game) {
        super(zone.BATTLEFIELD, new CreateTokenEffect(new WeaponToken()));
        new ArmAbilityEffect(game, this);
    }

    public ArmAbility(final ArmAbility ability) {
        super(ability);
    }

    @Override
    public String getRule() {
        return "Arm <i>(Create a colorless equipment artifact token named Weapon with equip 2 and \"Equipped creature gets +1/+1\" attached to targ)</i>";
    }

    @Override
    public StaticAbility copy() {
        return new ArmAbility(this);
    }
}

class ArmAbilityEffect extends CreateTokenEffect {

    ArmAbilityEffect(Game game, Ability source) {
        super(new WeaponToken(), 0);
        Permanent p = game.getPermanent(this.getLastAddedTokenId());
        if (p != null) {
            UUID targetId = this.getTargetPointer().getTargets(game, source).get(0);
            p.attachTo(targetId, game);
        }
    }

    ArmAbilityEffect(final ArmAbilityEffect effect) {
        super(effect);
    }

    @Override
    public ArmAbilityEffect copy() {
        return new ArmAbilityEffect(this);
    }
}
