package concrete_factory.SpaceMines;

import product.Obstacle;
import product.SpaceMines.ClusterMine;
import product.SpaceMines.ProximityMine;

public class Level1SpaceMinesFactory extends SpaceMinesFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 200) return new ClusterMine();
        else return new ProximityMine();
    }
}
