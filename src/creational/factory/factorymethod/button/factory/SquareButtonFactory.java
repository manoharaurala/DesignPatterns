package creational.factory.factorymethod.button.factory;

import creational.factory.factorymethod.button.buttonproduct.Button;
import creational.factory.factorymethod.button.buttonproduct.SquareButton;

public class SquareButtonFactory implements ButtonFactory {
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new SquareButton(border, length);
    }
}
