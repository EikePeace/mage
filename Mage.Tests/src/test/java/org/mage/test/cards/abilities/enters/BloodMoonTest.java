package org.mage.test.cards.abilities.enters;

import mage.constants.CardType;
import mage.constants.PhaseStep;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.game.permanent.Permanent;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

/**
 *
 * @author LevelX2
 */
public class BloodMoonTest extends CardTestPlayerBase {

    // 614.12. Some replacement effects modify how a permanent enters the battlefield. (See rules 614.1cd.)
    // Such effects may come from the permanent itself if they affect only that permanent (as opposed to a
    // general subset of permanents that includes it). They may also come from other sources. To determine
    // which replacement effects apply and how they apply, check the characteristics of the permanent as it
    // would exist on the battlefield, taking into account replacement effects that have already modified how
    // it enters the battlefield (see rule 616.1), continuous effects generated by the resolution of spells
    // or abilities that changed the permanents characteristics on the stack (see rule 400.7a), and continuous
    // effects from the permanents own static abilities, but ignoring continuous effects from any other source
    // that would affect it.
    // Grassland has to enter the battlefield tapped, because
    // the Blood Moon does not prevent ETB Replacement Effects
    @Test
    public void testBloodMoonDoesNotPreventETBReplacementEffects() {
        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.BATTLEFIELD, playerA, "Blood Moon");

        /**
         * Grasslands Land Grasslands enters the battlefield tapped. {T},
         * Sacrifice Grasslands: Search your library for a Forest or Plains card
         * and put it onto the battlefield. Then shuffle your library.
         */
        addCard(Zone.HAND, playerA, "Grasslands");

        playLand(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Grasslands");
        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();

        assertLife(playerA, 20);
        assertLife(playerB, 20);

        // Check that the land is tapped
        Permanent grassland = getPermanent("Grasslands", playerA.getId());
        Assert.assertEquals("Grasslands is not tapped but is has to be from ETB replacement effect", true, grassland.isTapped());

    }

    @Test
    public void testBloodMoonDoesNotPreventETBReplacementButPreventsTriggeredEffects() {
        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.BATTLEFIELD, playerA, "Blood Moon");

        /**
         * Kabira Crossroads Land Kabira Crossroads enters the battlefield
         * tapped. When Kabira Crossroads enters the battlefield, you gain 2
         * life. {W}: Add.
         *
         */
        addCard(Zone.HAND, playerA, "Kabira Crossroads");

        playLand(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Kabira Crossroads");
        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();

        // Check that the land is tapped
        Permanent grassland = getPermanent("Kabira Crossroads", playerA.getId());
        Assert.assertEquals("Kabira Crossroads is not tapped but is has to be from ETB replacement effect", true, grassland.isTapped());

        assertLife(playerA, 20); // Trigger may not trigger because of Blood Moon so the 2 life were not added
        assertLife(playerB, 20);

    }

