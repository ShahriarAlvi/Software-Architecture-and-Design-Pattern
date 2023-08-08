package concrete_factory.SolarFlares;

import product.Obstacle;
import product.SolarFlares.BlindingFlare;
import product.SolarFlares.ElectromagneticSurge;

public class Level2SolarFlaresFactory extends SolarFlaresFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 600) return new BlindingFlare();
        else return new ElectromagneticSurge();
    }
}
