package creational.prototype.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class BackgroundObjectTest {
    @Test
    public void testCloneObject() {
        // Step 4 - Create a prototype object
        BackgroundObject prototype = new BackgroundObject(100.00, 200.02, 100.13, 200.78, BackgroundObjectType.TREE);
        BackgroundObject clone = prototype.cloneObject();
        assertNotNull("If clone method is called, it should return a new object", clone);
        assertNotSame(prototype, clone, "If clone method is called, it should return a new object not same object");
        assertEquals("If clone method is called, it should return same value for x", prototype.getX(), clone.getX());

    }

    @Test
    public void testCloneObjectWithRegistry() {
        // Initialise registry
        BackgroundObjectRegistry registry = new BackgroundObjectRegistry();
        // Step 4 - Create a prototypeTree object
        BackgroundObject prototypeTree = new BackgroundObject(100.00, 200.02, 100.13, 200.78, BackgroundObjectType.TREE);
        registry.registerObject(prototypeTree);
        BackgroundObject prototypeBuilding = new BackgroundObject(100.00, 200.02, 100.13, 200.78, BackgroundObjectType.BUILDING);
        registry.registerObject(prototypeBuilding);
        BackgroundObject cloneTree = registry.getObject(BackgroundObjectType.TREE).cloneObject();
        BackgroundObject cloneBuilding = registry.getObject(BackgroundObjectType.BUILDING).cloneObject();
        assertNotNull("If cloneTree method is called, it should return a new object", cloneTree);
        assertEquals("If cloneTree method is called, it should return same value for x", prototypeTree.getHeight(), cloneTree.getHeight());
        assert prototypeTree.getType() == BackgroundObjectType.TREE;
        assert prototypeBuilding.getType() == BackgroundObjectType.BUILDING;
    }

}