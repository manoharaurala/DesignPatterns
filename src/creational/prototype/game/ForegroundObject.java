package creational.prototype.game;

public class ForegroundObject implements GraphicalObject {
    @Override
    public GraphicalObject cloneObject() {
        return new ForegroundObject();
    }
}
