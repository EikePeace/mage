package mage.cards.o;

import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.DrawDiscardControllerEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
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
public final class OverwhelmingPortents extends CardImpl {
    public OverwhelmingPortents(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{U}");
        this.subtype.add(SubType.AURA);

        // Enchant Creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.AddAbility));
        Ability enchantAbility = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(enchantAbility);

        // When Overwhelming Portents enters the battlefield, draw a card, then discard a card.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new DrawDiscardControllerEffect(1, 1, false)));

        // Enchanted creature has "{T}: Draw a card, then discard a card."
        Ability lootAbility = new SimpleActivatedAbility(Zone.BATTLEFIELD, new DrawDiscardControllerEffect(1, 1, false), new TapSourceCost());
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new GainAbilityAttachedEffect(lootAbility, AttachmentType.AURA, Duration.WhileOnBattlefield)));
    }

    public OverwhelmingPortents(final OverwhelmingPortents card){
        super(card);
    }

    @Override
    public OverwhelmingPortents copy(){
        return new OverwhelmingPortents(this);
    }

}
