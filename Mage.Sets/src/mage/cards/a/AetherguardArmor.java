package mage.cards.a;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.EquippedHasSubtypeCondition;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.BoostEquippedEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
import mage.abilities.keyword.EquipAbility;
import mage.abilities.keyword.HexproofAbility;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;

/**
 * @author Fenhl
 */
public final class AetherguardArmor extends CardImpl {
    public AetherguardArmor(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "");
        this.subtype.add(SubType.EQUIPMENT);

        this.nightCard = true;

        // Equipped creature gets +1/+2 and has hexproof.
        Ability ability = new SimpleStaticAbility(Zone.BATTLEFIELD, new BoostEquippedEffect(1, 2));
        Effect effect = new GainAbilityAttachedEffect(HexproofAbility.getInstance(), AttachmentType.EQUIPMENT);
        effect.setText("and has hexproof");
        ability.addEffect(effect);
        this.addAbility(ability);

        // Equip {2}
        this.addAbility(new EquipAbility(Outcome.AddAbility, new GenericManaCost(2)));
    }

    public AetherguardArmor(final AetherguardArmor card) {
        super(card);
    }

    @Override
    public AetherguardArmor copy() {
        return new AetherguardArmor(this);
    }
}
