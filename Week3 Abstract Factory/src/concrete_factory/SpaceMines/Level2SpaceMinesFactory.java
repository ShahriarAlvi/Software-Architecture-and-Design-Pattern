package concrete_factory.SpaceMines;

import product.Obstacle;
import product.SpaceMines.EMP_Mine;
import product.SpaceMines.ProximityMine;

public class Level2SpaceMinesFactory extends SpaceMinesFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 500) return new EMP_Mine();
        else return new ProximityMine();
    }
}
