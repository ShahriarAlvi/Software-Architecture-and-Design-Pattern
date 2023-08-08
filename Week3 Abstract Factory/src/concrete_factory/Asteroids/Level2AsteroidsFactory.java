package concrete_factory.Asteroids;

import product.Asteroids.Rocky_Asteroids;
import product.Asteroids.Silicon_Asteroids;
import product.Obstacle;

public class Level2AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
