package SOLID;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;
import SOLID.models.Eagle;
import SOLID.models.Parrot;
import SOLID.models.Penguin;
import SOLID.models.Sparrow;
import SOLID.services.Flyable;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Parrot parrot = new Parrot(10, Colour.GREEN, Size.SMALL, "Sharp", BirdType.Parrot);
        parrot.fly();
        parrot.eat();
        parrot.sleep();

        Eagle eagle = new Eagle(20, Colour.GREEN, Size.MEDIUM, "Sharp", BirdType.Eagle);
        eagle.fly();
        eagle.eat();
        eagle.sleep();

        Sparrow sparrow = new Sparrow(30, Colour.BROWN, Size.LARGE, "Sharp", BirdType.Sparrow);
        sparrow.fly();
        sparrow.eat();
        sparrow.sleep();

        Penguin penguin = new Penguin(25, Colour.WHITE, Size.LARGE, "NonSharp", BirdType.Penguin);
        penguin.swim();
        penguin.eat();
        penguin.sleep();

        List<Flyable> birds = List.of(parrot, eagle, sparrow);
        flyAll(birds);
    }

    public static void flyAll(List<Flyable> birds) {
        birds.forEach(Flyable::fly);
    }
}
