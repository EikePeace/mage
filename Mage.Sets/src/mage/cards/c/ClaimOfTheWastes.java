package mage.cards.c;

import mage.abilities.effects.common.DestroyTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.TargetPermanent;

import java.util.UUID;

public final class ClaimOfTheWastes extends CardImpl {
   public ClaimOfTheWastes (UUID ownerId, CardSetInfo setInfo){
       super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{B}{G}");

       this.getSpellAbility().addEffect(new DestroyTargetEffect());
       this.getSpellAbility().addTarget(new TargetPermanent());
   }

   public ClaimOfTheWastes (final ClaimOfTheWastes card) {
       super(card);
   }

   @Override
   public ClaimOfTheWastes copy() {
       return new ClaimOfTheWastes(this);
   }
}
