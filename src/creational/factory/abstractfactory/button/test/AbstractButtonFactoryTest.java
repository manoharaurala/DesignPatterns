package creational.factory.abstractfactory.button.test;

import creational.factory.abstractfactory.button.buttonproduct.Button;
import creational.factory.abstractfactory.button.buttonproduct.Radio;
import creational.factory.abstractfactory.button.buttonproduct.dark.DarkButton;
import creational.factory.abstractfactory.button.buttonproduct.dark.DarkRadio;
import creational.factory.abstractfactory.button.buttonproduct.light.LightButton;
import creational.factory.abstractfactory.button.buttonproduct.light.LightRadio;
import creational.factory.abstractfactory.button.factories.DarkThemeFactory;
import creational.factory.abstractfactory.button.factories.LightThemeFactory;
import creational.factory.abstractfactory.button.factories.ThemeFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AbstractButtonFactoryTest {
    @Test
    public void testLightTheme() {
        ThemeFactory factory = new LightThemeFactory();
        Button button = factory.createButton(10.0, 25.3);
        assertInstanceOf(LightButton.class,
                button,
                "If the factory is light, it should be a light button"
        );
        Radio radio = factory.createRadio(23.4);
        assertInstanceOf(LightRadio.class,
                radio,
                "If the factory is light, it should be a light radio"
        );

    }

    @Test
    public void testDarkTheme() {
        ThemeFactory factory = new DarkThemeFactory();
        Button button = factory.createButton(10.0, 25.3);
        assertInstanceOf(DarkButton.class,
                button,
                "If the factory is dark, it should be a dark button"
        );
        Radio radio = factory.createRadio(23.4);
        assertInstanceOf(DarkRadio.class,
                radio,
                "If the factory is dark, it should be a dark radio"
        );
    }
}
