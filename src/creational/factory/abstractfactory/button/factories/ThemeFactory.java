package creational.factory.abstractfactory.button.factories;

import creational.factory.abstractfactory.button.buttonproduct.Button;
import creational.factory.abstractfactory.button.buttonproduct.Radio;

public interface ThemeFactory {
    Button createButton(Double border, Double length);

    Radio createRadio(Double radius);
}
