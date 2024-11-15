package behavioural.strategy.map.contex;

import behavioural.strategy.map.interfaces.NavigationStrategy;

//Step 3-Adding a reference to context class
public class Navigator {
    private final NavigationStrategy strategy;

    public Navigator(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    //Passed through method
    public double navigate(String source, String destination) {
        return strategy.navigate(source, destination);
    }
}
