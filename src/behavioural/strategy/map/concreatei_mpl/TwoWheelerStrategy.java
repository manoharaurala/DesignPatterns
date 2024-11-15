package behavioural.strategy.map.concreatei_mpl;

import behavioural.strategy.map.interfaces.NavigationStrategy;

//Step 2 Implement concrete strategy
public class TwoWheelerStrategy implements NavigationStrategy {
    @Override
    public Double navigate(String source, String destination) {
        //Geo code location
        //Distance between location
        //Divide distance by avg speed
        return 25.3;
    }
}
