package creational.prototype.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
// Step 2 - Create a concrete class
public class BackgroundObject implements GraphicalObject {
    private Double x;
    private Double y;
    private Double width;
    private Double height;
    private BackgroundObjectType type;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Integer> pixels;

    public BackgroundObject(Double x, Double y, Double width, Double height, BackgroundObjectType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.pixels = generatePixels();
    }

    public BackgroundObject(BackgroundObject references) {
        this.x = references.getX();
        this.y = references.getY();
        this.type = references.getType();
        this.width = references.getWidth();
        this.height = references.getHeight();
        this.pixels = references.pixels;
    }

    private List<Integer> generatePixels() {
        return Collections.emptyList();
    }

    @Override
    public BackgroundObject cloneObject() {
        return new BackgroundObject(this);
    }
}
