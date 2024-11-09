package creational.factory.abstractfactory.button.factories;

import creational.factory.abstractfactory.button.buttonproduct.Button;
import creational.factory.abstractfactory.button.buttonproduct.Radio;
import creational.factory.abstractfactory.button.buttonproduct.dark.DarkButton;
import creational.factory.abstractfactory.button.buttonproduct.dark.DarkRadio;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton(Double border, Double length) {
        return new DarkButton(border, length);
    }

    @Override
    public Radio createRadio(Double radius) {
        return new DarkRadio(radius);
    }
}
