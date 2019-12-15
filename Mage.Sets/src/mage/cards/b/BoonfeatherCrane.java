package mage.cards.b;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.keyword.FlashAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.filter.common.FilterEnchantmentPermanent;
import mage.filter.predicate.mageobject.SubtypePredicate;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.Target;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class BoonfeatherCrane extends CardImpl {
    private static final FilterEnchantmentPermanent filter = new FilterEnchantmentPermanent("Aura you control");

    static {
        filter.add(new ControllerPredicate(TargetController.YOU));
        filter.add(new SubtypePredicate(SubType.AURA));
    }

    public BoonfeatherCrane(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}{W}");
        this.subtype.add(SubType.BIRD);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Flash
        this.addAbility(FlashAbility.getInstance());

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // When Boonfeather Crane enters the battlefield, you may attach target aura you control to target creature.
        Ability ability = new EntersBattlefieldTriggeredAbility(new BoonfeatherCraneEffect(), true);
        ability.addTarget(new TargetPermanent(filter));
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    public BoonfeatherCrane(final BoonfeatherCrane card){
        super(card);
    }

    @Override
    public BoonfeatherCrane copy(){
        return new BoonfeatherCrane(this);
    }
}


class BoonfeatherCraneEffect extends OneShotEffect {
    public BoonfeatherCraneEffect(){
        super(Outcome.BoostCreature);
        this.staticText = "attach target Aura you control to target creature.";
    }

    public BoonfeatherCraneEffect(final BoonfeatherCraneEffect effect){
        super(effect);
    }

    @Override
    public BoonfeatherCraneEffect copy(){
        return new BoonfeatherCraneEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source){
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null){
            Permanent aura = game.getPermanent(source.getFirstTarget());
            Permanent creature = game.getPermanent(source.getTargets().get(1).getFirstTarget());

            if (aura != null && creature != null){
                Permanent oldCreature = game.getPermanent(aura.getAttachedTo());
                if (oldCreature != null && !oldCreature.equals(creature)){
                    Target auraTarget = aura.getSpellAbility().getTargets().get(0);
                    if (!auraTarget.canTarget(creature.getId(), game)){
                        game.informPlayers(aura.getLogName() + " was not attached to " + creature.getLogName() + " because it's not a legal target for the aura.");
                    }
                    else if (oldCreature.removeAttachment(aura.getId(), game)) {
                        game.informPlayers(aura.getLogName() + " was unattached from " + oldCreature.getLogName() + " and attached to " + creature.getLogName());
                        creature.addAttachment(aura.getId(), game);
                    }
                }
            }
            return true;
        }
        return false;
    }

}