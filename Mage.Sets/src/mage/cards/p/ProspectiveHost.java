package mage.cards.p;

import mage.abilities.Ability;
import mage.abilities.common.DiesAttachedTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.continuous.BoostEnchantedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.permanent.token.ZombieToken;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */
public final class ProspectiveHost extends CardImpl {
    public ProspectiveHost(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{B}");
        this.subtype.add(SubType.AURA);

        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.BoostCreature));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);

        // Enchanted creature gets +2/+2
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new BoostEnchantedEffect(2, 2, Duration.WhileOnBattlefield)));
        // When enchanted creature dies, create a 2/2 black Zombie creature token.
        this.addAbility(new DiesAttachedTriggeredAbility(new CreateTokenEffect(new ZombieToken()), "enchanted creature"));
    }

    public ProspectiveHost(ProspectiveHost card) {
        super(card);
    }

    @Override
    public ProspectiveHost copy() {
        return new ProspectiveHost(this);
    }
}
