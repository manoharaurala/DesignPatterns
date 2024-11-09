package creational.factory.abstractfactory.button.buttonproduct.dark;

import creational.factory.abstractfactory.button.buttonproduct.Radio;

public class DarkRadio extends Radio {
    public DarkRadio(Double radius) {
        super(radius);
    }

    @Override
    public void render() {
        System.out.println("Dark radio Btn was clicked!");
    }

    @Override
    public void click() {
        System.out.println("Dark radio Btn Rendered!");
    }
}
