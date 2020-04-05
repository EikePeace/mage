package mage.cards.g;

import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.Condition;
import mage.abilities.decorator.ConditionalContinuousRuleModifyingEffect;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.DontUntapInControllersUntapStepEnchantedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.List;
import java.util.UUID;

/**
 * @author EikePeace
 */

public final class GoneFishin extends CardImpl {


    public GoneFishin(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{U}");
        this.subtype.add(SubType.AURA);


        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.Tap));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);

        // Enchanted creature doesn't untap during its controller's untap step unless that player controls a Fish.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new ConditionalContinuousRuleModifyingEffect(new DontUntapInControllersUntapStepEnchantedEffect(),
                new GoneFishinCondition())
                .setText("Enchanted creature doesn't untap during its controller's untap step unless that player controls a Fish.")
        ));
    }


    public GoneFishin(final GoneFishin card) {
        super(card);
    }

    @Override
    public GoneFishin copy() {
        return new GoneFishin(this);
    }
}

class GoneFishinCondition implements Condition {
    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent(SubType.FISH, "a Fish");
    @Override
    public boolean apply(Game game, Ability source) {
        Permanent enchantment = game.getPermanent(source.getSourceId());
        if (enchantment != null) {
            Permanent enchanted = game.getPermanent(enchantment.getAttachedTo());
            if (enchanted != null) {
                Player controller = game.getPlayer(enchanted.getControllerId());
                List permanents = game.getBattlefield().getAllActivePermanents(filter, controller.getId(), game);
                if (permanents != null){
                    return false;
                }
            }
        }
        return true;
    }
}
