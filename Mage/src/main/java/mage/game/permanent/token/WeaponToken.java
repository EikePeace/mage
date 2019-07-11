
package mage.game.permanent.token;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.continuous.BoostEquippedEffect;
import mage.abilities.keyword.EquipAbility;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.Zone;

/**
 *
 * @author spjspj
 */
public final class WeaponToken extends TokenImpl {

    public WeaponToken() {
        super("Weapon", "Artifact Equipment Token with 'Equip 2' and 'Equipped creature gets +1/+1'");
        cardType.add(CardType.ARTIFACT);
        subtype.add(SubType.EQUIPMENT);
        this.addAbility(new EquipAbility(Outcome.AddAbility, new GenericManaCost(2)));
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new BoostEquippedEffect(1, 1)));
    }

    public WeaponToken(final WeaponToken token) {
        super(token);
    }

    public WeaponToken copy() {
        return new WeaponToken(this);
    }
}
