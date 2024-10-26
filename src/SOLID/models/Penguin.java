package SOLID.models;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;
import SOLID.services.Swimmable;

public class Penguin extends Bird implements Swimmable {
    public Penguin(Integer weight, Colour colour, Size size, Beak beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void swim() {
        System.out.println("\nPenguin is swimming");

    }
}
