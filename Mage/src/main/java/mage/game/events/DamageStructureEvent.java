package mage.game.events;

import java.util.UUID;

/**
 * @author Fenhl
 */
public class DamageStructureEvent extends DamageEvent {
    public DamageStructureEvent(UUID targetId, UUID sourceId, UUID playerId, int amount, boolean preventable, boolean combat) {
        super(EventType.DAMAGE_STRUCTURE, targetId, sourceId, playerId, amount, preventable, combat);
    }
}
