package abstract_factory;

import product.Obstacle;

public abstract class ObstacleFactory {
        public abstract Obstacle createObstacle(int score);
}

