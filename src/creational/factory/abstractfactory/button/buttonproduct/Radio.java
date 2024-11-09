package creational.factory.abstractfactory.button.buttonproduct;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Radio {
    private Double radius;

    public abstract void render();

    public abstract void click();
}
