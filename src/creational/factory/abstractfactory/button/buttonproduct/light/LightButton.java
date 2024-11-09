package creational.factory.abstractfactory.button.buttonproduct.light;

import creational.factory.abstractfactory.button.buttonproduct.Button;

public class LightButton extends Button {
    private final Double length;

    public LightButton(Double border, Double length) {
        super(border);
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Light Square Btn was clicked!");

    }

    @Override
    public void click() {
        System.out.println("Light Square Btn Rendered!");

    }
}
