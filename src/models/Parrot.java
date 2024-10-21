package models;

import enums.BirdType;
import enums.Colour;
import enums.Size;

public class Parrot extends Bird{
    public Parrot(Integer weight, Colour colour, Size size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("\nParrot is flying");
    }
}
