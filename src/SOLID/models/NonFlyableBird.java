package SOLID.models;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;

public abstract class NonFlyableBird extends Bird {
    public NonFlyableBird(Integer weight, Colour colour, Size size, Beak beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    public abstract void swim();


}
