package creational.factory.factorymethod.button.test;

import creational.factory.factorymethod.button.buttonproduct.Button;
import creational.factory.factorymethod.button.buttonproduct.RoundButton;
import creational.factory.factorymethod.button.buttonproduct.SquareButton;
import creational.factory.factorymethod.button.factory.ButtonFactory;
import creational.factory.factorymethod.button.factory.RoundButtonFactory;
import creational.factory.factorymethod.button.factory.SquareButtonFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ButtonFactoryTest {

    @Test
    public void testRoundButton() {
        ButtonFactory buttonFactory = new RoundButtonFactory();
        Button button = buttonFactory.createButton(10.0, 1.0, null);
        assertInstanceOf(RoundButton.class, button, "If the screen size is of a phone, the btn should be round");
    }

    @Test
    public void testSquareButton() {
        ButtonFactory buttonFactory = new SquareButtonFactory();
        Button button = buttonFactory.createButton(10.0, null, 10.0);
        assertInstanceOf(SquareButton.class, button, "If the screen size is of a desktop, the btn should be square");

    }
}
