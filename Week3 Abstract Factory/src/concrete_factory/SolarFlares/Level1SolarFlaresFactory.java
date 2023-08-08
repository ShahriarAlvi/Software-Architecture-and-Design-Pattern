package concrete_factory.SolarFlares;

import abstract_factory.ObstacleFactory;
import product.Obstacle;
import product.SolarFlares.BlindingFlare;
import product.SolarFlares.ElectromagneticSurge;

public class Level1SolarFlaresFactory extends SolarFlaresFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 300) return new BlindingFlare();
        else return new ElectromagneticSurge();
    }
}
