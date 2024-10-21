import enums.BirdType;
import models.Bird;
import models.Eagle;
import models.Parrot;

public class Runner {
    public static void main(String[] args) {
        Bird parrot = new Parrot(10, "Green", "Small", "Sharp", BirdType.Parrot);
        parrot.fly();

        Bird eagle = new Eagle(20, "Brown", "Medium", "Sharp", BirdType.Eagle);
        eagle.fly();
    }
}
