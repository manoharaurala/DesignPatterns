package creational.factory.factorymethod.button.factory;

import creational.factory.factorymethod.button.buttonproduct.Button;
import creational.factory.factorymethod.button.buttonproduct.RoundButton;

public class RoundButtonFactory implements ButtonFactory {

    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new RoundButton(border, radius);
    }
}
