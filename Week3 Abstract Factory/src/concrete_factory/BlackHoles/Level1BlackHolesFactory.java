package concrete_factory.BlackHoles;

import product.BlackHoles.GravityVortex;
import product.BlackHoles.SingularityCore;
import product.Obstacle;

public class Level1BlackHolesFactory extends BlackHolesFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 400) return new SingularityCore();
        else return new GravityVortex();
    }
}
