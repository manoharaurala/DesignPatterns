package SOLID.models;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;
import SOLID.services.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(Integer weight, Colour colour, Size size, Beak beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("\nSparrow is flying");

    }
}
