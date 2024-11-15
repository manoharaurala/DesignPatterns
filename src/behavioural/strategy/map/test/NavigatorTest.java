package behavioural.strategy.map.test;

import behavioural.strategy.map.concreatei_mpl.FourWheelerStrategy;
import behavioural.strategy.map.concreatei_mpl.TwoWheelerStrategy;
import behavioural.strategy.map.contex.Navigator;
import org.junit.jupiter.api.Test;

public class NavigatorTest {
    Navigator navigator;

    @Test
    public void testCarNavigation() {
        navigator = new Navigator(new FourWheelerStrategy());
        assert (navigator.navigate("Bangalore", "Mysore") == 23.4);

    }

    @Test
    public void testBikeNavigation() {
        navigator = new Navigator(new TwoWheelerStrategy());
        assert (navigator.navigate("Bangalore", "Mysore") == 25.3);

    }
}
