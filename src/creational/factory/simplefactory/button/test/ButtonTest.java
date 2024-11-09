package creational.factory.simplefactory.button.test;

import creational.factory.simplefactory.button.buttonproduct.Button;
import creational.factory.simplefactory.button.buttonproduct.RoundButton;
import creational.factory.simplefactory.button.buttonproduct.SquareButton;
import creational.factory.simplefactory.button.enums.ScreenSize;
import creational.factory.simplefactory.button.factory.ButtonFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ButtonTest {
    @Test
    public void testButton() {
        RoundButton roundButton = new RoundButton(10.0, 1.0);
        SquareButton squareButton = new SquareButton(25.0, 50.0);
        assertTrue("Check object instance of round button", roundButton instanceof RoundButton);
        assertTrue("Check object instance of round button", squareButton instanceof SquareButton);
    }

    @Test
    public void testRoundButton() {
        Button button = ButtonFactory.createButton(ScreenSize.PHONE, 10.0, 1.0, null);
        assertInstanceOf(RoundButton.class, button, "If the screen size is of a phone, the btn should be round");
    }

    @Test
    public void testSquareButton() {
        Button button = ButtonFactory.createButton(ScreenSize.DESKTOP, 10.0, null, 10.0);
        assertInstanceOf(SquareButton.class, button, "If the screen size is of a desktop, the btn should be square");

    }
}
