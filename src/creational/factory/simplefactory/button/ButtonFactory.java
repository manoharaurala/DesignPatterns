package creational.factory.simplefactory.button;

public class ButtonFactory {
    // Step 3 - Create a static factory method
    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch (screenSize) {
            case PHONE, TABLET -> {
                return new RoundButton(border, radius);
            }
            case DESKTOP -> {
                return new SquareButton(border, length);
            }
        }
        throw new IllegalArgumentException("Invalid type: " + screenSize);
        // Why the factory pattern?
        // 1. SRP and OCP =>> Done
        // 2. Complex construction logic ==> Done
        // 3. Reduce usage of subclasses ==> Done

        // What are the downsides of the simple factory?
        // 1. Parameter explosion -> Assignment => Builder
        // 2. SRP + OCP violation in library code
    }
}
