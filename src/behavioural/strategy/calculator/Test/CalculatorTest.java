package behavioural.strategy.calculator.Test;

import behavioural.strategy.calculator.Calculator;
import behavioural.strategy.calculator.concreteImpl.AdditionalStrategy;
import behavioural.strategy.calculator.concreteImpl.SubtractionStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calculator = null;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();

    }

    @Test
    public void testAddition() {

        double a = 10;
        double b = 2;

        calculator.setStrategy(new AdditionalStrategy());

        double sum = calculator.performCalculation(a, b);
        assertEquals(a + b, sum);
    }

    @Test
    public void testSubtraction() {

        double a = 10;
        double b = 2;

        calculator.setStrategy(new SubtractionStrategy());

        double difference = calculator.performCalculation(a, b);
        assertEquals(a - b, difference);
    }

}
