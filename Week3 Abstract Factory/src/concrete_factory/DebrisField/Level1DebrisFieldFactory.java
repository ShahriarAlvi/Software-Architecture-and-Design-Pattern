package concrete_factory.DebrisField;

import product.DebrisField.DynamicDebrisField;
import product.DebrisField.StaticDebrisField;
import product.Obstacle;

public class Level1DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1500) return new DynamicDebrisField();
        else return new StaticDebrisField();
    }
}