    /**
     * There's a bug with Spreading Seas and Blood Moon
     *
     * Spreading Seas was played turn 3 in a Steam Vents, Blood Moon turn 7 or
     * something
     *
     * The enchanted Steam Vents was producing only U when it should produce
     * only R because of blood moon's time stamp.
     *
     * http://blogs.magicjudges.org/articles/2013/06/18/blood-moon-in-a-modern-environment/
     * Spreading Seas, which has started to see play in Modern, also functions
     * similar to Prismatic Omen. If the Seas enters the battlefield before
     * Blood Moon, Blood Moon wins since it has a later timestamp and the land
     * will just be a Mountain. If the Seas enters the battlefield after Blood
     * Moon, then the effect of the Seas wins and the land will be an Island.
     */
    @Test
    public void testBloodMoonAfterSpreadingSea() {
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 4);
        addCard(Zone.BATTLEFIELD, playerA, "Island", 1);
        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.HAND, playerA, "Blood Moon");

        // Enchant land
        // When Spreading Seas enters the battlefield, draw a card.
        // Enchanted land is an Island.
        addCard(Zone.HAND, playerA, "Spreading Seas"); // {1}{U}

        // {T}: Add {C}.
        // {T}: Add {B} or {W}. Caves of Koilos deals 1 damage to you.
        addCard(Zone.BATTLEFIELD, playerB, "Steam Vents");

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Spreading Seas", "Steam Vents");
        castSpell(1, PhaseStep.POSTCOMBAT_MAIN, playerA, "Blood Moon");
        setStopAt(2, PhaseStep.PRECOMBAT_MAIN);
        execute();

        assertPermanentCount(playerA, "Spreading Seas", 1);
        assertPermanentCount(playerA, "Blood Moon", 1);
        assertHandCount(playerA, 1);
        // Check that the Steam Vents produces only {R}
        Assert.assertTrue("The mana the land can produce should be [{R}] but it's " + playerB.getManaAvailable(currentGame).toString(), playerB.getManaAvailable(currentGame).toString().equals("[{R}]"));

    }

    @Test
    public void testBloodMoonBeforeSpreadingSea() {
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Mox Sapphire", 4);
        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.HAND, playerA, "Blood Moon");

        // Enchant land
        // When Spreading Seas enters the battlefield, draw a card.
        // Enchanted land is an Island.
        addCard(Zone.HAND, playerA, "Spreading Seas"); // {1}{U}

        // {T}: Add {C}.
        // {T}: Add {B} or {W}. Caves of Koilos deals 1 damage to you.
        addCard(Zone.BATTLEFIELD, playerB, "Steam Vents");

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Blood Moon");
        castSpell(1, PhaseStep.POSTCOMBAT_MAIN, playerA, "Spreading Seas", "Steam Vents");
        setStopAt(2, PhaseStep.PRECOMBAT_MAIN);
        execute();

        assertPermanentCount(playerA, "Spreading Seas", 1);
        assertPermanentCount(playerA, "Blood Moon", 1);
        assertHandCount(playerA, 1);
        // Check that the Steam Vents produces only {R}
        Assert.assertTrue("The mana the land can produce should be [{U}] but it's " + playerB.getManaAvailable(currentGame).toString(), playerB.getManaAvailable(currentGame).toString().equals("[{U}]"));
    }

    /**
     * Possible bug reported: Blood Moon effects no longer appearing with
     * Pithing Needle naming Blood Moon.
     *
     * Testing Blood Moon on battlefield before Pithing Needle naming it.
     * Non-basics should still only produce {R}
     */
    @Test
    public void testBloodMoonBeforePithingNeedle() {
        addCard(Zone.BATTLEFIELD, playerA, "Mountain", 3);
        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.HAND, playerA, "Blood Moon", 1);

        // Artifact (1)
        // As Pithing Needle enters the battlefield, name a card.
        // Activated abilities of sources with the chosen name can't be activated unless they're mana abilities.
        addCard(Zone.HAND, playerB, "Pithing Needle"); // {1}
        addCard(Zone.HAND, playerB, "Ghost Quarter", 1);
        // {T}: Add {C}.
        // {T}, Sacrifice Ghost Quarter: Destroy target land. Its controller may search their library for a basic land card, put it onto the battlefield, then shuffle their library.
        addCard(Zone.BATTLEFIELD, playerB, "Ghost Quarter", 1);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Blood Moon");

        castSpell(2, PhaseStep.PRECOMBAT_MAIN, playerB, "Pithing Needle");
        setChoice(playerB, "Blood Moon");
        playLand(2, PhaseStep.POSTCOMBAT_MAIN, playerB, "Ghost Quarter");

        setStopAt(2, PhaseStep.END_TURN);
        execute();

        assertPermanentCount(playerA, "Blood Moon", 1);
        assertPermanentCount(playerB, "Pithing Needle", 1);
        assertPermanentCount(playerB, "Ghost Quarter", 2);

        Assert.assertTrue("The mana Ghost Quarter can produce should be [{R}] but it's " + playerB.getManaAvailable(currentGame).toString(), playerB.getManaAvailable(currentGame).toString().equals("[{R}]"));
    }

    /**
     * Possible bug reported: Blood Moon effects no longer appearing with
     * Pithing Needle naming Blood Moon.
     *
     * Testing Pithing Needle on the battlefield naming Blood Moon, then playing
     * Blood Moon after. Non-basics should still only produce {R}
     */
    @Test
    public void testBloodMoonAfterPithingNeedle() {

        // Artifact (1)
        // As Pithing Needle enters the battlefield, name a card.
        // Activated abilities of sources with the chosen name can't be activated unless they're mana abilities.
        addCard(Zone.HAND, playerA, "Pithing Needle"); // {1}
        addCard(Zone.BATTLEFIELD, playerA, "Ghost Quarter", 1);

        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.HAND, playerB, "Blood Moon", 1);
        addCard(Zone.BATTLEFIELD, playerB, "Mountain", 3);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Pithing Needle");
        setChoice(playerA, "Blood Moon");

        castSpell(2, PhaseStep.PRECOMBAT_MAIN, playerB, "Blood Moon");

        setStopAt(3, PhaseStep.PRECOMBAT_MAIN);

        execute();

        assertPermanentCount(playerB, "Blood Moon", 1);
        assertPermanentCount(playerA, "Pithing Needle", 1);
        assertPermanentCount(playerA, "Ghost Quarter", 1);

        Assert.assertTrue("The mana the land can produce should be [{R}] but it's " + playerA.getManaAvailable(currentGame).toString(), playerA.getManaAvailable(currentGame).toString().equals("[{R}]"));
    }

    /**
     * If Blood Moon enters the battlefield with an animated Mutavault in play,
     * the Mutavault stays a 2/2 creature with all creature types and “gains”
     * the land type mountain (it can also tap for R). However, once the turn
     * ends, the Mutavault will loses both of its abilities and become a non
     * basic mountain named Mutavault.
     */
    @Test
    public void testBloodMoonMutavault() {

        addCard(Zone.BATTLEFIELD, playerA, "Swamp");

        // {T}: Add {C}.
        // {1}: Mutavault becomes a 2/2 creature with all creature types until end of turn. It's still a land.
        addCard(Zone.BATTLEFIELD, playerA, "Mutavault", 1);

        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.HAND, playerB, "Blood Moon", 1);
        addCard(Zone.BATTLEFIELD, playerB, "Mountain", 3);

        activateAbility(2, PhaseStep.PRECOMBAT_MAIN, playerA, "{1}: ");

        castSpell(2, PhaseStep.PRECOMBAT_MAIN, playerB, "Blood Moon");

        setStopAt(2, PhaseStep.END_TURN);

        execute();

        assertPermanentCount(playerB, "Blood Moon", 1);
        assertPowerToughness(playerA, "Mutavault", 2, 2);
        assertType("Mutavault", CardType.LAND, SubType.MOUNTAIN);
        assertType("Swamp", CardType.LAND, SubType.SWAMP);

        Assert.assertTrue("The mana the land can produce should be [{R}] but it's " + playerA.getManaAvailable(currentGame).toString(), playerA.getManaAvailable(currentGame).toString().equals("[{R}]"));
    }

    @Test
    public void testBloodMoonMutavaultEnd() {

        addCard(Zone.BATTLEFIELD, playerA, "Swamp");

        // {T}: Add {C}.
        // {1}: Mutavault becomes a 2/2 creature with all creature types until end of turn. It's still a land.
        addCard(Zone.BATTLEFIELD, playerA, "Mutavault", 1);

        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.HAND, playerB, "Blood Moon", 1);
        addCard(Zone.BATTLEFIELD, playerB, "Mountain", 3);

        activateAbility(2, PhaseStep.PRECOMBAT_MAIN, playerA, "{1}: ");

        castSpell(2, PhaseStep.PRECOMBAT_MAIN, playerB, "Blood Moon");

        setStopAt(3, PhaseStep.PRECOMBAT_MAIN);

        execute();

        assertPermanentCount(playerB, "Blood Moon", 1);
        assertPowerToughness(playerA, "Mutavault", 0, 0);
        assertType("Mutavault", CardType.LAND, SubType.MOUNTAIN);
        assertType("Swamp", CardType.LAND, SubType.SWAMP);

        Assert.assertTrue("The mana the lands can produce should be [{B}{R}] but it's " + playerA.getManaAvailable(currentGame).toString(), playerA.getManaAvailable(currentGame).toString().equals("[{B}{R}]"));
    }

    /**
     * If Blood Moon is on the battlefield, Flagstones of Trokair will enter the
     * battlefield as a legendary non-basic Mountain. If Flagstones of Trokair
     * is put into the graveyard due to “Legends rule” or because it was
     * destroyed, its ability doesn't trigger, because it doesn't exist: it
     * won't fetch you a Plains.
     */
    @Test
    public void testBloodMoonFlagstonesOfTrokair() {
        // {T}: Add {W}.
        // When Flagstones of Trokair is put into a graveyard from the battlefield, you may search
        // your library for a Plains card and put it onto the battlefield tapped. If you do, shuffle your library.
        addCard(Zone.HAND, playerA, "Flagstones of Trokair", 1);
        addCard(Zone.LIBRARY, playerA, "Plains");

        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.BATTLEFIELD, playerB, "Blood Moon");
        addCard(Zone.BATTLEFIELD, playerB, "Mountain", 3);
        addCard(Zone.HAND, playerB, "Stone Rain");

        playLand(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Flagstones of Trokair");
        castSpell(2, PhaseStep.PRECOMBAT_MAIN, playerB, "Stone Rain", "Flagstones of Trokair");

        setStopAt(2, PhaseStep.BEGIN_COMBAT);

        execute();

        assertPermanentCount(playerB, "Blood Moon", 1);
        assertGraveyardCount(playerB, "Stone Rain", 1);

        assertPermanentCount(playerA, "Flagstones of Trokair", 0);
        assertGraveyardCount(playerA, "Flagstones of Trokair", 1);

        assertPermanentCount(playerA, 0);
    }

    /**
     * Because Blood Moon's static ability operates only when it's on the
     * battlefield and begins affecting any nonbasic lands immediately. In fact,
     * Blood Moon's effect is so quick that once a non-basic land hits the
     * battlefield it's going to be affected. Therefore:
     *
     * If a nonbasic land's has EtB triggered abilities, these will not trigger
     * because the ability isn't there (it's gone). Effects that modify the way
     * the land enters the battlefield are replacement effects. They are applied
     * before the permanent enters the battlefield and taking into account
     * continuous effects that already exist and would apply to the permanent.
     * (see CR 614.12).
     *
     * 614.12 Some replacement effects modify how a permanent enters the
     * battlefield. (See rules 614.1c-d.) Such effects may come from the
     * permanent itself if they affect only that permanent (as opposed to a
     * general subset of permanents that includes it). They may also come from
     * other sources. To determine which replacement effects apply and how they
     * apply, check the characteristics of the permanent as it would exist on
     * the battlefield, taking into account replacement effects that have
     * already modified how it enters the battlefield (see rule 616.1),
     * continuous effects from the permanent's own static abilities that would
     * apply to it once it's on the battlefield, and continuous effects that
     * ..........................................===========================
     * already exist and would apply to the permanent.
     * ================================================
     *
     * Madblind Mountain enters the battlefield untapped, as a nonbasic Mountain
     * with single mana ability and no other.
     */
    @Test
    @Ignore
    public void testBloodMoonMadblindMountain() {
        // {T}: Add {R}.
        // Madblind Mountain enters the battlefield tapped.
        // {R}, {tap}: Shuffle your library. Activate this ability only if you control two or more red permanents.
        addCard(Zone.HAND, playerA, "Madblind Mountain", 1);

        // Blood Moon   2R
        // Enchantment
        // Nonbasic lands are Mountains
        addCard(Zone.BATTLEFIELD, playerB, "Blood Moon");

        playLand(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Madblind Mountain");

        setStopAt(1, PhaseStep.BEGIN_COMBAT);

        execute();

        assertPermanentCount(playerB, "Blood Moon", 1);
        assertPermanentCount(playerA, "Madblind Mountain", 1);

        assertTapped("Madblind Mountain", false); // it may not be tapped because the etB effect was removed by Blood Moon

    }
}
