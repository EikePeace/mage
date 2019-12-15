package mage.cards.s;

import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.RechargeEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author jbfitz
 */

public final class SurveillanceMission extends CardImpl {
    public SurveillanceMission(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{U}");
        this.subtype.add(SubType.AURA);

        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.AddAbility));
        Ability enchantAbility = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(enchantAbility);

        // When Surveillance Mission, recharge.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new RechargeEffect()));

        // Enchanted creature has "T: Scry 1."
        Ability scryAbility = new SimpleActivatedAbility(Zone.BATTLEFIELD, new ScryEffect(1), new TapSourceCost());
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new GainAbilityAttachedEffect(scryAbility, AttachmentType.AURA, Duration.WhileOnBattlefield)));
    }

    public SurveillanceMission (final SurveillanceMission card) {
        super(card);
    }

    @Override
    public SurveillanceMission copy(){
        return new SurveillanceMission(this);
    }
}
