package structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
// Step 2 - Extrinsic state
public class FlyingBullet {
    private Double x, y, z;
    private Double direction;

    // Step 3 - Add a has-a relation
    private Bullet bullet;
}
