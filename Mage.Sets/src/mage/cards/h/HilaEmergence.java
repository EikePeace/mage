package mage.cards.h;
import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfCombatTriggeredAbility;
import mage.abilities.common.CantBeCounteredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.UntapEnchantedEffect;
import mage.abilities.effects.common.continuous.BecomesCreatureAttachedWithActivatedAbilityOrSpellEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.abilities.keyword.HasteAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterLandPermanent;
import mage.game.permanent.token.TokenImpl;
import mage.target.TargetPermanent;
import mage.target.common.TargetLandPermanent;

/**
 *
 * @author RogueAUstralian
 */
public final class HilaEmergence extends CardImpl {

    private static final FilterLandPermanent filter = new FilterLandPermanent();

    public HilaEmergence(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{G}{G}");
        this.subtype.add(SubType.AURA);

        //This spell can't be countered
        this.addAbility(new CantBeCounteredAbility());
        
        // Enchant land
        TargetPermanent auraTarget = new TargetLandPermanent(filter);
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.PutCreatureInPlay));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);

        //At the beginning of combat, untap enchanted land. It becomes a 6/6 green Lizard creature with haste
        Effect lizard = new BecomesCreatureAttachedWithActivatedAbilityOrSpellEffect(new LizardToken(), "Enchanted land becomes a 6/6 green Spirit creature until end of turn.", Duration.EndOfTurn);
        Effect untap = new UntapEnchantedEffect();
        BeginningOfCombatTriggeredAbility combat = new BeginningOfCombatTriggeredAbility(untap, TargetController.YOU, false);
        combat.addEffect(lizard);
        this.addAbility(combat);

    }

    public HilaEmergence(final HilaEmergence card) {
        super(card);
    }

    @Override
    public HilaEmergence copy() {
        return new HilaEmergence(this);
    }

    private static class LizardToken extends TokenImpl {

        LizardToken() {
            super("", "6/6 green Lizard creature with haste");
            cardType.add(CardType.CREATURE);
            color.setGreen(true);
            subtype.add(SubType.LIZARD);
            power = new MageInt(6);
            toughness = new MageInt(6);
            this.addAbility(HasteAbility.getInstance());
        }

        public LizardToken(final LizardToken token) {
            super(token);
        }

        public LizardToken copy() {
            return new LizardToken(this);
        }
    }
}