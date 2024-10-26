package SOLID;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;
import SOLID.models.*;

public class Runner {
    public static void main(String[] args) {
        FlyableBird parrot = new Parrot(10, Colour.GREEN, Size.SMALL, "Sharp", BirdType.Parrot);
        parrot.fly();
        parrot.eat();
        parrot.sleep();

        FlyableBird eagle = new Eagle(20, Colour.GREEN, Size.MEDIUM, "Sharp", BirdType.Eagle);
        eagle.fly();
        eagle.eat();
        eagle.sleep();

        FlyableBird sparrow=new Sparrow(30,Colour.BROWN,Size.LARGE,"Sharp",BirdType.Sparrow);
        sparrow.fly();
        sparrow.eat();
        sparrow.sleep();

        NonFlyableBird penguin=new Penguin(25,Colour.WHITE,Size.LARGE,"NonSharp",BirdType.Penguin);
        penguin.swim();
        penguin.eat();
        penguin.sleep();
    }
}
