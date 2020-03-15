package mage.game.events;

import java.util.UUID;

/**
 * @author Fenhl
 */
public class DamagedStructureEvent extends DamagedEvent {
    public DamagedStructureEvent(UUID targetId, UUID sourceId, UUID playerId, int amount, boolean combat) {
        super(EventType.DAMAGED_STRUCTURE, targetId, sourceId, playerId, amount, combat);
    }
}
