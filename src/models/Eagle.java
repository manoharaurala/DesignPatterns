package models;

import enums.BirdType;
import enums.Colour;
import enums.Size;

public class Eagle extends Bird{

    public Eagle(Integer weight, Colour colour, Size size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("\nEagle is flying");
    }
}
