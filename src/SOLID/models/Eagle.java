package SOLID.models;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;
import SOLID.services.Flyable;

public class Eagle extends Bird implements Flyable {

    public Eagle(Integer weight, Colour colour, Size size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("\nEagle is flying");
    }
}
