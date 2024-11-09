package creational.factory.abstractfactory.button.factories;

import creational.factory.abstractfactory.button.buttonproduct.Button;
import creational.factory.abstractfactory.button.buttonproduct.Radio;
import creational.factory.abstractfactory.button.buttonproduct.light.LightButton;
import creational.factory.abstractfactory.button.buttonproduct.light.LightRadio;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton(Double border, Double length) {
        return new LightButton(border, length);
    }

    @Override
    public Radio createRadio(Double radius) {
        return new LightRadio(radius);
    }
}
