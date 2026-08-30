import java.util.EnumMap;
import java.util.Map;

public class TroopRegistry {
    private final Map<TroopType, Troop> prototypes =
            new EnumMap<>(TroopType.class);

    public void registerPrototype(TroopType type, Troop prototype) {
        prototypes.put(type, prototype);
    }

    public Troop createTroop(TroopType type) {
        Troop prototype = prototypes.get(type);

        if (prototype == null) {
            throw new IllegalArgumentException(
                    "No prototype registered for " + type);
        }

        return prototype.cloneTroop();
    }
}
