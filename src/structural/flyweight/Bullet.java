package structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
// Step 1 - Intrinsic State
public class Bullet {
    private String image;

    private Double radius;
    private Double weight;

    private BulletType type;
}
