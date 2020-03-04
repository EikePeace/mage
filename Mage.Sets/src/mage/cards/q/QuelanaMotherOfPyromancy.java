package mage.cards.q;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.mana.RedManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.game.permanent.token.custom.CreatureToken;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class QuelanaMotherOfPyromancy extends CardImpl {
    public QuelanaMotherOfPyromancy(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{R}{G}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SHAMAN);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // {T}: Add {R}.
        this.addAbility(new RedManaAbility());

        // {3}, {T}: Create a 1/1 red and green Shaman creature token with haste and “{T}: Add {R}.”
        Ability ability = new SimpleActivatedAbility(new CreateTokenEffect(
                new CreatureToken(1, 1, "1/1 red and green Shaman creature token with haste and “{T}: Add {R}”", SubType.SHAMAN)
                .withColor("RG")
                .withAbility(HasteAbility.getInstance())
                .withAbility(new RedManaAbility())
        ), new GenericManaCost(3));
        ability.addCost(new TapSourceCost());
        this.addAbility(ability);
    }

    public QuelanaMotherOfPyromancy(final QuelanaMotherOfPyromancy card) { super(card); }

    @Override
    public QuelanaMotherOfPyromancy copy() { return new QuelanaMotherOfPyromancy(this); }
}
