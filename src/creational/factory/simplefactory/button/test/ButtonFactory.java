package creational.factory.simplefactory.button.test;

import creational.factory.simplefactory.button.Button;
import creational.factory.simplefactory.button.RoundButton;
import creational.factory.simplefactory.button.ScreenSize;
import creational.factory.simplefactory.button.SquareButton;

public class ButtonFactory {
    // Step 3 - Create a static factory method
    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch (screenSize) {
            case PHONE, TABLET -> {
                return new RoundButton(border, radius);
            }
            case DESKTOP -> {
                return new SquareButton(border, length);
            }
        }
        throw new IllegalArgumentException("Invalid type: " + screenSize);
    }
}
