package creational.prototype.game;

import java.util.HashMap;
import java.util.Map;

public class BackgroundObjectRegistry {
    private final Map<BackgroundObjectType, BackgroundObject> backgroundObjectMap;

    public BackgroundObjectRegistry() {
        backgroundObjectMap = new HashMap<>();
    }

    public void registerObject(BackgroundObject object) {
        backgroundObjectMap.put(object.getType(), object);
    }

    public BackgroundObject getObject(BackgroundObjectType type) {
        return backgroundObjectMap.get(type);
    }
}
