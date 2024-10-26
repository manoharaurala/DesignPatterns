package SOLID.models;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;

public class Sparrow extends FlyableBird{
    public Sparrow(Integer weight, Colour colour, Size size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("\nSparrow is flying");

    }
}
