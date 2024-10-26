package SOLID.models;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;

public abstract class FlyableBird extends Bird {

    public FlyableBird(Integer weight, Colour colour, Size size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    public abstract void fly();
}
