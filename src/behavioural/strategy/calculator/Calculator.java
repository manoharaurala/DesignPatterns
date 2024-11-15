package behavioural.strategy.calculator;

import behavioural.strategy.calculator.interfaces.OperationStrategy;
import lombok.Setter;

@Setter
public class Calculator {
    private OperationStrategy strategy = null;

    public double performCalculation(double a, double b) {
        return strategy.operate(a, b);
    }

}
