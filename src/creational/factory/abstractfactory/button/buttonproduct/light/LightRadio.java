package creational.factory.abstractfactory.button.buttonproduct.light;

import creational.factory.abstractfactory.button.buttonproduct.Radio;

public class LightRadio extends Radio {
    public LightRadio(Double radius) {
        super(radius);
    }

    @Override
    public void render() {
        System.out.println("Light Radio Btn was clicked!");
    }

    @Override
    public void click() {
        System.out.println("Light Radio Btn Rendered!");
    }
}
