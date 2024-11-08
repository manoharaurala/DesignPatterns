package creational.factory.factorymethod.button.factory;

import creational.factory.factorymethod.button.buttonproduct.Button;

public interface ButtonFactory {
    Button createButton(Double border, Double radius, Double length);
}
