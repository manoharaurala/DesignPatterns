package behavioural.strategy.map.concreatei_mpl;

import behavioural.strategy.map.interfaces.NavigationStrategy;

public class FourWheelerStrategy implements NavigationStrategy {
    @Override
    public Double navigate(String source, String destination) {
        return 23.4;
    }
}
