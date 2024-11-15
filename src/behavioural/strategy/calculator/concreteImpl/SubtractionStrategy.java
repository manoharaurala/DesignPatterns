package behavioural.strategy.calculator.concreteImpl;

import behavioural.strategy.calculator.interfaces.OperationStrategy;

public class SubtractionStrategy implements OperationStrategy {
    @Override
    public double operate(double number1, double number2) {
        return number1 - number2;
    }
}
