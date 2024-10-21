import enums.BirdType;
import enums.Colour;
import enums.Size;
import models.Bird;
import models.Eagle;
import models.Parrot;

public class Runner {
    public static void main(String[] args) {
        Bird parrot = new Parrot(10, Colour.GREEN, Size.SMALL, "Sharp", BirdType.Parrot);
        parrot.fly();

        Bird eagle = new Eagle(20, Colour.GREEN, Size.MEDIUM, "Sharp", BirdType.Eagle);
        eagle.fly();
    }
}
